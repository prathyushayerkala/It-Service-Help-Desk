
<%@ page import = "java.util.*,beans.TicketBean" %>

<%
ArrayList<TicketBean> ticketList ; 
%>

<%  ticketList = (ArrayList)request.getAttribute("ticketList"); %>


<style>
table, td, th {
border : 1px solid black;
border-collapse : collapse;
padding : 10px }
</style>
<center> <h1> Employee List </h1>
<br><br>
<table>
<tr>
<th>TicketNum</th>
<th>OwnerId</th>
<th>Priority</th>
<th>Type</th>
<th>Description</th>
<th>StartDate</th>
<th>EquipId</th>
<th>Status</th>
<th>Rid</th>
<th>EndDate</th>
</tr>
<%
for (TicketBean eb : ticketList){
out.println("<tr>");
out.println("<td>" + eb.getTicketNum() + "</td>");
out.println("<td>" + eb.getOwnerId() + "</td>");
out.println("<td>" + eb.getPriority() + "</td>");
out.println("<td>" + eb.getType() + "</td>");
out.println("<td>" + eb.getDescription() + "</td>");
out.println("<td>" + eb.getStartdate() + "</td>");
out.println("<td>" + eb.getEquipId() + "</td>");
out.println("<td>" + eb.getStatus() + "</td>");
out.println("<td>" + eb.getRid() + "</td>");
out.println("<td>" + eb.getEndDate() + "</td>");
out.println("<td><a href = '/ItHelpDesk/DeleteEmpServlet?eid=" + eb.getTicketNum() + "'></a> </td>");
out.println("</tr>");
}
%>
</table></center>
