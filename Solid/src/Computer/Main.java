package Computer;

public class Main {
    public static void main(String[] args){
        Computer computer = new Computer("Asus",2000);
        SaveInterface saveComputer = new SaveComputerToFile();
        SaveInterface saveComputer2 = new SaveComputerToDB();
        saveComputer2.save("poi", computer);
        saveComputer.save("out", computer);

    }
}

