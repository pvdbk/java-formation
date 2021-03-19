package etudiant2;

public class Student extends Person {
	public void goToClasses() {
		System.out.println("I'm going to class.");
	}
	
	public void displayAge() {
		System.out.println("My age is: " + this.getAge() + " years old.");
	}
}
