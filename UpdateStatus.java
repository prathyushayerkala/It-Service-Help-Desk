

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
@WebServlet("/UpdateStatus")
public class UpdateStatus extends HttpServlet {
    private static final long serialVersionUID = 1L;
      
   /**
    * @see HttpServlet#HttpServlet()
    */
   public UpdateStatus() {
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
        int ticketId = Integer.parseInt(request.getParameter("ticketId"));
        TicketBean tb = new TicketBean();
        tb.setTicketNum( ticketId );
        TicketDAO td = new TicketDAO();
        if(td.update(tb)){
            response.sendRedirect("/ItHelpDesk/MyAssignedTkts");
        }else{
           out.println("ERROR");
        }
           
    }

}
