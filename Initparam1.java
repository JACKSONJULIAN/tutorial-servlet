
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Initparam1 extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

PrintWriter out=response.getWriter();
out.print("<h1>Init Parameter Names are : ");
Enumeration enumeration=getServletConfig().getInitParameterNames();
while(enumeration.hasMoreElements())

{
out.print(enumeration.nextElement()+"");
}
ServletConfig con1=getServletConfig();
out.println("<h1>Company"+con1.getInitParameter("Company"));
out.print("Venue"+con1.getInitParameter("venue"));
out.println("Training:"+con1.getInitParameter("Training"));
out.print("<h1>Company:"+getServletConfig().getInitParameter("Company"));
out.print("Venue"+getServletConfig().getInitParameter("Venue"));
out.print("Training:"+getServletConfig().getInitParameter("Training"));

}

}


