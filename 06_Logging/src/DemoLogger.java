import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoLogger {
    private static final Logger LOG = Logger.getLogger(DemoLogger.class.getName());

    public static void main(String[] args) {
        LOG.info("Programm wurde gestartet");
        LOG.setLevel(Level.WARNING);

        try {
            ((Object) null).toString();
        }catch (Exception e) {
            LOG.log(Level.SEVERE, "Exception!", e);
        }

        LOG.info("Prg stopped.");



    }
}
