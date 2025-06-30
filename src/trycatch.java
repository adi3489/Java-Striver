
    public class trycatch {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30};

            try {
                // Trying to access index 5 (which doesn't exist)
                System.out.println(arr[5]);
            } catch (Exception e) {
                System.out.println("Array index is out of bounds!");
            }

            System.out.println("Program continues.");
        }
    }