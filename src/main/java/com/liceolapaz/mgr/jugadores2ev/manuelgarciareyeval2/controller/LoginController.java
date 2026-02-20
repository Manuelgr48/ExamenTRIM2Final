package com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.controller;

import com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.DAO.UsuarioDAO;
import com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.model.Usuario;
import com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.util.AppShell;
import com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.util.View;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {
    @FXML
    public Label welcomeText;
    @FXML
    public TextField usernameField;
    @FXML
    public PasswordField passwordField;
    @FXML
    public Button loginBTN;
    @FXML
    public Button registerBTN;

    UsuarioDAO usuarioDAO = new UsuarioDAO();
    public boolean comprobarCampos(){
        return usernameField.getText().isEmpty() && !passwordField.getText().isEmpty();
    }

    public void handeLogin(ActionEvent actionEvent){
        if (comprobarCampos()){
            String username = usernameField.getText();
            String password = passwordField.getText();
            Usuario usuarioALoguear = usuarioDAO.UsuarioLogin(username, password);
            Object Alertas;
            if (usuarioALoguear != null) {
               
                    else {
                        Alertas.showStandardAlert("Error en login, credenciales incorrectas", Alert.AlertType.ERROR);
                    }
                }
                else {
                    Alertas.showStandardAlert(,"Rellena los cammpos", Alert.AlertType.ERROR);
                }

            }

            public void handleRegistro(ActionEvent actionEvent) {
                AppShell.getInstance().changeView(View.REGISTRO;
            }
        };
            }
        }
    }




    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}