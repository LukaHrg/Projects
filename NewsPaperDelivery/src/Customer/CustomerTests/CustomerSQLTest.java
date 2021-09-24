

import Customer.Customer;
import Customer.CustomerSQL;
import Main.CustomExceptionHandler;
import junit.framework.TestCase;

public class CustomerSQLTest extends TestCase {

    //Test #: 1
    //Test: test positive insertcustomer
    //Inputs: "Jack", "Daniels", 5, "willow park", "Athlone", "087123123123", "not archived"
    //Expected Output: insert successful

    public void testInsertcustomer001()
    {
        try
        {
            Customer custObj = new Customer("Jack", "Daniels", 5, "willow_park", "Athlone", "087123123123", "not_archived");

            CustomerSQL acc = new CustomerSQL();

            assertEquals(true,acc.insertCustomer(custObj));
        }
        catch (CustomExceptionHandler e)
        {
            fail("Exception not expected");
        }
    }

    //Test #: 2
    //Test: test negative insertcustomer
    //Inputs: "Jackarerzpaaaaaa", "Daniels", 5, "willow park", "Athlone", "087123123123", "not archived"
    //Expected Output: insert unsuccessful

    public void testInsertcustomer002()
    {
        try
        {
            Customer custObj = new Customer("Jackarerzpaaaaaa", "Daniels", 5, "willow_park", "Athlone", "087123123123", "not_archived");

            CustomerSQL acc = new CustomerSQL();

            assertEquals(false,acc.insertCustomer(custObj));
        }
        catch (CustomExceptionHandler e)
        {
            fail("Exception not expected");
        }
    }

    //Test #: 3
    //Test: test positive editcustomer
    //Inputs: 5, "Jack", "Daniels", 5, "willow park", "Athlone", "087123123123", "not archived"
    //Expected Output: edit successful

    public void testEditcustomer001()
    {
        try
        {
            Customer custObj = new Customer("Jack", "Daniels", 5, "willow_park", "Athlone", "087123123123", "not_archived");

            CustomerSQL acc = new CustomerSQL();

            assertEquals(true,acc.editCustomer(6, custObj));
        }
        catch (CustomExceptionHandler e)
        {
            fail("Exception not expected");
        }
    }

    //Test #: 4
    //Test: test negative editcustomer
    //Inputs: "Jackarerzpaaaaaa", "Daniels", 5, "willow park", "Athlone", "087123123123", "not archived"
    //Expected Output: edit unsuccessful

    public void testEditcustomer002()
    {
        try
        {
            Customer custObj = new Customer("Jackarerzpaaaaaa", "Daniels", 5, "willow_park", "Athlone", "087123123123", "not_archived");

            CustomerSQL acc = new CustomerSQL();

            assertEquals(false,acc.editCustomer(6, custObj));
        }
        catch (CustomExceptionHandler e)
        {
            fail("Exception not expected");
        }
    }

    //Test #: 5
    //Test:
    //Inputs:
    //Expected Output:

    public void testPrintcustomer001()
    {
        CustomerSQL acc = new CustomerSQL();

        assertEquals(true,acc.retrieveAllCustomers());
    }

    //Test #: 6
    //Test: test negative editcustomer
    //Inputs: "Jackarerzpaaaaaa", "Daniels", 5, "willow park", "Athlone", "087123123123", "not archived"
    //Expected Output: edit unsuccessful

    public void testDeletecustomer001()
    {
        CustomerSQL acc = new CustomerSQL();

        assertEquals(true,acc.deleteCustomers(6));
    }

}
