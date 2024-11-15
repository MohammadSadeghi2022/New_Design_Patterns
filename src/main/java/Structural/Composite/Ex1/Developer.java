package Structural.Composite.Ex1;

public class Developer implements IEmployee{

    private String name;
    private int salary;
    private String position;

    public Developer(String name, int salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    @Override
    public void showEmployeeInfo() {
        System.out.println("Name: " + name+ "Salary: " + salary + "Position: " + position);
    }
}
