import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        list.add(99);
        list.add(100);
        list.add(90);
        list.add(80);
        list.add(9);
        list.add(10);
        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list.offer(2));


    }
}
