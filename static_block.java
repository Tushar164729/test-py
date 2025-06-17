class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name="Phone";
        System.out.println("in static block");
    }
    public Mobile(){
        brand="";
        price=200;
        System.out.println("in constructor");
        
    }
    public void show(){
        System.out.println("in show method");
    }
}



public class static_block {
    public static void main(String[] args) {
        Mobile obj2=new Mobile();
        Mobile obj1=new Mobile();
    }
}
