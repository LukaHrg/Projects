
import Delivery.DeliveryOrder;
import Delivery.DeliveryOrderSQL;
import Main.CustomExceptionHandler;
import junit.framework.TestCase;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DeliveryOrderSQLTest extends TestCase
{

    //Test Number:1
    //Objective: Test a succesful insertion
    //Input: A correct deliveryOrder object
    //Expected Output: True
    public void testInsertDeliveryOrder001()
    {
        try
        {
            DeliveryOrder deliveryOrder = new DeliveryOrder
                    ("11.11.2011", 2, "NotArchived", "NoSpecialMessage");

            DeliveryOrderSQL acc = new DeliveryOrderSQL();

            assertTrue(acc.insertDeliveryOrder(deliveryOrder));
        }
        catch (CustomExceptionHandler e)
        {
            fail(e.getMessage());
        }
    }

    //Test Number:2
    //Objective: Test a failure insertion into deliveryOrder
    //Input: incorrect SQL Password
    //Expected Output: False
    public void testInsertDeliveryOrder002()
    {
        try
        {
            DeliveryOrder deliveryOrder = new DeliveryOrder
                    ("11.11.2011", 2, "NotArchived", "NoSpecialMessage");

            DeliveryOrderSQL acc = new DeliveryOrderSQL();

            acc.AlterConnect();
            assertFalse(acc.insertDeliveryOrder(deliveryOrder));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    //Test number:1
    //Objective: Test successful insertion into EditDeliveryOrder
    //Input: correct SQL Password
    //Output: True
    public void testEditDeliveryOrder001()
    {
        try
        {
            DeliveryOrder deliveryOrder = new DeliveryOrder
                    ("11.11.2011", 2, "NotArchived", "NoSpecialMessage");

            DeliveryOrderSQL acc = new DeliveryOrderSQL();

            assertTrue(acc.editDeliveryOrder(1, deliveryOrder));
        }
        catch (Exception e)
        {
            fail(e.getMessage());
        }
    }

    //Test number:2
    //Objective: Test unsuccessful insertion into EditDeliveryOrder
    //Input:
    //Output:False
    public void testEditDeliveryOrder002()
    {
        try
        {
            DeliveryOrder deliveryOrder = new DeliveryOrder
                    ("11.11.2011", 2, "NotArchived", "NoSpecialMessage");

            DeliveryOrderSQL acc = new DeliveryOrderSQL();
            acc.AlterConnect();
            assertFalse(acc.editDeliveryOrder(1, deliveryOrder));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    //Test number: 1
    //Objective: Test a succesful retrieve delivery orders
    //Input: correct database connection
    //Output: True
    public void testRetrieveDeliveryOrders001()
    {
        DeliveryOrderSQL acc = new DeliveryOrderSQL();

        assertTrue(acc.retrieveDeliveryOrders());
    }

    //Test number: 2
    //Objective: Test an unsuccessful retrieve delivery orders
    //Input: incorrect database connection
    //Output: False
    public void testRetrieveDeliveryOrders002()
    {
        DeliveryOrderSQL acc = new DeliveryOrderSQL();
        try
        {
            acc.AlterConnect();
            assertFalse(acc.retrieveDeliveryOrders());
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    //Test number: 1
    //Objective: Test correct database connection with Delete Delivery order
    //Input: Correct data base connection
    //Output: true
    public void testDeleteDeliveryOrder001()
    {
        DeliveryOrderSQL acc = new DeliveryOrderSQL();

        assertTrue(acc.deleteDeliveryOrder(1));
    }

    //Test number: 2
    //Objective: Test incorrect database connection with Delete Delivery order
    //Input: Incorrect database connection
    //Output: false
    public void testDeleteDeliveryOrder002()
    {
        DeliveryOrderSQL acc = new DeliveryOrderSQL();
        try
        {
            acc.AlterConnect();
            assertFalse(acc.deleteDeliveryOrder(2));
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    //Test Number: 1
    //Objective: Test valid Delivery Person ID
    //Input: 1
    //Expected output: true

    public void testDeliveryPersonID001()
    {
        DeliveryOrderSQL acc = new DeliveryOrderSQL();

        try
        {
            assertTrue(acc.checkDeliveryPerson(1));
        }
        catch (Exception e)
        {
            fail(e.getMessage());
        }
    }

    //Test Number: 2
    //Objective: Test invalid Delivery Person ID
    //Input: 99
    //Expected output: false

    public void testDeliveryPersonID002()
    {
        DeliveryOrderSQL acc = new DeliveryOrderSQL();

        try
        {
            assertFalse(acc.checkDeliveryPerson(99));
        }
        catch (Exception e)
        {
            fail(e.getMessage());
        }
    }
}