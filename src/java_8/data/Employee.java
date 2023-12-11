package java_8.data;


import java.util.Objects;

public class Employee {

    private String empName;
    private int age;

    public Employee(String empName, int age) {
        this.empName = empName;
        this.age = age;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(empName, employee.empName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", age=" + age +
                '}';
    }
}
