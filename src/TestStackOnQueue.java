public class TestStackOnQueue {
    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();

        stack.push(10);
        stack.push(20);

        System.out.println("Верхний элемент (top): " + stack.top());

        System.out.println("Удалённый элемент (pop): " + stack.pop());

        System.out.println("Стек пуст? " + stack.empty());

        System.out.println(stack);
    }
}