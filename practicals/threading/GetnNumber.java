package practicals.threading;

import java.util.Scanner;

public class GetnNumber implements Runnable{

    @Override
    public void run() {
        System.out.println("Enter n number: ");
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.close();
    }
}
