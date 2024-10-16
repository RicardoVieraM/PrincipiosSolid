package LSP;

// Clase Gorrion, que sí puede volar
public class Gorrion extends Ave implements Volador {

    public Gorrion(String nombre) {
        super(nombre);
    }

    @Override
    public void volar() {
        System.out.println("El gorrión está volando");
    }
}
