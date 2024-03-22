package iterator.iterator_java;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public MenuItem setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public MenuItem setDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public MenuItem setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public MenuItem setPrice(double price) {
        this.price = price;
        return this;
    }
}
