import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println("ENTER A NUMBER");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int i = 2;
        if (a <= 0) {
            System.out.println("0 is not a valid input. Please enter a positive integer greater than 1.");
            return;
        }
        while (i < a) {

            if (a % i == 0) {
                System.out.println("not prime");
                b = true;
                break;
            }
            i++;
        }
        if (b == false) {
            System.out.println("prime");
        }


    }
}

