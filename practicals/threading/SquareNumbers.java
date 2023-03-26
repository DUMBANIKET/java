package practicals.threading;

public class SquareNumbers implements Runnable{

    @Override
    public void run() {
        System.out.println("--Square Thread--");
        for (int i = 0; i <= 10; i++){
            System.out.printf("%d  ", i*i);
        }
        System.out.println();
    }
}
