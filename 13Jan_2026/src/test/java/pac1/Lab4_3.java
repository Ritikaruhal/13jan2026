package pac1;
 
import java.io.*;
import java.util.Scanner;
 
 
class Employee_Exception extends Exception {

	private static final long serialVersionUID = 1L;
 
	public Employee_Exception(String message) {
        super(message);
    }
}
public class Lab4_3 {
 
    static class Employee {
        private int id;
        private String name;
        private double salary;
 
        public Employee(int id, String name, double salary) throws Employee_Exception {
            if (salary < 3000) {
                throw new Employee_Exception("Salary must be at least 3000. Given: " + salary);
            }
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
        public void display() {
            System.out.println("\nEmployee Details");
            System.out.println("ID     : " + id);
            System.out.println("Name   : " + name);
            System.out.println("Salary : " + salary);
        }
        public void writeToFile(String filename) throws IOException {
            FileWriter fw = new FileWriter(filename);
            fw.write(id + "\n");
            fw.write(name + "\n");
            fw.write(salary + "\n");
            fw.close();
        }
        public static Employee readFromFile(String filename) throws Exception {
            BufferedReader br = new BufferedReader(new FileReader(filename));
 
            int id = Integer.parseInt(br.readLine());
            String name = br.readLine();
            double salary = Double.parseDouble(br.readLine());
 
            br.close();
            return new Employee(id, name, salary);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        try {
            System.out.print("Enter Employee ID: ");
            int id = Integer.parseInt(sc.nextLine().trim());
 
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine().trim();
 
            System.out.print("Enter Employee Salary: ");
            double salary = Double.parseDouble(sc.nextLine().trim());
            
            Employee emp = new Employee(id, name, salary);
 
            emp.display();
            emp.writeToFile("C:\\Users\\Ritika.Ruhal\\git\\13jan2026\\13Jan_2026\\src\\test\\java\\pac1\\employee.txt"
            		+ "");
            System.out.println("\nEmployee details written to file.");
 
            Employee empFromFile = Employee.readFromFile("C:\\\\Users\\\\Ritika.Ruhal\\\\git\\\\13jan2026\\\\13Jan_2026\\\\src\\\\test\\\\java\\\\pac1\\\\employee.txt"
            		+ "");
 
            System.out.println("\nReading employee from file...");
            empFromFile.display();
 
        } catch (Employee_Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input. Please enter numbers for ID and Salary.");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
