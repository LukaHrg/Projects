package Customer;

import Main.SQLAccess;

import java.sql.*;

public class CustomerSQL extends SQLAccess
{
    static Connection connect;
    private static PreparedStatement preparedStatement = null;

    public CustomerSQL()
    {
        connect = super.getConnect();
    }

    public static boolean insertCustomer(Customer c)
    {
        boolean insertSuccessful = true;
        //Add Code here to call embedded SQL to insert Customer into DB
        try
        {
            //Create prepared statement to issue SQL query to the database

            preparedStatement = connect.prepareStatement("insert into agileassignment.Customer values (default, ?, ?, ?, ?, ?, ?, ?)");

            preparedStatement.setString(1, c.getFirstname());
            preparedStatement.setString(2, c.getLastname());
            preparedStatement.setInt(3, c.getHouse_number());
            preparedStatement.setString(4, c.getStreet());
            preparedStatement.setString(5, c.getTown());
            preparedStatement.setString(6, c.getPhoneNumber());
            preparedStatement.setString(7, c.getArchived());

            preparedStatement.executeUpdate();

        }

        catch (Exception e)
        {
            insertSuccessful = false;
        }
        //Insert Successful is handled in the command line class to see if the insert was successful
        return insertSuccessful;
    }// end insertCustomerDetailsAccount

    public boolean editCustomer(int Id, Customer c)
    {
        boolean editSuccessful = true;

        //Add Code here to call embedded SQL to edit Customer in DB

        try
        {
            //Similar to the creation above however in this prepared statement it specifies that
            //the update must be applied where the passed in ID matches the one in the database
            preparedStatement = connect.prepareStatement("UPDATE Customer set firstname = ?, lastname = ?, house_number = ?, street = ?, town = ?, phone_number = ?, archived = ? where customer_id = " + Id);

            preparedStatement.setString(1, c.getFirstname());
            preparedStatement.setString(2, c.getLastname());
            preparedStatement.setInt(3, c.getHouse_number());
            preparedStatement.setString(4, c.getStreet());
            preparedStatement.setString(5, c.getTown());
            preparedStatement.setString(6, c.getPhoneNumber());
            preparedStatement.setString(7, c.getArchived());

            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            editSuccessful = false;
        }
        //edit Successful is handled in the command line class to see if the edit was successful
        return editSuccessful;
    }


    public boolean retrieveAllCustomers() {
        boolean printSuccessful = true;

        try {
            Statement stmt = this.connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM agileassignment.customer");
            System.out.printf("\n%-12s %-10s %-10s %-13s %-15s %-10s %-15s %-20s\n", "customerId", "First Name", "Last Name", "House Number", "Street", "Town", "Phone Number", "Archived");

            while(rs.next()) {
                int id = rs.getInt("customer_id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                int house_number = rs.getInt("house_number");
                String street = rs.getString("street");
                String town = rs.getString("town");
                String phone_number = rs.getString("phone_number");
                String archived = rs.getString("Archived");
                System.out.printf("\n%-12d %-10s %-10s %-13d %-15s %-10s %-15s %-20s\n", id, firstname, lastname, house_number, street, town, phone_number, archived);
            }
        } catch (Exception e) {
            printSuccessful = false;
        }

        return printSuccessful;
    }


    public boolean deleteCustomers(int Id) {
        boolean deleteSuccessful = true;

        try {
            this.preparedStatement = this.connect.prepareStatement("DELETE from Customer where customer_id =" + Id);
            this.preparedStatement.executeUpdate();
        } catch (Exception var4) {
            deleteSuccessful = false;
        }

        return deleteSuccessful;
    }

    public CustomerSQL(Connection connect)
    {
        this.connect = connect;
    }
}
