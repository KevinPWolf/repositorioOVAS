import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MainServlet extends HttpServlet{

	private String mymsg;
	
	public void init() throws ServletException  {
	      mymsg = "Hello World!";
	   }

	public void doGet(HttpServletRequest request, 
	        HttpServletResponse response) throws ServletException, 
	        IOException 
	    {            
	        // Setting up the content type of web page      
	        response.setContentType("text/html");
	        // Writing the message on the web page      
	        PrintWriter out = response.getWriter();      
	        out.println("<h1>" + mymsg + "</h1>");      
	        out.println("<p>" + "Hello Friends!" + "</p>");   
	    }

	public void destroy() {
		      /* leaving empty for now this can be
		       * used when we want to do something at the end
		       * of Servlet life cycle
		       */
		   }
}
