import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  //킹1 퀸1 룩2 비숍2 나이트2 폰8 K Q R B Kn P
    Scanner scanner = new Scanner(System.in);
    int K = scanner.nextInt();
    int Q = scanner.nextInt();
    int R = scanner.nextInt();
    int B = scanner.nextInt();
    int Kn = scanner.nextInt();
    int P = scanner.nextInt();


    System.out.println(1 - K);
    System.out.println(1 - Q);
    System.out.println(2 - R);
    System.out.println(2 - B);
    System.out.println(2 - Kn);
    System.out.println(8 - P);
  }
}