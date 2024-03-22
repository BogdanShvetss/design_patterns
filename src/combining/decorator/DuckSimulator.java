package combining.decorator;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable readHeadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new RubberDuck();

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(readHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        System.out.println(QuackCounter.getNumberOfQuacks());
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}