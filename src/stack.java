import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.remove(2);
        s.push(3);
        s.pop();
        System.out.println(s);

    }
}
