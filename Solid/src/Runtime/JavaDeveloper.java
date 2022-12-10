package Runtime;

import jdk.swing.interop.SwingInterOpUtils;

public class JavaDeveloper implements IDeveloper, ITester {
    @Override
    public void writeCode() {
        System.out.println("Use Java syntax");
    }

    @Override
    public void eat() {
        System.out.println("Java eat");

    }

    @Override
    public void stressTest() {

    }

    @Override
    public void funcTest() {

    }
}
