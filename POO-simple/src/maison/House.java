package maison;

public class House {
	private double surface;
	private Door door;
	
	public House(double surface, Door door) {
		this.setSurface(surface);
		this.setDoor(door);
	}
	
	public void display() {
		System.out.println("Je suis une maison, ma surface est de " + this.getSurface() + " m². Je passe la parole à ma porte.");
		this.getDoor().display();
	}
	
	public double getSurface() {
		return this.surface;
	}
	
	public void setSurface(double surface) {
		this.surface = surface;
	}

	public Door getDoor() {
		return this.door;
	}
	
	public void setDoor(Door door) {
		this.door = door;
	}
}
