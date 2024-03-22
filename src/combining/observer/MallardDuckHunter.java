package combining.observer;

public class MallardDuckHunter implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println(duck + " has just quacked, my wife will cook it for our dinner.");
    }
}
