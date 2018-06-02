package StudentInfo;

public class Student {

	public static void main(String args[]) { // public void print
												// student(),print
		StudentInfo student = new StudentInfo(); // use defined variable-Student
		student.setId(012);
		student.setFirstName("Devi");
		student.setLastName("Uthirabalan");
		student.setGender("Female");
		student.setCourse("BE");
		student.setDept("ECE");

		System.out.println(student.toString());
	}
}