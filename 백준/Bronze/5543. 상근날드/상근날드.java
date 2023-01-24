import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		int[] burger = new int[3];
		int[] drinks = new int[2];
		for(i = 0; i < 3; i++)
			burger[i] = scanner.nextInt();

		for(i = 0; i < 2; i++)
			drinks[i] = scanner.nextInt();
		int burger_min = burger[0];
		int drink_min = drinks[0];
		for(i = 0; i < 3; i++)
		{
			if(burger_min > burger[i])
				burger_min = burger[i];
		}
		for(i = 0; i < 2; i++)
		{
			if(drink_min > drinks[i])
				drink_min = drinks[i];
		}
		System.out.println(drink_min + burger_min - 50);

	}

}
