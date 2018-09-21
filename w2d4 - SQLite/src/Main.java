

public class Main {



    public static void main(String[] args) {

        CreateDB create = new CreateDB();
        CreateTables createTables = new CreateTables();
        InsertData insert = new InsertData();
        QueryData query = new QueryData();

       // create.createNewDatabase("test.db");
       // createTables.createNewTable("test.db");
        insert.insertPerson(0, "Fredrik", "Bjerko", "Kileveien", "18.11.1992", 0, 0);
        insert.insertPhone(0,"94899997", "33395036");
        insert.insertEmail(0,"f.bjerko@gmail.com", "");

        insert.insertPerson(1, "Scott", "Scottie", "SKESSMOKORSE", "Unknown", 1, 1);
        insert.insertPhone(1,"9420394032", "");
        insert.insertEmail(1,"scottie_skedsmo4life@gmail.com", "");
        // query.selectAll();
    }



}