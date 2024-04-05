package MainFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
    public static void main(String[] args) {
        // You can put your database connection logic here
        Connection con = ConnectDb();
        // Perform operations with the connection
    }

    static Connection ConnectDb() {
        // Implement your database connection logic here
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_stock","root","Enockay23#");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return con;
    }
}
