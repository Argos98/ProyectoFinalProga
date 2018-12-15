package cr.ac.ucenfotec.dl;

import cr.ac.ucenfotec.bl.Usuario;
import baseDatos.Conector;

import java.sql.ResultSet;
import java.util.ArrayList;

public class MultiUsuario {


    //ESTAS FUNCION ES LA QUE SE ENCARGAR DE GUARDAR LA INSTACIA DEL OBJETO USUARIO EN SQL
    public Usuario registrarUsuario(String nombre, String apellido1, String apellido2, String correo, int cedula, String genero, String conterasena, int SCcant) throws Exception {
        Usuario tpmUsuario = null;

        String query;

        query = "INSERT INTO  Usuario(Nombre, Apellido1, Apellido2, Correo, Cedula, Genero, Contrasena, SCcant) " +
                "VALUES ('" + nombre + "','" + apellido1 + "','" + apellido2 + "','" + correo + "'," + cedula + ",'" + genero + "','" + conterasena + "'," + SCcant + " )";
        try {

                Conector.getConector().ejecutarSQL(query);

        } catch (Exception e) {
            throw e;
        }


        return tpmUsuario;


    }

    //ESTA FUNCION SE ENCARGA DE EXTRAR DE SQL LA INFORMACION DEL USUARIO
    public ArrayList<Usuario> listarUsurios() throws Exception {
        ArrayList<Usuario> usuarios;

        ResultSet result;

        String query;

        usuarios = new ArrayList<>();

        query = "SELECT Nombre, Apellido1, Apellido2, Correo, Cedula, Genero, Contrasena, SCcant FROM Usuario";

        try {

            result = Conector.getConector().ejecutarSQL(query, true);

            while (result.next()) {
                Usuario tpmUsuario = new Usuario(result.getString("Nombre"), result.getString("Apellido1"), result.getString("Apellido2"),
                        result.getString("Correo"), result.getInt("Cedula"), result.getString("Genero"),
                        result.getString("Contrasena"), result.getInt("SCcant"));

                usuarios.add(tpmUsuario);
                return usuarios;
            }

        } catch (Exception e) {
            throw e;
        }
        return usuarios;
    }

    public int cantSesion() throws Exception {
        int numCantSesion;

        ResultSet result;

        String query;

        query = "SELECT SCcant FROM Usuario";

        try {

            result = Conector.getConector().ejecutarSQL(query, true);
            numCantSesion = result.getInt("SCcant");
            return numCantSesion;

        } catch (Exception e) {
            throw e;
        }

    }



    public String correo() throws Exception {
        String correo = "-1";

        ResultSet result;

        String query;

        query = "SELECT Correo FROM Usuario";

        try {

            result = Conector.getConector().ejecutarSQL(query, true);
            while (result.next()) {
                correo = result.getString("Correo");
                return correo;
            }


        } catch (Exception e) {
            throw e;
        }
        return correo;
    }

    public String contrasena() throws Exception {
        String correo = "-1";

        ResultSet result;

        String query;

        query = "SELECT Contrasena FROM Usuario";

        try {

            result = Conector.getConector().ejecutarSQL(query, true);
            while (result.next()) {
                correo = result.getString("Contrasena");
                return correo;
            }


        } catch (Exception e) {
            throw e;
        }
        return correo;
    }
}
