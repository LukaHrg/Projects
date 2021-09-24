package Main;

import Customer.CustomerSQL;

import java.sql.*;


/*
    SQL Access is made to deal with almost all communication to the SQL database
    It deals with initial connection to the database as well as passing relevant information

    Overview:
        SQL Constructor: Connects to database
            Customer methods: Deals with interaction with customer classes and table
            DeliveryO Methods: Deals with interaction with Delivery order classes and table
            Invoice Methods: Deals with interaction with Invoice classes and table
*/

public class SQLAccess {

    //Objects used to connect and interact with the SQL database

    //Used for the initial connection
    private Connection connect;
    //Used to pass prewritten requests to the database
    private Statement statement = null;
    //Used as a vehicle to pass information into the database
    private PreparedStatement preparedStatement = null;
    //Contains information recieved from the database
    private ResultSet resultSet = null;

    public SQLAccess()
    {
        try
        {
            //Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Setup the connection with the DB
            //Login and database connection information
            String host = "localhost:3306";
            String user = "root";
            String password = "admin";

            connect = DriverManager.getConnection("jdbc:mysql://" + host + "/agileassignment?" + "user=" + user + "&password=" + password);


        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public Connection getConnect() {
        return connect;
    }

    public void setConnect(Connection connect) {
        this.connect = connect;
    }
}// end Class