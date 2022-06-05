package g12c.cw5;

public class Crystal extends Mineral{
    private int magicPower;

    public Crystal (String name, int baseReagent, int dissolubility, int magicPower) {
        super (name, baseReagent, magicPower);
        setMagicPower(magicPower);
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower (int magicPower) {
        if (magicPower < 0) {
            throw new RuntimeException("Magiczna moc nie może być mniejsza niz 0");
        } else {
            this.magicPower = magicPower;
        }
    }
    public int getReagent() {
        return (super.getReagent() + getMagicPower());
    }
}
