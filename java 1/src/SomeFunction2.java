import static java.lang.Math.*;

public class SomeFunction2 implements Function {
    private final Function a;
    private final Function b;

    public SomeFunction2(Function a, Function b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return b.calculate(x)*sin(a.calculate(x)*pow(0.44,2)*cos(2*0.44))-1;
    }

    @Override
    public double derivative(double x) {
        return a.derivative(x);
    }
}
