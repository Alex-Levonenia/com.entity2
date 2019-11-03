import java.sql.SQLOutput;

public class Human extends Entity implements Runnable {
    protected static final boolean WAS_BORN_AT_EARTH = true;
    private int height;
    private String name;

    public Human(int weight, int height, String name){
        super(weight);
        this.height = height;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeRun() {
        System.out.println(getClass().getName()+": I run");
    }

    public static void main(String[] args) {
        Man.saySomething();
        Man man = new Man(64,185, "Ivan");
        man.makeRun();

        Woman.saySomething();
        Woman woman = new Woman(52, 167,"Anna");

        woman.makeRun();
        System.out.println(woman.getHeight());
        System.out.println(woman.getWeight());
        System.out.println(woman.getName());
        System.out.println(Woman.WAS_BORN_AT_EARTH);

        String s1 = "qwe";
        String s2 = "we";
        String s3 = "q" + s2;
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(getHashCode(3523564));


    }

    public static int getHashCode(Integer integer){
        return integer.hashCode();
    }
}

