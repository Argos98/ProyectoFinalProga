package cr.ac.ucenfotec.tl;

import cr.ac.ucenfotec.bl.*;
import cr.ac.ucenfotec.dl.CapaLogica;
import cr.ac.ucenfotec.dl.MultiCliente;
import cr.ac.ucenfotec.dl.MultiContacto;
import cr.ac.ucenfotec.dl.MultiUsuario;

import java.util.ArrayList;
import java.util.Date;

public class Gestor {

    private CapaLogica cl;
    private MultiUsuario muliti;

    public Gestor() {

        cl = new CapaLogica();
        muliti = new MultiUsuario();

    }

    public void registrarUsuario(String nombre, String apellido1, String apellido2, String correo, int cedula,
                                 String genero, String conterasena, int SCcant) throws Exception {

        Usuario tpmUsuario;

        tpmUsuario = (new MultiUsuario().registrarUsuario(nombre, apellido1, apellido2, correo, cedula, genero, conterasena, SCcant));

        //El codigo que se encuentra aqui era de cundo usaba arraylist y txt para el almacenamiento del programa
        {
            // tpmUsuario = new Usuario(nombre,apellido1,apellido2,correo,cedula,genero,conterasena);

            //cl.registrarUsuario(tpmUsuario);
            // cl.guardarUsuario(tpmUsuario);
        }
    }

    public void registrarProyecto(String codigo, String nombre, String descripcion, String fechaInicio, String tipo) {

        Proyecto tpmProyecto;

        tpmProyecto = new Proyecto(codigo, nombre, descripcion, fechaInicio, tipo);

        cl.registrarProyecto(tpmProyecto);
        cl.registrarProyecto(tpmProyecto);

    }

    public void registrarTecnologias(String codigo, String nombre) {

        Tecnologia tpmTecnologia;

        tpmTecnologia = new Tecnologia(codigo, nombre);

        cl.regsitrarTecnologia(tpmTecnologia);
        cl.guardarTecnologia(tpmTecnologia);

    }

    public void registrarClienteJuridico(String nombre, String provincia, String canton, String direccionExacta,
                                         String identifiacion, String cedulaCont) throws Exception {

        ClienteJuridico tpmClienteJuridico;

        tpmClienteJuridico = (new MultiCliente().registrarClienteJuridico(nombre,provincia,canton,direccionExacta,identifiacion,cedulaCont));

//        cl.resgistrarClienteJuridico(tpmClienteJuridico);
//        cl.guardarClientesJuridicos(tpmClienteJuridico);

    }

    public void registrarClienteFisico(String nombre, String provincia, String canton, String direccionExacta,
                                       String apellido1, String apellido2, String correo, String telefono) throws Exception {

        ClienteFisico tpmClienteFisico;

        tpmClienteFisico = (new MultiCliente().registrarClienteFisico(nombre,provincia,canton,direccionExacta,apellido1,apellido2,correo,telefono));

//        cl.registrarClienteFisico(tpmClienteFisico);
//        cl.guardarClientesFisicos(tpmClienteFisico);

    }

    public void registrarContacto(String nombre, String apellido1, String apellido2, String cedula, String telefono,
                                  String correo) throws Exception {

        Contacto tpmContacto;

        tpmContacto = (new MultiContacto().registrarContacto(nombre, apellido1, apellido2, cedula, telefono, correo)) ;

//        cl.registrarContacto(tpmContacto);
//        cl.guardarContacto(tpmContacto);

    }

    public void registrarTarea(String codigo, String nombre, String descripcion) {

        Tarea tpmTarea;

        tpmTarea = new Tarea(codigo, nombre, descripcion);

        cl.registrarTareas(tpmTarea);
        cl.guardarTarea(tpmTarea);
    }

    public void registrarActivdad(String qHizo, Date fechaInicio, Date fechaFin, String horaIncio, String horaFin) {

        Actividad tpmActividad;

        tpmActividad = new Actividad(qHizo, fechaInicio, fechaFin, horaIncio, horaFin);

        cl.guardarActividad(tpmActividad);
        cl.registrarActividad(tpmActividad);

    }

    public int primeraEjecucion() throws Exception {
        int primeraEjecuin;
        return primeraEjecuin = cl.primeraEjecucion();
    }


    //Lista atraves de la bd usando el multi
    public String[] imprimirUsuario() throws Exception {
        String datos[];
        int i = 0;
        ArrayList<Usuario> listaUsuarios;

        listaUsuarios = (new MultiUsuario().listarUsurios());
        System.out.println("soy el gestor" + listaUsuarios.toString());
        datos = new String[listaUsuarios.size()];


        for (Usuario dato : listaUsuarios) {
            datos[i] = dato.toString();
            i++;
        }

        return datos;
    }

    //esta es un get de correo
    public String getCorreo() throws Exception {
        return muliti.correo();
    }

    //un get de contrasena
    public String getContrasena() throws Exception {
        return muliti.contrasena();
    }

    public String[] imprirmirProyectos() {
        String[] datos;
        int i = 0;
        datos = new String[cl.imprimirProyectos().size()];
        for (String dato : cl.imprimirProyectos()) {
            datos[i] = dato.toString();
            i++;
        }
        return datos;
    }

    public String[] imprirmirClientesFisicos() {
        String[] datos;
        int i = 0;
        datos = new String[cl.imprimirClientesFisicos().size()];
        for (String dato : cl.imprimirClientesFisicos()) {
            datos[i] = dato.toString();
            i++;
        }
        return datos;
    }

    public String[] imprirmirClientesJuridicos() {
        String[] datos;
        int i = 0;
        datos = new String[cl.imprimirClientesJuridicos().size()];
        for (String dato : cl.imprimirClientesJuridicos()) {
            datos[i] = dato.toString();
            i++;
        }
        return datos;
    }

    public String[] imprirmirTecnologias() {
        String[] datos;
        int i = 0;
        datos = new String[cl.imprimirTecnologias().size()];
        for (String dato : cl.imprimirTecnologias()) {
            datos[i] = dato.toString();
            i++;
        }
        return datos;
    }

    public String[] imprirmirContacto() {
        String[] datos;
        int i = 0;
        datos = new String[cl.imprimirContacto().size()];
        for (String dato : cl.imprimirContacto()) {
            datos[i] = dato.toString();
            i++;
        }
        return datos;
    }

    public String[] imprirmirTarea() {
        String[] datos;
        int i = 0;
        datos = new String[cl.imprimirTarea().size()];
        for (String dato : cl.imprimirTarea()) {
            datos[i] = dato.toString();
            i++;
        }
        return datos;
    }

    public String[] imprirmirActividad() {
        String[] datos;
        int i = 0;
        datos = new String[cl.imprimirActividad().size()];
        for (String dato : cl.imprimirActividad()) {
            datos[i] = dato.toString();
            i++;
        }
        return datos;
    }
}
