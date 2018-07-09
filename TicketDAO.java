import java.sql.*;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import beans.TicketBean;

public class TicketDAO {

	public boolean insert(TicketBean tb){
		try {
	//		Class.forName("com.mysql.jdbc.Driver");
	//		Connection con = DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/itshd", "itshd", "itshd");
			Connection con = DBConnectionFactory.getConnection();
			PreparedStatement p = con.prepareStatement("insert into Ticket(ownerId, priority, type, description, equipId, startDate) values(?,?,?,?,?,now())");

			p.setInt(1, tb.getOwnerId());
			p.setString(2, tb.getPriority());
			p.setString(3, tb.getType());
			p.setString(4, tb.getDescription());
			p.setString(5, tb.getEquipId());

			if (p.executeUpdate() == 1)
				return true;
			else
				return false;
		}
		
		catch (SQLException se) {
			se.printStackTrace();
		}
		return false;
	}


	public boolean update(TicketBean tb){
		try{
	//		Class.forName("com.mysql.jdbc.Driver");
		//	Connection con = DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/itshd", "itshd", "itshd");
			Connection con = DBConnectionFactory.getConnection();
			PreparedStatement p = con.prepareStatement("update Ticket set status ='close', endDate = now() where TicketNum = ?");

			p.setInt(1, tb.getTicketNum());
			if (p.executeUpdate() == 1)
				return true;
			else
				return false;
		}catch (SQLException se) {
			se.printStackTrace();
		}
		return false;
	}


	public ArrayList<TicketBean> getAllTickets(){
		try{
	//		Class.forName("com.mysql.jdbc.Driver");
		//	Connection con = DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/itshd", "itshd", "itshd");
			Connection con = DBConnectionFactory.getConnection();
			PreparedStatement p = con.prepareStatement("select * from Ticket");
			ResultSet rs =p.executeQuery();
			ArrayList<TicketBean> ticketList = new ArrayList<TicketBean>();
			while (rs.next()){
				TicketBean tb = new TicketBean(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6), rs.getDate(7), rs.getString(8), rs.getInt(9), rs.getDate(10));
				ticketList.add(tb);
			}
			return ticketList;
		}

		catch (SQLException se) {
			se.printStackTrace();
		}
		return null;
	}

	public ArrayList<TicketBean> getOpenTickets(){
		try{
//			Class.forName("com.mysql.jdbc.Driver");
	//		Connection con = DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/itshd", "itshd", "itshd");
			Connection con = DBConnectionFactory.getConnection();
			PreparedStatement p = con.prepareStatement("select * from Ticket where status = 'OPEN' ");
			ResultSet rs =p.executeQuery();
			ArrayList<TicketBean> ticketList = new ArrayList<TicketBean>();
			while (rs.next()){
				TicketBean tb = new TicketBean(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6), rs.getDate(7), rs.getString(8), rs.getInt(9), rs.getDate(10));
				ticketList.add(tb);
				System.out.println(tb);
			}
			return ticketList;
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
		return null;
	}


	public ArrayList<TicketBean> getClosedTickets(){
		try{
		//	Class.forName("com.mysql.jdbc.Driver");
		//	Connection con = DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/itshd", "itshd", "itshd");
			Connection con = DBConnectionFactory.getConnection();
			PreparedStatement p = con.prepareStatement("select * from Ticket where status = 'close' ");
			ResultSet rs =p.executeQuery();
			ArrayList<TicketBean> ticketList = new ArrayList<TicketBean>();
			while (rs.next()){
				TicketBean tb = new TicketBean(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6), rs.getDate(7), rs.getString(8), rs.getInt(9), rs.getDate(10));
				ticketList.add(tb);
				System.out.println(tb);
			}
			return ticketList;
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
		return null;
	}

	public ArrayList<TicketBean> getUnassignedTickets() {
		try{
		//	Class.forName("com.mysql.jdbc.Driver");
	//		Connection con = DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/itshd", "itshd", "itshd");
			Connection con = DBConnectionFactory.getConnection();
			PreparedStatement p = con.prepareStatement("select * from Ticket where rid is null");
			ResultSet rs =p.executeQuery();
			ArrayList<TicketBean> ticketList = new ArrayList<TicketBean>();
			while (rs.next()){
				TicketBean tb = new TicketBean(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6), rs.getDate(7), rs.getString(8), rs.getInt(9), rs.getDate(10));
				ticketList.add(tb);
				//System.out.println(tb);
			}
			return ticketList;
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
		return null;
	}
	public boolean assign(TicketBean tb){
		try{
	//		Class.forName("com.mysql.jdbc.Driver");
		//	Connection con = DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/itshd", "itshd", "itshd");
			Connection con = DBConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement("update Ticket set rid = ? where TicketNum = ?");
			ps.setInt(1, tb.getRid() );
			ps.setInt(2, tb.getTicketNum());

			if(ps.executeUpdate() == 1)
				return true;
			else
				return false;

		}catch (SQLException se) {
			se.printStackTrace();
		}
		return false;
	}


	public ArrayList<TicketBean> PendingTickets(TicketBean tb){

	try {

	//	Class.forName("com.mysql.jdbc.Driver");
		//Connection con = DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/itshd", "itshd", "itshd");
		Connection con = DBConnectionFactory.getConnection();
		PreparedStatement p = con.prepareStatement("select * from Ticket where rid = ? and status = 'open' order by priority");
		p.setInt(1, tb.getRid());

		ResultSet rs = p.executeQuery();

		ArrayList<TicketBean> myTickets = new ArrayList<TicketBean>();

		while(rs.next()) {

			TicketBean t = new TicketBean(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6), rs.getDate(7), rs.getString(8)); 
			
			myTickets.add(t);

		}

		return myTickets;

	}
	
	catch (SQLException se) {
		se.printStackTrace();
	}

	return null;

}
	
public ArrayList<TicketBean> getItCTkts(TicketBean tb) {
	try {

//		Class.forName("com.mysql.jdbc.Driver");
	//	Connection con = DriverManager.getConnection("jdbc:mysql://192.168.7.48:3306/itshd", "itshd", "itshd");
		Connection con = DBConnectionFactory.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from Ticket where rid = ? and status = 'CLOSE'");
		ps.setInt(1, tb.getRid());

		ResultSet rs = ps.executeQuery();

		ArrayList<TicketBean> myTickets = new ArrayList<TicketBean>();

		while(rs.next()) {

			TicketBean t = new TicketBean(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6), rs.getDate(7), rs.getString(8));
			myTickets.add(t);

		}

		return myTickets;

	}
		catch (SQLException se) {
		se.printStackTrace();
	}

	return null;

}


public ArrayList<TicketBean> getPTickets(TicketBean tb){
	try{
		Connection con = DBConnectionFactory.getConnection();
		PreparedStatement p = con.prepareStatement("select * from Ticket where ownerId = ?");
		p.setInt(1,tb.getOwnerId() );
		ResultSet rs = p.executeQuery();
		ArrayList<TicketBean> ticketList = new ArrayList<TicketBean>();
		while (rs.next()){
			TicketBean t = new TicketBean(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6), rs.getDate(7), rs.getString(8), rs.getInt(9), rs.getDate(10));
			ticketList.add(t);
		}
		return ticketList;
	}

	catch (SQLException se) {
		se.printStackTrace();
	}
	return null;
}
		
}


