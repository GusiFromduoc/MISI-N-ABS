public class BrigadaMedica extends EquipoEmergencia {
    
    public BrigadaMedica (String nombre) {
        super(nombre);
    }
    
    @Override
    public void atenderEmergencia() {
        System.out.printf("%s se dirige al lugar en este momento a tratar al herido %n", getNombre());
    };
}
