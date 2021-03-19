package pokemon;

public class Eau extends Pokemon {
	public Eau(String nom, int hp, int atk) {
		super(nom, hp, atk);
	}
	
	@Override
	public void attaquer(Pokemon p) {
		if(p instanceof Feu) {
			p.perdHp(2*this.getAtk());
		} else if(p instanceof Plante || p instanceof Eau) {
			p.perdHp(this.getAtk()/2);
		} else {
			super.attaquer(p);
		}
	}
}
