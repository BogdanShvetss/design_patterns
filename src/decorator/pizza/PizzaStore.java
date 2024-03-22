package decorator.pizza;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new ThickCrustPizza();
        Pizza cheesePizza = new Cheese(pizza);
        Pizza greekPizza = new Olives(cheesePizza);

        System.out.println(greekPizza.getDescription() + "\n" + "price is - $" + greekPizza.cost());
    }
}
