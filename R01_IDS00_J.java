// Non-compliant Code: Vulnerable to SQL Injection using untrusted input
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class R01_IDS00_J {
    public static void main(String[] args) throws Exception {
        String username = "admin";  // Assume this is untrusted input
        String query = "SELECT * FROM users WHERE username = '" + username + "'";

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);  // Vulnerable to SQL Injection
    }
}
*/

// Compliant Code: Use PreparedStatement to prevent SQL Injection
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class R01_IDS00_J {
    public static void main(String[] args) throws Exception {
        String username = "admin";  // Assume this is untrusted input
        String query = "SELECT * FROM users WHERE username = ?";

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, username);  // Safely inject parameter
        ResultSet resultSet = preparedStatement.executeQuery();
    }
}
