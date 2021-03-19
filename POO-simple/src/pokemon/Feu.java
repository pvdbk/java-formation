package pokemon;

public class Feu extends Pokemon {
	public Feu(String nom, int hp, int atk) {
		super(nom, hp, atk);
	}
	
	@Override
	public void attaquer(Pokemon p) {
		if(p instanceof Plante) {
			p.perdHp(2*this.getAtk());
		} else if(p instanceof Eau || p instanceof Feu) {
			p.perdHp(this.getAtk()/2);
		} else {
			super.attaquer(p);
		}
	}
}
