package controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class FXMLConfirmarUsuarioUsuario implements Initializable {
    FXMLRegistroUsuarioController regU = new FXMLRegistroUsuarioController();

    @FXML
    public void volverLogin(ActionEvent actionEvent) throws Exception {
        ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
//        ((Node) (FXMLLoader.load(getClass().getResource("../fxml/ConfirmarRegistroUsuario.fxml")))).getScene().getWindow().hide();
//        ((Node) (FXMLLoader.load(getClass().getResource("../fxml/RegistroUsuario.fxml.fxml")))).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("../fxml/sample.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Notebook Code");
        stage.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
