package buoi4;

public class Employee {
    private int id;
    private String fistName;
    private String lastName;
    private int salary;
    public Employee(int id,String fistName,String lastName,int salary){
        this.id=id;
        this.fistName=fistName;
        this.lastName=lastName;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
     public String getFistName(){
        return fistName;
    }
     public String getLastName(){
        return lastName;
    }
    public String getFullName(){
        return fistName+lastName;
    } 
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getAnuuualSalary(){
        return this.salary*12;
    }
    public void upToSalary(int percent){
        this.salary=salary*percent/100;
    }
    public String toString(){
        return "ID"+this.id+"Lastname"+this.lastName+"Fistname"+this.fistName+"Salary"+this.salary;
    }
    public void display(){
        System.out.println(this.toString());
        System.out.println("AnuualSalary"+this.getAnuuualSalary());
    }
}
