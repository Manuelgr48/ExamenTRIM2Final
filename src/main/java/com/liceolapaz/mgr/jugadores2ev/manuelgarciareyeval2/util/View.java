package com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.util;

import com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.controller.HomeController;
import com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.controller.LoginController;
import com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.controller.RegisterController;

public enum View {
    ;
    public static View getFxmlPath() {
        LoginController.class.getResource("/com/liceolapaz/mgr/jugadores2ev/manuelgarciareyeval2/view/login.fxml").toString();
        HomeController.class.getResource("/com/liceolapaz/mgr/jugadores2ev/manuelgarciareyeval2/view/home.fxml").toString();
        RegisterController.class.getResource("/com/liceolapaz/mgr/jugadores2ev/manuelgarciareyeval2/view/register.fxml").toString();
    }

    public String getTitulo() {
    }
}
