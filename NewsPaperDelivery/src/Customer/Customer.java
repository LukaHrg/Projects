package Customer;
import Main.CustomExceptionHandler;

public class Customer extends CustomerInteraction {

    /*
        This class contains a constructor for the Customer table.
        It contains multiple getter and setters for the variables.
        It also contains methods to validate each of these variables.
     */

    private int id;

    private String firstname;

    private String lastname;

    private int house_number;

    private String street;

    private String town;

    private String phoneNumber;

    private String archived;



    public Customer(String FirstName, String LastName, int housenumber, String Street, String Town, String Phone, String Archived) throws CustomExceptionHandler
    {
        // Validate Input

        try
        {
            validateFirstName(FirstName);

            validateLastName(LastName);

            validatehousenumber(housenumber);

            validateStreet(Street);

            validateTown(Town);

            validatePhone(Phone);

            validateArchived(Archived);

        }
        catch (CustomExceptionHandler e)
        {
            System.out.println(e.getMessage());
            throw e;
        }


        // Set Attributes

        setId(0);

        setFirstname(FirstName);

        setLastname(LastName);

        setHouse_number(housenumber);

        setStreet(Street);

        setTown(Town);

        setPhoneNumber(Phone);

        setArchived(Archived);

    }

    // Setters
    public void setId(int Id) { id = Id; }
    public void setFirstname(String FirstName) { firstname = FirstName; }
    public void setLastname(String LastName) { lastname = LastName; }
    public void setHouse_number(int housenumber) { house_number = housenumber; }
    public void setStreet(String Street){street = Street; }
    public void setTown(String Town){town = Town; }
    public void setPhoneNumber(String Phone) { phoneNumber = Phone; }
    public void setArchived(String Archived) {archived = Archived; }

    //Getters
    public int getId() { return id; }
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public int getHouse_number() { return house_number; }
    public String getStreet() { return street; }
    public String getTown() { return town; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getArchived() { return archived; }


    public static void validateFirstName(String FirstName) throws CustomExceptionHandler {

        //Agree Formating Rules on "Customer Name"
        //E.G. Name String must be a minimum of 2 characters and a maximum of 50 characters

        if (FirstName.isBlank() || FirstName.isEmpty())
            throw new CustomExceptionHandler("Customer First Name NOT specified");
        else if (FirstName.length() < 2)
            throw new CustomExceptionHandler("Customer First Name does not meet minimum length requirements");
        else if (FirstName.length() > 20)
            throw new CustomExceptionHandler("Customer First Name exceeds maximum length requirements");

    }


    public static void validateLastName(String LastName) throws CustomExceptionHandler {

        //Agree Formating Rules on "Customer Address"
        //E.G. Name String must be a minimum of 5 characters and a maximum of 60 characters

        if (LastName.isBlank() || LastName.isEmpty())
            throw new CustomExceptionHandler("Customer LastName NOT specified");
        else if (LastName.length() < 5)
            throw new CustomExceptionHandler("Customer LastName does not meet minimum length requirements");
        else if (LastName.length() > 30)
            throw new CustomExceptionHandler("Customer LastName exceeds maximum length requirements");

    }


    public static void validatehousenumber(int housenumber) throws CustomExceptionHandler {

        //Agree Formating Rules on "Customer PhoneNumber"
        //E.G. Name String must be a minimum of 7 characters and a maximum of 15 characters

        if (housenumber == 0)
            throw new CustomExceptionHandler("Customer HouseNumber NOT specified");
        else if (housenumber < 0)
            throw new CustomExceptionHandler("Customer HouseNumber less than 0");
        else if (housenumber > 150)
            throw new CustomExceptionHandler("Customer HouseNumber exceeds maximum length requirements");

    }


    public static void validateStreet(String Street) throws CustomExceptionHandler {

        //Agree Formating Rules on "Customer PhoneNumber"
        //E.G. Name String must be a minimum of 7 characters and a maximum of 15 characters

        if (Street.isBlank() || Street.isEmpty())
            throw new CustomExceptionHandler("Customer Street NOT specified");
        else if (Street.length() < 7)
            throw new CustomExceptionHandler("Customer Street name does not meet minimum length requirements");
        else if (Street.length() > 15)
            throw new CustomExceptionHandler("Customer Street name exceeds maximum length requirements");

    }


    public static void validateTown(String Town) throws CustomExceptionHandler {

        //Agree Formating Rules on "Customer PhoneNumber"
        //E.G. Name String must be a minimum of 7 characters and a maximum of 15 characters

        if (Town.isBlank() || Town.isEmpty())
            throw new CustomExceptionHandler("Customer Town NOT specified");
        else if (Town.length() < 7)
            throw new CustomExceptionHandler("Customer Town name does not meet minimum length requirements");
        else if (Town.length() > 15)
            throw new CustomExceptionHandler("Customer town exceeds maximum length requirements");

    }


    public static void validatePhone(String Phone) throws CustomExceptionHandler {

        //Agree Formating Rules on "Customer PhoneNumber"
        //E.G. Name String must be a minimum of 7 characters and a maximum of 15 characters

        if (Phone.isBlank() || Phone.isEmpty())
            throw new CustomExceptionHandler("Customer PhoneNumber NOT specified");
        else if (Phone.length() < 7)
            throw new CustomExceptionHandler("Customer PhoneNumber does not meet minimum length requirements");
        else if (Phone.length() > 15)
            throw new CustomExceptionHandler("Customer PhoneNumber exceeds maximum length requirements");

    }


    public static void validateArchived(String Archived) throws CustomExceptionHandler {

        //Agree Formating Rules on "Customer Archived"
        //E.G. archive String must be a minimum of 8 characters and a maximum of 12 characters

        if (Archived.isBlank() || Archived.isEmpty())
            throw new CustomExceptionHandler("Customer Archived NOT specified");
        else if (Archived.length() < 8)
            throw new CustomExceptionHandler("Customer Archived does not meet minimum length requirements");
        else if (Archived.length() > 12)
            throw new CustomExceptionHandler("Customer Archived exceeds maximum length requirements");


    }
}