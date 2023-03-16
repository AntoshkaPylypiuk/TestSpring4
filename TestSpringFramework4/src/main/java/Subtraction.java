public class Subtraction implements Command {
    DataBase dataBase;

    public void execute() {
        dataBase.subtraction();
    }

    public Subtraction(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void subtractionResult(DataBase dataBase) {
        if (dataBase.getAction().equals("-")) {
            System.out.println("Result: " + (dataBase.getNumber1() - dataBase.getNumber2()));
        }
    }
}
