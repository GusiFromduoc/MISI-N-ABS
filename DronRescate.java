public class DronRescate extends EquipoEmergencia implements Volador {
    
    public DronRescate (String nombre) {
    super(nombre);
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Un dron se dirige al lugar");
    }

    @Override
    public void volar() {
        System.out.printf("El dron numero: %s ha salido en vuelo en este instante. %n", getNombre());
    }
}
