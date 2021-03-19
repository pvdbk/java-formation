package etudiant;

public class Student {
	private String nom;
	private int note1;
	private int note2;
	
	public Student(String nom, int note1, int note2) {
		this.setNom(nom);
		this.setNote1(note1);
		this.setNote2(note2);
	}
	
	public double calc_moy() {
		return (this.getNote1() + this.getNote2())/2.0;
	}
	
	public void show() {
		System.out.println("L'étudiant " + this.getNom() + " a une moyenne de " + this.calc_moy() + ".");
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getNote1() {
		return this.note1;
	}
	
	public int getNote2() {
		return this.note2;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setNote1(int note) {
		this.note1 = note;
	}

	public void setNote2(int note) {
		this.note2 = note;
	}
}
