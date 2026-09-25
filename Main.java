public class Main {
    public static void main(String[] args) {     
      
        EquipoEmergencia medico1 = new BrigadaMedica ("Juan");
        BrigadaTecnica tecnico1 = new BrigadaTecnica("Miguel");
        DronRescate dron1 = new DronRescate ("001");

        Volador volador = new DronRescate("Dron Aéreo");
        Reparador reparador = new BrigadaTecnica("Equipo Técnico");
        medico1.atenderEmergencia();
        tecnico1.atenderEmergencia();
        dron1.atenderEmergencia();
        
        medico1.mostrarNombre();
        tecnico1.mostrarNombre();
        dron1.mostrarNombre();

        dron1.volar();
        tecnico1.reparar();
        volador.volar();
        reparador.reparar();

        EquipoEmergencia equipo1 = new BrigadaMedica("Brigada Médica");

        EquipoEmergencia equipo2 = new BrigadaTecnica("Brigada Técnica");

        EquipoEmergencia equipo3 = new DronRescate("Dron de Rescate");

        equipo1.atenderEmergencia();
        equipo2.atenderEmergencia();
        equipo3.atenderEmergencia();
    }
}