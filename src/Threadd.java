public class Threadd extends Thread {

    public void run() {
        System.out.println("inside thread");
    }

    public static void main(String[] args) {
        Threadd obj = new Threadd();

        obj.start();
        System.out.println("outside");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }

}


//public class Threadd implements Runnable {
//    public void run() {
//        System.out.println("inside thread");
//    }
//
//    public static void main(String[] args) {
//        Threadd obj = new Threadd();
//
//        Thread t = new Thread(obj);
//        t.start();
//        System.out.println("outside");
//
//        obj.run();
//        System.out.println("Hello");
//    }
//}



//class EvenRunnable implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0) System.out.println("Even: " + i);
//        }
//    }
//}
//
//
//class OddRunnable implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 != 0) System.out.println("Odd: " + i);
//        }
//    }
//}
//
//public class Threadd {
//    public static void main(String[] args) {
//        Thread even = new Thread( EvenRunnable());
//        Thread odd = new Thread(OddRunnable());
//
//        even.start();
//        odd.start();
//    }
//}


