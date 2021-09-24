package Customer;
import Main.CommandLine;
import Main.CustomExceptionHandler;

import java.sql.SQLException;
import java.util.Scanner;

public class CustomerInteraction
{
    CustomerSQL acc = new CustomerSQL();
    public void InteractWithCustomer()
    {
        //Present Customer with Functionality Options

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        System.out.println(" ");
        System.out.println("=============================================");
        System.out.println("Please choose ONE of the following options:");
        System.out.println("1. Create Customer Account");
        System.out.println("2. Update Customer account");
        System.out.println("3. Delete Customer Record by ID");
        System.out.println("4. Display Customer table");
        System.out.println("99. Close the NewsAgent Application");
        System.out.println("=============================================");
        System.out.println(" ");

        String choice = input.next();


        try
        {
            boolean pass = true;
            String firstname = null;
            String lastname = null;
            int house_number = 0;
            String street = null;
            String town = null;
            String phoneNumber = null;
            String archived = null;
            int id = 0;
            //Interaction with the customer table
            switch (choice)
            {
                //Create a new Customer
                case "1":
                    // Takes user input
                    do
                    {
                        try
                        {
                            System.out.print("Enter the Customer First Name: \n");
                            firstname = input.next();
                            Customer.validateFirstName(firstname);
                            pass = true;
                        }
                        catch(CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    }
                    while(!pass);
                    do
                    {
                        try
                        {
                            System.out.print("Enter the Customer Last Name: \n");
                            lastname = input.next();
                            Customer.validateLastName(lastname);
                            pass = true;
                        }
                        catch(CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    }
                    while(!pass);
                    do
                    {
                        try
                        {
                            System.out.print("Enter the Customer House Number: \n");
                            house_number = Integer.parseInt(input.next());
                            Customer.validatehousenumber(house_number);
                            pass = true;
                        }
                        catch(CustomExceptionHandler | NumberFormatException e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    }
                    while(!pass);
                    do
                    {
                        try
                        {
                            System.out.print("Enter the Customers Street: \n");
                            street = input.next();
                            Customer.validateStreet(street);
                            pass = true;
                        }
                        catch(CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    }
                    while(!pass);
                    do
                    {
                        try
                        {
                            System.out.print("Enter the Customers Town: \n");
                            town = input.next();
                            Customer.validateTown(town);
                            pass = true;
                        }
                        catch(CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    }
                    while(!pass);
                    do
                    {
                        try
                        {
                            System.out.print("Enter the Customers Phone Number: \n");
                            phoneNumber = input.next();
                            Customer.validatePhone(phoneNumber);
                            pass = true;
                        }
                        catch(CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    }
                    while(!pass);
                    do
                    {
                        try
                        {
                            System.out.print("Enter if the Customer is archived or not: \n");
                            archived = input.next();
                            Customer.validateArchived(archived);
                            pass = true;
                        }
                        catch(CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    }
                    while(!pass);

                    //Creates Customer object
                    Customer custObj = new Customer(firstname, lastname, house_number, street, town, phoneNumber, archived);

                    //Insert Customer details into the database
                    boolean insertResult = acc.insertCustomer(custObj);

                    //Checks if the details were successfully inserted
                    if (insertResult)
                        System.out.println("Customer Details saved");
                    else
                        System.out.println("Error: Customer Details not saved");

                    return;

                //Edit a customer account
                case "2":
                    // Takes user input
                    do
                    {
                        System.out.print("Enter the Customer ID: \n");
                        try
                        {
                            id = Integer.parseInt(input.next());
                        }
                        catch (NumberFormatException e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                        pass = true;
                    } while(!pass);

                    do
                    {
                        try
                        {
                            System.out.print("Enter the Customer First Name: \n");
                            firstname = input.next();
                            Customer.validateFirstName(firstname);
                            pass = true;
                        }
                        catch(CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    } while(!pass);

                    do
                    {
                        try
                        {
                            System.out.print("Enter the Customer Last Name: \n");
                            lastname = input.next();
                            Customer.validateLastName(lastname);
                            pass = true;
                        }
                        catch(CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    } while(!pass);

                    do
                    {
                        try
                        {
                            System.out.print("Enter the Customer House Number: \n");
                            house_number = Integer.parseInt(input.next());
                            Customer.validatehousenumber(house_number);
                            pass = true;
                        }
                        catch(CustomExceptionHandler | NumberFormatException e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    } while(!pass);

                    do
                    {
                        try
                        {
                            System.out.print("Enter the Customers Street: \n");
                            street = input.next();
                            Customer.validateStreet(street);
                            pass = true;
                        }
                        catch(CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    } while(!pass);

                    do
                    {
                        try
                        {
                            System.out.print("Enter the Customers Town: \n");
                            town = input.next();
                            Customer.validateTown(town);
                            pass = true;
                        }
                        catch(CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    } while(!pass);

                    do
                    {
                        try
                        {
                            System.out.print("Enter the Customers Phone Number: \n");
                            phoneNumber = input.next();
                            Customer.validatePhone(phoneNumber);
                            pass = true;
                        }
                        catch(CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    } while(!pass);

                    do
                    {
                        try
                        {
                            System.out.print("Enter if the Customer is archived or not: \n");
                            archived = input.next();
                            Customer.validateArchived(archived);
                            pass = true;
                        }
                        catch(CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    } while(!pass);

                    //Creates Customer object
                    custObj = new Customer(firstname, lastname, house_number, street, town, phoneNumber, archived);

                    //Insert Customer details into the database
                    insertResult = acc.editCustomer(id, custObj);

                    //Checks if the details were successfully inserted
                    if (insertResult)
                        System.out.println("Delivery Details saved");
                    else
                        System.out.println("Error: Delivery Details not saved");

                    return;

                //Delete a customer account
                case "3":
                    do
                    {
                        try {
                            System.out.print("Enter the Customer ID: \n");
                            id = Integer.parseInt(input.next());
                        }
                        catch (NumberFormatException e)
                        {
                            System.out.println(e);
                            pass = false;
                        }
                        pass = true;
                    } while(!pass);
                    boolean deleteResult = acc.deleteCustomers(id);
                    if (deleteResult) {
                        System.out.println("Deletion Successful");
                    } else {
                        System.out.println("Error: Deletion Unsuccessful");
                    }

                case "4":
                    insertResult  = acc.retrieveAllCustomers();

                    return;

                case "99":
                    //Closes the application
                    CommandLine.keepAppOpen = false;
                    System.out.println("Closing the Application");
                    break;
                default:
                    System.out.println("No valid function selected");
            }
        }
        catch (CustomExceptionHandler e)
        {
            System.out.println(e.getMessage());
            return;
        }

    }

    public CustomerInteraction()
    {
    }
}
