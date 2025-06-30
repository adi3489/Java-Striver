import java.util.Scanner;

public class primeNumber {

    public  static String Prime(int a) {
           if (a < 2) {
               return "Not prime";
           }
           for (int i = 2; i <a; i++) {
               if (a % i == 0) {
                   return "Not prime";
               }
           }
        return "Primee";
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int a = s.nextInt();
            String result = Prime(a);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("galatttt");
        }
    }
}

