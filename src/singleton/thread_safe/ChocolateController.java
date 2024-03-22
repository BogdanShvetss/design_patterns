package singleton.thread_safe;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();

        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
    }
}
