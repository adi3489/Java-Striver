import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int a = s.nextInt();

        int fact = 1;


        while(a>1){
            if(a==0){
                System.out.println("0");
                break;
            }
            fact = a*fact;
            a--;
        }
        System.out.println(fact);
    }
}
