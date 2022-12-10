package Runtime;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        IDeveloper developer = new JavaDeveloper();
        IDeveloper developer1 = new KotlinDeveloper();


        IManager manager = new BeastManager();
        manager.speak(developer);
        manager.speak(developer1);
    }
}