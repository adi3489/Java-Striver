import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
         int sum=0;
         
         if(x>=1&&x<=100)
             sum = x*6;
         else if (x>100 && x<=150) {
             sum = 100*6+(x-100)*7;
         } else if (x>150 && x<=200) {
             sum=100*6+50*7+(x-150)*10;
         } else if (x>200 && x<=300) {
             sum = 100*6+50*7+50*10+(x-50)*15;
         }else{
             sum=100*6+50*7+50*10+100*15+(x-300)*20;
             System.out.println(sum);
         }

    }
}
