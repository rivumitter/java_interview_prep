package java_8.data;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DataUtility {

    public static List<Employee> getEmployee() {

        return List.of(new Employee("rivu", 27),
                new Employee("rimpa", 26),
                new Employee("rima", 32),
                new Employee("sabhya", 33),
                new Employee("ayan", 32));
    }

    public static List<Item> getItems() {
            return Arrays.asList(
                    new Item("apple", 10, new BigDecimal("9.99")),
                    new Item("banana", 20, new BigDecimal("19.99")),
                    new Item("orange", 10, new BigDecimal("29.99")),
                    new Item("watermelon", 10, new BigDecimal("29.99")),
                    new Item("papaya", 20, new BigDecimal("9.99")),
                    new Item("apple", 10, new BigDecimal("9.99")),
                    new Item("banana", 10, new BigDecimal("19.99")),
                    new Item("apple", 20, new BigDecimal("9.99"))
            );
    }

    public static List<Integer> getNumList() {
        return List.of(1,2,5,6,7,2,6,7,9,10);
    }

    public static <K,V> void printMap(Map<K,V> employeeMap) {
        employeeMap.forEach((k,v) -> System.out.println("key:"+k+" value:"+v));
    }
}
