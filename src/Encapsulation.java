public class Encapsulation {
    int age;
    String name;

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setAge(20);
        obj.setName("night");
        System.out.println(obj.getAge()+" "+obj.getName());
    }
}
