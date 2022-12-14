package interviews.mainstream;

import interviews.hvhj.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        List<Employee> employee=new ArrayList<Employee>();
        Employee e1=new Employee("abhay",26,120000);
        Employee e2=new Employee("anoop",26,150000);
        Employee e3=new Employee("abh",24,12000);
        Employee e4=new Employee("aay",23,13000);

        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        employee.add(e4);

        List<Employee> employee1 =  employee.stream().map(e-> {
                    if (e.getAge() > 25) {
                        e.setSalary(e.getSalary() * 1.20);
                    }
                    return e;
                }).collect(Collectors.toList());
        System.out.println("employee1!!1");
        System.out.println(employee1);
    }
}
