package Pr_11;

public class Horse {
    synchronized void Horsemove(int n) throws InterruptedException {// synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.print("running\n");
            Thread.sleep(400);

        }
        System.out.println("horse "+n+" to the finish line");
    }
}
