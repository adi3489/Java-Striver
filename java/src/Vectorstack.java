import java.util.Vector;

public class Vectorstack {
    public static void main(String[] args) {
        Vector<Integer> s = new Vector<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println(s.get(0));
        System.out.println(s.contains(1));

    }
}
