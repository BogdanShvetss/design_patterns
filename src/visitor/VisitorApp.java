package visitor;

public class VisitorApp {
    public static void main(String[] args) {
        Element car = new CarElement();

        HooliganVisitor hooliganVisitor = new HooliganVisitor();
        car.accept(hooliganVisitor);

        System.out.println("__________________");

        MechanicVisitor mechanicVisitor = new MechanicVisitor();
        car.accept(mechanicVisitor);
    }
}