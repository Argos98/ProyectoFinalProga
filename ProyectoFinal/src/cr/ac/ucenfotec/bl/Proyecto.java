package cr.ac.ucenfotec.bl;

import java.util.ArrayList;

public class Proyecto {

    //este va ser Stirng para poner un codigo alfunmero si se desea 
    private String codigo;
    private String nombre;
    private String descripcion;
    private String fechaInicio;
    private String tipo;

    //crea una forma de que esto se registre luego
    private String fechaFin;

    private ArrayList<Tecnologia> tecnoligas;

    /* pensar en una forma de hacer esto
    "así como las tecnologías asociadas y una serie de actividades, además del cliente
asociado"*/
    public Proyecto() {
        tecnoligas = new ArrayList<>();
    }

    public Proyecto(String codigo, String nombre, String descripcion, String fechaInicio, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.tipo = tipo;
    }

    public Proyecto(String codigo, String nombre, String descripcion, String fechaInicio, String tipo, String fechaFin, ArrayList<Tecnologia> tecnoligas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.tipo = tipo;
        this.fechaFin = fechaFin;
        this.tecnoligas = tecnoligas;
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

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public ArrayList<Tecnologia> getTecnoligas() {
        return tecnoligas;
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

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setTecnoligas(ArrayList<Tecnologia> tecnoligas) {
        this.tecnoligas = tecnoligas;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechaInicio=" + fechaInicio + ", tipo=" + tipo + ", fechaFin=" + fechaFin + ", tecnoligas=" + tecnoligas + '}';
    }

}
