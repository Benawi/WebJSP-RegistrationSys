
import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Register extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //out.print("hello html");
        String n = request.getParameter("userName");
        String p = request.getParameter("userPass");
        String e = request.getParameter("userEmail");
        String c = request.getParameter("userCountry");
        String s = request.getParameter("Sex");

        try {
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            out.print("You are connected successfully ...");
            PreparedStatement ps = con.prepareStatement("insert into registeruser values(?,?,?,?,?)");
            ps.setString(1, n);
            ps.setString(2, p);
            ps.setString(3, e);
            ps.setString(4, c);
            ps.setString(5, s);

            int i = ps.executeUpdate();
            if (i > 0) {
                out.print("You are successfully Inserted...");
                out.print("<form action=\"/Webregisteruser/servlet/Search\" method=\"\">\n"
                        + "<input type=\"submit\" value=\"View\"/>");
                ps = con.prepareStatement("select * from REGISTERUSER");
                out.print("<table width=50% border=1>");
                out.print("<caption>Result:</caption>");
                ResultSet rs = ps.executeQuery();

                /* Printing column names */
                ResultSetMetaData rsmd = rs.getMetaData();
                int total = rsmd.getColumnCount();
                out.print("<tr>");
                for (i = 1; i <= total; i++) {
                    out.print("<th>" + rsmd.getColumnName(i) + "</th>");

                }
                out.print("</tr>");

                /* Printing result */
                while (rs.next()) {
                    out.print("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(4) +"</td><td>" + rs.getString(5) + "</td></tr>");

                }
                out.print("</table>");
            }

        } catch (Exception e2) {
            System.out.println(e2);
        }

        out.close();
    }

}
