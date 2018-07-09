

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.TicketBean;

/**
 * Servlet implementation class AssignTicket
 */
@WebServlet("/AssignTicket")
public class AssignTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignTicket() {
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
		System.out.println(request.getParameter("ticketId"));
		int ticketId = Integer.parseInt(request.getParameter("ticketId"));
		int empId = Integer.parseInt(request.getParameter("empId"));
		
		System.out.println(ticketId + " " + empId);
		TicketBean tb = new TicketBean();
		tb.setRid(empId);
		tb.setTicketNum(ticketId);
		TicketDAO td = new TicketDAO();
        if(td.assign(tb)){
            
            request.getRequestDispatcher("Admin.jsp").include(request, response);
            out.println("<center><font size = '5' color='green'>  Ticket Assigned </font></center>");
        }
        else {

        	 
             request.getRequestDispatcher("AssignTicket.jsp").include(request, response);
             out.println("<center><font size = '5' color='red'>   </font></center>");
        }
			
	}

}

