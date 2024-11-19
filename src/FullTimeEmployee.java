public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String n, int eId, double s) {
        super(n, eId, s);
    }

    @Override
    public double calculateBonus() {
        double bonus = (super.getSalary() * 20)/100;
        return bonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("Role: Full-Time Employee");
        super.displayDetails();
    }
}
