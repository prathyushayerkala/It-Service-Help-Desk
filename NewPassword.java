

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.EmployeeBean;

/**
 * Servlet implementation class NewPassword
 */
@WebServlet("/NewPassword")
public class NewPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String newp = request.getParameter("newp");
		String conp = request.getParameter("conp");
		if (newp.equals(conp)){
		   EmployeeBean eb = new EmployeeBean();
		   eb.setEid((Integer)session.getAttribute("eid"));
		   eb.setPassword(conp);
		   EmployeeDAO ed = new EmployeeDAO();
  	   if(ed.changePswd(eb)){
  		  session.setAttribute("password", conp);
  		  request.getRequestDispatcher("CurrPswd.jsp").include(request, response);
  		out.println("<center><font size = '5' color='green'> Password Changed Successfully</font></center>");
			   
  	   }
  	   else{
  		 request.getRequestDispatcher("newPassword.jsp").include(request, response);
  		 out.println("<center><font size = '5' color='red'>  Wrong password </font></center>");
		}
		}else{
			request.getRequestDispatcher("newPassword.jsp").include(request, response);
			 out.println("<center><font size = '5' color='red'> Check the password entered </font></center>");
			
		}
		
		
		
	}

}
