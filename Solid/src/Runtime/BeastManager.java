package Runtime;

public class BeastManager implements IManager{
    @Override
    public void speak(IDeveloper developer) {
        System.out.println("Manager syntax");
        developer.writeCode();
    }
}
