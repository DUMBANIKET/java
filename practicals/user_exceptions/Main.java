package practicals.user_exceptions;

public class Main {
    public static void main(String[] args) throws AgeOutOfBoundException {
        Student s = new Student("Darwin", 999, 14, "BscIT");
        if (s.getAge() < 15 || s.getAge() > 21){
            throw new AgeOutOfBoundException();
        }
    }
}
