package g12c.cw5;

public class Ore extends Mineral {

private boolean metallic;

public Ore (String name, int baseReagent, int power, boolean metallic) {
    super (name, baseReagent, power);
    setMetallic (metallic);
}
    public boolean isMetallic() {
        return metallic;
    }
    public void setMetallic (boolean metallic) {
        this.metallic=metallic;
    }
    public int getReagent () {
        if (!metallic) {
            return (super.getReagent()/2);
        } else {
            return (super.getReagent());
        }
    }
}
