package session_17_equals_hashCode_generics.practice;

import java.util.HashSet;
import java.util.Set;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setId(1l);
        emp1.setFirstName("John");
        emp1.setLastName("Doe");

        Employee emp2 = new Employee();
        emp1.setId(1l);
        emp1.setFirstName("John");
        emp1.setLastName("Doe");

        Employee emp3 = new Employee();
        emp1.setId(2l);
        emp1.setFirstName("Bob");
        emp1.setLastName("James");

        System.out.println("Emp1 equals emp2?: "+ emp1.equals(emp2));


        Set<Employee> EmployeeSet = new HashSet<Employee>(); {
        }
    }
}
