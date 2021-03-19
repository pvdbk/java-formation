package pokemon;

public class Pokemon {
	public String nom;
	public double hp;
	public double atk;
	
	public Pokemon(String nom, double hp, double atk) {
		this.setNom(nom);
		this.setHp(hp);
		this.setAtk(atk);
	}

	@Override
	public String toString() {
		return this.getNom() + " a " + this.getHp() + " points de vie et " + this.getAtk() + " points d'attaque.";
	}
	
	public void attaquer(Pokemon p) {
		p.perdHp(this.getAtk());
	}
	
	public void perdHp(double n) {
		this.setHp(this.getHp() - n);
	}
	
	public boolean isDead() {
		return this.getHp() <= 0;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public double getHp() {
		return this.hp;
	}
	
	public double getAtk() {
		return this.atk;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setHp(double hp) {
		this.hp = hp;
	}
	
	public void setAtk(double atk) {
		this.atk = atk;
	}
}
