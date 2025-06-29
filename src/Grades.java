import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        if(x>=90 && x<101) {
            System.out.println("Grade A");
        } else if (x>=70 && x<90) {
            System.out.println("Grade B");
        } else if (x>=60 && x<70) {
            System.out.println("Grade C");
        } else if (x>=40 && x<60) {
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }

    }
}
