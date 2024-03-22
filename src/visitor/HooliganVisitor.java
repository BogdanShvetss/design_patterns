package visitor;

public class HooliganVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Starting the engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Kicking the body");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Smocking in the car");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Piercing " + wheel.getName());
    }
}