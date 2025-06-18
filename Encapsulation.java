
class Human{
    private int age;
    // private String name="Tushar";
    private String name;
    
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
    public String getName(){
        return name;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.setAge(50);
        // obj.age=11;
        // obj.name="Tushar"
        // System.out.println(obj.name);
        System.out.println(obj.getAge());
    }
}

