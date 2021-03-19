package maison;

public class Person {
	private String nom;
	private House house;
	
	public Person(String nom, House house) {
		this.setNom(nom);
		this.setHouse(house);
	}
	
	public void display() {
		System.out.println("Je suis " + this.getNom() + ", je passe la parole à ma maison.");
		this.getHouse().display();
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public House getHouse() {
		return this.house;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setHouse(House house) {
		this.house = house;
	}
}
