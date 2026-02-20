package com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.util;

import com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.model.Usuario;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppShell {
    private static AppShell instance;
    private static Stage stage;
    private static Usuario usuario;

    public static AppShell getInstance(){
        if(instance == null){
            instance = new AppShell();
        }
        return instance;
    }
    private AppShell() {
    }

    public void changeView(View view){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(View.getFxmlPath()));
            Parent root = loader.load();
            Scene scene = new Scene(root,800,600);;
            stage.setScene(scene);
            stage.setTitle(view.getTitulo());
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        AppShell.stage = stage;
    }

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        AppShell.usuario = usuario;
    }
}
