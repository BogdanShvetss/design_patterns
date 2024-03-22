package adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class EnumerationIteratorTestDrive {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        Vector<String> vector = new Vector<>(list);

        Iterator<?> iterator = new EnumerationIterator(vector.elements());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
