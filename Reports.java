

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.TicketBean;

/**
 * Servlet implementation class Reports
 */
@WebServlet("/Reports")
public class Reports extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reports() {
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
		TicketDAO td = new TicketDAO();
		ArrayList<TicketBean> openTickets = td.getOpenTickets();
		request.setAttribute("TicketList", openTickets );
		request.getRequestDispatcher("allTickets.jsp").forward(request, response);
		
		response.setContentType("text/html");
		TicketDAO td1 = new TicketDAO();
		ArrayList<TicketBean> closedTickets = td1.getClosedTickets();
		request.setAttribute("TicketList", closedTickets);
		request.getRequestDispatcher("allTickets.jsp").forward(request, response);
	}

}
