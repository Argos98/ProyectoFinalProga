package controladores;

import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class FXMLRegistroClienteController implements Initializable {


    @FXML
    private ComboBox clienteSelecion;

    @FXML
    private void volverMenu(ActionEvent actionEvent) throws IOException {
        ((Node) (actionEvent.getSource())).getScene().getWindow().hide();

        Parent parent = FXMLLoader.load(getClass().getResource("../fxml/Menu.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Notebook Code");
        stage.show();
    }

    @FXML
    private void lazarRegistros(ActionEvent actionEvent) throws IOException {

        String tipoCliente;

        tipoCliente = (String) clienteSelecion.getValue();

        if(tipoCliente.equals("Cliente Fisico")){
            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("../fxml/RegistroClienteFisico.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("Registro de Clientes");
            stage.show();
        }else {
            if(tipoCliente.equals("Cliente Juridico")){
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                Parent parent = FXMLLoader.load(getClass().getResource("../fxml/ClienteJuridico.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(parent);
                stage.setScene(scene);
                stage.setTitle("Registro de Clientes");
                stage.show();
            }
        }


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        clienteSelecion.getItems().add("Cliente Fisico");
        clienteSelecion.getItems().add("Cliente Juridico");


    }


}
