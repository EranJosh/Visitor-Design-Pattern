import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Furniture> cart = new ArrayList<>();
        cart.add(new Chair(5.0));
        cart.add(new Table(20.0));
        cart.add(new Sofa(50.0));

        ShippingVisitor calculator = new ShippingCostCalculator();

        for (Furniture item : cart) {
            double cost = item.accept(calculator);
            System.out.println("Shipping cost for " + item.getClass().getSimpleName() + ": $" + cost);
        }
    }
}