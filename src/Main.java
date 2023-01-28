import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/testingFirstTime";
        String user="root";
        String pass = ""; // use the password of your user database server
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        String query = "SELECT * FROM people";
        ResultSet res = st.executeQuery(query);
        while (res.next()){
            System.out.print(res.getString(1));
            System.out.print("   ");
            System.out.print(res.getInt(2));
            System.out.print("   ");
            System.out.print(res.getString(3));
            System.out.println();
        }
        st.close();
        con.close();
    }
}