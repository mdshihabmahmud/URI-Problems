import java.util.Scanner;
public class URI_3040 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();

            while (t != 0) {
                int h = input.nextInt();
                int d = input.nextInt();
                int g = input.nextInt();

                if (h <= 300 && h >= 200 && d >= 50 && g >= 150) {
                    System.out.printf("Sim\n");
                } else {
                    System.out.printf("Nao\n");
                }
                t--;
            }
        }
    }
}
