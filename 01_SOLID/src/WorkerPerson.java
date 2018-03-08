public class WorkerPerson implements Worker,IisHumanWorker {

    @Override
    public void work() {
        System.out.println("I'm a normal Worker");
    }

    @Override
    public void eat() {
        System.out.println("I'm going to lunch now");
    }
}
