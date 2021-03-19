package maison;

public class Door {
	private String color;
	
	public Door(String color) {
		this.setColor(color);
	}
	
	public void display() {
		System.out.println("Je suis une porte, ma couleur est " + this.getColor() + ".");
	}
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
