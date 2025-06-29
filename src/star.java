import java.util.Scanner;
public class star {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for(int i =0;i<a;i++){
            for(int j=0;j<a-i-1;j++){
                System.out.print("_");

                }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
