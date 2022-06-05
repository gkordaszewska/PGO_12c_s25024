package g12c.cw5;

public class Mineral extends Ingredient {
    protected int power;

    public Mineral (String name, int baseReagent, int power) {
        super (name, baseReagent);
        setPower(power);
    }

    public int getPower() {
        return power;
    }

    public  void setPower (int power) {
        if (power < 0) {
         throw new RuntimeException("Wartość nie może być mniejsza niż 0");
        } else {
            this.power = power;
        }
    }
    public int getReagent () {
        return (super.getReagent()+getPower());
    }
}
