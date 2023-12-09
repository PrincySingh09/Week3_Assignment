package in.princy.springboot.crudapi.service;

import in.princy.springboot.crudapi.model.Employee;
import java.util.List;

public interface EmployeeService {
  List<Employee> get();

  Employee get(int id);

  void save(Employee employee);

  void delete(int id);
}
