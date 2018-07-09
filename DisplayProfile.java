
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import beans.EmployeeBean;


/**
 * Servlet implementation class UpdateAgencyServlet
 */
@WebServlet("/DisplayProfile")
public class DisplayProfile extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayProfile() {
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
     * @return
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        response.setContentType("text/html");
        HttpSession session = request.getSession();
		int id = (Integer)session.getAttribute("eid");
        EmployeeDAO ed = new EmployeeDAO();
        EmployeeBean eb = new EmployeeBean();
        eb = ed.displayProfile(id);
        System.out.println(eb);
        request.setAttribute("employee" , eb);
        request.getRequestDispatcher("DisplayProfile.jsp").forward(request, response);
            
            }

           
     
    
}
