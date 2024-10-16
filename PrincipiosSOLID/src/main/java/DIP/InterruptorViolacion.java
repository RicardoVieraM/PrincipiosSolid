package DIP;


// Clase Interruptor que depende de Bombilla (violación del DIP)
public class InterruptorViolacion {

    private Bombilla bombilla;

    public Interruptor(Bombilla bombilla) {
        this.bombilla = bombilla;
    }

    public void operar() {
        bombilla.encender();
        // Más tarde: bombilla.apagar();
    }
}
