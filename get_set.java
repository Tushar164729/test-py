class Human{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

public class get_set{
    public static void main(String[] args) {
        Human obj1=new Human();
        obj1.setAge(70);
        System.out.println(obj1.getAge());
    }
}