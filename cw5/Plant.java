package g12c.cw5;

public class Plant extends Ingredient {
    protected int toxity;

    public Plant (String name, int baseReagent, int toxity ){
        super(name, baseReagent);
        setToxity(toxity);
    }
    public int getToxity() {
        return toxity;
    }
    public void setToxity (int toxity) {
        if (toxity < 0) {
            throw new RuntimeException("Wartość nie może być mniejsza od 0");
        } else {
            this.toxity = toxity;
        }
    }
    public int getReagent () {
        if (getToxity() > 0) {
            return (super.getReagent() * getToxity());
        } else {
            return super.getReagent();
        }
    }

}
