package LSP;

public class AvestruzViolacion extends AveViolacion {

    @Override
    public void volar() {
        throw new UnsupportedOperationException("Las avestruces no pueden volar");
    }
}
