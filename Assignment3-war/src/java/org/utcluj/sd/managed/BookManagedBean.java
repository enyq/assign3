/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.utcluj.sd.managed;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.utcluj.sd.assign3.enities.Book;


/**
 *
 * @author Eniko
 */
@ManagedBean(name="book")
@SessionScoped
public class BookManagedBean implements Serializable{

     @EJB
    private BookManagedBean bookManagedBean;
    private Book book;
    /**
     * Creates a new instance of UserManagedBean
     */
    public BookManagedBean() {
    }
    
    /**
     * Returns list of customer objects to be displayed in the data table
     * @return
     */
    public List<Book> getBooks()
    {
        return null;//bookManagedBean.findAll();
    }

    /**
     * Returns the selected Customer object
     * @return
     */
    public Book getDetails()
    {
        //Can either do this for simplicity or fetch the details again from the
        //database using the Customer ID
        return book;
    }
    
    /**
     * Action handler - user selects a customer record from the list
     * (data table) to view/edit
     * @param user
     * @return
     */
    public String showDetails(Book book)
    {
        this.book = book;
        return "DETAILS";
    }

    /**
     * Action handler - update the changes in the Customer object to the
     * database
     * @return
     */
    public String update()
    {
        System.out.println("###UPDATE###");
      //  bookManagedBean.edit(book);
        return "SAVED";
    }

    /**
     * Action handler - goes to the Customer listing page
     * @return
     */
    public String list()
    {
        System.out.println("###LIST###");
        return "LIST";
    }
    
     public String updateView(Book book){
        
       
//        this.=user.getId();
//        this.name=user.getName();
//        this.username = user.getUsername();
//        this.password = user.getPassword();
//        this.address=user.getAddress();
//        this.birthDate=user.getBirthDate();
//        this.latitude=user.getLatitude();
//        this.longitude=user.getLongitude();
//        this.role=user.getRole();
        return "updateView";
    }
    
}
