class Human
{
    private int age;
    private String name;

    public int getAge(){
        return age;

    }
    public void setAge(int age){
       age=age;
    }
}

public class this_keyword{
    public static void main(String[] args) {
        Human h=new Human();
        h.setAge(80);
        System.out.println(h.getAge());
    }
}