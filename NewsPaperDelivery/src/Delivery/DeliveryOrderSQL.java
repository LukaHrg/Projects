package Delivery;

import Main.CustomExceptionHandler;
import Main.SQLAccess;

import java.sql.*;

public class DeliveryOrderSQL extends SQLAccess
{
    Connection connect;
    private PreparedStatement preparedStatement = null;

    public DeliveryOrderSQL()
    {
        connect = super.getConnect();
    }

    public void AlterConnect() throws SQLException
    {
        connect = DriverManager.getConnection("jdbc:mysql://" + "Test" + "/agileassignment?" + "user=" + "Test" + "&password=" + "Test");
    }


    public boolean insertDeliveryOrder(DeliveryOrder d)
    {
        boolean insertSuccessfull = true;

        try
        {
            preparedStatement = connect.prepareStatement("insert into delivery values (default, ?, ?, ?, ?)");
            preparedStatement.setString(1,d.getDate());
            preparedStatement.setInt(2,d.getDeliveryPersonID());
            preparedStatement.setString(3,d.getArchived());
            preparedStatement.setString(4,d.getSpecialMessage());

            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            return false;
        }
        return insertSuccessfull;
    }

    public boolean editDeliveryOrder(int Id, DeliveryOrder d)
    {
        boolean editSuccessful = true;

        try
        {
            preparedStatement = connect.prepareStatement("UPDATE Delivery set deliverydate = ?, deliveryperson_id = ?, archived = ?, special_orders = ? where delivery_id =" + Id);

            preparedStatement.setString(1, d.getDate());
            preparedStatement.setInt(2,d.getDeliveryPersonID());
            preparedStatement.setString(3,d.getArchived());
            preparedStatement.setString(4,d.getSpecialMessage());

            preparedStatement.executeUpdate();
        }
        catch(SQLException e)
        {
            return false;
        }

        return editSuccessful;
    }

    public boolean deleteDeliveryOrder(int Id)
    {
        boolean deleteSuccessful = true;

        try
        {
            this.preparedStatement = this.connect.prepareStatement("DELETE from delivery where delivery_id =" +Id);
        }
        catch (Exception e)
        {
            return false;
        }
        return deleteSuccessful;
    }

    public boolean retrieveDeliveryOrders()
    {
        boolean printSuccessful = true;

        try
        {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM delivery");
            System.out.printf("\n%-12s %-20s %-10s %-13s %-15s \n", "Delivery ID", "Date", "Delivery Person", "Archived", "Special Message");

            while(rs.next())
            {
                int id = rs.getInt("delivery_id");
                String date = rs.getString("deliverydate");
                int personID = rs.getInt("deliveryperson_id");
                String archived = rs.getString("archived");
                String specialOrders = rs.getString("special_orders");
                System.out.printf("\n%-12d %-20s %-15d %-13s %-15s \n",id,date,personID,archived,specialOrders);
            }

        } catch (SQLException e)
        {
            printSuccessful = false;
        }
        return printSuccessful;
    }

    public boolean checkDeliveryPerson(int id)
    {
        boolean deliveryPerson = true;
        try {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT count(*) FROM deliveryperson WHERE deliveryperson_id =" + id);
            rs.next();
            int count = rs.getInt(1);
            if(count == 0)
                deliveryPerson = false;
        }
        catch (Exception e)
        {
            deliveryPerson = false;
        }
        return deliveryPerson;
    }
}
