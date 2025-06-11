
public class Item {
    private float cost;
    private int health;
    private boolean destroyed;
    private DisasterTypes weakness;
    private DisasterTypes strength;
    private String name;
    private String info;
    //private int type;

    //general baseline for all items
    public Item() {
        cost = 0;
        health = 0;
        destroyed = false;
        weakness = DisasterTypes.TYPHOON;
        strength = DisasterTypes.FLOOD;
        name = "blank";
        info = "blank";
    }

    public Item(float cost, int health, boolean destroyed, DisasterTypes weakness, DisasterTypes strength, String name, String info) {
        this.cost = cost;
        this.health = health;
        this.destroyed = destroyed;
        this.weakness = weakness;
        this.strength = strength;
        this.name = name;
        this.info = info;
    }

    float get_cost() {
        return this.cost;
    }

    void set_cost(float cost) {
        this.cost = cost;
    }

    int get_health() {
        return this.health;
    }

    void set_health(int health) {
        this.health = health;
    }

    boolean get_destroyed() {
        return this.destroyed;
    }

    void set_destroyed(boolean destroyed) {
        this.destroyed = destroyed;
        if (destroyed) {
            System.out.println("One of your " + this.name + " has been destroyed.");
        }
    }

    DisasterTypes get_weakness() {
        return this.weakness;
    }

    void set_weakness(DisasterTypes weakness) {
        this.weakness = weakness;
    }

    String get_info() {
        return this.info;
    }

    void set_info(String info) {
        this.info = info;
    }

    DisasterTypes getStrength() {
        return this.strength;
    }

    void setStrength(DisasterTypes strength) {
        this.strength = strength;
    }
}
