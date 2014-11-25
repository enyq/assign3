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
import org.utcluj.sd.assign3.enities.Book;

/**
 *
 * @author Eniko
 */
@Stateless
@LocalBean
public class BookSessionBean {
    @PersistenceContext(unitName = "Assignment3-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    public List<Book> retrieve() {
        Query query = em.createNamedQuery("Book.findAll");
        return query.getResultList();
    }

    public Book update(Book book) {
        return em.merge(book);
    }
    
    public void delete(Book book) {
        em.remove(book);
    }
}
