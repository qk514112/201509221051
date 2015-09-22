package services;

/**
 * Created by dj0708 on 15/9/22.
 */

import models.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class UserService {
    @PersistenceContext
    private EntityManager em;

    public List<User> getAll() {
//        TypedQuery<User> query = em.createQuery("select u from User u", User.class);
        Query query = em.createQuery("SELECT u FROM User u");
        return query.getResultList();
    }
}
