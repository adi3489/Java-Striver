import java.util.*;

public class armstrongthrow {

    static int arm(int x) throws Exception {
        int original = x, sum = 0;

        while (x > 0) {
            int digit = x % 10;
            sum += digit * digit * digit;
            x /= 10;
        }
if(sum!=original){
    throw new Exception("equal nhi h ");
}else{
    System.out.println("yes armstrong");
}
        return sum;
    }
    public static void main(String[] args)throws Exception {
        try {
            Scanner s = new Scanner(System.in);
            int x = s.nextInt();

            int answer = arm(x);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
