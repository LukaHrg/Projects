package Delivery;

import Main.CustomExceptionHandler;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DeliveryOrder
{
    /*
        This class contains a constructor for the Delivery order table.
        It contains multiple getter and setters for the variables.
        It also contains methods to validate each of these variables.
    */

    private int deliveryID;
    private String date;
    private int deliveryPersonID;
    private String archived;
    private String specialMessage;

    public DeliveryOrder(String date, int deliveryPersonID, String archived,String specialMessage) throws CustomExceptionHandler {
        //Sets the class variables accordingly
        ;
        try
        {
            //Passes date through the method in order to validate it
            validateDate(date);
            validateArchived(archived);
            validateSpecialMsg(specialMessage);
        }
        catch (CustomExceptionHandler e)
        {
            System.out.println(e.getMessage());
            throw e;
        }
        setDate(date);
        setDeliveryPersonID(deliveryPersonID);
        setArchived(archived);
        setSpecialMessage(specialMessage);
    }



    /*
    Getters and setters
    */
    public void setDeliveryID(int deliveryID)
    {
        this.deliveryID = deliveryID;
    }
    public int getDeliveryID()
    {
        return deliveryID;
    }

    public void setDate(String date)
    {
        this.date = date;
    }
    public String getDate()
    {
        return date;
    }

    public void setDeliveryPersonID(int deliveryPersonID)
    {
        this.deliveryPersonID = deliveryPersonID;
    }
    public int getDeliveryPersonID()
    {
        return deliveryPersonID;
    }

    public String getArchived() {
        return archived;
    }
    public void setArchived(String archived) {
        this.archived = archived;
    }

    public String getSpecialMessage() {
        return specialMessage;
    }
    public void setSpecialMessage(String specialMessage) {this.specialMessage = specialMessage;
    }

    public static boolean validateDate(String date) throws CustomExceptionHandler
    {
        /*
        This method first checks if the date is blank or empty
        It then creates a formatter of type (Day.Month.Year)
        It then attempts to format the input date properly
        */
        boolean result;
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
        return true;

    }

    public static boolean validateArchived(String archived) throws CustomExceptionHandler
    {
        if(archived.isBlank())
            throw new CustomExceptionHandler("Archived State cannot be blank");

        if(archived.length() <= 7)
            throw new CustomExceptionHandler("Archived State is too short");

        if(archived.length() >= 15)
            throw new CustomExceptionHandler("Archived State is too long");

        return true;
    }

    public static boolean validateSpecialMsg(String spcMsg) throws CustomExceptionHandler
    {
        if(spcMsg.isBlank())
            throw new CustomExceptionHandler("Special Message cannot be blank");

        if(spcMsg.length() <= 7)
            throw new CustomExceptionHandler("Special Message is too short");

        if(spcMsg.length() >= 50)
            throw new CustomExceptionHandler("Special Message is too long");

        return true;
    }

}
