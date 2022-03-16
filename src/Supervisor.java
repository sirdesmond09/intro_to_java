class Supervisor extends Employee{

    public String branch;

    public Supervisor(String name, int salary, String branch) {
        super(name, salary);
        this.branch = branch;
    }


}