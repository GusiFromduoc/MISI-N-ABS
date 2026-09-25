public abstract class EquipoEmergencia {

    private String nombre;

    public EquipoEmergencia(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.printf("El nombre del equipo es %s %n", nombre);
    }

    public String getNombre() {
        return nombre;
    }
    public void atenderEmergencia() {}

}