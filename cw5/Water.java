package g12c.cw5;

public class Water extends Liquid {

    private boolean distilated;

    public Water (String name, int baseReagent, int dissolubility, boolean distilated) {
        super(name, baseReagent, dissolubility);
        setDistilated(distilated);
    }

    public boolean isDistilated () {
        return distilated;
    }

    public void setDistilated (boolean distilated) {
        this.distilated = distilated;
    }

    public int getReagent () {
        if (!distilated) {
            return super.getReagent()/2;
        } else {
            return (super.getReagent());
        }
    }

}
