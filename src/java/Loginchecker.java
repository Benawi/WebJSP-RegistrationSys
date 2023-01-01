
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Loginchecker extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n = request.getParameter("name");
        String p = request.getParameter("pass");
        //out.print("YOUr data"+n);
        String proximaPage = " ";
        if (LoginDao.validate(n, p)) {
            proximaPage = "/home.jsp";
        } else {
           proximaPage = "/ErrorPage.html";
            out.print("Sorry username or password error");
            
        }
        RequestDispatcher rd = request.getRequestDispatcher(proximaPage);
        rd.forward(request, response);
        //out.close();
    }

}
