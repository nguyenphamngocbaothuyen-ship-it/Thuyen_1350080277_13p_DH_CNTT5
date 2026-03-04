package Buoi7;

import java.util.Date;

public class Person {
    private String name;
    private Date birthday;
    public void setname(String name){
        this.name=name;
    }
    public void setbirthday(Date birthday){
        this.birthday=birthday;
    }
    public String getDetails(){
        return "Name "+name+",Birthday "+birthday;
    }
}
class Employee extends Person{
    private double salary;
    public void setsalary(double salary){
        this.salary=salary;
    }
    @Override
    public String getDetails() {
        return super.getDetails()+",Salary "+salary;
    } 
}
class Manager extends Employee{
    private Employee asssistant;

    public void setAssistant(Employee assistants){
        this.asssistant=assistants;
    }
    @Override
    public String getDetails() {
        String detail = super.getDetails();
        if (asssistant != null){
            detail +=",Assistant: ["+asssistant.getDetails()+"]";
        }
        return detail;
    } 
}