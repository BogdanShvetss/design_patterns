package prototype;

public class Client {
    public static void main(String[] args) {
        Monster dragon = new Dragon("dragon", false);
        Monster drakon = new Drakon("drakon", 2, true);

        Monster dragonPrototype = makeMonster(dragon, "dragonPrototype");
        Monster drakonPrototype = makeMonster(drakon, "drakonPrototype");

        System.out.println(drakonPrototype);
        drakonPrototype.spitPoison();

        System.out.println(dragonPrototype);
        dragonPrototype.spitPoison();
    }

    public static Monster makeMonster(Monster monsterToCopy, String name) {
        Monster newMonster = null;
        try {
            newMonster = monsterToCopy.copy();
            newMonster.setName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newMonster;
    }
}