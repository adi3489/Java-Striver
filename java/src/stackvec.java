import java.util.Stack;

public class stackvec {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
                s.add(1);
                s.add(2);
                s.add(3);
        System.out.println(s.contains(2));
        System.out.println(s.get(1));
        System.out.println(s.search(1));


        }

    }

