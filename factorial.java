public class factorial {

	public static void main(String[] args) {
		int num = 3;
		int r = factorial(num);
		if(r == -1)
			System.out.println("Error occured. Unable to do negative numbers");
		else
			System.out.println("\n\n" + num + "! Factorial is: " + r);
	}

	public static int factorial(int n) {
		if(n < 0)
			return -1;
		else
			return factorial(1, n, 1);
	}

	public static int factorial(int a, int n, int total) {
		if(a-1 == n)
			return total;
		else
			return factorial(a+1, n, total*a);
	}

}