

import Invoice.Invoice;
import Main.CustomExceptionHandler;
import junit.framework.TestCase;

public class InvoiceTest extends TestCase {

    //Test #: 1
    //Test Objective: To create a Customer.Customer bill
    //Inputs: PayAmount = 500, date = 14.02.2021, custId = 1
    //Expected Output: Bill created for Customer.Customer 1

    public void testInvoice001()
    {

        //Create the Customer.Customer Bill Object

        try
        {
            //Call method under test
            Invoice bill = new Invoice(5,500,"13.02.2021");

            assertEquals(500.0, bill.getAmount());
            assertEquals("13.02.2021", bill.getDate());
            assertEquals(5, bill.getcusId());

        }
        catch (CustomExceptionHandler e) {
            fail("Exception not expected");
        }
    }

    //Test #: 2
    //Test Objective: To create a Customer.Customer bill warning
    //Inputs: date = 25.02.2021
    //Expected Output: "Warning, bill overdue!"

    public void testWarning001() throws CustomExceptionHandler
    {
        assertEquals("Warning, bill overdue!", Invoice.Warning("25.02.2020"));
    }

    //Test #: 2
    //Test Objective: To create a Customer.Customer bill warning
    //Inputs: date = 25.02.2021
    //Expected Output: "Warning, bill overdue!"

    public void testWarning002() throws CustomExceptionHandler
    {
        assertEquals("Bill still valid.", Invoice.Warning("25.02.2050"));
    }

    //Test #: 3
    //Test Objective: To catch an invalid date input
    //Inputs: date = "43332"
    public void testValidateDate001()
    {
        try
        {
            Invoice.validateDate("43332");
            fail("Exception Expected");
        }
        catch(CustomExceptionHandler e)
        {
            assertEquals("The date format is not correct", e.getMessage());
        }
    }

    //Test #: 3
    //Test Objective: To catch an invalid date input
    //Inputs: date = "43332"
    public void testValidateDate002()
    {
        try
        {
            Invoice.validateDate("");
            fail("Exception Expected");
        }
        catch(CustomExceptionHandler e)
        {
            assertEquals("Date NOT Specified", e.getMessage());
        }
    }

    //Test #: 3
    //Test Objective: To catch an invalid date input
    //Inputs: date = "43332"
    public void testValidateAmount001()
    {
        try
        {
            Invoice.validateAmount(Double.parseDouble("-5"));
            fail("Exception Expected");
        }
        catch(CustomExceptionHandler e)
        {
            assertEquals("Payment amount can't be less or equal to 0 ", e.getMessage());
        }
    }

}