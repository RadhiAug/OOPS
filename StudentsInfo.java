package week2.Day1;

public class StudentsInfo {

	public void getStudentDetails() {
		System.out.println("Roshini");
	}
	public void getStudentDetails(int subno,int id) {
		System.out.println("test");
	
	}
	public void getStudentDetails(int phno ) {
		System.out.println("Roshini");
	}
	public void getStudentDetails(String name) {
		System.out.println("rosh");
	}
	public void getStudentDetails(String name, int phno) {
		System.out.println("test");
	}
	public static void main(String[] args) {
		StudentsInfo stud = new StudentsInfo();
		stud.getStudentDetails();
		stud.getStudentDetails("958236666");
		stud.getStudentDetails("Shilpa");
		stud.getStudentDetails("story", 95822);
		stud.getStudentDetails(4, 526);
	}
}
