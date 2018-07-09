package beans;
import java.sql.Date;


public class TicketBean {
    int TicketNum;
    int ownerId;
    String priority;
    String type;
    String description;
    String equipId;
    Date startdate;
    String status;
    int rid;
    Date enddate;
    public TicketBean(int ticketNum, int ownerId, String priority, String type,
			String description, String equipId, Date startdate, String status) {
		super();
		TicketNum = ticketNum;
		this.ownerId = ownerId;
		this.priority = priority;
		this.type = type;
		this.description = description;
		this.equipId = equipId;
		this.startdate = startdate;
		this.status = status;
	}
	Date endDate;
    
    
    public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	
	public int getTicketNum() {
		return TicketNum;
	}
	public void setTicketNum(int ticketNum) {
		TicketNum = ticketNum;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setStatus(String stat) {
		this.status = stat;
	}
	public String getStatus() {
		return status;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEquipId() {
		return equipId;
	}
	public void setEquipId(String equipId) {
		this.equipId = equipId;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	
	
	public TicketBean(int ticketNum, int ownerId, String priority, String type,
			String description, String equipId, Date startdate, String status, int rid, Date endDate) {
		super();
		TicketNum = ticketNum;
		this.ownerId = ownerId;
		this.priority = priority;
		this.type = type;
		this.description = description;
		this.equipId = equipId;
		this.startdate = startdate;
		this.status = status;
		this.rid = rid;
		this.endDate = endDate;
		
	}
	public TicketBean() {
	
	}
	@Override
	public String toString() {
		return "TicketBean [TicketNum=" + TicketNum + ", ownerId=" + ownerId
				+ ", priority=" + priority + ", type=" + type
				+ ", description=" + description + ", equipId=" + equipId
				+ ", startdate=" + startdate + ", status=" + status + ", rid="
				+ rid + ", endDate=" + endDate + "]";
	}
    
   
  
   
   
   

}