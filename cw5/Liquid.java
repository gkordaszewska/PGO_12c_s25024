package g12c.cw5;

public class Liquid extends Ingredient {

    private int dissolubility;

    public Liquid(String name, int baseReagent, int dissolubility) {
        super (name, baseReagent);
       setDissolubility(dissolubility);
    }

    public int getDissolubility () {
        return dissolubility;
    }
    public void setDissolubility (int dissolubility) {
        if (dissolubility > 100 || dissolubility < 0) {
            throw new RuntimeException("Wartość musi zawierać się w przedziale od 0 do 100");
        } else {
            this.dissolubility = dissolubility;
        }
    }

    public int getReagent() {
        return (int) (super.getReagent()*getDissolubility()*0.01);
    }

}
