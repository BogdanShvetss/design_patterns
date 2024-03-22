package prototype;

public class Drakon extends Monster {
    public Drakon(String name, int numHeads, boolean canBreathFire) {
        super(name);
        this.numHeads = numHeads;
        this.canBreatheFire = canBreathFire;
    }

    public void spitPoison() {
        System.out.println(this.name + " spits poison");
    }

    @Override
    public Monster copy() throws CloneNotSupportedException {
        return (Monster) this.clone();
    }
}