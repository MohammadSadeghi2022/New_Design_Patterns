package Structural.Composite.Ex1;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements IEmployee{
private String name;
private String address;

    public CompanyDirectory(String name, String address) {
        this.name = name;
        this.address = address;
    }

    List<IEmployee> employees=new ArrayList<>();
    @Override
    public void showEmployeeInfo() {
        System.out.println("Name: "+name+"Address: "+address);
        employees.forEach(IEmployee::showEmployeeInfo);
    }
    public void addEmployee(IEmployee employee) {
        employees.add(employee);
    }
    public void removeEmployee(IEmployee employee) {
        employees.remove(employee);
    }

}
