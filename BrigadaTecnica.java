public class BrigadaTecnica extends EquipoEmergencia {
    
        public BrigadaTecnica (String nombre) {
        super(nombre);
    }



        @Override
    public void atenderEmergencia() {
        System.out.println("El equipo de Tecnicos se dirige al lugar");
    }

}
