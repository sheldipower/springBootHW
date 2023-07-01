package repository;

import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();
    int getAllEmployeeSumSalary();
    String  getEmployeeMinSalary();
    String  getEmployeeMaxSalary();
    List<Employee>  getEmployeeHighSalarySalary();
}
