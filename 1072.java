import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  int N , X, in = 0, out = 0;
  int interval_start =10,interval_end =20 ;

  Scanner input =new Scanner(System.in);

  N =input.nextInt();
  for (int i = 1; i <= N; i++) {
   X =input.nextInt();
   if (X >= interval_start && X <= interval_end) {
    in += 1;
   }else {
    out += 1;
   }
  }
  System.out.print(in+" in\n"+out +" out\n");


 }

}
