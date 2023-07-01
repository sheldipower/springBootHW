package service;

import org.springframework.stereotype.Service;
import repository.EmployeeRepository;
import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;


import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    private EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees() ;
    }

    @Override
    public int getAllEmployeeSumSalary() {
        return employeeRepository.getAllEmployeeSumSalary();
    }

    @Override
    public String getEmployeeMinSalary() {
        return employeeRepository.getEmployeeMinSalary();
    }

    @Override
    public String getEmployeeMaxSalary() {return employeeRepository.getEmployeeMaxSalary();}

    @Override
    public List<Employee> getEmployeeHighSalarySalary() {
        return employeeRepository.getEmployeeHighSalarySalary();
    }
}