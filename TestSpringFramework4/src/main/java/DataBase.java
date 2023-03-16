import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class DataBase {
    DataBase dataBase;
    public void subtraction() {
        if (dataBase.getAction().equals("-")) {
            System.out.println("Result:" + (dataBase.getNumber1() - dataBase.getNumber2()));
        }
    }
    public void addition() {
        if (dataBase.getAction().equals("-")) {
            System.out.println("Result:" + (dataBase.getNumber1() - dataBase.getNumber2()));
        }
    }
    public void multiplication(){
        if (dataBase.getAction().equals("*")) {
            System.out.println("Result:" + (dataBase.getNumber1() * dataBase.getNumber2()));
        }
    }
    public void division(){
        if (dataBase.getAction().equals("/")) {
            System.out.println("Result:" + (dataBase.getNumber1() / dataBase.getNumber2()));
        }
    }
    private int number1;
    private int number2;
    private String action;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    public void scanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number ");
        setNumber1(scanner.nextInt());

        System.out.println("Second number ");
        setNumber2(scanner.nextInt());

        System.out.println("Action ");
        setAction(scanner.next());
    }
}
