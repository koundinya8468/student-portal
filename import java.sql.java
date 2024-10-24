import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseConnection {
    public Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/student_db";
            String user = "root";
            String password = "password";
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void registerStudent(String name, String email) {
        try {
            Connection conn = connect();
            String query = "INSERT INTO Student (name, email, registration_date) VALUES (?, ?, CURDATE())";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.executeUpdate();
            System.out.println("Student registered successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
