package visitor;

public class CarElement implements Element {
    Element[] elements;

    public CarElement() {
        this.elements = new Element[]{
                new WheelElement("front right wheel"),
                new WheelElement("front left wheel"),
                new WheelElement("back right wheel"),
                new WheelElement("back left wheel"),
                new BodyElement(),
                new EngineElement()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}