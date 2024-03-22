package iterator.iterator_java;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList<Menu> menus;

    public Waitress(ArrayList menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> iterator = menus.iterator();
        while (iterator.hasNext()) {
            Iterator<MenuItem> menuItemIterator = iterator.next().createIterator();
            System.out.println("Menu");
            printMenu(menuItemIterator);
        }
    }

    public void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}