public class Addition implements Command {
    DataBase dataBase;

    public void execute() {
        dataBase.addition();
    }
    public Addition (DataBase dataBase){
        this.dataBase=dataBase;
    }
    public void addition(DataBase dataBase) {
        if (dataBase.getAction().equals("+")) {
            System.out.println("Result:" + (dataBase.getNumber1() + dataBase.getNumber2()));
        }
    }
}
