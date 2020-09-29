

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Customer;
import dao.CustomerDAO;

/**
 * Servlet implementation class LogAction
 */
@WebServlet("/LogAction")
public class LogAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogAction() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	try {  //takahashi add


        		HttpSession session =request.getSession();

        		String login =request.getParameter("login");
        		String password=request.getParameter("password");
        		CustomerDAO dao=new CustomerDAO();
        		Customer customer = null;

				try {
					customer = dao.search(login,password);
				} catch (Exception e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}

        		if(customer!=null) {
        			session.setAttribute("customer",customer);

        			RequestDispatcher rd = request.getRequestDispatcher("/login-out.jsp");
            		rd.forward(request, response);
        		}else {
        		RequestDispatcher rd = request.getRequestDispatcher("/login-error.jsp");
        		rd.forward(request, response);
        		}
        		//takahashi add↓
        }catch (Exception e) {
        	e.printStackTrace();
        }
    	//takahashi add↑
        	}




	}


