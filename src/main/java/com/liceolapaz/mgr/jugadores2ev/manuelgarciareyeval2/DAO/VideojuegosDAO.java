package com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.DAO;

import com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.model.Videojuegos;
import com.liceolapaz.mgr.jugadores2ev.manuelgarciareyeval2.util.DBConnection;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class VideojuegosDAO {

    public List<Videojuegos> findAll() {
        try {
            Session session = DBConnection.getInstance().getSession();
            String hql = "FROM Videojuegos";
            Query<Videojuegos> query = session.createQuery(hql, Videojuegos.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public boolean crearVideojuego(Videojuegos videojuegos) {
        try {
            Session session = DBConnection.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
            String hql = "FROM Videojuegos WHERE titulo = :titulo";
            Query<Videojuegos> query = session.createQuery(hql, Videojuegos.class);
            query.setParameter("titulo", videojuegos.getTitulo());

            if (query.uniqueResult() == null) {
                session.persist(videojuegos);
                transaction.commit();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean editar(Videojuegos videojuegos) {
        try {
            Session session = DBConnection.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
            Videojuegos v = session.find(Videojuegos.class, videojuegos.getId());
        if (v != null) {
                    v.setTitulo(videojuegos.getTitulo());
                    v.setCompletado(videojuegos.isCompletado());
                    session.merge(v);
                    transaction.commit();
                    return true;
                } else {
                    return false;
                }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean eliminar(Videojuegos videojuegos) {
        try {
            Session session = DBConnection.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
            Videojuegos v = session.find(Videojuegos.class, videojuegos.getId());
            if (v != null) {
                session.remove(v);
                transaction.commit();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}

