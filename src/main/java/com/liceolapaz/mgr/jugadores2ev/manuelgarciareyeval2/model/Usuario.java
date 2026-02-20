package com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario{
    @Id
    private String username;
    private String password;
    private boolean isAdmin;

    public Usuario() {
    }

    public Usuario(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = false;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
