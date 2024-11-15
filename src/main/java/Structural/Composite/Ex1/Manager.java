package Structural.Composite.Ex1;

public class Manager implements IEmployee{
    private String name;
    private int salary;
    private String position;
    public Manager(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.position = department;
    }
    @Override
    public void showEmployeeInfo() {
        System.out.println("Name: " + name+"Salary: " + salary+"Position: " + position);
    }
}
