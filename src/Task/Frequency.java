package Task;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int[] arr = new int[a]; //input liya size


        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();    //give element one by one
        }

        int search = s.nextInt(); //search element

        int freq = 0; //count of search element

        for (int i = 0; i < a; i++) {
            if (arr[i] == search) {
                freq++;
            }
        }

        System.out.println(freq);
    }
}

