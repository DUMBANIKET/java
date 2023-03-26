package practicals.user_exceptions;

public class AgeOutOfBoundException extends Exception{
    public AgeOutOfBoundException(){
        super("Age out of range");
    }
}
