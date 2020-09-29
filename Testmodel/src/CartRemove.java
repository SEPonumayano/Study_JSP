

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartRemove
 */
@WebServlet("/CartRemove")
public class CartRemove extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartRemove() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html; charset=UTF-8");
    	request.setCharacterEncoding("UTF-8");
		PrintWriter out =response.getWriter();
    	out.println("<html>");
	    out.println("<head>");
	    out.println("<title>一括削除完了</title>");
	    out.println("</head>");
	    out.println("<body>");

	    HttpSession session=request.getSession();
	    session.removeAttribute("cart");

	    out.println("<p>削除しました。</p>");

	    out.println("<br>");
	    out.println("<a href=\"http://localhost:8080/Testmodel/CartGet\">一覧</a>");

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
