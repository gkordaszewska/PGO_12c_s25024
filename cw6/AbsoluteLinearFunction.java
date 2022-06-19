package g12c.cw6;

public class AbsoluteLinearFunction extends LinearFunction implements Fun {

    public AbsoluteLinearFunction (double a, double b) {
        super (a,b);
    }


    @Override
    public double f(double x) {
        return Math.abs(getA()*x+getB());
    }
}
