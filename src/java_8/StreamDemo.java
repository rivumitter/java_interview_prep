package java_8;

import java_8.data.Employee;
import java_8.data.DataUtility;
import java_8.data.Item;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {


        List<Employee> employeeList = List.of(new Employee("rivu", 27),
                new Employee("rimpa", 26),
                new Employee("rima", 32),
                new Employee("sabhya", 33),
                new Employee("ayan", 32));


        List<String> employees = employeeList.stream()
                .filter(employee -> employee.getAge() > 30)
                .peek(employee -> {
                    if("ayan".equals(employee.getEmpName()))
                        employee.setEmpName("babai");
                })
                .map(Employee::getEmpName)
                .collect(Collectors.toList());

         // System.out.println(employees);

        //   employees.forEach(employee -> System.out.println(employee.getEmpName()));
        //
        //   / employees.parallelStream().forEach(employee -> System.out.println(employee.getEmpName()));


        // Collectors.groupingBy(Function<T,V> fn)

        // Collectors.groupingBy(Function<T,V> fn, Collectors c)

        // Collectors.groupingBy(Function<T,V> fn, Supplier<T> sp, Collectors c)

        // group employee by age

        Map<Integer, List<Employee>> employeeMap = DataUtility.getEmployee().stream().collect(Collectors.groupingBy(Employee::getAge));

       // DataUtility.printMap(employeeMap);


        // count number of fruits

        List<String> fruitNames = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

        Map<String, Long> fruitsMap = fruitNames.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

       // DataUtility.printMap(fruitsMap);


        // item names grouped by the quantity.

        Map<String, Integer> itemsMap = DataUtility.getItems().stream().collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));

      //  DataUtility.printMap(itemsMap);


        // group the employee names by their age

        Map<Integer, List<String>> employeeNameMap = DataUtility.getEmployee().stream()
                .collect(Collectors.groupingBy(Employee::getAge, Collectors.mapping(Employee::getEmpName, Collectors.toList())));

      //  DataUtility.printMap(employeeNameMap);


        // get duplicate elements in a list

        Set<Integer> duplicateData = DataUtility.getNumList().stream()
                .filter(num -> Collections.frequency(DataUtility.getNumList(), num) > 1).collect(Collectors.toSet());

     //   System.out.println(duplicateData);

        // get second-highest data

        Integer integer = DataUtility.getNumList().stream().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(-1000);

      //  System.out.println(integer);

        // sums of integer

        int sum = DataUtility.getNumList().stream().mapToInt(num -> num).sum();

        System.out.println(sum);


    }
}
