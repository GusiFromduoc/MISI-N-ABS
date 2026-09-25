public class Main {
    public static void main(String[] args) {     
      
        EquipoEmergencia medico1 = new BrigadaMedica ("Juan");
        EquipoEmergencia tecnico1 = new BrigadaTecnica("Miguel");
        EquipoEmergencia dron1 = new DronRescate ("001");

        medico1.atenderEmergencia();
        tecnico1.atenderEmergencia();
        dron1.atenderEmergencia();

    }
}