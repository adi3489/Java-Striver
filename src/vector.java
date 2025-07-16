import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector <Integer> s = new Vector<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(6);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(6);
        s.add(6);
        System.out.println(s.capacity());
        System.out.println(s);
    }
}
