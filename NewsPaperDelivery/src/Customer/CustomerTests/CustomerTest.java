

import Customer.Customer;
import Main.CustomExceptionHandler;
import junit.framework.TestCase;

public class CustomerTest extends TestCase {

    //Test #: 1
    //Test Objective: To create a Customer Account
    //Inputs: FirstName = Jack, LastName = Daniels, housenumber = 5, Street = willow park, Town = "Athlone", Phone = "087123123123"
    //Expected Output: Customer Object created with id = 0, "Jack Daniels", custAddr = "Athlone", custPhone = "087-123123123"

    public void testCustomer001()
    {

        //Create the Customer Object

        try
        {
            //Call method under test
            Customer custObj = new Customer("Jack", "Daniels", 5, "willow park", "Athlone", "087123123123", "not archived");

            // Use getters to check for object creation

            assertEquals(0, custObj.getId());
            assertEquals("Jack", custObj.getFirstname());
            assertEquals("Daniels", custObj.getLastname());
            assertEquals(5, custObj.getHouse_number());
            assertEquals("willow park", custObj.getStreet());
            assertEquals("Athlone", custObj.getTown());
            assertEquals("087123123123", custObj.getPhoneNumber());
            assertEquals("not archived", custObj.getArchived());
        }
		catch (CustomExceptionHandler e)
        {
        fail("Exception not expected");
        }
    }

    //Test #: 2
    //Test Objective: To create a Customer Account
    //Inputs: FirstName = Jackaaaaaaaaaaaaaaaaaa, LastName = Daniels, housenumber = 5, Street = willow park, Town = "Athlone", Phone = "087123123123"
    //Expected Output: error

    public void testCustomer002()
    {

        //Create the Customer Object

        try
        {
            //Call method under test
            Customer custObj = new Customer("Jackaaaaaaaaaaaaaaaaaa", "Daniels", 5, "willow park", "Athlone", "087123123123", "not archived");

            // Use getters to check for object creation

            assertEquals(0, custObj.getId());
            assertEquals("Jackaaaaaaaaaaaaaaaaaa", custObj.getFirstname());
            assertEquals("Daniels", custObj.getLastname());
            assertEquals(5, custObj.getHouse_number());
            assertEquals("willow park", custObj.getStreet());
            assertEquals("Athlone", custObj.getTown());
            assertEquals("087123123123", custObj.getPhoneNumber());
            assertEquals("not archived", custObj.getArchived());
        }
        catch (CustomExceptionHandler e)
        {

        }
    }

    //Test #: 3
    //Test Objective: To edit an existing customer
    //Inputs: FirstName = Jacky, LastName = Daniels, housenumber = 5, Street = Willow Park, Town = "Athlone", Phone = "087123123123"
    //Expected Output: Exception Message: "Customer Name does not meet minimum length requirements"

    public void testEditCustomer001(){

        try{
            Customer custObj = new Customer("Jacky", "Daniels", 5, "Willow Park", "Athlone", "087123123123", "not archived");

            assertEquals(0, custObj.getId());
            assertEquals("Jacky", custObj.getFirstname());
            assertEquals("Daniels", custObj.getLastname());
            assertEquals(5, custObj.getHouse_number());
            assertEquals("Willow Park", custObj.getStreet());
            assertEquals("Athlone", custObj.getTown());
            assertEquals("087123123123", custObj.getPhoneNumber());
            assertEquals("not archived", custObj.getArchived());
        }
        catch (CustomExceptionHandler e) {
            fail("Exception not expected");
        }
    }

    //Test #: 4
    //Test Objective: To catch an invalid customer name
    //Inputs: FirstName = "J"
    //Expected Output: Exception Message: "Customer FirstName does not meet minimum length requirements"

    public void testValidateFirstName001() {

        try {

            //Call method under test
            Customer.validateFirstName("J");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer First Name does not meet minimum length requirements", e.getMessage());
        }
    }

    //Test #: 5
    //Test Objective: To catch an invalid customer name
    //Inputs: FirstName = ""
    //Expected Output: Exception Message: "Customer First Name NOT specified"

    public void testValidateFirstName002() {

        try {

            //Call method under test
            Customer.validateFirstName("");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer First Name NOT specified", e.getMessage());
        }
    }

    //Test #: 6
    //Test Objective: To catch an invalid customer name
    //Inputs: LastName = "J"
    //Expected Output: Exception Message: "Customer LastName does not meet minimum length requirements"

    public void testValidateLastName001() {

        try {

            //Call method under test
            Customer.validateLastName("J");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer LastName does not meet minimum length requirements", e.getMessage());
        }
    }

    //Test #: 7
    //Test Objective: To catch an invalid customer name
    //Inputs: LastName = ""
    //Expected Output: Exception Message: "Customer LastName NOT specified"

    public void testValidateLastName002() {

        try {

            //Call method under test
            Customer.validateLastName("");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer LastName NOT specified", e.getMessage());
        }
    }

    //Test #: 8
    //Test Objective: To catch an invalid customer name
    //Inputs: LastName = "Jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj"
    //Expected Output: Exception Message: "Customer LastName exceeds maximum length requirements"

    public void testValidateLastName003() {

        try {

            //Call method under test
            Customer.validateLastName("Jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer LastName exceeds maximum length requirements", e.getMessage());
        }
    }

    //Test #: 9
    //Test Objective: To catch an invalid customer house number
    //Inputs: housenumber = "-1"
    //Expected Output: Exception Message: "Customer house number less than 0"

