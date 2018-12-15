package controladores;

import cr.ac.ucenfotec.tl.Gestor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class FXMLRegistroUsuarioController implements Initializable {


    ObservableList<String> genero = FXCollections.observableArrayList("Selecione un genero", "Hombre", "Mujer");
    ObservableList<String> generoList = FXCollections.observableArrayList("Selecione un genero", "Hombre", "Mujer");
    Gestor controller = new Gestor();

    @FXML
    private Button registrar;

    @FXML
    private Button salir;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellido1;

    @FXML
    private TextField txtApellido2;

    @FXML
    private TextField txtCorreo;

    @FXML
    private PasswordField pfContrasena;

    @FXML
    private ComboBox generoBox;


    @FXML
    void regresarLogin(javafx.event.ActionEvent actionEvent) throws Exception {
        ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("../fxml/sample.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Notebook Code");
        stage.show();
    }

    @FXML
    private void tomarDatosUsuario(javafx.event.ActionEvent actionEvent) throws Exception {



        String nombre;
        String apellido1;
        String apellido2;
        String correo;

        int cedula;
        //voy usar una varibale String para la cedula ya luego parciarlo a int ya que el javaFx solo lee String en los formularios
        String cedulaTpm;

        String genero;
        String contrasena;
        int SCcant;

        nombre = txtNombre.getText();
        apellido1 = txtApellido1.getText();
        apellido2 = txtApellido2.getText();
        correo = txtCorreo.getText();

        cedulaTpm = txtCedula.getText();
        cedula = Integer.parseInt(cedulaTpm);

        contrasena = pfContrasena.getText();

        SCcant = 1;
        genero = (String) generoBox.getValue();


        controller.registrarUsuario(nombre, apellido1, apellido2, correo, cedula, genero, contrasena, SCcant);
        System.out.println(nombre + " " + apellido1 + " " + apellido2 + " " + correo + " " + cedula + " " + contrasena);


        limpiarFormulario();

        Parent parent = FXMLLoader.load(getClass().getResource("../fxml/ConfirmarRegistroUsuario.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Registro Usuario");
        stage.show();
        ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
    }


    public void limpiarFormulario() {
        txtNombre.clear();
        txtApellido1.clear();
        txtApellido2.clear();
        txtCorreo.clear();
        txtCedula.clear();
        pfContrasena.clear();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        generoBox.getItems().add("Hombre");
        generoBox.getItems().add("Mujer");
        generoBox.getItems().add("Otro");
    }

    @FXML
    public void initialize() {

       // generoBox.setItems("genero");


    }
}
