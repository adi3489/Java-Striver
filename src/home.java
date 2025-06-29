class car{
    String color;
    String speed;

    public void run(){
        System.out.println("car start to run buddy");
    }
}
class Alto800 extends car{
    public void run(){
        System.out.println("car running on uttrakhand");
    }
}

public class home {
    public static void main(String[] args) {
        car c = new car();
        c.run();
        Alto800 s = new Alto800();
        s.run();
    }
}
