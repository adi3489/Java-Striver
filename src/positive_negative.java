import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if(a>=0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }
}
