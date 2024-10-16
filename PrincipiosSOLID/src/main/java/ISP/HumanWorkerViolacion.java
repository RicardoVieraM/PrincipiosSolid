package ISP;


public class HumanWorkerViolacion implements WorkerViolacion {

    @Override
    public void work() {
        System.out.println("Working...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }
}
