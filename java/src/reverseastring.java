import java.util.*;

public class reverseastring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String rev = "  ";

        for (int i = input.length() - 1; i >= 0; i--) {
            rev  += input.charAt(i);
        }

        System.out.println( rev);
    }
}