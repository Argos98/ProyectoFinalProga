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

public class FXMLConfirmarRegistroClienteController implements Initializable {

    @FXML
    public void volverMenu(ActionEvent actionEvent) throws Exception {
        ((Node) (actionEvent.getSource())).getScene().getWindow().hide();

        Parent parent = FXMLLoader.load(getClass().getResource("../fxml/Menu.fxml"));
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
