package LibrarySystem.JpaLibraryManagement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	private String address;
	private String college;
	
	public Student() {
		
	}

	public Student(int sid, String sname, String address, String college) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
		this.college = college;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + ", college=" + college + "]";
	}
	
	

}
