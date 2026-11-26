public abstract class DeliveryService {
    // Фабричный метод
    public abstract Order createOrder();

    // Общий метод доставки
    public void deliver() {
        Order order = createOrder();
        System.out.println("Доставка заказа: " + order.getDescription());
        order.process();
    }
}