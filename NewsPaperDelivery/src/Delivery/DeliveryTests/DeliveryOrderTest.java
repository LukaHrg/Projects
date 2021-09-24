
import Delivery.DeliveryOrder;
import Main.CustomExceptionHandler;
import Main.State;
import junit.framework.TestCase;

public class DeliveryOrderTest extends TestCase
{

    /*
    This class contains a series of tests for the delivery order class.
     */

    //Test # : 1
    // Test Objective: Create a delivery order
    //Inputs: date = "11.02.2021"
    //Expected output: Created with ID = 5, Date = "11.02.2021, Delivery PersonID = 5"
    public void testDeliveryOrder001() throws CustomExceptionHandler
    {
        //Create delivery order object

        DeliveryOrder deliObj = new DeliveryOrder("11.02.2021",5, "not archived", "no special message");

        assertEquals(0, deliObj.getDeliveryID());
        assertEquals("11.02.2021", deliObj.getDate());
        assertEquals(5, deliObj.getDeliveryPersonID());
        assertEquals("not archived", deliObj.getArchived());
        assertEquals("no special message", deliObj.getSpecialMessage());

    }


    //Test #: 1
    //Test Objective: To catch an invalid date input
    //Inputs: date = "43332"
    public void testValidateDate001()
    {
        try
        {
            DeliveryOrder.validateDate("43332");
            fail("Exception Expected");
        }
        catch (CustomExceptionHandler e)
        {
            assertEquals("The date format is not correct", e.getMessage());
        }

    }
    //Test #: 2
    //Test Objective: Successfully validate a date
    //Inputs: date = "04.08.2021"
    public void testValidateDate002()
    {
        try {
            assertEquals(true, DeliveryOrder.validateDate("04.08.2000"));
        }
        catch (CustomExceptionHandler e)
        {
            System.out.println(e.getMessage());
        }

    }

    //Test #: 1
    //Test Objective: To catch an invalid deliveryPersonID
    //Inputs: 9
    //Outputs:
    public void testValidateDeliveryPersonID()
    {

    }

    //Test#: 1
    //Test Objective: Test that there are no special messages
    //inputs: no special message
    //outputs: no special message
    public void testOrderArchive001()
    {
        try
        {
            assertEquals(true,DeliveryOrder.validateArchived("Archived"));
        }
        catch (CustomExceptionHandler e)
        {
            fail(e.getMessage());
        }
    }
    //Test#: 2
    //Test Objective: confirm that there is a special message
    //inputs: Do this thing
    //outputs: Do this thing
    public void testOrderArchive002()
    {
        try
        {
            DeliveryOrder.validateArchived("Arc");
        }
        catch (CustomExceptionHandler e)
        {
            assertEquals("Archived State is too short",e.getMessage());
        }
    }

    //Test#: 3
    //Test Objective: confirm rejection of long state
    //inputs: Archivedddddddddddd
    //outputs: Too long
    public void testOrderArchive003()
    {
        try
        {
            DeliveryOrder.validateArchived("Archivedddddddddddd");
        }
        catch (CustomExceptionHandler e)
        {
            assertEquals("Archived State is too long",e.getMessage());
        }
    }

    //Test: 1
    //Objective: Test a correct Special Message
    //Input: "This is a fine message
    //Output:"True"

    public void testOrderSpecial001()
    {
        try
        {
            assertEquals(true,DeliveryOrder.validateSpecialMsg("This is a fine Message"));
        }
        catch (CustomExceptionHandler e)
        {
            fail(e.getMessage());
        }
    }

    //Test: 2
    //Objective: Test a short Special Message
    //Input: "This"
    //Output:"Special Message is too short"

    public void testOrderSpecial002()
    {
        try
        {
            DeliveryOrder.validateSpecialMsg("This");
        }
        catch (CustomExceptionHandler e)
        {
            assertEquals("Special Message is too short",e.getMessage());
        }
    }

    //Test: 2
    //Objective: Test a short Special Message
    //Input: "This message is ridiculously long and you should feel bad for writing it. "
    //Output:"Special Message is too short"

    public void testOrderSpecial003()
    {
        try
        {
            DeliveryOrder.validateSpecialMsg(
                    "This message is ridiculously long and you should feel bad for writing it.");
        }
        catch (CustomExceptionHandler e)
        {
            assertEquals("Special Message is too long",e.getMessage());
        }
    }

}