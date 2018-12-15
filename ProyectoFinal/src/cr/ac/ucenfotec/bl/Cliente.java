package cr.ac.ucenfotec.bl;

public class Cliente {

    private String nombre;
    private String provincia;
    private String canton;
    private String direccionExacta;

    public Cliente() {
    }

    public Cliente(String nombre, String provincia, String canton, String direccionExacta) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.canton = canton;
        this.direccionExacta = direccionExacta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCanton() {
        return canton;
    }

    public String getDireccionExacta() {
        return direccionExacta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public void setDireccionExacta(String direccionExacta) {
        this.direccionExacta = direccionExacta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", provincia=" + provincia + ", canton=" + canton + ", direccionExacta=" + direccionExacta + '}';
    }

}
