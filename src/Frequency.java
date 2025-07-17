import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int[] arr = new int[a]; //input liya size


        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();    //element
        }

        int search = s.nextInt();

        int freq = 0;

        for (int i = 0; i < a; i++) {
            if (arr[i] == search) {
                freq++;
            }
        }

        System.out.println(freq);
    }
}

