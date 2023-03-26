package practicals.threading;

public class MultiThreading {

    public static void main(String[] args) throws InterruptedException {
        Thread getNumber = new Thread(new GetnNumber());
        Thread evenNumber = new Thread(new EvenNumbers());
        Thread oddNumber = new Thread(new OddNumbers());
        Thread squareNumber = new Thread(new SquareNumbers());

        getNumber.start();
        getNumber.join(); // waits till the thread dies
        evenNumber.start();
        getNumber.join(); // waits till the thread dies
        oddNumber.start();
        oddNumber.join(); // waits till the thread dies
        squareNumber.start();
    }
}
