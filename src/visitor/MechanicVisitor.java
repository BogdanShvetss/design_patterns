package visitor;

public class MechanicVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Checking the engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Cleaning the body");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Painting the car");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Pumping up " + wheel.getName());
    }
}