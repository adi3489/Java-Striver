import java.util.*;
public class Array {
    public static void main(String[] args) {
//        int arr[]={1,2,3,4,5};
//        int arr[] = new int[5];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=4;
//        arr[4]=5;
        //find the sum off array element

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total number of element in the array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the  "+(i+1)+" number: ");
            arr[i] = s.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println("The sum of numbers is  "+ sum);
    }
}



//        int i =0;
//        while(i< arr.length){
//            System.out.println(arr[i]);
//            i++;
//        }

//



