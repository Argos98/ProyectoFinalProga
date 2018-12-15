package controladores;

import cr.ac.ucenfotec.tl.Gestor;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;


import java.net.URL;
import java.util.ResourceBundle;


import javafx.fxml.FXML;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class FXMLRegistroClienteFisicoController implements Initializable {

    Gestor controller = new Gestor();

    @FXML
    private ComboBox selecProvincia;

    @FXML
    private ComboBox selecCanton;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellido1;

    @FXML
    private TextField txtApellido2;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtCanton;

    @FXML
    private TextField txtDirecconExacta;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        selecProvincia.getItems().add("San José");
        selecProvincia.getItems().add("Alajuela");
        selecProvincia.getItems().add("Cartago");
        selecProvincia.getItems().add("Heredia");
        selecProvincia.getItems().add("Guanacaste");
        selecProvincia.getItems().add("Puntarenas");
        selecProvincia.getItems().add("Limón");
//         String provincia = (String) selecProvincia.getValue();
//        if(provincia.equals("San José")){
//
//            selecProvincia.getItems().add("San José Central");
//
//        }

    }

    @FXML
    private void registrarClienteFisico(javafx.event.ActionEvent actionEvent) throws Exception {

        String nombre;
        String provincia;
        String canton;
        String direccionExacta;
        String apellido1;
        String apellido2;
        String correo;
        String telefono;

        nombre = txtNombre.getText();

        provincia = (String) selecProvincia.getValue();

        canton =  txtCanton.getText();

        direccionExacta = txtDirecconExacta.getText();

        apellido1 = txtApellido1.getText();

        apellido2 = txtApellido2.getText();

        correo = txtCorreo.getText();

        telefono = txtTelefono.getText();


        controller.registrarClienteFisico(nombre,provincia,canton,direccionExacta,apellido1,apellido2,correo,telefono);


        txtNombre.clear();
        txtCanton.clear();
        txtDirecconExacta.clear();
        txtApellido1.clear();
        txtApellido2.clear();
        txtCorreo.clear();
        txtTelefono.clear();

        Parent parent = FXMLLoader.load(getClass().getResource("../fxml/ConfirmarRegistroCliente.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Mensaje de Confrimacion");
        stage.show();
        ((Node) (actionEvent.getSource())).getScene().getWindow().hide();

    }

    {
//    @FXML
//    private void llenarSelect(ActionEvent actionEvent){
//        String provincia= (String) selecProvincia.getValue();
//
//        if(provincia.equals("San José")){
//
//            selecProvincia.getItems().add("San José Central");
//
//        }
    }

}




