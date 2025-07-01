public class Throw {
    void checkage(int age) throws  Exception{
        if(age<18){
            throw new Exception("bhai tu eligible nhi h");
        }else{
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) throws Exception{
        Throw obj = new Throw();
        obj.checkage(19);
    }
}
