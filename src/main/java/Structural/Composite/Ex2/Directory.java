package Structural.Composite.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IRoot {

    private String name;
    private List<IRoot> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addChild(IRoot child) {
        children.add(child);
    }

    public void removeChild(IRoot child) {
        children.remove(child);
    }

    public IRoot getChild(int index) {
        if (index < 0 || index >= children.size())
            throw new IndexOutOfBoundsException();
        return children.get(index);
    }

    @Override
    public void printDirectory() {

        System.out.println("Directory: " + name);
        children.forEach(IRoot::printDirectory);
    }
}
