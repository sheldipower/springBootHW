package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Employee;
import service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService =employeeService;
    }

    @GetMapping("list")
    public List<Employee> showCounter() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/max")
    public String showeMaxSalaryEmployees(){
        return employeeService.getEmployeeMaxSalary();
    }
    @GetMapping("/sum")
    public int showeSumSalaryEmployees(){
        return employeeService.getAllEmployeeSumSalary();
    }
    @GetMapping("/min")
    public String showeMinSalary(){
        return employeeService.getEmployeeMinSalary();
    }
    @GetMapping("/high-salary")
    public List<Employee> showeHighSalarySalary(){
        return employeeService.getEmployeeHighSalarySalary();
    }
}