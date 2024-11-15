package Structural.Composite.Ex2;

public class Main {
    public static void main(String[] args) {
        IRoot file1=new File("file1.txt");
        IRoot file2=new File("file2.txt");
        IRoot file3=new File("file3.txt");
        IRoot file4=new File("file4.txt");
        IRoot file5=new File("file5.txt");
        IRoot file6=new File("file6.txt");
        IRoot file7=new File("file7.txt");

        Directory D11=new Directory("D11");
        D11.addChild(file4);

        Directory D1=new Directory("D1");
        D1.addChild(D11);
        D1.addChild(file3);

        Directory D21=new Directory("D21");
        D21.addChild(file5);
        D21.addChild(file6);

        Directory D22=new Directory("D22");
        D22.addChild(file7);

        Directory D2=new Directory("D2");
        D2.addChild(D21);
        D2.addChild(D22);

       Directory rootDirectory=new Directory("rootDirectory");
       rootDirectory.addChild(file1);
       rootDirectory.addChild(D1);
       rootDirectory.addChild(file2);
       rootDirectory.addChild(D2);

       rootDirectory.printDirectory();
    }
}
