package cr.ac.ucenfotec.bl;

public class Tecnologia {

    private String codigo;
    private String nombre;

    public Tecnologia() {
    }

    public Tecnologia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tecnologia{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
     

}
