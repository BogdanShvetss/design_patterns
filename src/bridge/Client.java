package bridge;

public class Client {
    public static void main(String[] args) {
        TVFactory tvFactory = new TVFactory();
        SpecialRemote remoteSony = new SpecialRemote(tvFactory);
        System.out.println("Connect your remote to TV");
        remoteSony.setTv("Sony");
        remoteSony.on();
        remoteSony.up();
        remoteSony.down();
        remoteSony.off();

        System.out.println("\n\n");

        GenericRemote remoteLG = new GenericRemote(tvFactory);
        System.out.println("Connect your remote to tv");
        remoteLG.setTv("LG");
        remoteLG.on();
        remoteLG.nextChannel();
        remoteLG.prevChannel();
        remoteLG.off();
    }
}