

import Main.CustomExceptionHandler;
import junit.framework.TestCase;
import Publication.Publication;

public class PublicationTest extends TestCase
{
        public void testPublication001() throws CustomExceptionHandler {
            Publication p = new Publication("TestPaper","06.04.2000","TestMan","43",12.99,300,4);

            assertEquals("TestPaper", p.getName());
            assertEquals("06.04.2000", p.getDate());
            assertEquals("TestMan", p.getAuthor());
            assertEquals("43", p.getVersion());
            assertEquals(12.99,p.getPrice());
            assertEquals(300, p.getStock());
        }

        //Test 00
        //Input:
        //Expected output:

       public void testValidateName001()
       {
           try
           {
               Publication.ValidateName("The Test mail with a name too long");
               fail("Exception Expected");
           }
           catch (CustomExceptionHandler e)
           {
               assertEquals("Error: Name too long",e.getMessage());

           }

       }

       public  void testValidateDate001()
       {
           try
           {
               Publication.ValidateDate("33.444.21");
               fail("Exception not expected");
           } catch(CustomExceptionHandler e)
           {
               assertEquals("Error: Date format incorrect", e.getMessage());
           }
       }

       public void testValidateAuthor001()
       {
           try
           {
            Publication.ValidateAuthor(" ");
            fail("Exception not expected");
           }
           catch (CustomExceptionHandler e)
           {
               assertEquals("Error: Author name cannot be blank", e.getMessage());
           }
       }

       public void testValidateVersion001()
       {
            try
            {
                Publication.ValidateVersion("This version is too long");
                fail("Exception expected");
            }
            catch (CustomExceptionHandler e)
            {
                assertEquals("Error: Version is too long",e.getMessage());
            }
       }

       public void testValidatePrice001()
       {
            try
            {
                Publication.ValidatePrice(31.00);
                fail("Exception expected");
            }
            catch (CustomExceptionHandler e)
            {
                assertEquals("Error: Price cannot be this large", e.getMessage());
            }
       }


       //Test #:1
       //Objective: Test that stock is too low
       //Inputs: -4
       //Outputs: Warning: Stock is too low
       public void testValidateStock001()
       {
            try
            {
                Publication.ValidateStock(-4);
                fail("Exception expected");
            }
            catch (CustomExceptionHandler e)
            {
                assertEquals("Warning: Stock is running too low", e.getMessage());
            }
       }

    //Test #:2
    //Objective: Test that stock is too high
    //Inputs: 104
    //Outputs: Warning: Max stock do not order any more
    public void testValidateStock002()
    {
        try
        {
            Publication.ValidateStock(104);
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e)
        {
            assertEquals("Warning: Max stock do not order any more", e.getMessage());
        }
    }

    //Test #:3
    //Objective: Test that stock is ok
    //Inputs: 52
    //Outputs: true
    public void testValidateStock003()
    {
        try
        {
            assertEquals(true,Publication.ValidateStock(52));
        }
        catch (CustomExceptionHandler e)
        {
            fail(e.getMessage());
        }

    }




}