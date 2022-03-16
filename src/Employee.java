public class Employee {
    public String name;
    public int salary;
    
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public int bonus(){
        if (this.salary > 1000){
            return (int) (this.salary *1.01);

        } else{
            return this.salary;
        }
        
    }


}
