/*import java.util.Scanner;
public class _백준_2738 {
	final class input_arr {
		private final int N;
		private final int M;
	
		public input_arr(int N, int M) {
			this.N = N;
			this.M = M;
		}
		public int getN() {
			return N;
		}
		public int getM() {
			return M;
		}
		public static input_arr sth() {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		return new input_arr(N, M);
	}
	
	public static void input_arr(int[][] arr) {
		int i, j;
		Scanner scanner = new Scanner(System.in);
		input_arr array = sth();
		for(i = 0; i < array.getN(); i++)
		{
			for(j = 0; j < array.getM(); j++)
				arr[i][j] = scanner.nextInt();
		}
	}
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		sth()
		int i, j;
		int [][]arrA = new int [N][M];
		int [][]arrB = new int [N][M];
		input_arr(arrA);
		input_arr(arrB);
		
		for(i = 0; i < N; i++)
		{
			for(j = 0; j < M; j++)
			{
				System.out.print(arrA[i][j] + arrB[i][j] + " ");
			}
			System.out.println();
		}
	}

}
*/


import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static int N = scanner.nextInt();
	public static int M = scanner.nextInt();
	
	public static void main(String[] args) {
	
		//Scanner scanner = new Scanner(System.in);
		//int N = scanner.nextInt();
		//int M = scanner.nextInt();
		int i, j;
		int [][]arrA = new int [N][M];
		int [][]arrB = new int [N][M];
		input_arr(arrA);
		input_arr(arrB);
		
		for(i = 0; i < N; i++)
		{
			for(j = 0; j < M; j++)
			{
				System.out.print(arrA[i][j] + arrB[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public static void input_arr(int[][] arr) {
		//Scanner scanner = new Scanner(System.in);
		int i, j;
		for(i = 0; i < N; i++)
		{
			for(j = 0; j < M; j++)
				arr[i][j] = scanner.nextInt();
		}
	}
}