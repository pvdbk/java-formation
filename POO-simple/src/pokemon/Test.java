package pokemon;

public class Test {
	public static void main(String[] args) {
		Feu feu = new Feu("Feu", 10, 1);
		Plante pla = new Plante("Pla", 10, 1);
		Eau eau = new Eau("Eau", 10, 1);
		Pokemon pok = new Pokemon("Pok", 10, 1);
		feu.attaquer(feu);
		feu.attaquer(pla);
		feu.attaquer(eau);
		feu.attaquer(pok);
		System.out.println(feu.toString());
		System.out.println(pla.toString());
		System.out.println(eau.toString());
		System.out.println(pok.toString());
		System.out.println();
		pla.attaquer(feu);
		pla.attaquer(pla);
		pla.attaquer(eau);
		pla.attaquer(pok);
		System.out.println(feu.toString());
		System.out.println(pla.toString());
		System.out.println(eau.toString());
		System.out.println(pok.toString());
		System.out.println();
		eau.attaquer(feu);
		eau.attaquer(pla);
		eau.attaquer(eau);
		eau.attaquer(pok);
		System.out.println(feu.toString());
		System.out.println(pla.toString());
		System.out.println(eau.toString());
		System.out.println(pok.toString());
		System.out.println();
		pok.attaquer(feu);
		pok.attaquer(pla);
		pok.attaquer(eau);
		pok.attaquer(pok);
		System.out.println(feu.toString());
		System.out.println(pla.toString());
		System.out.println(eau.toString());
		System.out.println(pok.toString());
	}
}
