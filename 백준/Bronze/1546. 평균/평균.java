import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		double [] arr = new double [N];
		int i;
		double sum = 0;
		double new_arr;
		double M = arr[0];

		
		for(i = 0; i < N; i++)
		{
			arr[i] = scanner.nextInt();
			if(M < arr[i])
				M = arr[i];
		}
		for(i = 0; i < N; i++)
		{
			new_arr = arr[i] / M * 100;
			sum += new_arr;
		}
		System.out.println(sum / N);
	}
}