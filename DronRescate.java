public class DronRescate extends EquipoEmergencia {
    
        public DronRescate (String nombre) {
        super(nombre);
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Un dron se dirige al lugar");
    }
}
