import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println(" number");
        int a = s.nextInt();
        System.out.println(" number");
        int b = s.nextInt();

        for(int i = a;i<=b;i++){
            if(i%2==0){
                System.out.println(i +" "+"is a even number");
            }else{
                System.out.println(i +" "+"is a odd number");
            }
        }

    }
}
