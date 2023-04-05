/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connections;

/**
 *
 * @author hp
 */
import java.sql.*;


public class DatabaseConnection {
    private Connection connection;

    public DatabaseConnection() {
        try {
            // JDBC driver name and database URL
            String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
            String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";

            //  Database credentials
            String USER = "miniproject";
            String PASS = "4sf20cs114";

            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}

