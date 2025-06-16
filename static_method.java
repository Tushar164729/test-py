class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand+ ":"+price+":"
        +name);
    }
}

public class static_method{
    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        // obj1.name="SmartPhone";
        Mobile.name="SmartPhone";

        Mobile obj2=new Mobile();
        obj2.brand="Apple";
        obj2.price=1500;
        // obj2.name="SmartPhone";
        Mobile.name="SmartPhone";

        // obj1.name="Phone";

        obj1.show();
    }
}

