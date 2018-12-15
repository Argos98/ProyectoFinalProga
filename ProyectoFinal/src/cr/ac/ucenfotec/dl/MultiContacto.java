package cr.ac.ucenfotec.dl;

import baseDatos.Conector;
import cr.ac.ucenfotec.bl.Contacto;

public class MultiContacto {


    public Contacto registrarContacto(String nombre, String apellido1, String apellido2, String cedula, String telefono,
                                      String correo) throws Exception {

        Contacto tpmContacto1 = null;

        String query;

        query = "INSERT INTO Contacto(Nombre,Apellido1,Apellido2,Cedula, Telefono,Correo)" +
                "VALUES('" + nombre + "','" + apellido1 + "','" + apellido2 + "','" + cedula + "','" + telefono + "','" + correo + "')";


        try {
            Conector.getConector().ejecutarSQL(query);

        } catch (Exception e) {

        }

        return tpmContacto1;
    }


}
