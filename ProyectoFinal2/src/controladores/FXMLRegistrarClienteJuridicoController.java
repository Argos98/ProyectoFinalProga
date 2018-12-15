package controladores;

import cr.ac.ucenfotec.tl.Gestor;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLRegistrarClienteJuridicoController implements Initializable {

    Gestor controller = new Gestor();

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtCedulaJuridica;

    @FXML
    private ComboBox cbProvincia;

    @FXML
    private TextField txtCanton;

    @FXML
    private TextField txtDirecionExacta;

    @FXML
    private TextField txtCedulaCont;

    @FXML
    private TextField txtNombreCont;

    @FXML
    private TextField txtApellido1Cont;

    @FXML
    private TextField txtApellido2Cont;

    @FXML
    private TextField txtTelefonoCont;

    @FXML
    private TextField txtCorreoCont;

    @FXML
    private void regitroClienteJuridico() throws Exception {

        String nombre;
        String cedulaJuridica;
        String provincia;
        String canton;
        String direccionExacto;
        String cedulaCont;
        String nombreCont;
        String apellido1Cont1;
        String apellidoCont2;
        String telefonoCont;
        String correoCont;

        nombre = txtNombre.getText();
        cedulaJuridica = txtCedulaJuridica.getText();
        provincia = (String) cbProvincia.getValue();
        canton = txtCanton.getText();
        direccionExacto = txtDirecionExacta.getText();
        cedulaCont = txtCedulaCont.getText();
        nombreCont = txtNombreCont.getText();
        apellido1Cont1 = txtApellido1Cont.getText();
        apellidoCont2 = txtApellido2Cont.getText();
        telefonoCont = txtTelefonoCont.getText();
        correoCont = txtCorreoCont.getText();

       controller.registrarClienteJuridico(nombre,provincia,canton,direccionExacto,cedulaJuridica,cedulaCont);
      controller.registrarContacto(nombreCont,apellido1Cont1,apellidoCont2,cedulaCont,telefonoCont,correoCont);

        txtNombre.clear();
        txtCedulaJuridica.clear();
        txtCanton.clear();
        txtDirecionExacta.clear();
        txtCedulaCont.clear();
        txtNombreCont.clear();
        txtApellido1Cont.clear();
        txtApellido2Cont.clear();
        txtTelefonoCont.clear();
        txtCorreoCont.clear();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbProvincia.getItems().add("San José");
        cbProvincia.getItems().add("Alajuela");
        cbProvincia.getItems().add("Cartago");
        cbProvincia.getItems().add("Heredia");
        cbProvincia.getItems().add("Guanacaste");
        cbProvincia.getItems().add("Puntarenas");
        cbProvincia.getItems().add("Limón");
    }


}
