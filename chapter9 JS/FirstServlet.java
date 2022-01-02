import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public  class FirstServlet extends HttpServlet {
	private static final String CONTENT_TYPE = "text/html";

	public void service(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException {
		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Test Servlet</title></head>");
		out.println("<body>");
		out.println("<p>Hello World</p>");
		out.println("<p>The servlet has received a POST." + "This is the reply.<p>");

		out.println("</body>");
		out.println("</html>");

		out.close();
	} 
}