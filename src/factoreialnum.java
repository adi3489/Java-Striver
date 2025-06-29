import java.util.Scanner;

public class factoreialnum {

    static int factorial(int a) {
        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum = sum * i;
           // return sum;
        }
        return sum;
    }

        public static void main (String[]args){
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            factorial(a);
            System.out.println(factorial(a));
        }
    }

