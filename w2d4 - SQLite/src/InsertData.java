import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

    /**
     * Connect to the test.db database
     *
     * @return the Connection object
     */
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:/home/noroff-experis-7/Noroff/w2d4 - SQLite/test.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    public void insertPerson(int person_id, String first_name, String last_name, String address
                                , String birthdate, int phone_id, int email_id) {

        String sql = "INSERT OR IGNORE INTO Person(person_id, first_name, last_name, address," +
                "birthdate, phone_id, email_id) VALUES(?,?,?,?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, person_id);
            pstmt.setString(2, first_name);
            pstmt.setString(3, last_name);
            pstmt.setString(4, address);
            pstmt.setString(5, birthdate);
            pstmt.setInt(6, phone_id);
            pstmt.setInt(7, email_id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertEmail(int email_id, String email_1, String email_2) {

        String sql = "INSERT OR IGNORE INTO Email(email_id, email_1, email_2) VALUES(?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(2, email_1);
            pstmt.setInt(1, email_id);
            pstmt.setString(3, email_2);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertPhone(int phone_id, String phonenumber_1, String phonenumber_2) {

        String sql = "INSERT OR IGNORE INTO Phonenumbers(phone_id, phonenumber_1, phonenumber_2) VALUES(?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, phone_id);
            pstmt.setString(2, phonenumber_1);
            pstmt.setString(3, phonenumber_2);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
