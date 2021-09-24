

import Invoice.Invoice;
import Invoice.InvoiceSQL;
import Main.CustomExceptionHandler;
import junit.framework.TestCase;

public class InvoiceSQLTest extends TestCase {

    //Test #:
    //Test: test
    //Inputs:
    //Expected Output: insert successful

    public void testInsertinvoice001()
    {
        try
        {
            Invoice invObj = new Invoice(1, 35, "21.05.2022");

            InvoiceSQL acc = new InvoiceSQL();

            assertEquals(true,acc.insertInvoice(invObj));
        }
        catch (CustomExceptionHandler e)
        {
            fail("Exception not expected");
        }
    }

    //Test #:
    //Test: test
    //Inputs:
    //Expected Output: insert successful

    public void testInsertinvoice002()
    {
        try
        {
            Invoice invObj = new Invoice(6, 35, "21.05.2022");

            InvoiceSQL acc = new InvoiceSQL();

            assertEquals(false,acc.insertInvoice(invObj));
        }
        catch (CustomExceptionHandler e)
        {
            fail("Exception not expected");
        }
    }
}
