package odev3;

public class Student extends User{
	private String registeredCourse;
	

	public Student(int Id, String firstName, String lastName, String eMail, String password, String registeredCourse) {
		super(Id, firstName, lastName, eMail, password);
		this.registeredCourse = registeredCourse;
	}

	public String getRegisteredCourse() {
		return registeredCourse;
	}
	public void setRegisteredCourse(String registeredCourse) {
		this.registeredCourse = registeredCourse;
	}
	
	
	
	

}
