public class Main {
    public static void main(String[] args) {     
      
        EquipoEmergencia medico1 = new BrigadaMedica ("Juan");
        BrigadaTecnica tecnico1 = new BrigadaTecnica("Miguel");
        DronRescate dron1 = new DronRescate ("001");

        medico1.atenderEmergencia();
        tecnico1.atenderEmergencia();
        dron1.atenderEmergencia();
        
        medico1.mostrarNombre();
        tecnico1.mostrarNombre();
        dron1.mostrarNombre();

        dron1.volar();
        tecnico1.reparar();

    }
}