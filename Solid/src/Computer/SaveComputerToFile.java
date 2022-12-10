package Computer;

public class SaveComputerToFile implements SaveInterface {
    public void save(String path, Computer computer){
        System.out.println(" Сохранение файла" + path +" " + computer);
    }
}
