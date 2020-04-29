import static java.lang.Math.*;

public class SecondFunction implements Function {
    public final double k;

    public SecondFunction(double k) {
        this.k = k;
    }

    @Override
    public double calculate(double x) {
        return k * x;
    }
    @Override
    public double derivative(double x) {
        return 1.7*pow(0.44,2)*cos(x*pow(0.44,2)*cos(0.88));
    }
}
