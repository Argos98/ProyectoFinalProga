/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.bl;

/**
 * @author David
 */
public class ClienteJuridico extends Cliente {

    private String identifiacion;
    // private String ubicacion;
    // private Contacto contacto;
    private String cedulaContacto;


    public ClienteJuridico() {
    }

    public ClienteJuridico(String identifiacion, String cedulaContacto) {
        this.identifiacion = identifiacion;
        this.cedulaContacto = cedulaContacto;
    }

    public ClienteJuridico(String nombre, String provincia, String canton, String direccionExacta, String identifiacion, String cedulaContacto) {
        super(nombre, provincia, canton, direccionExacta);
        this.identifiacion = identifiacion;
        this.cedulaContacto = cedulaContacto;
    }

    public String getIdentifiacion() {
        return identifiacion;
    }

    public void setIdentifiacion(String identifiacion) {
        this.identifiacion = identifiacion;
    }

    public String getCedulaContacto() {
        return cedulaContacto;
    }

    public void setCedulaContacto(String cedulaContacto) {
        this.cedulaContacto = cedulaContacto;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" +
                "identifiacion='" + identifiacion + '\'' +
                ", cedulaContacto='" + cedulaContacto + '\'' +
                '}';
    }
}
