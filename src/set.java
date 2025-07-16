import java.security.Key;
import java.util.*;

public class set {
    public static void main(String[] args) {
        HashMap<Integer, String> list = new HashMap<>();
        list.put(5, "Aditya");
        list.put(4, "Aditya");
        list.put(2, "Piyush");
        list.forEach((Integer Key, String Value) -> {
            if(Value.equals("Piyush"))
                System.out.println(Key);
        });
    }
}
