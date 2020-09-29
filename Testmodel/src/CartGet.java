

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import chapter17.Product;

/**
 * Servlet implementation class CartGet
 */
@WebServlet("/CartGet")
public class CartGet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartGet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setContentType("text/html;charset=UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
    	request.setCharacterEncoding("UTF-8");
		PrintWriter out =response.getWriter();
    	out.println("<html>");
	    out.println("<head>");
	    out.println("<title>aa</title>");
	    out.println("</head>");
	    out.println("<body>");

	    out.println("<p>一覧</p>");

	    HttpSession session=request.getSession();

	    List<Product> cart=(List<Product>)session.getAttribute("cart");
	    if(cart!=null) {
	    	for(Product p:cart) {
	    		out.println("<p>");
	    		out.println(p.getName());
	    		out.println(":");
	    		out.println(p.getPrice());
	    		out.println("</p>");
	    	}
	    }

	    out.println("<br>");
	    out.println("<a href=\"http://localhost:8080/Testmodel/cart-add.jsp\">追加</a>");
	    out.println("<br>");
	    out.println("<a href=\"http://localhost:8080/Testmodel/CartRemove\">一括削除</a>");

	    out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
