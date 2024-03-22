package memento;

public class MementoApp {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("LVL 1", 30000);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("LVL 2", 400000);
        System.out.println(game);

        System.out.println("Loading...");
        game.load(file.getSave());
        System.out.println(game);
    }
}