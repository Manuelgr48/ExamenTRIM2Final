package com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.DAO;

import com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.model.Usuario;
import com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.util.DBConnection;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsuarioDAO {
    public Usuario UsuarioLogin (String username, String password) {
        try{
            Session session = DBConnection.getInstance().getSession();
            Usuario usuarioExiste = session.find(Usuario.class, username);
            if (usuarioExiste == null){
                return null;
            }
            else if (usuarioExiste.getPassword().equals(password)){
                return usuarioExiste;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean registro (Usuario usuario) {
        try{
            Session session = DBConnection.getInstance().getSession() ;
                Transaction transaction = session.beginTransaction();
            Usuario usuarioExiste = session.find(Usuario.class, usuario.getUsername());
            if (usuarioExiste == null){
            session.persist(usuario);
            transaction.commit();
            return true;
            }
            else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
