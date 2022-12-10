package Runtime;

public class KotlinDeveloper implements IDeveloper, ITester{
    @Override
    public void writeCode() {
        System.out.println("Use Kotlin syntax");
    }

    @Override
    public void eat() {
        System.out.println("Kotlin eat");
    }

    @Override
    public void stressTest() {
        System.out.println("Kotlin test");
    }

    @Override
    public void funcTest() {

    }
}
