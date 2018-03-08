import java.util.ArrayList;
import java.util.List;

/**
 * Created by manue on 14.09.2017.
 */
public class Manager implements IisHumanWorker {

    List<Worker> workerlist = new ArrayList<Worker>(); //ArrayList to save the individual workers

    public void setWorker (Worker w){ //sets a Worker
        workerlist.add(w); // adds the worker to the workerlist
    }

    public  void manage(){
        for(Worker w : workerlist){ //goes to every worker
            w.work(); //starts every worker
        }

        for(Worker w : workerlist){ //goes to every worker
            if(w instanceof IisHumanWorker){
                ((IisHumanWorker) w).eat();
            }
        }
    }

    public void eat(){}

}
