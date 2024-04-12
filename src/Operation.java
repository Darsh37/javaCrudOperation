import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Operation  {

    static Map<Integer, Employee> employeeMap = new HashMap<>();

    //We want the id of the student object be auto-generated
    //for which we can use AtomicInteger class
    static AtomicInteger atomic = new AtomicInteger();

    public static String addEmployee(Employee emp){
        emp.setId(atomic.incrementAndGet());
        employeeMap.put(emp.getId(), emp);
        return "New Employee added";    
    }

    public static Collection<Employee> getAllEmployees(){
        return employeeMap.values();
    }

    public static Employee getEmployee(int id){
        return employeeMap.get(id);
    }
    
    public static String deleteEmployee(int id){
        employeeMap.remove(id);
        return "Student data deleted Succefully";
    }

    public static String updateEmployee(Employee emp){
        employeeMap.put(emp.getId(), emp);
        return "Student details updated succesfully";
    }


    
    
}
