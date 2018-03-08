/**
 * Created by manue on 14.09.2017.
 */
public class Superworker implements IisHumanWorker, Worker { //implements from Worker because he is also a worker that can work

    @Override
    public void work(){
        System.out.println("I'm a super Worker"); //symbolises that he can work faster
    }

    public void eat() {
        System.out.println("I'm going to lunch now");
    }
}
