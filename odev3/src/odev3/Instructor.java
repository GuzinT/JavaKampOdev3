package odev3;

public class Instructor extends User{
	private String giveCourse;
	
	
	public Instructor(int Id, String firstName, String lastName, String eMail, String password, String giveCourse) {
		super(Id, firstName, lastName, eMail, password);
		this.giveCourse = giveCourse;
	}
	
	public String getGiveCourse() {
		return giveCourse;
	}
	public void setGiveCourse(String givecourse) {
		this.giveCourse = givecourse;
	}

}
