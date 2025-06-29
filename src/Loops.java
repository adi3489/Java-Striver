import java.sql.SQLOutput;
import java.util.*;
public class Loops {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0;i<=10;i++){
            int a = n*i;

            System.out.println(   n +"*"+i+  "=" +a );
        }

    }
}