    public void testValidatehousenumber001() {

        try {

            //Call method under test
            Customer.validatehousenumber(-1);
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer HouseNumber less than 0", e.getMessage());
        }
    }

    //Test #: 10
    //Test Objective: To catch an invalid customer house number
    //Inputs: housenumber = "0"
    //Expected Output: Exception Message: "Customer HouseNumber NOT specified"

    public void testValidatehousenumber002() {

        try {

            //Call method under test
            Customer.validatehousenumber(0);
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer HouseNumber NOT specified", e.getMessage());
        }
    }

    //Test #: 11
    //Test Objective: To catch an invalid customer house number
    //Inputs: housenumber = 151"
    //Expected Output: Exception Message: "Customer HouseNumber exceeds maximum length requirements"

    public void testValidatehousenumber003() {

        try {

            //Call method under test
            Customer.validatehousenumber(151);
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer HouseNumber exceeds maximum length requirements", e.getMessage());
        }
    }

    //Test #: 12
    //Test Objective: To catch an invalid customer street
    //Inputs: housenumber = "AIT"
    //Expected Output: Exception Message: "Customer Street name does not meet minimum length requirements"

    public void testValidatestreet001() {

        try {

            //Call method under test
            Customer.validateStreet("AIT");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer Street name does not meet minimum length requirements", e.getMessage());
        }
    }

    //Test #: 13
    //Test Objective: To catch an invalid customer street
    //Inputs: housenumber = ""
    //Expected Output: Exception Message: "Customer Street NOT specified"

    public void testValidatestreet002() {

        try {

            //Call method under test
            Customer.validateStreet("");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer Street NOT specified", e.getMessage());
        }
    }

    //Test #: 14
    //Test Objective: To catch an invalid customer street
    //Inputs: housenumber = "AITAITAITAITAITAIT"
    //Expected Output: Exception Message: "Customer Street name exceeds maximum length requirements"

    public void testValidatestreet003() {

        try {

            //Call method under test
            Customer.validateStreet("AITAITAITAITAITAIT");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer Street name exceeds maximum length requirements", e.getMessage());
        }
    }

    //Test #: 15
    //Test Objective: To catch an invalid customer town
    //Inputs: town = "AIT"
    //Expected Output: Exception Message: "Customer Town name does not meet minimum length requirements"

    public void testValidatetown001() {

        try {

            //Call method under test
            Customer.validateTown("AIT");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer Town name does not meet minimum length requirements", e.getMessage());
        }
    }

    //Test #: 16
    //Test Objective: To catch an invalid customer town
    //Inputs: town = ""
    //Expected Output: Exception Message: "Customer Town NOT specified"

    public void testValidatetown002() {

        try {

            //Call method under test
            Customer.validateTown("");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer Town NOT specified", e.getMessage());
        }
    }

    //Test #: 17
    //Test Objective: To catch an invalid customer town
    //Inputs: town = "AITAITAITAITAITAIT"
    //Expected Output: Exception Message: "Customer town exceeds maximum length requirements"

    public void testValidatetown003() {

        try {

            //Call method under test
            Customer.validateTown("AITAITAITAITAITAIT");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer town exceeds maximum length requirements", e.getMessage());
        }
    }

    //Test #: 18
    //Test Objective: To catch an invalid customer phone
    //Inputs: phone = "123123"
    //Expected Output: Exception Message: "Customer PhoneNumber does not meet minimum length requirements"

    public void testValidatephone001() {

        try {

            //Call method under test
            Customer.validatePhone("123123");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer PhoneNumber does not meet minimum length requirements", e.getMessage());
        }
    }

    //Test #: 19
    //Test Objective: To catch an invalid customer phone
    //Inputs: phone = ""
    //Expected Output: Exception Message: "Customer PhoneNumber NOT specified"

    public void testValidatephone002() {

        try {

            //Call method under test
            Customer.validatePhone("");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer PhoneNumber NOT specified", e.getMessage());
        }
    }

    //Test #: 20
    //Test Objective: To catch an invalid customer phone
    //Inputs: phone = "123123123123123123"
    //Expected Output: Exception Message: "Customer PhoneNumber exceeds maximum length requirements"

    public void testValidatephone003() {

        try {

            //Call method under test
            Customer.validatePhone("123123123123123123");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer PhoneNumber exceeds maximum length requirements", e.getMessage());
        }
    }

    //Test #: 21
    //Test Objective: To catch an invalid archived entery
    //Inputs: phone = ""
    //Expected Output: Exception Message: "Customer Archived NOT specified"

    public void testValidatearchived001() {

        try {

            //Call method under test
            Customer.validateArchived("");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer Archived NOT specified", e.getMessage());
        }
    }

    //Test #: 22
    //Test Objective: To catch an invalid archived entery
    //Inputs: phone = "aaa"
    //Expected Output: Exception Message: "Customer Archived does not meet minimum length requirements"

    public void testValidatearchived002() {

        try {

            //Call method under test
            Customer.validateArchived("aaa");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer Archived does not meet minimum length requirements", e.getMessage());
        }
    }

    //Test #: 23
    //Test Objective: To catch an invalid archived entery
    //Inputs: phone = "aaaaaaaaaaaaa"
    //Expected Output: Exception Message: "Customer Archived exceeds maximum length requirements"

    public void testValidatearchived003() {

        try {

            //Call method under test
            Customer.validateArchived("aaaaaaaaaaaaa");
            fail("Exception expected");
        }
        catch (CustomExceptionHandler e) {
            assertEquals("Customer Archived exceeds maximum length requirements", e.getMessage());
        }
    }

}
