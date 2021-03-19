package etudiant2;

public class Person {
	private int age;
	
	public Person() {}

	public void hello() {
		System.out.println("Hello");
	}
	
	public int getAge()
	{
		return this.age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
}
