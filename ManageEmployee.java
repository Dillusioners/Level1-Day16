// importing all of the required packages
import java.util.*;

// Main class of the program class
class ManageEmployee{
// Creating Scanner object to revieve user input
static Scanner scanner = new Scanner(System.in);

// Creating an ArrayList to contain all of the employee records
static ArrayList<Employee> employeeList = new ArrayList<>();

// Main method
public static void main(String[] args) {
    boolean running =true;
    
    // Displaying choices to reciever using a while loop
    while (running) {
        System.out.println("\n Welcome to the Employee Management System!\n"
                         + "Please select an option:\n"
                         + "1. Add an employee\n"
                         + "2. Remove an employee\n"
                         + "3. Search for an employee\n"
                         + "4. View all employees\n"
                         + "5. Exit\n"
                         + "\n => Enter your option:- ");
        
        // Getting user input
        int user_choice = scanner.nextInt();
        
        // Switch case to perform different operations upon the 'user_choice' variable
        switch (user_choice) {
            case 1:
                addEmployee(); // Appends a new employee record
                break;
            case 2:
                removeEmployee(); // Throws an existing employee record
                break;
            case 3:
                searchEmployee(); // Finds for a specific employee record
                break;
            case 4:
                viewAllEmployees(); // Prints all of the employee records
                break;
            case 5:
                running = false; // Exit the program
                break;
            default:
                System.out.println("Invalid input, please try again.  \n \n \n"); // Displays when invalid choice is provided
        }
    }
}

// Method to create a new employee record
static void addEmployee() {
    scanner.nextLine(); // Consume the newline character left behind by scanner.nextInt()
    System.out.println("Enter the employee's name:");
    String name = scanner.nextLine(); // Getting employee name from user input
    System.out.println("Enter the employee's address:");
    String address = scanner.nextLine(); // Getting employee address from user input
    System.out.println("Enter the employee's phone number:");
    String phone = scanner.nextLine(); // Getting employee phone number from user input
    System.out.println("Enter the employee's salary (annually):");
    double salary = scanner.nextDouble(); // Getting employee salary from user input
    
    // Making a new Employee object with the choices provided by the user and adding it to employeeList
    Employee newEmployee = new Employee(name, address, phone, salary);
    employeeList.add(newEmployee);
    System.out.println("Employee added successfully!\n\n\n"); // Displaying success message
}

// Method to remove an existing employee record
static void removeEmployee() {
    scanner.nextLine(); // Consume the newline character left behind by scanner.nextInt()
    System.out.println("Please enter the name of the employee to remove:");
    String name = scanner.nextLine(); // Recieving employee name to remove from user input
    
    // Looping through employeeList to find the removeable employee
    for (Employee employee : employeeList) {
        if (employee.getName().equals(name)) { // If employee is found, remove it from employeeList
            employeeList.remove(employee);
            System.out.println("Employee removed successfully!  \n \n \n"); // Displaying success message
            return;
        }
    }
    
    System.out.println("Employee not found.\n\n\n"); // Displaying error message invalid employee was provided
}

// Method to search for a single employee
static void searchEmployee() {
    scanner.nextLine(); // Consume the newline character left behind by scanner.nextInt()
    System.out.println("Please enter the name of the employee to search for:");
    String name = scanner.nextLine(); // Recieving employee name to search for from end user
        
        for (Employee employee : employeeList) {
            if (employee.getName().equals(name)) { // If employee is found, remove it from employeeList
            
                // Displaying all of the details of the employee in the following code: 
                System.out.println("Employee ID:- " + employee);// Displaying ID
                System.out.println("Employee Name:- " + employee.getName());// Displaying Name
                System.out.println("Employee Address:- " + employee.getAddress());// Displaying Address
                System.out.println("Employee Phone:- " + employee.getPhone());// Displaying Phone
                System.out.println("Employee Salary:- " + employee.getSalary());// Displaying Salary
                return;
            }
        }
        
        System.out.println("Employee not found.  \n \n \n"); // Displaying error message if employee not found
    }
    
    // method used for printing the details of all of the employees in employeeList
    static void viewAllEmployees() {
        for (Employee employee : employeeList) { // Looping all employees
				System.out.println("\n ******************");
                System.out.println("Employee ID:- " + employee);// Displaying ID
                System.out.println("Employee Name:- " + employee.getName());// Displaying Name
                System.out.println("Employee Address:- " + employee.getAddress());// Displaying Address
                System.out.println("Employee Phone:- " + employee.getPhone());// Displaying Phone
                System.out.println("Employee Salary:- " + employee.getSalary());// Displaying Salary
                System.out.println("****************** \n");
                return;
        }
    }
}

class Employee { // Making the class to store an employee
    private String name; // Storing Name
    private String address; // Storing Address
    private String phone; // Storing phone number
    private double salary;// Storing the salary
    
    // Constructor for the Employee class
    public Employee(String name, String address, String phone, double salary) {
        this.name = name; // Storing Name
        this.address = address;// Storing Address
        this.phone = phone;// Storing Phone
        this.salary = salary;// Storing Salary
    }
    
    // Following methods return all of the above private class variables:
    public String getName() {
        return name; // Giving Name
    }
    
    public String getAddress() {
        return address;// Giving address
    }
    
    public String getPhone() {
        return phone;// Giving Phone
    }
    
    public double getSalary() {
        return salary;//Giving Salary
    }
    
    // Following methods set the values of all the above private class variables: 
    public void setAddress(String address) {
        this.address = address;// Updating Address
    }
    
    public void setPhone(String phone) {
        this.phone = phone;//Updating Phone
    }
    
    public void setSalary(double salary) {
        this.salary = salary;//Updating Salary
    }
    
}
