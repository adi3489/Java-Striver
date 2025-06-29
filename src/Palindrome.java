import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
      int b = a;
        int reverse = 0;
        int rem;

        while(a!=0){
            rem = a%10;
            reverse = reverse*10+rem;
            a= a/10;

        }
        if (b==reverse){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

    }
}
