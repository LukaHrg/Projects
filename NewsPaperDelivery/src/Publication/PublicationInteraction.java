package Publication;
import Main.CommandLine;
import Main.CustomExceptionHandler;

import java.sql.SQLException;
import java.util.Scanner;

public class PublicationInteraction
{
    PublicationSQL acc = new PublicationSQL();
    public void InteractWithPublication()
    {
        //Present Customer with Functionality Options

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        System.out.println(" ");
        System.out.println("=============================================");
        System.out.println("Please choose ONE of the following options:");
        System.out.println("1. Create Publication Account");
        System.out.println("2. Update Publication account");
        System.out.println("3. Delete Publication Record by ID");
        System.out.println("4. Display Publication table");
        System.out.println("99. Close the NewsAgent Application");
        System.out.println("=============================================");
        System.out.println(" ");

        String choice = input.next();


       //try
       // {
            boolean insertResult;

            //Interaction with the customer table
            switch (choice)
            {
                //Create a new Customer
                case "1":
                    throw new RuntimeException("Not yet implemented");

                //Edit a customer account
                case "2":
                    throw new RuntimeException("Not yet implemented");

                //Delete a customer account
                case "3":
                    throw new RuntimeException("Not yet implemented");

                case "4":
                    insertResult = acc.retrieveAllPublications();

                    return;

                case "99":
                    //Closes the application
                    CommandLine.keepAppOpen = false;
                    System.out.println("Closing the Application");
                    break;
                default:
                    System.out.println("No valid function selected");
            }
       // }
       /* catch (CustomExceptionHandler e)
        {
            System.out.println(e.getMessage());
            return;
        }*/

    }

}
