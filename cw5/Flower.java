package g12c.cw5;

public class Flower extends Plant {

    public Flower (String name, int baseReagent, int toxity) {
        super (name, baseReagent, toxity);
    }
    public int getReagent() {
        return (super.getReagent() * 2);
    }
}
