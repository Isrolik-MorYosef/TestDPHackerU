/**
 * Created by Isrolik morYossef on 6/27/2019 | 15:47 AM.
 */
public class FlyWeightNode implements Flyweight {
    int base;
    int exponent;

    public FlyWeightNode(int base, int exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    @Override
    public double operation() {
        return Math.pow(base, exponent);
    }
}
