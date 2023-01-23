import java.util.Scanner;

public class Main {
	public static void Bubble_Sort(int[] arr) {
		Bubble_Sort(arr, arr.length - 1);
	}

	private static void Bubble_Sort(int[] arr, int size) {
		int i, j;
		for(i = 0; i < size; i++) {
			for(j = 0; j < size - i; j++) {
				if(arr[j] > arr[j + 1])
					Swap(arr, j, j + 1);
			}
		}
	}
		
	private static void Swap(int []arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int k = scanner.nextInt();
		int i,  j;
		int [] score = new int [N];
		for(i =0; i < N; i++)
			score[i] = scanner.nextInt();
		Main bubble = new Main();
		bubble.Bubble_Sort(score);
		System.out.println(score[N - k]);
	}
	
}
