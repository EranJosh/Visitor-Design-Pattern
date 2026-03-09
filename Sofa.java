public class Sofa implements Furniture {
    private double volume;

    public Sofa(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visit(this);
    }
}