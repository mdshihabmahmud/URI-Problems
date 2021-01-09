import java.util.Scanner;
public class URI_2342 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int total = input.nextInt();
            int a = input.nextInt();
            char ch = input.next().charAt(0);
            int b = input.nextInt();

            if (ch == '+') {
                System.out.printf(((a + b) <= total) ? "OK" : "OVERFLOW");
            } else {
                System.out.printf(((a * b) <= total) ? "OK" : "OVERFLOW");
            }
            System.out.printf("\n");
        }
    }
}
