public class variables {
    int age =10;//instance
static int num=89;
    public static void main(String[] args) {
        variables obj = new variables();
        System.out.println(obj.age);
        obj.age=56;
        System.out.println(obj.age);
        System.out.println(num);
    }
}
