public abstract class Employee implements BonusCalculable {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String n, int eId, double s) {
        this.name = n;
        this.employeeId = eId;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculateBonus();

    public void displayDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.printf("Salary: %.2f\n", salary);
        System.out.printf("Bonus: %.2f\n", calculateBonus());
    };
}