public class PizzaOrder extends Order {
    @Override
    public String getDescription() {
        return "Пицца (доставка пиццы)";
    }

    @Override
    public void process() {
        System.out.println("Пицца готовится и доставляется курьером...");
    }
}