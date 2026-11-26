public class TestDeliveryFactory {
    public static void main(String[] args) {
        System.out.println("=== Доставка пиццы ===");
        DeliveryService pizzaService = new PizzaDelivery();
        pizzaService.deliver();

        System.out.println("\n=== Доставка продуктов ===");
        DeliveryService groceryService = new GroceryDelivery();
        groceryService.deliver();
    }
}