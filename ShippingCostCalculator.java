public class ShippingCostCalculator implements ShippingVisitor {
    @Override
    public double visit(Chair chair) {
        return 15.0;
    }

    @Override
    public double visit(Table table) {
        return table.getSize() * 2.5;
    }

    @Override
    public double visit(Sofa sofa) {
        return sofa.getVolume() * 5.0;
    }
}