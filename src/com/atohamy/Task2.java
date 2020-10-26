package com.atohamy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        List<Employee> Employees= Arrays.asList(
          new Employee("SE","Hatem","01012719996"),
          new Employee("SE","Kadry","01029893098"),
          new Employee("SE","Yahya","01029893098"),
          new Employee("ASE","Tohamy","01012719996")
        );
        Collections.sort(Employees,(e1,e2)-> e1.getName().compareTo(e2.getName()) );
        String titles[] = {"SE","ASE"};
        System.out.println("Software developers ");
        System.out.println("Count: "+ Employees.stream()
                .filter(employee -> employee.getTitle().equals(titles[0]))
                .count());
        Employees.stream()
                .filter(employee -> employee.getTitle().equals(titles[0]))
                .forEach(wrapperForValidation(employee -> System.out.println("Name "+ employee.getName() + " - Mobile "+ employee.getNumber()),Employees,titles[0]));
        System.out.println("Associate Software developers ");
        System.out.println("Count: "+ Employees.stream()
                .filter(employee -> employee.getTitle().equals(titles[1]))
                .count());
        Employees.stream()
                .filter(employee -> employee.getTitle().equals(titles[1]))
                .forEach(wrapperForValidation(employee -> System.out.println("Name "+ employee.getName() + " - Mobile "+ employee.getNumber()),Employees,titles[1]));
    }
    private static Consumer<Employee> wrapperForValidation(Consumer<Employee> consumer, List<Employee> Employees, String title )
    {
        return employee -> {
            try {
                if(Employees.stream().filter(testemployee -> testemployee.getTitle().equals(title)).count()<2)
                    throw new Exception() ;
                consumer.accept(employee);
            }catch (Exception e)
            {
                System.out.println("Employees are less than two");
            }

        };
    }
}

