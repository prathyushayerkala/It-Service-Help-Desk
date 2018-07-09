

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.TicketBean;

/**
 * Servlet implementation class RaiseTicket
 */
@WebServlet("/RaiseTicket")
public class RaiseTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RaiseTicket() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		HttpSession session = request.getSession();
		int ownerId = (Integer)session.getAttribute("eid");
		
		String priority = request.getParameter("priority");
		String type = request.getParameter("type");
		String description = request.getParameter("description");
		String equipId = request.getParameter("equipId");
		
		
		PrintWriter out = response.getWriter();
				
		TicketBean tb = new TicketBean();
		tb.setOwnerId(ownerId);
		tb.setPriority(priority);
		tb.setType(type);
		tb.setDescription(description);
		tb.setEquipId(equipId);
		TicketDAO td = new TicketDAO();
		if(td.insert(tb)){
	            
	            request.getRequestDispatcher("ProjectTeam.jsp").include(request, response);
	            out.println("<center><font size = '5' color='green'>  Ticket Created </font></center>");
	        }
		else
			response.sendRedirect("RaiseTicket.jsp");
	}
	
}

