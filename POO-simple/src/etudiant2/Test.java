package etudiant2;

public class Test {
	public static void main(String[] args) {
		new Person().hello();
		Student student = new Student();
		student.setAge(15);
		student.hello();
		student.goToClasses();
		student.displayAge();
		Teacher teacher = new Teacher();
		teacher.setAge(40);
		teacher.hello();
		teacher.explain();
	}
}
