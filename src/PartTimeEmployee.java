public class PartTimeEmployee extends Employee{
    public PartTimeEmployee(String n, int eId, double s) {
        super(n, eId, s);
    }

    @Override
    public double calculateBonus() {
        double bonus = (super.getSalary() * 10)/100;
        return bonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("Role: Part-Time Employee");
        super.displayDetails();
    }
}
