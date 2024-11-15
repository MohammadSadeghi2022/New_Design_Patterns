package Structural.Composite.Ex1;

public class Main {
    public static void main(String[] args) {
        CompanyDirectory companyDirectory = new CompanyDirectory("Credit Team", "Tehran-Gandi");
        companyDirectory.addEmployee(new Developer("Mohammad Sadeghi", 30, "Developer L4"));
        companyDirectory.addEmployee(new Developer("Mehrdad Harati", 60, "Developer L2"));

        //CompanyDirectory companyDirectory2 = new CompanyDirectory("CHQ Team", "Tehran-Gandi");
         companyDirectory.addEmployee(new CompanyDirectory("CHQ Team", "Tehran-Gandi"));

//        companyDirectory2.addEmployee(new Manager("Jalal Ahamdi", 70, "Card manager"));
//        companyDirectory2.addEmployee(new Developer("Mohammad Shirzad", 50, "Developer L2"));
//        companyDirectory2.addEmployee(new Developer("Ali Jabari", 25, "Developer L3"));

        companyDirectory.showEmployeeInfo();
    }
}
