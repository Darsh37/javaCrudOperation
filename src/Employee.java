import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    private int id;
    private String name;
    private int age;
    private float salary;
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public float getSalary() {
        return salary;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public Employee(String name, int age, float salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }

    // @Override
    // public int compareTo(Employee o) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    // }
    @Override
    public int compare(Employee o1, Employee o2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compare'");
    }




}
