/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.utcluj.sd.assign3.ejb;

import javax.ejb.Stateful;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import javax.persistence.SynchronizationType;
import org.utcluj.sd.assign3.enities.Appuser;
import org.utcluj.sd.assign3.enities.Book;
import org.utcluj.sd.assign3.enities.OrderE;
import org.utcluj.sd.assign3.enities.Orderdetail;

/**
 *
 * @author Eniko
 */
@Stateful
@LocalBean
public class ShoppingCart {

    @PersistenceContext(type=PersistenceContextType.EXTENDED,synchronization = SynchronizationType.UNSYNCHRONIZED)
    private EntityManager em;
 
    Appuser appuser;
    OrderE order;
   
 
public void startToShop(Integer userId) {
  Query query = em.createNamedQuery("Appuser.findById");
  appuser = (Appuser) query.getSingleResult();
  order = new OrderE(); 
  
}
 
public void addToCart(Book book, int quantity) {
  Orderdetail orderdetail = new Orderdetail();
  orderdetail.setBookId(book);
  orderdetail.setIdorderDetail(Integer.MIN_VALUE);
  orderdetail.setQuantity(quantity);
  order.addOrderdetail(orderdetail);
}
public void confirmOrder() {
  em.joinTransaction();
  appuser.addOrder(order);
}
}
