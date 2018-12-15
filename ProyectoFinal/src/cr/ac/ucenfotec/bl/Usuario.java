
package cr.ac.ucenfotec.bl;


public class Usuario {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String correo;
    private int cedula;
    private String genero;
    private String contrasena;
    private int SCcant;
    //buscar como agregar un avatar 
    // private imagen avatar 

    public Usuario() {
    }

    public Usuario(String nombre, String apellido1, String apellido2, String correo, int cedula, String genero, String contrasena, int SCcant) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.correo = correo;
        this.cedula = cedula;
        this.genero = genero;
        this.contrasena = contrasena;
        this.SCcant = SCcant;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getSCcant() {
        return SCcant;
    }

    public void setSCcant(int SCcant) {
        this.SCcant = SCcant;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", correo='" + correo + '\'' +
                ", cedula=" + cedula +
                ", genero='" + genero + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", SCcant=" + SCcant +
                '}';
    }
}
