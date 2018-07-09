

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.EmployeeBean;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int username = Integer.parseInt(request.getParameter("username"));
	    String password = request.getParameter("password");
	  
		EmployeeBean em = new EmployeeBean();
		em.setEid(username);
		em.setPassword(password);
		EmployeeDAO ed = new EmployeeDAO();
		int eid = 0;
		if (ed.isValid(em)){
			  HttpSession session = request.getSession();
			  session.setAttribute("eid",username);
			  session.setAttribute("password", password);
			  
			  
			
			if(ed.checkUser(em).equals("Admin"))
				response.sendRedirect("admin.jsp");
			else if(ed.checkUser(em).equals("IT Team" ))
				response.sendRedirect("ItTeam.jsp");
			else if(ed.checkUser(em).equals("Project Team"))
				response.sendRedirect("ProjectTeam.jsp");
			else if (ed.checkUser(em)== null)
				out.println("happy");
				
		
		}else{
			response.sendRedirect("HomePage.jsp");
		}
	}

}

