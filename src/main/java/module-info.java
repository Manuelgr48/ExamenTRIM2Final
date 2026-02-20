module com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;


    requires jakarta.persistence;
    requires java.sql;
    requires java.naming;


    opens com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2 to javafx.fxml;
    exports com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2;
    exports com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.controller;
    opens com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.controller to javafx.fxml;
}