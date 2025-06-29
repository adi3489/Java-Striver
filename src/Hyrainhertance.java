// Parent class
public class Hyrainhertance {
    void show() {
        System.out.println("This is the parent class - Hyrainhertance");
    }
}

// First child class
class ChildOne extends Hyrainhertance {
    void displayChildOne() {
        System.out.println("This is the first child class - ChildOne");
    }
}

// Second child class
class ChildTwo extends Hyrainhertance {
    void displayChildTwo() {
        System.out.println("This is the second child class - ChildTwo");
    }
}

// Main class to test
class TestHierarchy {
    public static void main(String[] args) {
        ChildOne c1 = new ChildOne();
        c1.show();             // from Hyrainhertance
        c1.displayChildOne();  // from ChildOne

        ChildTwo c2 = new ChildTwo();
        c2.show();             // from Hyrainhertance
        c2.displayChildTwo();  // from ChildTwo
    }
}