package exercicesSimples;

public class exo13 {

	public static void main(String[] args) {
		int[] intArray = { 3, 1, 5, 2, 10, 11, 4 };
		sort(intArray);
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(" " + intArray[i]);
		}
	}

	public static void sort(int[] toSort) {
		boolean somethingDone;
		int iMax = toSort.length-1;
		do {
			somethingDone = false;
			for(int i = 0; i < iMax; i++) {
				if(toSort[i] > toSort[i+1]) {
					int temp = toSort[i];
					toSort[i] = toSort[i+1];
					toSort[i+1] = temp;
					somethingDone = true;
				}
			}
			iMax--;
		} while (somethingDone);
	}
}
