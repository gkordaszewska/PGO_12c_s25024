package g12c.cw5;

public class Alcohol extends Liquid {

    private int percent;

    public Alcohol (String name, int baseReagent, int dissolubility, int percent) {
        super(name, baseReagent, dissolubility);
        setPercent(percent);
    }

    public int getPercent() {
        return percent;
    }
    public void setPercent(int percent) {
        if (percent>100 || percent<0) {
            throw new RuntimeException("Wartość musi zawierać się w przedziale od 0 do 100");
        } else {
            this.percent=percent;
        }
    }

   public int getReagent () {
        return super.getReagent() - percent;
   }

}
