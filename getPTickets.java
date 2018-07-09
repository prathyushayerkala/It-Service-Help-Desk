

import java.io.IOException;
import java.net.HttpRetryException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.TicketBean;

/**
 * Servlet implementation class getPTickets
 */
@WebServlet("/getPTickets")
public class getPTickets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPTickets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		TicketBean tb = new TicketBean();
		tb.setOwnerId((Integer)session.getAttribute("eid"));
		
		TicketDAO td = new TicketDAO();
	ArrayList<TicketBean> allTickets = td.getPTickets(tb);
		request.setAttribute("TicketList", allTickets);
		request.getRequestDispatcher("allTickets.jsp").forward(request, response);
	}

}
