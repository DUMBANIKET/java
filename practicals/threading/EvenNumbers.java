package practicals.threading;

public class EvenNumbers implements Runnable{

    @Override
    public void run() {
        System.out.println("--Even Thread--");
        for (int i = 0; i <= 10; i++){
            if(i % 2 == 0){
                System.out.printf("%d\t",i);
            }
        }
        System.out.println();
    }
}
