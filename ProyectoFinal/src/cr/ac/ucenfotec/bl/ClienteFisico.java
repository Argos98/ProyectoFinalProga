package cr.ac.ucenfotec.bl;

public class ClienteFisico  extends Cliente {

    private String apellido1;
    private String apellido2;
    private String correo;
    private String telefono;

    public ClienteFisico() {
    }

    public ClienteFisico(String apellido1, String apellido2, String correo, String telefono) {
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.correo = correo;
        this.telefono = telefono;
    }

    public ClienteFisico(String apellido1, String apellido2, String correo, String telefono, String nombre, String provincia,
            String canton, String direccionExacta) {
        super(nombre, provincia, canton, direccionExacta);
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ClienteFisico{" + "apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", correo=" + correo + ", telefono=" + telefono + '}';
    }

}
