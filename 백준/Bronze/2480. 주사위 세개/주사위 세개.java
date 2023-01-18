import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int i = 0;
		int money = 0;
		int max;
		
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		//System.out.printf("주사위1 = %d 주사위2 = %d 주사위3 = %d\n", n1, n2, n3);
	
		if(n1 == n2 && n2 == n3)
			money += 10000 + n1 * 1000;
		
		else if(n1 == n2 && n2!= n3)
			money += 1000 + n1 * 100;
		else if(n1 == n3 && n1 != n2)
			money += 1000 + n1 * 100;
		else if(n2 == n3 && n1 != n2)
			money += 1000 + n2 * 100;
		
		else if(n1 != n2 && n2 != n3 && n1!= n3)
		{
			max = (n1 > n2 && n1 > n3) ? n1 : (n2 > n3) ? n2 : n3;
			money = max * 100;
		}
		System.out.printf("%d", money);
	}
}
