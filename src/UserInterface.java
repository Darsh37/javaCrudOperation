import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface  {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("\nSelect the operation you want to perform");
            System.out.println("1. Add the Employee Details");
            System.out.println("2. Update the Employee Details");
            System.out.println("3. Remove the Employee Details");
            System.out.println("4. Display Employee Details");
            System.out.println("5. Dispaly all the Employee Details");
            System.out.println("6. Display all the Employee Details sorted by Name");
            System.out.println("7. Display all the Employee Details sorted by Age");
            System.out.println("8. Display all the Employee Details sorted by Salary");
            System.out.print("\n\nEnter the Choice : ");
            int choice = sc.nextInt();

            String name;
            int age, id;
            float salary;
            Employee emp;

            if (choice == 0)
                break;
            switch (choice) {
                case 1:
                    System.out.println("Enter Name : ");
                    name = sc.next();

                    System.out.println("Enter age : ");
                    age = sc.nextInt();

                    System.out.println("Enter Salary : ");
                    salary = sc.nextFloat();

                    emp = new Employee(name, age, salary);
                    Operation.addEmployee(emp);
                    break;
                case 2:
                    System.out.println("Enter the id of the student");
                    id = sc.nextInt();
                    emp = Operation.getEmployee(id);
                    if (emp == null)
                        System.out.println("Employee does not exits");
                    else {
                        System.out.println("What do you want to update");
                        System.out.println("1. Name");
                        System.out.println("2. Age");
                        System.out.println("3. Salary");

                        int choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.print("Enter Name : ");
                                name = sc.next();
                                emp.setName(name);
                                break;
                            case 2:
                                System.out.print("Enter age : ");
                                age = sc.nextInt();
                                emp.setAge(age);
                                break;
                            case 3:
                                System.out.print("Enter Salary : ");
                                salary = sc.nextFloat();
                                emp.setSalary(salary);
                                break;
                            default:
                                System.out.println("Invalid Choice");
                                break;
                        }
                    }
                    System.out.println(Operation.updateEmployee(emp));

                    break;
                case 3:
                    System.out.println("Enter the id of the Employee");
                    id = sc.nextInt();
                    emp = Operation.getEmployee(id);
                    if (emp == null)
                        System.out.println("Employee does not exits");
                    else
                        System.out.println(Operation.deleteEmployee(id));
                    break;
                case 4:
                    System.out.println("Enter the id of the Employee");
                    id = sc.nextInt();
                    emp = Operation.getEmployee(id);
                    try {
                        System.out.println(emp);
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage());

                    }
                    break;
                case 5:
                    List<Employee> employee = new ArrayList<>(Operation.getAllEmployees());
                    if (employee.isEmpty())
                        System.out.println("No Student records found ");

                    else
                        employee.forEach(s -> System.out.println(s));
                    break;
                case 6:
                    employee = new ArrayList<>(Operation.getAllEmployees());
                    if (employee.isEmpty()) {
                        System.out.println("No records found ");
                    } else {
                        employee.stream()
                                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                                .forEach(s -> System.out.println(s));
                    }
                    break;
                case 7:
                    employee = new ArrayList<>(Operation.getAllEmployees());
                    if (employee.isEmpty()) {
                        System.out.println("No records found ");
                    } else {
                        employee.stream()
                                .sorted((s3, s4) -> {
                                    Integer age1 = s3.getAge();
                                    Integer age2 = s4.getAge();
                                    return age1.compareTo(age2);
                                })
                                .forEach(s -> System.out.println(s));
                    }
                    break;
                case 8:
                    employee = new ArrayList<>(Operation.getAllEmployees());
                    if (employee.isEmpty()) {
                        System.out.println("No records found ");
                    } else {
                        employee.stream()
                                .sorted((s3, s4) -> {
                                    Integer marks1 = s3.getAge();
                                    Integer marks2 = s4.getAge();
                                    return marks1.compareTo(marks2);
                                })
                                .forEach(s -> System.out.println(s));
                    }
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }
    }
}
