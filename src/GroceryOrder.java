public class GroceryOrder extends Order {
    @Override
    public String getDescription() {
        return "Продукты (доставка продуктов)";
    }

    @Override
    public void process() {
        System.out.println("Продукты собираются на складе и доставляются...");
    }
}

