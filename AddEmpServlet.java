import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.EmployeeBean;

/**
 * Servlet implementation class AddEmpServlet
 */
@WebServlet("/AddEmpServlet")
public class AddEmpServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpServlet() {
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
        
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String designation = request.getParameter("designation");
        String department = request.getParameter("department");
        System.out.println("In Emp Servlet");
        EmployeeBean eb = new EmployeeBean();
        eb.setFname(fname);
        eb.setLname(lname);
        eb.setEmail(email);
        eb.setAddress(address);
        eb.setDesignation(designation);
        eb.setDepartment(department);
        EmployeeDAO ed = new EmployeeDAO();
        if(ed.insert(eb)){
            
            request.getRequestDispatcher("admin.jsp").include(request, response);
            out.println("<center><font size = '5' color='green'>  employee added </font></center>");
        }
        else {

        	 
             request.getRequestDispatcher("admin.jsp").include(request, response);
             out.println("<center><font size = '5' color='red'>  employee not added </font></center>");
        }
               
    }

}

