package exercicesSimples;

public class exo6 {

	public static void main(String[] args) {
		calc(2, "+", 3);
		calc(2, "*", 3);
		calc(2, "-", 3);
		calc(2, "/", 3);
		calc(2, "%", 3);
	}
	
	public static void calc(int a, String op, int b) {
		int res = 0;
		boolean error = false;
		if (op == "+") {
			res = a+b;
		} else if (op == "-") {
			res = a-b;
		} else if (op == "*") {
			res = a*b;
		} else if (op == "/") {
			res = a/b;
		} else {
			error = true;
		}
		if(error) {
			System.out.println("?");
		} else {
			System.out.println(res);
		}
	}

}
