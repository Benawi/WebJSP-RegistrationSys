
import java.sql.*;

public class LoginDao {

    public static boolean validate(String name, String pass) {
        boolean status = false;
        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java2021", "1616");
            //CallableStatement callobj=con.prepareCall("{call SsELECTUSe(?)}");
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
//            CREATE table "REGISTERUSER" (
//    "NAME"       VARCHAR2(25) NOT NULL,
//    "PASS"       VARCHAR2(25) NOT NULL
//)
            PreparedStatement ps = con.prepareStatement("select * from REGISTERUSER where NAME=? and PASS=?");
            ps.setString(1, name);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}
