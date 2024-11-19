import java.util.ArrayList;
import java.util.HashSet;

public class EmployeeManager{

    private ArrayList<Employee> employees = new ArrayList<>();
    HashSet<Integer> IDs = new HashSet<>();


    public void AddEmployee(Employee employee){

        if (IDs.contains(employee.getEmployeeId())){
            System.out.println("Employee ID " + employee.getEmployeeId() + " Already exist");
        }
        else {
        IDs.add(employee.getEmployeeId());
        employees.add(employee);
        }

    }

    public void DisplayAllEmployeeAndRoles(){
        for (Employee employee : employees){
            employee.displayDetails();
            System.out.println();
        }

    }

    public void UpdateEmployeeSalary(int employeeId, double newSalary){
        if (IDs.contains(employeeId)){
            for (Employee employee : employees){
                if(employee.getEmployeeId() == employeeId){
                    employee.setSalary(newSalary);
                    System.out.println("The salary was updated for the employee with ID: " + employeeId);
                }
            }
        }
        else {
            System.out.println("Employee ID " + employeeId + " does not exist");
        }

    }

    public void DisplayEmployeeDetailsAndBonus(int employeeId){
        for(Employee employee : employees){
            if (employee.getEmployeeId() == employeeId){
                employee.displayDetails();
                break;
            }
        }

    }
}


