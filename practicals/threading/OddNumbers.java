package practicals.threading;

public class OddNumbers implements Runnable{

    @Override
    public void run() {
        System.out.println("--Odd Thread--");
        for (int i = 0; i <= 10; i++){
            if(i % 2 != 0){
                System.out.printf("%d\t",i);
            }
        }
        System.out.println();
    }
}
