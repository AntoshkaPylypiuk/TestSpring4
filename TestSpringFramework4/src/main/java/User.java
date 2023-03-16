public class User {
    Command subtraction;
    Command addition;
    Command multiplication;
    Command division;

    public User(Command subtraction, Command addition, Command multiplication, Command division) {
        this.subtraction = subtraction;
        this.addition = addition;
        this.multiplication = multiplication;
        this.division = division;
    }

    public void subtraction() {
        subtraction.execute();
    }
    public void addition() {
        addition.execute();
    }
    public void multiplication() {
        multiplication.execute();
    }
    public void division() {
        division.execute();
    }
}
