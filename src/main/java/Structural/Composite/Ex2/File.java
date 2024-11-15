package Structural.Composite.Ex2;

//leaf
public class File implements IRoot {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void printDirectory() {
        System.out.println("Directory: " + name);
    }
}
