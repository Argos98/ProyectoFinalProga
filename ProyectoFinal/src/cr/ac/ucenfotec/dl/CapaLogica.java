package cr.ac.ucenfotec.dl;

import cr.ac.ucenfotec.bl.Actividad;
import cr.ac.ucenfotec.bl.ClienteFisico;
import cr.ac.ucenfotec.bl.ClienteJuridico;
import cr.ac.ucenfotec.bl.Contacto;
import cr.ac.ucenfotec.bl.Proyecto;
import cr.ac.ucenfotec.bl.Tarea;
import cr.ac.ucenfotec.bl.Tecnologia;
import cr.ac.ucenfotec.bl.Usuario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class CapaLogica {

    MultiUsuario multi = new MultiUsuario();

    ArrayList<Usuario> usuario;
    ArrayList<Proyecto> proyectos;
    ArrayList<Tecnologia> tecnologias;
    ArrayList<ClienteJuridico> clientesJuridicos;
    ArrayList<ClienteFisico> clientesFisicos;
    ArrayList<Contacto> contactos;
    ArrayList<Tarea> tareas;
    ArrayList<Actividad> actividades;

    public CapaLogica() {

        usuario = new ArrayList<>();
        proyectos = new ArrayList<>();
        tecnologias = new ArrayList<>();
        clientesJuridicos = new ArrayList<>();
        clientesFisicos = new ArrayList<>();
        contactos = new ArrayList<>();
        tareas = new ArrayList<>();
        actividades = new ArrayList<>();

    }

    public int primeraEjecucion() throws Exception {
        int cantidad = multi.cantSesion();
        int primera = -2;
        String numSesion = Integer.toString(cantidad);

        if (numSesion == null || numSesion == "0") {
            primera = 1;
        } else {
            primera = 2;
        }


        return primera;

    }

    public void registrarUsuario(Usuario tpmUsuario) {
        usuario.add(tpmUsuario);
    }

    public void registrarProyecto(Proyecto tmpProyecto) {
        proyectos.add(tmpProyecto);
    }

    public void regsitrarTecnologia(Tecnologia tpmTenologia) {
        tecnologias.add(tpmTenologia);
    }

    public void resgistrarClienteJuridico(ClienteJuridico tpmClienteJuridico) {
        clientesJuridicos.add(tpmClienteJuridico);
    }

    public void registrarClienteFisico(ClienteFisico tpmClienteFisico) {
        clientesFisicos.add(tpmClienteFisico);
    }

    public void registrarContacto(Contacto tpmContacto) {
        contactos.add(tpmContacto);
    }

    public void registrarTareas(Tarea tmpTarea) {

        tareas.add(tmpTarea);

    }

    public void registrarActividad(Actividad tpmActividad) {

        actividades.add(tpmActividad);

    }

    public void guardarUsuario(Usuario tpmUsuario) {
        try {
            FileWriter writer = new FileWriter("Usuario.txt", true);
            BufferedWriter buffer = new BufferedWriter(writer);

            buffer.newLine();
            buffer.write(tpmUsuario.toString());

            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarProyecto(Proyecto tpmProyecto) {
        try {
            FileWriter writer = new FileWriter("Proyectos.txt", true);
            BufferedWriter buffer = new BufferedWriter(writer);

            buffer.newLine();
            buffer.write(tpmProyecto.toString());

            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarTecnologia(Tecnologia tpmTecnologia) {
        try {
            FileWriter writer = new FileWriter("tecnologia.txt", true);
            BufferedWriter buffer = new BufferedWriter(writer);

            buffer.newLine();
            buffer.write(tpmTecnologia.toString());

            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarClientesJuridicos(ClienteJuridico tpmClienteJuridico) {
        try {
            FileWriter writer = new FileWriter("ClientesJuridicos.txt", true);
            BufferedWriter buffer = new BufferedWriter(writer);

            buffer.newLine();
            buffer.write(tpmClienteJuridico.toString());

            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarClientesFisicos(ClienteFisico tpmClienteFisico) {
        try {
            FileWriter writer = new FileWriter("ClientesFisico.txt", true);
            BufferedWriter buffer = new BufferedWriter(writer);

            buffer.newLine();
            buffer.write(tpmClienteFisico.toString());

            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarContacto(Contacto tpmContacto) {
        try {
            FileWriter writer = new FileWriter("Contactos.txt", true);
            BufferedWriter buffer = new BufferedWriter(writer);

            buffer.newLine();
            buffer.write(tpmContacto.toString());

            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarTarea(Tarea tpmTarea) {
        try {
            FileWriter writer = new FileWriter("Tarea.txt", true);
            BufferedWriter buffer = new BufferedWriter(writer);

            buffer.newLine();
            buffer.write(tpmTarea.toString());

            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarActividad(Actividad tpmActividad) {
        try {
            FileWriter writer = new FileWriter("Actividad.txt", true);
            BufferedWriter buffer = new BufferedWriter(writer);

            buffer.newLine();
            buffer.write(tpmActividad.toString());

            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> imprimirProyectos() {

        ArrayList<String> lista;
        lista = new ArrayList<>();
        try {
            FileReader reader = new FileReader("Proyectos.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String datos;

            //el bufferedReader extrae cada línea, y verrifica si el resultado es nulo. Si es nulo es que ya llegó al final del texto.
            //De ahi la condición del ciclo while.
            while ((datos = buffer.readLine()) != null) // Ciclo que imprime cada una de las lineas, que se almacenan en la variable datos.
            {
                lista.add(datos);

            }
            reader.close();//se cierra el reader.
        } catch (IOException e) {
            e.printStackTrace();//se imprime la pila de llamadas para ver dónde está el error.
        }
        return lista;

    }

    public static ArrayList<String> imprimirTecnologias() {

        ArrayList<String> lista;
        lista = new ArrayList<>();
        try {
            FileReader reader = new FileReader("tecnologia.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String datos;

            //el bufferedReader extrae cada línea, y verrifica si el resultado es nulo. Si es nulo es que ya llegó al final del texto.
            //De ahi la condición del ciclo while.
            while ((datos = buffer.readLine()) != null) // Ciclo que imprime cada una de las lineas, que se almacenan en la variable datos.
            {
                lista.add(datos);

            }
            reader.close();//se cierra el reader.
        } catch (IOException e) {
            e.printStackTrace();//se imprime la pila de llamadas para ver dónde está el error.
        }
        return lista;

    }

    public static ArrayList<String> imprimirClientesJuridicos() {

        ArrayList<String> lista;
        lista = new ArrayList<>();
        try {
            FileReader reader = new FileReader("ClientesJuridicos.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String datos;

            //el bufferedReader extrae cada línea, y verrifica si el resultado es nulo. Si es nulo es que ya llegó al final del texto.
            //De ahi la condición del ciclo while.
            while ((datos = buffer.readLine()) != null) // Ciclo que imprime cada una de las lineas, que se almacenan en la variable datos.
            {
                lista.add(datos);

            }
            reader.close();//se cierra el reader.
        } catch (IOException e) {
            e.printStackTrace();//se imprime la pila de llamadas para ver dónde está el error.
        }
        return lista;

    }

    public static ArrayList<String> imprimirClientesFisicos() {

        ArrayList<String> lista;
        lista = new ArrayList<>();
        try {
            FileReader reader = new FileReader("ClientesFisico.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String datos;

            //el bufferedReader extrae cada línea, y verrifica si el resultado es nulo. Si es nulo es que ya llegó al final del texto.
            //De ahi la condición del ciclo while.
            while ((datos = buffer.readLine()) != null) // Ciclo que imprime cada una de las lineas, que se almacenan en la variable datos.
            {
                lista.add(datos);

            }
            reader.close();//se cierra el reader.
        } catch (IOException e) {
            e.printStackTrace();//se imprime la pila de llamadas para ver dónde está el error.
        }
        return lista;

    }

    public static ArrayList<String> imprimirContacto() {

        ArrayList<String> lista;
        lista = new ArrayList<>();
        try {
            FileReader reader = new FileReader("Contactos.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String datos;

            //el bufferedReader extrae cada línea, y verrifica si el resultado es nulo. Si es nulo es que ya llegó al final del texto.
            //De ahi la condición del ciclo while.
            while ((datos = buffer.readLine()) != null) // Ciclo que imprime cada una de las lineas, que se almacenan en la variable datos.
            {
                lista.add(datos);

            }
            reader.close();//se cierra el reader.
        } catch (IOException e) {
            e.printStackTrace();//se imprime la pila de llamadas para ver dónde está el error.
        }
        return lista;

    }

    public static ArrayList<String> imprimirTarea() {

        ArrayList<String> lista;
        lista = new ArrayList<>();
        try {
            FileReader reader = new FileReader("Tarea.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String datos;

            //el bufferedReader extrae cada línea, y verrifica si el resultado es nulo. Si es nulo es que ya llegó al final del texto.
            //De ahi la condición del ciclo while.
            while ((datos = buffer.readLine()) != null) // Ciclo que imprime cada una de las lineas, que se almacenan en la variable datos.
            {
                lista.add(datos);

            }
            reader.close();//se cierra el reader.
        } catch (IOException e) {
            e.printStackTrace();//se imprime la pila de llamadas para ver dónde está el error.
        }
        return lista;

    }

    public static ArrayList<String> imprimirActividad() {

        ArrayList<String> lista;
        lista = new ArrayList<>();
        try {
            FileReader reader = new FileReader("Actividad.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String datos;

            //el bufferedReader extrae cada línea, y verrifica si el resultado es nulo. Si es nulo es que ya llegó al final del texto.
            //De ahi la condición del ciclo while.
            while ((datos = buffer.readLine()) != null) // Ciclo que imprime cada una de las lineas, que se almacenan en la variable datos.
            {
                lista.add(datos);

            }
            reader.close();//se cierra el reader.
        } catch (IOException e) {
            e.printStackTrace();//se imprime la pila de llamadas para ver dónde está el error.
        }
        return lista;

    }


}
