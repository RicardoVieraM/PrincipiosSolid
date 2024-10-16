package ISP;

public class RobotWorkerViolacion implements WorkerViolacion {

    @Override
    public void work() {
        System.out.println("Working...");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat");
    }
}
