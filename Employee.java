public class Employee {

        String name;
        String employeeId;
        String department;

        // Constructor
        public Employee(String name, String employeeId, String department) {
            this.name = name;
            this.employeeId = employeeId;
            this.department = department;
        }

        // Display employee information
        public void display() {
            System.out.println("Name: " + name + ", ID: " + employeeId + ", Department: " + department);
        }
    }

    class EmployeeArrayDemo {
        public static void main(String[] args) {
            // Initialize an array of Employee objects
            Employee[] employees = new Employee[3];

            // Add employees to the array
            employees[0] = new Employee("Alice Johnson", "E001", "HR");
            employees[1] = new Employee("Bob Smith", "E002", "Engineering");
            employees[2] = new Employee("Charlie Brown", "E003", "Sales");

            // Access and update employee information
            employees[1].department = "Product Development"; // Update department

            // Display employee information
            for (Employee employee : employees) {
                employee.display();
            }
        }
    }

