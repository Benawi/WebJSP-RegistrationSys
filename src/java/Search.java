
import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Search extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();

            PreparedStatement ps = con.prepareStatement("select * from USERPROFILE");
            //  ps.setInt(1, roll);

            out.print("<table width=50% border=1>");
            out.print("<caption>Result:</caption>");
            ResultSet rs = ps.executeQuery();

            /* Printing column names */
            ResultSetMetaData rsmd = rs.getMetaData();
            int total = rsmd.getColumnCount();
            out.print("<tr>");
            for (int i = 1; i <= total; i++) {
                out.print("<th>" + rsmd.getColumnName(i) + "</th>");

            }
            out.print("</tr>");

            /* Printing result */
            while (rs.next()) {
                out.print("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(4) + "</td><td>"+rs.getString(5)+"</td></tr>");

            }
            out.print("</table>");

        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            out.close();
        }
    }

}
