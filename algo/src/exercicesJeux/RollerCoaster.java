package exercicesJeux;

public class RollerCoaster {

	public static void main(String[] args) {
		int places = 5;
		int tours = 3;
		int[] file = { 2, 3, 5, 4 };
		int profit = 0;
		for (int tour = 1; tour <= tours; tour++)
		{
			System.out.print("Tour " + tour + " : ");
			int nbOccup = 0;
			for(int groupe = 1; (nbOccup += file[0]) <= places; groupe++) {
				if(groupe > 1) {
					System.out.print(", ");
				}
				System.out.print("groupe " + groupe + " rentre");
				profit += file[0];
				rotate(file);
			}
			System.out.println(" (état de la file : " + arrayToString(file) + ")");
		}
		System.out.println("Profit : " + profit + "€");
	}
	
	public static void rotate(int[] a)
	{
		int temp = a[0];
		int lastIndex = a.length - 1;
		for(int i = 0; i < lastIndex; i++) {
			a[i] = a[i+1];
		}
		a[lastIndex] = temp;
	}
	
	public static String arrayToString(int[] a)
	{
		String ret = "[";
		for(int i = 0; i < a.length; i++) {
			if(i > 0) {
				ret += ", ";
			}
			ret += a[i];
		}
		ret += "]";
		return ret;
	}

}
