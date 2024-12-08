import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private PasswordField tPasswordField;
     
    @FXML
    private TextField tUsernamField;

    @FXML
    public void login(ActionEvent event) throws IOException{
    try {
        System.out.println("[LOG] - ");
        String usn = tUsernamField.getText();
        String pw = tPasswordField.getText();

        Parent homePageParent = FXMLLoader.load(getClass().getResource("InventoryPage.fxml"));
        Scene homescreen = new Scene(homePageParent);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        if (usn.equals("IYANZ") && (pw.equals("1111"))) {
            System.out.println("[LOG] Login success");
            stage.setScene(homescreen);
            stage.show();
            
        } else {
            System.out.println("[LOG] Login failed");
            Alert alert = new Alert(AlertType.ERROR);            
            alert.setTitle("Salah Username atau Password");
            alert.setContentText("Silahkan cek kembali Username atau Password anda");
            alert.showAndWait();
        }
    } catch (Exception e) {
        System.out.println("[LOG] error");
        e.printStackTrace();
    }
    }
}
