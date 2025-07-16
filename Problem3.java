import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        int n = (a % 2 == 0) ? a - 1 : a;
        for (int i = 1; i <= n * 2 - 1; i += 2) {
            System.out.print(i);
            if (i + 2 <= n * 2 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
