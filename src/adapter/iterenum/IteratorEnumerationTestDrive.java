package adapter.iterenum;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {
        List<Integer> numbers = generateList(100);

        Enumeration<?> enumeration = new IteratorEnumeration(numbers.iterator());

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }

    static List<Integer> generateList(int limit) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < limit; i++) {
            numbers.add(i);
        }

        return numbers;
    }
}
