import static testPack.A.a;
public class Man extends Human {
    public Man(int weight, int height, String name) {
        super(weight, height, name);
    }

    public static void saySomething(){
        System.out.println("No");
    }
    {
        System.out.print("This is in block: " );
        System.out.println(getName());
    }
    static {
        System.out.print("This is in static block: " );
        saySomething();
    }
}
