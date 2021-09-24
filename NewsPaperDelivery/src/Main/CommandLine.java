package Main;

import Customer.CustomerInteraction;
import Delivery.DeliveryInteraction;
import Invoice.InvoiceInteraction;
import Publication.PublicationInteraction;

import java.util.Scanner;


/*
        The command line class is mainly a Command line interface. It handles all user input and displays
        information from all the SQl database Tables. It is built using a series of switch statements
        with the input from the user being simple numbers.
*/

public class CommandLine
{
    public static boolean keepAppOpen = true;
    private static SQLAccess acc;

    public static void main(String[] args)
    {
        //Initialises the Main.SQLAccess object and creates a connection to the database
         acc = new SQLAccess();

         //TODO fix the scanner so that spaces don'1t brake the program
        Scanner input = new Scanner(System.in);
        String functionNumber = "-99";

        //When we want to close the app we set this boolean to false
        while (keepAppOpen)
        {
            //Overall menu - allows you to choose which class to interact with
            System.out.println(" ");
            System.out.println("=============================================");
            System.out.println("Please choose one of the following options");
            System.out.println("1. Customers");
            System.out.println("2. Delivery Orders");
            System.out.println("3. Invoices");
            System.out.println("4. Publication");
            System.out.println("99. Close the newsagent application");
            System.out.println("=============================================");
            System.out.println(" ");

            functionNumber = input.next();

            switch (functionNumber)
            {
                case "1":
                    //Display Customer options
                    new CustomerInteraction().InteractWithCustomer();
                    break;

                case "2":
                    //Display Delivery options
                    new DeliveryInteraction().InteractWithDelivery();
                    break;

                case "3":
                    //Display Invoice options
                    new InvoiceInteraction().InteractWithInvoice();
                    break;

                case "4":
                    //Display Publication options
                    new PublicationInteraction().InteractWithPublication();
                    break;
                case "99":
                    //Close the application
                    keepAppOpen = false;
                    System.out.println("Closing the Application");
                    break;

                default:
                    System.out.println("No valid function selected");
            }
        }
    }

}
