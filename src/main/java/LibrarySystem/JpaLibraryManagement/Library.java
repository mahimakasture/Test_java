package LibrarySystem.JpaLibraryManagement;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Library {
	@Id
	private int lid;
	private String lname;
	private String branch;
	@OneToMany
	private List<Student> Student;

	
	public Library() {
		
	}


	public Library(int lid, String lname, String branch, List<LibrarySystem.JpaLibraryManagement.Student> student) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.branch = branch;
		Student = student;
	}


	public int getLid() {
		return lid;
	}


	public void setLid(int lid) {
		this.lid = lid;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public List<Student> getStudent() {
		return Student;
	}


	public void setStudent(List<Student> student) {
		Student = student;
	}


	@Override
	public String toString() {
		return "Library [lid=" + lid + ", lname=" + lname + ", branch=" + branch + ", Student=" + Student + "]";
	}
	
}
