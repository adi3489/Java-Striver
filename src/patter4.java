import java.util.Scanner;

public class patter4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for(int i = a; i>=1;i--){
            for(int j =a;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();


        }
    }
}

