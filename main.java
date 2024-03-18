 class Employee {
 public void work() {
 System.out.println("Employee
 working");
 }
 public double getSalary() {
 return 0.0;
 }
 }
 class HRManager extends Employee
 {
 @Override
 public void work() {
 System.out.println("HR Manager
 working");
 }
 public void addEmployee() {
 System.out.println("Adding new
 employee");
 }
 }
 public class Main {
 public static void main(String[]
 args) {
Employee employee = new
 Employee();
 employee.work();
 HRManager hrManager = new
 HRManager();
 hrManager.work();
 hrManager.addEmployee();
 }
 }
