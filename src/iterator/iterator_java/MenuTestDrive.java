package iterator.iterator_java;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        ArrayList list = new ArrayList(Arrays.asList(pancakeHouseMenu, dinerMenu, cafeMenu));

        Waitress waitress = new Waitress(list);
        waitress.printMenu();
    }
}