import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int [] arr = new int[N];
		int i, cnt = 0;
		for(i = 0; i < N; i++)
			arr[i] = scanner.nextInt();
		int v = scanner.nextInt();
		for(i = 0; i < N; i++)
			if(arr[i] == v)
				cnt++;
		System.out.println(cnt);
	}

}
