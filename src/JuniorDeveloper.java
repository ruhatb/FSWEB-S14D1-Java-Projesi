public class JuniorDeveloper extends Employee {



    public JuniorDeveloper(long id, String name) {
        super(id, name);
    }

    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @java.lang.Override
    public void work() {
      double currentSalary = getSalary();
      double newSalary = currentSalary *1.2;
        System.out.println("junior dev salary is " + newSalary );

    }
}


