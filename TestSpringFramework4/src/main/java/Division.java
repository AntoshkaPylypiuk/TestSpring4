public class Division implements Command {
    DataBase dataBase;

    public void execute() {
        dataBase.division();
    }

    public Division(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void division(DataBase dataBase) {
        if (dataBase.getAction().equals("/")) {
            System.out.println("Result: " + (dataBase.getNumber1() / dataBase.getNumber2()));
        }
    }
}
