package Publication;

import Main.CustomExceptionHandler;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Publication
{
    private int id;
    private String name;
    private String date;
    private String author;
    private String version;
    private double price;
    private int stock;
    private int deliveryID;

    public Publication(String name, String date, String author,String version, double price,int stock,int deliveryID) throws CustomExceptionHandler {

        try
        {
            ValidateName(name);
            ValidateDate(date);
            ValidateAuthor(author);
            ValidateVersion(version);
            ValidatePrice(price);
            ValidateStock(stock);
        }
        catch (CustomExceptionHandler e)
        {
            System.out.println(e.getMessage());
            throw e;
        }

        setId(0);
        setName(name);
        setDate(date);
        setAuthor(author);
        setVersion(version);
        setPrice(price);
        setStock(stock);
        setDeliveryID(deliveryID);
    }


    /*
    GETS AND SETS
     */
    public int getId() {return id;}
    public void setId(int id) {id = this.id;}

    public String getName() {return name;}
    public void setName(String name) {name = this.name;}

    public String getDate() {return date;}
    public void setDate(String date) {date = this.date;}

    public String getAuthor() {return author;}
    public void setAuthor(String author) {author = this.author;}

    public String getVersion() {return version;}
    public void setVersion(String version) {version = this.version;}

    public double getPrice() {return price;}
    public void setPrice(double price) {price = this.price;}

    public int getStock() {return stock;}
    public void setStock(int stock) {stock = this.stock;}

    public int getDeliveryID() {return deliveryID;}
    public void setDeliveryID(int deliveryID) {deliveryID = this.deliveryID;}

    public static void ValidateName(String name) throws CustomExceptionHandler
    {
        if(name.isBlank() || name.isEmpty())
            throw new CustomExceptionHandler("Error: Name cannot be blank");

        if(name.length() >= 16)
            throw new CustomExceptionHandler("Error: Name too long");

    }

    public static void ValidateDate(String date) throws CustomExceptionHandler {
               /*
        This method first checks if the date is blank or empty
        It then creates a formatter of type (Day.Month.Year)
        It then attempts to format the input date properly
         */

        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        formatter.setLenient(false);
        Date parsedDate;

        //Throw Exception if string is blank
        if(date.isBlank()||date.isEmpty())
            throw new CustomExceptionHandler("Error: Date NOT Specified");

        //Throw exception if date is not formatted correctly
        try
        {
            parsedDate = formatter.parse(date);

        }
        catch (Exception e)
        {
            throw new CustomExceptionHandler("Error: Date format is incorrect");
        }
    }

    public static void ValidateAuthor(String author) throws CustomExceptionHandler {
        if (author.isBlank()||author.isEmpty())
            throw new CustomExceptionHandler("Error: Author name cannot be blank");

        if(author.length() >= 16)
            throw new CustomExceptionHandler("Error: Author name is too long");
    }

    public static void ValidateVersion(String version) throws CustomExceptionHandler {
        if (version.isBlank()||version.isEmpty())
            throw new CustomExceptionHandler("Error: Author name cannot be blank");

        if(version.length() >= 11)
            throw new CustomExceptionHandler("Error: Version name is too long");
    }

    public static void ValidatePrice(double price) throws CustomExceptionHandler {
        if(price >= 30.00)
            throw new CustomExceptionHandler("Error: Price is too high");
    }

    public static boolean ValidateStock(int stock) throws CustomExceptionHandler
    {
        if(stock < 10)
            throw new CustomExceptionHandler("Warning: Stock is running too low");
        else if(stock >= 100)
            throw new CustomExceptionHandler("Warning: Max stock do not order any more");
        else
            return true;
    }

}
