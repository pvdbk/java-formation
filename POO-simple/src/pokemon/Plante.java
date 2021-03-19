package pokemon;

public class Plante extends Pokemon {
	public Plante(String nom, int hp, int atk) {
		super(nom, hp, atk);
	}

	@Override
	public void attaquer(Pokemon p) {
		if(p instanceof Eau) {
			p.perdHp(2*this.getAtk());
		} else if(p instanceof Plante || p instanceof Feu) {
			p.perdHp(this.getAtk()/2);
		} else {
			super.attaquer(p);
		}
	}
}
