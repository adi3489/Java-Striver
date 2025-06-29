import java.util.Scanner;

public class rangePalindrome {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int c = s.nextInt();


        while (c >= a) {
            int b = a;
            int reverse = 0;
            int rem=0;
            while (b != 0) {
                rem = b % 10;
                reverse = reverse * 10 + rem;
                b = b / 10;

            }
            if (a == reverse) {
                System.out.println(reverse);
            }
            a++;
        }
    }
}


