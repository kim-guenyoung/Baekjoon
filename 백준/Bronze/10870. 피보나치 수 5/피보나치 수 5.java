import java.util.Scanner;


public class Main {
	
	public static int recursive(int n) {
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		else
			return recursive(n - 1) + recursive(n - 2);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.println(recursive(n));
	}
}