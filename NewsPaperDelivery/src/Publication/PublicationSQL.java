package Publication;

import Main.SQLAccess;

import java.sql.*;

public class PublicationSQL extends SQLAccess
{
    static Connection connect;
    private static PreparedStatement preparedStatement = null;

    public PublicationSQL()
    {
        connect = super.getConnect();
    }

    public boolean retrieveAllPublications() {
        boolean printSuccessful = true;

        try {
            Statement stmt = this.connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM agileassignment.publication");
            System.out.printf("\n%-12s %-10s %-10s %-13s %-15s %-10s %-15s %-20s\n", "publicationId", "Name", "Date", "Author", "Version", "Price", "Stock", "Delivery Id");

            while(rs.next()) {
                int id = rs.getInt("publication_id");
                String name = rs.getString("name");
                String date = rs.getString("date");
                int author = rs.getInt("author");
                String version = rs.getString("version");
                String price = rs.getString("price");
                String stock = rs.getString("stock");
                String deliveryId = rs.getString("delivery_id");
                System.out.printf("\n%-12d %-10s %-10s %-13d %-15s %-10s %-15s %-20s\n", id, name, date, author, version, price, stock, deliveryId);
            }
        } catch (Exception e) {
            printSuccessful = false;
        }

        return printSuccessful;
    }

}
