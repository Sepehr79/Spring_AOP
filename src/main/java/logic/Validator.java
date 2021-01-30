package logic;

public class Validator {
    public void validate(int age){
        if (age <= 0)
            throw new ArithmeticException("Not valid age");
        System.out.println("Succeed");
    }
}
