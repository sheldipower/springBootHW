package service;

import pojo.Employee;
import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    int getAllEmployeeSumSalary();
    String  getEmployeeMinSalary();
    String  getEmployeeMaxSalary();
    List<Employee>  getEmployeeHighSalarySalary();
    private final static List<Employee> EMPLOYEE_LIST = List.of(
            new Employee("Катя", 90_000),
            new Employee("Дима", 102_000),
            new Employee("Олег", 80_000),
            new Employee("ОлЬга", 40_000),
            new Employee("Вика", 165_000)
    );

    public int maxSalary() {
        int max = 0;
        for (int i = 0; i < EMPLOYEE_LIST.size(); i++)
            if (EMPLOYEE_LIST.get(i).getSalary() > max) {
                max = EMPLOYEE_LIST.get(i).getSalary();
            }
        return max;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(EMPLOYEE_LIST);
    }

    @Override
    public int getAllEmployeeSumSalary() {
        int sum = 0;
        for (int i = 0; i < EMPLOYEE_LIST.size(); i++) {
            sum += EMPLOYEE_LIST.get(i).getSalary();
        }

        return sum;
    }

    @Override
    public String getEmployeeMinSalary() {
        int min = maxSalary();
        String minEmployee = null;
        for (int i = 0; i < EMPLOYEE_LIST.size(); i++)
            if (EMPLOYEE_LIST.get(i).getSalary() < min) {
                min = EMPLOYEE_LIST.get(i).getSalary();
                minEmployee = EMPLOYEE_LIST.get(i).getName();
            }
        return minEmployee;
    }

    @Override
    public String getEmployeeMaxSalary() {
        int max = 0;
        String maxEmployee = null;
        for (int i = 0; i < EMPLOYEE_LIST.size(); i++)
            if (EMPLOYEE_LIST.get(i).getSalary() > max) {
                max = EMPLOYEE_LIST.get(i).getSalary();
                maxEmployee = EMPLOYEE_LIST.get(i).getName();
            }
        return maxEmployee;
    }
}