import java.util.Scanner;

public class patter3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for(int i = a; i>0;i--){
            for(int j =i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
