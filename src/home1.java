import java.sql.SQLOutput;
import java.util.Scanner;

abstract class Shape{
    abstract int area(int r);
}

class circle extends Shape{

    int area(int r) {
        float pie = 3.14f;
        float a = pie*r*r;
        return (int)a;
    }
}

class Rectangle extends circle{

    int area(int l,int b){
        int area=l*b;
        return area;
    }
}
public class home1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE RADIUS");
        int r= s.nextInt();
        System.out.println("ENTER THE LENGTH");
        int l = s.nextInt();
        System.out.println("ENTER THE BREADTH");
        int b = s.nextInt();

        Rectangle rec = new Rectangle();
        System.out.println("AREA OF RECTANGLE : "+rec.area(l,b));
        circle c=new circle();
        System.out.println("AREA OF CIRCLE : "+c.area(r));


    }
}
