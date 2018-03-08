import java.util.logging.Logger;

public class Printer implements Runnable {

    private static final Logger LOG = Logger.getLogger(Printer.class.getName());

    @Override
    public void run() {
        int i = 0;

        while(true) {
            try {

                i = i+1;
                double sec = Math.random() * 1 + 1;
                LOG.info("Counter: " + i);
                LOG.info("Ruhezeit " + sec + " Sekunden");
                Thread.sleep((int)(sec * 1000));


            } catch (InterruptedException e) {

                e.printStackTrace();

            }
        }

    }
}



