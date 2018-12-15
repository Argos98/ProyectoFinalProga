package controladores;

import cr.ac.ucenfotec.tl.Gestor;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.Parent;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Node;

public class Controller implements Initializable {

    Gestor controller = new Gestor();

    @FXML
    private Button iniciarSecion;

    @FXML
    private Button salir;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtContrasena;

    @FXML
    private void inicarSecion(javafx.event.ActionEvent actionEvent) throws Exception {

        String correo = controller.getCorreo();
        String contrasena = controller.getContrasena();

        System.out.println(correo+" "+contrasena);

        String correoU;
        String contrasenaU;
//
        correoU = txtCorreo.getText();
        contrasenaU = txtContrasena.getText();
//
        System.out.println(correoU + contrasenaU);

        if (correo.equals(correoU) && contrasena.equals(contrasenaU)) {
            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();

            Parent parent = FXMLLoader.load(getClass().getResource("../fxml/Menu.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("Notebook Code");
            stage.show();

        }


    }

    @FXML
    private void lanzarRegistroUsuario(javafx.event.ActionEvent actionEvent) throws Exception {
        ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("../fxml/RegistroUsuario.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Registro De Usuario");
        stage.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


}
