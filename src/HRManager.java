public class HRManager extends Employee{

    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;

    private  SeniorDeveloper[] seniors;
    public HRManager(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(50000);
        System.out.println("HR Manager is "+ getName()+" welcome..");
    }
}

