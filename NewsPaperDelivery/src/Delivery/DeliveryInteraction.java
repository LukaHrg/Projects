package Delivery;

import Main.CommandLine;
import Main.CustomExceptionHandler;

import java.util.Scanner;

import static java.lang.Integer.*;

public class DeliveryInteraction
{
    DeliveryOrderSQL acc = new DeliveryOrderSQL();
    public void InteractWithDelivery()
    {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        System.out.println(" ");
        System.out.println("=============================================");
        System.out.println("Please choose ONE of the following options:");
        System.out.println("1. Create Delivery Order");
        System.out.println("2. Update Delivery Order");
        System.out.println("3. Delete Delivery Order by ID");
        System.out.println("4. Retrieve a list of Delivery Orders");
        System.out.println("99. Close the NewsAgent Application");
        System.out.println("=============================================");
        System.out.println(" ");

        String choice = input.next();

        try
        {
            boolean pass = true;
            int deliveryID = 0;
            String deliveryDate = null;
            String archived = null;
            String specialMessage = null;
            //Interaction with the delivery table
            switch (choice)
            {
                //Create a delivery order
                case "1":
                    //Takes user input
                    do
                    {
                        try
                        {
                            System.out.print("Enter the delivery orders date: \n");
                            deliveryDate = input.next();
                            DeliveryOrder.validateDate(deliveryDate);
                            pass = true;
                        }
                        catch (CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    } while(!pass);

                    System.out.print("Enter the delivery person id: \n");
                    int deliveryPID = input.nextInt();

                    do
                    {
                        try
                        {
                            System.out.print("Enter Delivery orders archival state: \n");
                            archived = input.next();
                            DeliveryOrder.validateArchived(archived);
                            pass = true;
                        }
                        catch (CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    } while(!pass);

                    do
                    {
                        try
                        {
                            System.out.print("Enter any special message: \n");
                            specialMessage = input.next();
                            DeliveryOrder.validateSpecialMsg(specialMessage);
                            pass = true;
                        }
                        catch (CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    } while (!pass);

                    //Creates delivery order object
                    DeliveryOrder deliObj = new DeliveryOrder(deliveryDate, deliveryPID, archived, specialMessage);

                    //Insert Delivery details into the database
                    boolean insertResult = acc.insertDeliveryOrder(deliObj);

                    //Checks if the details were successfully inserted
                    if (insertResult)
                        System.out.println("Delivery Details saved");
                    else
                        System.out.println("Error: Delivery Details not saved");

                    return;

                //Edit a delivery order
                case "2":
                {
                    //Takes user input
                    do
                    {
                        try
                        {
                            System.out.print("Enter the Delivery ID you wish to change: \n");
                            deliveryID = parseInt(input.next());
                        }
                        catch (NumberFormatException e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                        pass = true;
                    }while (!pass);


                    do
                    {
                        try
                        {
                            System.out.print("Enter the delivery orders date: \n");
                            deliveryDate = input.next();
                            DeliveryOrder.validateDate(deliveryDate);
                            pass = true;
                        }
                        catch (CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    } while(!pass);

                    System.out.print("Enter the delivery person id: \n");
                    deliveryPID = parseInt(input.next());

                    do
                    {
                        try
                        {
                            System.out.print("Enter Delivery orders archival state: \n");
                            archived = input.next();
                            DeliveryOrder.validateArchived(archived);
                            pass = true;
                        }
                        catch (CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    } while(!pass);

                    do
                    {
                        try
                        {
                            System.out.print("Enter any special message: \n");
                            specialMessage = input.next();
                            DeliveryOrder.validateSpecialMsg(specialMessage);
                            pass = true;
                        }
                        catch (CustomExceptionHandler e)
                        {
                            System.out.println(e.getMessage());
                            pass = false;
                        }
                    } while (!pass);


                    //Creates new delivery order object
                    deliObj = new DeliveryOrder(deliveryDate, deliveryPID, archived, specialMessage);

                    //Passes the new details into the database
                    boolean editResult = acc.editDeliveryOrder(deliveryID, deliObj);

                    //Checks if the details were successfully edited
                    if (editResult)
                        System.out.println("Delivery Details edited");
                    else
                        System.out.println("Error: Delivery Details not edited");

                    return;
                }

                //Delete a delivery order
                case "3":
                {
                    System.out.print("Enter the Delivery Order ID: \n");
                    int id = Integer.parseInt(input.next());
                    boolean deleteResult = acc.deleteDeliveryOrder(id);
                    if (deleteResult) {
                        System.out.println("Deletion Successful");
                    } else {
                        System.out.println("Error: Deletion Unsuccessful");
                    }
                    return;
                }


                //Retrieve all delivery orders
                case "4":
                {
                    boolean retrieveResult = acc.retrieveDeliveryOrders();

                    if (retrieveResult) {
                        System.out.println("Retrieve Successful");
                    } else {
                        System.out.println("Error: Retrieval Unsuccessful");
                    }
                    return;
                }

                case "99":
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
        }
    }


    public DeliveryInteraction(){}
}
