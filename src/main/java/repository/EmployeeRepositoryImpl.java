package repository;

import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;

import java.util.*;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final static List<Employee> EMPLOYEE_LIST = List.of(
            new Employee("Катя", 90_000),
            new Employee("Дима", 102_000),
            new Employee("Олег", 80_000),
            new Employee("ОлЬга", 40_000),
            new Employee("Вика", 165_000)
    );



    @Override
    public List<Employee> getEmployeeHighSalarySalary() {
        List<Employee> employeeList = new ArrayList<>();
        int hightSalary = 40_000;
        for (int i = 0; i < EMPLOYEE_LIST.size(); i++) {
            if (hightSalary < EMPLOYEE_LIST.get(i).getSalary()) {
                employeeList.add( new Employee(EMPLOYEE_LIST.get(i).getName(), EMPLOYEE_LIST.get(i).getSalary()));
            }
        }
        return employeeList;
    }

}