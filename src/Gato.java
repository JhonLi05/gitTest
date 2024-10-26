public class Persona {
    private String nombre;
    private int id;
    public Persona(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void setId(int id) {this.id = id;}
    public int getId() {return id;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getNombre() {return nombre;}

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + getNombre() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
