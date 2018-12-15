package cr.ac.ucenfotec.dl;

import baseDatos.Conector;
import cr.ac.ucenfotec.bl.Cliente;
import cr.ac.ucenfotec.bl.ClienteFisico;
import cr.ac.ucenfotec.bl.ClienteJuridico;

public class MultiCliente {





    public ClienteFisico registrarClienteFisico(String nombre, String provincia, String canton, String direccionExacta,
                                                String apellido1, String apellido2, String correo, String telefono) throws Exception{

        ClienteFisico tmpCliente = null;

        String query;


        query = "INSERT INTO ClienteFisico(Nombre, Provincia, Canton, DireccionExacta, Apellido1,Apellido2,Correo,Telefono)" +
                "VALUES ('"+nombre+"','"+provincia+"','"+canton+"','"+direccionExacta+"','"+apellido1+"','"+apellido2+"','"+correo+"','"+telefono+"')";

        try {

            Conector.getConector().ejecutarSQL(query);

        }catch (Exception e){
            throw e;
        }

        return tmpCliente;
    }

    //      juridica
//    private String nombre;
//    private String provincia;
//    private String canton;
//    private String direccionExacta;
//    private String identifiacion;
//    private String ubicacion;
//    private Contacto contacto;


    public ClienteJuridico registrarClienteJuridico(String nombre, String provincia, String canton, String direccionExacta,
                                                    String identifiacion, String cedulaCont) throws Exception{

        ClienteJuridico tmpCliente = null;

        String query;


        query = "INSERT INTO clinJuri(Nombre, Identificacion, Provincia, Canton, UbicacionExacta, CedulaCont)" +
                "VALUES ('"+nombre+"','"+identifiacion+"','"+provincia+"','"+canton+"','"+direccionExacta+"','"+cedulaCont+"')";

        try {

            Conector.getConector().ejecutarSQL(query);

        }catch (Exception e){
            throw e;
        }

        return tmpCliente;
    }


}
