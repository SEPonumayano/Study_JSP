

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class RequestTest
 */
@WebServlet("/RequestTest")
public class RequestTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out =response.getWriter();

		out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Hello World!</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>Hello World!</h1>");

	    out.println("<p>Method<br>"+request.getMethod()+"</p>");
	    out.println("<p>Request URL<br>"+request.getRequestURL()+"</p>");
	    out.println("<p>Context Path<br>"+request.getContextPath()+"</p>");
	    out.println("<p>Servlet Path<br>"+request.getServletPath()+"</p>");
	    out.println("<p>Query String<br>"+request.getQueryString()+"</p>");
	    out.println("<p>Protocol<br>"+request.getProtocol()+"</p>");

	    out.println("<p>Request URL<br>"+request.getRequestURL()+"</p>");
	    out.println("<p>Scheme<br>"+request.getScheme()+"</p>");
	    out.println("<p>Server Name<br>"+request.getServerName()+"</p>");
	    out.println("<p>Server Port<br>"+request.getServerPort()+"</p>");

	    out.println("</body>");
	    out.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
