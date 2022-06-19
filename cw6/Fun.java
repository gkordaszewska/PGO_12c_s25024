package g12c.cw6;

public interface Fun {
    double f(double x);

    static double minimum(Fun func, double a, double b, double alpha) {
        if (a>=b) {
            throw new RuntimeException("Parametr a musi być mniejszy od b");
        } else {
            double min = func.f(a);
            double tmp;
            for (double i=a; i<=b; i=i+alpha) {
                tmp = func.f(i);
                if (tmp < min) {
                    min = tmp;
                }
            }
            return min;
        }
        }
    }

