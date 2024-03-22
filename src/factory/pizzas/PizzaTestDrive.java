package factory.pizzas;

public class PizzaTestDrive {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        System.out.println(cheesePizza);

        Pizza veggiePizza = pizzaStore.orderPizza("veggie");
        System.out.println(veggiePizza);
    }
}
