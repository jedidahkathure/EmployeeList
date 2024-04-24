package ArrayList;
import java.util.ArrayList;
public class Employee {



        private String name;
        private int employeeId;

        // Constructor
        public Employee(String name, int employeeId) {
            this.name = name;
            this.employeeId = employeeId;
        }

        // Getters
        public String getName() {
            return name;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        // String representation of the employee
        @Override
        public String toString() {
            return "Employee ID: " + employeeId + ", Name: " + name;
        }
    }

    class EmployeeList {
        public static void main(String[] args) {
            // Create an ArrayList to store employees
            ArrayList<Employee> employees = new ArrayList<>();

            // Add some employees to the list
            employees.add(new Employee("Alice Johnson", 101));
            employees.add(new Employee("Bob Smith", 102));
            employees.add(new Employee("Charlie Brown", 103));

            // Print the list of employees
            System.out.println("List of Employees:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }

            // Example operation: find an employee by ID
            int searchId = 102;
            Employee foundEmployee = null;
            for (Employee employee : employees) {
                if (employee.getEmployeeId() == searchId) {
                    foundEmployee = employee;
                    break;
                }
            }

            if (foundEmployee != null) {
                System.out.println("Employee with ID " + searchId + " found: " + foundEmployee.getName());
            } else {
                System.out.println("Employee with ID " + searchId + " not found.");
            }
        }
    }

