import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String [] arr = new String[n];
		int i, j;
		for(i = 0; i < arr.length; i++)
		{
			arr[i] = scanner.next();
		}
		
		for(i = 0; i < arr.length; i++)
		{
			int score = 0;
			int sum = 0;
			for(j = 0; j < arr[i].length(); j++)
			{
				if(arr[i].charAt(j) == 'O' || arr[i].charAt(j) == 'o')
					score++;
				else
					score = 0;
				sum += score;
			}
			System.out.println(sum);
		}
		
			
	}
}
