package cr.ac.ucenfotec.bl;

// estas son las actividades a cumplir por el programador lo cambie el nombre para evitar confucion
public class Tarea {

    //muchos de estos es una bitacora un arraylist por proyecto de esto y asi tengo una bitacora 
    private String codigo;
    private String nombre;
    private String descripcion;

    public Tarea() {
    }

    public Tarea(String codigo, String nombre, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tarea{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

}
