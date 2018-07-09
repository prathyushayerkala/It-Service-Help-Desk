

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.TicketBean;

/**
 * Servlet implementation class MyClosedTkts
 */
@WebServlet("/MyClosedTkts")
public class MyClosedTkts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyClosedTkts() {
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
		int eid = (Integer)session.getAttribute("eid");
		TicketBean tb = new TicketBean();
		tb.setRid(eid);
		TicketDAO td = new TicketDAO();
		ArrayList<TicketBean> ticketList = td.getItCTkts(tb);
		
		request.setAttribute("ticketList", ticketList);
		request.getRequestDispatcher("ItCTickets.jsp").forward(request, response);
		
		
	}

}
