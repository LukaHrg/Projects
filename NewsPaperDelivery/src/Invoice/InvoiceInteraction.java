package Invoice;

import Customer.Customer;
import Main.CustomExceptionHandler;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvoiceInteraction
{
    InvoiceSQL acc = new InvoiceSQL();
    public void InteractWithInvoice()
    {
        System.out.println(" ");
        System.out.println("=============================================");
        System.out.println("Please choose ONE of the following options:");
        System.out.println("1. Create Invoice");
        System.out.println("2. Update Invoice");
        System.out.println("3. Delete Invoice");
        System.out.println("99. Close the NewsAgent Application");
        System.out.println("=============================================");
        System.out.println(" ");

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        String choice = input.next();

        try
        {
            boolean pass = true;
            double amount = 0.0;
            int cusID = 0;
            String invoiceDate = null;
            boolean insertResult = true;
            switch (choice)
            {
                case "1":
                    do
                    {
                        try
                        {
                            System.out.println("Enter the invoice amount: ");
                            amount = Double.parseDouble(input.next());
                            Invoice.validateAmount(amount);
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
                            System.out.println("Enter the invoice Date: ");
                            invoiceDate = input.next();
                            Invoice.validateDate(invoiceDate);
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
                        System.out.println("Enter the customer ID: ");
                        cusID = input.nextInt();
                        pass = true;
                    }
                    while(!pass);

                    Invoice invObject = new Invoice( cusID, amount, invoiceDate);

                    insertResult = acc.insertInvoice(invObject);

                    if (insertResult)
                        System.out.println("Invoice Details saved");
                    else
                        System.out.println("Error: Invoice Details not saved");

                    return;

                case "2":
                    throw new RuntimeException("Not yet implemented");
                    //return;

                case "3":
                    throw new RuntimeException("Not yet implemented");
                    //return;

                case "99":
                    throw new RuntimeException("Not yet implemented");
                    //break;

                default:
                    System.out.println("No valid function selected");
            }
        }
        catch (CustomExceptionHandler | InputMismatchException e)
        {
            System.out.println(e.getMessage());
            return;
        }
    }
    public InvoiceInteraction(){}
}
