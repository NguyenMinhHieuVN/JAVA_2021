package Pr_11;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Race {
    public static void main(String args[]) {
        final Horse obj = new Horse();
        // horse 1
        Thread h1 = new Thread() {
            public void run() {
                try {
                    obj.Horsemove(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Race.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };
        // horse 2
        Thread h2 = new Thread() {
            public void run() {
                try {
                    obj.Horsemove(2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Race.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };
        h1.start();
        h2.start();
    }
}
