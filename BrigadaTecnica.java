public class BrigadaTecnica extends EquipoEmergencia implements Reparador {
    
    public BrigadaTecnica (String nombre) {
    super(nombre);
    }



    @Override
    public void atenderEmergencia() {
        System.out.println("El equipo de Tecnicos se dirige al lugar");
    }

    @Override
    public void reparar() {
        System.out.printf("%s está reparando el equipo dañado.%n", getNombre());
    }
}
