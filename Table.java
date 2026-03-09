public class Table implements Furniture {
    private double size;

    public Table(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visit(this);
    }
}