import java.util.Scanner;
public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static int N = scanner.nextInt();
	public static void input_arr(int[] arr) {
		//int []arrA = new int [N];
		//int []arrB = new int [N];
		int i;
		for(i = 0; i < N; i++)
			arr[i] = scanner.nextInt();
//		for(i =0; i < N; i++)
//			arrB[i] = scanner.nextInt();
	}
	
//	public static void bubble_sort_up(int[] arr) {
//		int []arrA = new int [N];
//		int i, j;
//		for(i = 0; i < N; i++) {
//			for(j = 0; j < N - i - 1; j++)
//			{
//				if(arrA[j] > arrA[j + 1])
//				{
//					int temp;
//					temp = arrA[j];
//					arrA[j] = arrA[j + 1];
//					arrA[j + 1] = temp;
//				}
//			}
//		}
//	}
//	public static void bubble_sort_down(int[] arr) {
//		int []arrB = new int [N];
//		int i, j;
//		for(i = 0; i < N; i++) {
//			for(j = 0; j < N - i - 1; j++) {
//				if(arrB[j] < arrB[j + 1])
//				{
//					int temp;
//					temp = arrB[j];
//					arrB[j] = arrB[j + 1];
//					arrB[j + 1] = temp;
//				}
//			}
//		}
//	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//int N = scanner.nextInt();
		int i, j;
		int []arrA = new int [N];
		int []arrB = new int [N];
		
//		for(i = 0; i < N; i++)
//			arrA[i] = scanner.nextInt();
//		for(i =0; i < N; i++)
//			arrB[i] = scanner.nextInt();
		
		input_arr(arrA);
		input_arr(arrB);
		
		for(i = 0; i < N; i++) {
			for(j = 0; j < N - i - 1; j++)
			{
				if(arrA[j] > arrA[j + 1])
				{
					int temp;
					temp = arrA[j];
					arrA[j] = arrA[j + 1];
					arrA[j + 1] = temp;
				}
			}
		}
	
		for(i = 0; i < N; i++) {
			for(j = 0; j < N - i - 1; j++) {
				if(arrB[j] < arrB[j + 1])
				{
					int temp;
					temp = arrB[j];
					arrB[j] = arrB[j + 1];
					arrB[j + 1] = temp;
				}
			}
		}
	
		int sum = 0;
		for(i = 0; i< N; i++)
		{	
			
			sum += arrA[i] * arrB[i];
			
		}
		System.out.println(sum);
	}

}