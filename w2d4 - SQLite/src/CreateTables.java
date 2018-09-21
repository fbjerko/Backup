import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class CreateTables {


        public static void createNewTable(String db) {
            // SQLite connection string
            String url = "jdbc:sqlite:/home/noroff-experis-7/Noroff/w2d4 - SQLite/test.db";

            // SQL statement for creating a new table
            String sql1 = "CREATE TABLE IF NOT EXISTS Person (\n"
                    + "	person_id INTEGER PRIMARY KEY UNIQUE ,\n"
                    + "	first_name text NOT NULL ,\n"
                    + "	last_name text NOT NULL,\n"
                    + "	address text NOT NULL,\n"
                    + "	birthdate text NOT NULL,\n"
                    + "	phone_id INTEGER NOT NULL,\n"
                    + "	email_id INTEGER NOT NULL,\n"
                    + "	FOREIGN KEY(phone_id) REFERENCES Phonenumbers (phone_id) ,\n"
                    + "	FOREIGN KEY(email_id) REFERENCES Email (email_id) \n"
                    + "); ";

            String sql2 =  "CREATE TABLE IF NOT EXISTS Family (\n"
                    + "	person_id INTEGER UNIQUE ,\n"
                    + "	mother text ,\n"
                    + "	father text ,\n"
                    + "	sibling_1 text ,\n"
                    + "	sibling_2 text, \n"
                    + "	child_1 text ,\n"
                    + "	child_2 text ,\n"
                    + "	friend_1 text ,\n"
                    + "	friend_2 text, \n"
                    + "	FOREIGN KEY (person_id) REFERENCES Person (person_id)\n"
                    + ");";

            String sql3 = "CREATE TABLE IF NOT EXISTS Email (\n"
                    + "	email_id INTEGER NOT NULL UNIQUE PRIMARY KEY ,\n"
                    + "	email_1 text,\n"
                    + "	email_2 text\n"
                    + ");";

            String sql4 = "CREATE TABLE IF NOT EXISTS Phonenumbers (\n"
                    + "	phone_id INTEGER NOT NULL UNIQUE PRIMARY KEY ,\n"
                    + "	phonenumber_1 text,\n"
                    + "	phonenumber_2 text\n"
                    + ");";

            try (Connection conn = DriverManager.getConnection(url);
                 Statement stmt = conn.createStatement()) {
                // create a new table
                stmt.execute(sql1);
                stmt.execute(sql2);
                stmt.execute(sql3);
                stmt.execute(sql4);

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

}
