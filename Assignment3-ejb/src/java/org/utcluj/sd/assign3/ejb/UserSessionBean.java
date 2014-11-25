/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.utcluj.sd.assign3.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.utcluj.sd.assign3.enities.Appuser;

/**
 *
 * @author Eniko
 */
@Stateless
@LocalBean
public class UserSessionBean {
    @PersistenceContext(unitName = "Assignment3-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    public List<Appuser> retrieve() {
         Query query = em.createNamedQuery("Appuser.findAll");
        return query.getResultList();
    }
    
    public Appuser login(String username, String password) {
          Query query = em.createNamedQuery("Appuser.findByName").setParameter("username", username);
        Appuser user =  (Appuser) query.getSingleResult();
        if(password.equals(user.getPassword())) {
            return user;
        }
        return new Appuser();
    }

    
}
