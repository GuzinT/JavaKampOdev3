package odev3;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "G�zin", " Turgut", "guzin@gmail.com", "******", "Java");
		Instructor instructor1 = new Instructor(1, "Engin", " Demiro�","engin@gmail.com", "********", "Java");

		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor1);
		
		
	}

}
