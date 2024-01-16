public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(long id, String name) {
        super(id, name);
    }

    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double salaryPoint() {
        double point= 1.8;
       return point*getSalary();
    }

    @Override
    public void work() {
        System.out.println("Senior Developer salary " + getSalary());
    }
}
