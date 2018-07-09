
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.TicketBean;

/**
 * Servlet implementation class AssignTicket
 */
@WebServlet("/MyAssignedTkts")
public class MyAssignedTkts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyAssignedTkts() {
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
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();

		int empId = (Integer)session.getAttribute("eid");
		TicketBean tb = new TicketBean();
		tb.setRid(empId);
		TicketDAO td = new TicketDAO();
		ArrayList<TicketBean> myTickets = td.PendingTickets(tb);
		System.out.println(myTickets);

		request.setAttribute("myTickets", myTickets);
		request.getRequestDispatcher("myOpenTickets.jsp").forward(request,response);

	}

}

