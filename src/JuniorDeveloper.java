public class JuniorDeveloper extends Employee {

    private double salary;

    public JuniorDeveloper(long id, String name) {
        super(id, name);
    }

    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salaryPoint();
    }

    public double salaryPoint() {
        double point= 1.3;
        return point*salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void work() {

        System.out.println("Junior developers salary is " + getSalary());
    }
}


