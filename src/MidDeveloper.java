public class MidDeveloper extends Employee{

    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    public double salaryPoint() {
        double point= 1.5;
        return getSalary();
    }

    @Override
    public void work() {
        System.out.println("Middeveloper salary is " + getSalary());
    }
}
