package in.princy.springboot.crudapi.dao;

import in.princy.springboot.crudapi.model.Employee;
import java.util.List;

public interface EmployeeDAO {
  List<Employee> get();

  Employee get(int id);

  void save(Employee employee);

  void delete(int id);
}
