package Invoice;

import Main.CustomExceptionHandler;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice{

    /*
        This class contains a constructor for the Invoice table.
        It contains multiple getter and setters for the variables.
        It also contains methods to validate each of these variables.
     */

    private double amount;
    private int customerId;
    private int invoiceId;
    private String paymentdate;
    private String billDue;

    Date parsedDate;
    Date formDate;

        public Invoice(int customerId, double amount, String date) throws CustomExceptionHandler
        {
            //Passes variables through the methods in order to validate them
            validateAmount(amount);
            validateDate(date);


            //Sets the class variables accordingly
            setinvId(0);
            setAmount(amount);
            setDate(date);
            setcusId(customerId);
            setbillDue(Warning(date));
        }

    // Setters
    public void setcusId (int Id) { customerId = Id; }
    public void setDate (String date) {paymentdate = date; }
    public void setAmount (double amount) { this.amount = amount; }
    public void setinvId(int invId) {invoiceId = invId; }
    public void setbillDue(String billDue){this.billDue = billDue;}

    //Getters
    public int getinvId() {return invoiceId; }
    public int getcusId() { return customerId; }
    public String getDate() { return paymentdate; }
    public double getAmount() { return amount; }

        public static String Warning(String date) throws CustomExceptionHandler
        {

            // Creates the date in the current time
            Date now = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            formatter.setLenient(false);
            try
            {
                // Formats the current date into a date format
                Date parsedDate = formatter.parse(date);

                String formDate = formatter.format( new Date());
                Date formNow = formatter.parse(formDate);

                // Compares the current date with the date in the Invoice table
                if(parsedDate.before(formNow))
                {
                    return ("Warning, bill overdue!");
                }
                else
                {
                    return ("Bill still valid.");
                }
            }
            catch(Exception e)
            {
                throw new CustomExceptionHandler("The date format is not correct");
            }
        }


    public static void validateDate(String date) throws CustomExceptionHandler {

        // Validate the date is formatted correctly
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        formatter.setLenient(false);
        Date parsedDate;

        //Throw Exception if string is blank
        if(date.isBlank()||date.isEmpty())
            throw new CustomExceptionHandler("Date NOT Specified");



        //Throw exception if date is not formatted correctly
        try
        {
            parsedDate = formatter.parse(date);

        }
        catch (Exception e)
        {
            throw new CustomExceptionHandler("The date format is not correct");
        }
    }

    public static void validateAmount(double payAmount) throws CustomExceptionHandler
    {
        if (payAmount <= 0)
            throw new CustomExceptionHandler("Payment amount can't be less or equal to 0 ");
    }
}
