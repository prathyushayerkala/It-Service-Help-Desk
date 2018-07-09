package beans;
public class EmployeeBean {
    int eid;
    String fname;
    String lname;
    String address;
    String email;
    String department;
    String designation;
    String password;
   
    public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
        return eid;
    }
   
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public EmployeeBean(int eid,String fname, String lname, String address,
            String email, String department, String designation) {
        super();
        this.eid = eid;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.email = email;
        this.department = department;
        this.designation = designation;
    }
    
    public EmployeeBean() {
    }
    
	public EmployeeBean(int eid) {
		this.eid = eid;
	}

	

}
