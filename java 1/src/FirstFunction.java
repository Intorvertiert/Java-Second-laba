import static java.lang.Math.*;

public class FirstFunction implements Function {
    public final double k;

    public FirstFunction(double k) {
        this.k = k;
    }

    @Override
    public double calculate(double x) {
        return k * x;
    }

    @Override
    public double derivative(double x) {
        return 0.44*pow(exp(1),-1.7*0.44)-cos(x*0.44+1.7)*(1/(2*sqrt(x+1.7*0.44)));
    }
}
