import java.sql.SQLOutput;

public class Entity {
    private int weight;

    public Entity(int weight){
        this.weight = weight;

    }

    public int getWeight(){
        return weight;
    }
    public static void say(){
        System.out.println("Say");
    }
}
