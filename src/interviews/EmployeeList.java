package interviews;

import interviews.hvhj.Employee;

import java.util.ArrayList;

public class EmployeeList {
    public ArrayList<Employee> createemployeelist(){
        ArrayList<Employee> EmployeeList=new ArrayList<>();
        Employee emp1=new Employee("Abhay",23,4500);
        Employee emp2=new Employee("Ajay",24,5500);

        EmployeeList.add(emp1);
        EmployeeList.add(emp2);

        return EmployeeList;
    }

    public static void main(String[] args) {
        EmployeeList obj=new EmployeeList();
        ArrayList<Employee> EmployeeList=obj.createemployeelist();
        for (Employee var :EmployeeList){
            System.out.println("Employee Detail :"+var.getName() +var.getAge() +var.getSalary());
        }
    }
}
