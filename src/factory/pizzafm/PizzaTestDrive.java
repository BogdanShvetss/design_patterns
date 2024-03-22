package factory.pizzafm;

public class PizzaTestDrive {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza cheesePizzaNy = nyPizzaStore.orderPizza("cheese");
        System.out.println(cheesePizzaNy);

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza veggiePizza = chicagoPizzaStore.createPizza("veggie");
        System.out.println(veggiePizza);
    }
}