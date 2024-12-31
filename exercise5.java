package exercise;

class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }

}




public class exercise5 {
    public static void main (String[] args){
Employee obj = new Employee("Rayuth", 0001, 2500);
obj.displayEmployeeDetails();
    }
}
