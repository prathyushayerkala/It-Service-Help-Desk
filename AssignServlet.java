
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.EmployeeBean;
import beans.TicketBean;

/**
 * Servlet implementation class AssignServlet
 */
@WebServlet("/AssignServlet")
public class AssignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		TicketDAO td = new TicketDAO();
		EmployeeDAO ed = new EmployeeDAO();
		ArrayList<TicketBean> openTickets = td.getUnassignedTickets();
		ArrayList<EmployeeBean> itEmps = ed.getItEmployees();
		request.setAttribute("TicketList", openTickets);
		request.setAttribute("employeeList", itEmps);
		request.getRequestDispatcher("AssignTicket.jsp").forward(request, response);
		
	}

}
