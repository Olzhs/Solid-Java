package Computer;

public class SaveComputerToDB implements SaveInterface {
    public void save(String path, Computer computer){
        System.out.println(" Сохранение файла в базу данных " + path +" " + computer);
    }
}
