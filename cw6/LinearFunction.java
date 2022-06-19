package g12c.cw6;

public class LinearFunction extends Function implements Fun {
    private double a;
    private double b;

    public LinearFunction (double a, double b) {
        setA (a);
        setB (b);
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a=a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b=b;
    }

    @Override
    public double f (double x) {
        return (getA()*x+getB());
    }

    @Override
    void increaseCoefficientsBy(double delta) {

        setA (a+delta);
        setB (b+delta);
    }

    @Override
    void decreaseCoefficientsBy(double delta) {
        setA(a-delta);
        setB(b-delta);
    }




}
