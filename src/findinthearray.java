import java.util.*;
public class findinthearray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();   //taking the input ok

        int arr[] = new int[a]; //that inout will be our array size

        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int b =s.nextInt();
        boolean f = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==b){
                f=true;
                System.out.println("yes at "+i);
               // return;
            }

          }
        //System.out.println("not found");
        if (f == false){
            System.out.println("not found");
        }
        }

}

