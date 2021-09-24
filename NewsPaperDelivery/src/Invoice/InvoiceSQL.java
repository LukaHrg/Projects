package Invoice;

import Main.SQLAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InvoiceSQL extends SQLAccess
{
/*
Deals with the  Invoice class
*/
    Connection connect;
    private PreparedStatement preparedStatement = null;

    public InvoiceSQL()
    {
        connect = super.getConnect();
    }

    public boolean insertInvoice(Invoice b)
    {
        boolean insertSuccessful = true;

        try
        {
            preparedStatement = connect.prepareStatement("insert into agileassignment.invoice values (default , ?, ?, ?)");

            preparedStatement.setInt(1, b.getcusId());
            preparedStatement.setDouble(2, b.getAmount());
            preparedStatement.setString(3, b.getDate());


            preparedStatement.executeUpdate();
        }
        catch (Exception e)
        {
            insertSuccessful = false;
        }
        return insertSuccessful;
    }
    public boolean editInvoice(int ID, Invoice i)
    {
        boolean editSuccessful = true;

        throw new RuntimeException("Not yet implemented");
        //TODO
    }
}
