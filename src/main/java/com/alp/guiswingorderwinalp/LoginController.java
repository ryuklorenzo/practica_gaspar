package com.alp.guiswingorderwinalp;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.SwingUtilities;

public class LoginController {

    @FXML
    private TextField userField;

    @FXML
    private PasswordField passField;

    @FXML
    private void handleLogin() {
        String usuario = userField.getText();
        String password = passField.getText();

        // Verificamos credenciales
        if ("admin".equals(usuario) && "admin".equals(password)) {
            // 1. Cerrar la ventana de Login (JavaFX)
            Stage stage = (Stage) userField.getScene().getWindow();
            stage.close();

            // 2. Abrir la ventana Principal (Swing)
            SwingUtilities.invokeLater(() -> {
                GuiSwingOrderWinALP mainApp = new GuiSwingOrderWinALP();
                mainApp.setVisible(true);
            });

        } else {
            // Mostrar error si falla
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error de acceso");
            alert.setHeaderText(null);
            alert.setContentText("Usuario o contraseña incorrectos.\nInténtalo de nuevo.");
            alert.showAndWait();
        }
    }
}