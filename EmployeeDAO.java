   .import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.EmployeeBean;

public class EmployeeDAO {
	public boolean isValid(EmployeeBean eb){
		try{
			Connection con = DBConnectionFactory.getConnection();
			PreparedStatement p = con.prepareStatement("select * from Employee where empId = ? and password = ?");
			p.setInt(1, eb.getEid());
			p.setString(2, eb.getPassword());
			ResultSet rs = p.executeQuery();
			return rs.next();
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
		return false;
	}

	public String checkUser(EmployeeBean eb){
		try{
	//		Class.forName("com.mysql.jdbc.Driver");
	//		Connection con = DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/itshd", "itshd", "itshd");
			Connection con = DBConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement("select department from Employee where empId = ?");
			ps.setInt(1, eb.getEid());
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				return rs.getString(1);
				
			}
			return null;
		}

		catch (SQLException se) {
			se.printStackTrace();
		}
		return null;
	}






	public boolean insert(EmployeeBean eb) {
		try {
			
			Connection con = DBConnectionFactory.getConnection();
			PreparedStatement p =con.prepareStatement("insert into Employee(fname, lname, address, email, department, designation) values(?,?,?,?,?,?)");
			p.setString(1, eb.getFname());
			p.setString(2, eb.getLname());
			p.setString(3, eb.getAddress());
			p.setString(4, eb.getEmail());
			p.setString(5, eb.getDepartment());
			p.setString(6, eb.getDesignation());
			
			if(p.executeUpdate()==1)
				return true;
			else{
				
			        System.out.println("SQL Problem");
				return false;
			}
		}  catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}


	public ArrayList<EmployeeBean> getItEmployees(){
		try{
		//	Class.forName("com.mysql.jdbc.Driver");
		//	Connection con = DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/itshd", "itshd", "itshd");
			Connection con = DBConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Employee where department = 'IT Team'");
			ResultSet rs = ps.executeQuery();
			ArrayList<EmployeeBean> itEmps = new ArrayList<EmployeeBean>();
			while (rs.next()){
				EmployeeBean eb = new EmployeeBean ( rs.getInt(1));
				itEmps.add(eb);
			}
			return itEmps;

		}  catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
	
	public ArrayList<EmployeeBean> showEmps(){
		try {
	//	Class.forName("com.mysql.jdbc.Driver");
	//	Connection con = DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/itshd", "itshd", "itshd");
			Connection con = DBConnectionFactory.getConnection();
			PreparedStatement p = con.prepareStatement("select * from Employee where department != 'Admin'");
		ResultSet rs = p.executeQuery();
		ArrayList<EmployeeBean> empList = new ArrayList<EmployeeBean>();
		while(rs.next()){
			EmployeeBean eb = new EmployeeBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
			empList.add(eb);
			}
		return empList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public boolean deleteEmp(EmployeeBean eb){
		try {
		//	Class.forName("com.mysql.jdbc.Driver");
		//	Connection con = DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/itshd", "itshd", "itshd");
			Connection con = DBConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from Employee where empId = ?");
			ps.setInt(1, eb.getEid());
			
			if(ps.executeUpdate() == 1)
				return true;
			else 
				return false;
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean changePswd(EmployeeBean eb){
		try{
	//	Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/itshd", "itshd", "itshd");
			Connection con = DBConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement("update Employee set password = ? where empId = ?");
		ps.setString(1,eb.getPassword());
		ps.setInt(2,eb.getEid());
		if (ps.executeUpdate() == 1)
			return true;
		else
			return false;
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;	
	}
	
	

    


public EmployeeBean displayProfile(int eid){
	try {
		Connection con = DBConnectionFactory.getConnection();
		PreparedStatement p = con.prepareStatement("select empId, fname, lname, address, email, department, designation from Employee where empId = ?");
		p.setInt(1, eid );
	ResultSet rs = p.executeQuery();
	rs.next();
	EmployeeBean eb = new EmployeeBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6), rs.getString(7));
				
	return eb;
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
	
}

}