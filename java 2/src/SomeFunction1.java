import static java.lang.Math.*;

public class SomeFunction1 implements Function {
    private final Function a;
    private final Function b;

    public SomeFunction1(Function a, Function b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return pow(exp(1),-(b.calculate(x)*0.44))*sin(a.calculate(x)*0.44+b.calculate(x))-sqrt(b.calculate(x)*0.44+a.calculate(x));
    }

    @Override
    public double derivative(double x) {
        return a.derivative(x);
    }

   /* @Override
    public SomeFunction derivative() {
        return new SomeFunction(a.derivative(), b.derivative());
    }*/
}
