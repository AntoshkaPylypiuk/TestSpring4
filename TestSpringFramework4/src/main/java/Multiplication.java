public class Multiplication implements Command {
    DataBase dataBase;

    public void execute() {
        dataBase.multiplication();
    }

    public Multiplication(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void multiplication(DataBase dataBase) {
        if (dataBase.getAction().equals("*")) {
            System.out.println("Result: " + (dataBase.getNumber1() * dataBase.getNumber2()));
        }
    }
}
