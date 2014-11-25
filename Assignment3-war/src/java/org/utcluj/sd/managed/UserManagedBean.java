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
import org.utcluj.sd.assign3.ejb.UserSessionBean;
import org.utcluj.sd.assign3.enities.Appuser;



/**
 *
 * @author Eniko
 */
@ManagedBean(name="user")
@SessionScoped
public class UserManagedBean implements Serializable{

     @EJB
    private UserSessionBean userSessionBean;
    private Appuser user;
    private int id;
    private String name;
    private String username;
    private String password;
    private String usertype;
    private String email;
    private String phoneNo; 
    private String address;
 
    /**
     * Creates a new instance of UserManagedBean
     */
    public UserManagedBean() {
    }
    
    /**
     * Returns list of customer objects to be displayed in the data table
     * @return
     */
    public List<Appuser> getUsers()
    {
         return null;
      //  return userSessionBean.retrieve();
    }

    /**
     * Returns the selected Customer object
     * @return
     */
    public Appuser getDetails()
    {
        //Can either do this for simplicity or fetch the details again from the
        //database using the Customer ID
        return user;
    }
    
    /**
     * Action handler - user selects a customer record from the list
     * (data table) to view/edit
     * @param user
     * @return
     */
    public String showDetails(Appuser user)
    {
        this.user = user;
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
      //  user = userSessionBean.update(user);
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
    
     public String updateView(Appuser user){
        
       
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
     
    public String login() {
        user = userSessionBean.login(username, password);
        if(user!=null)
        {
 
        
                if (user.getType().equals("admin")) {
                    setUsertype("admin");
                return "allBooks";
                } else { 
                    setUsertype("simple");
                return "allBooks"; 
                }
                
        } else {
                return "index";
            }
        
    }
    
//    public String insert() {
//        usersFacade.create(new Users(5,name,username,password,email,phoneNo,address,"simple"));
//        return "allBooks";
//    }
     
      public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public Appuser getUser() {
        return user;
    }

    public void setUser(Appuser user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String eMail) {
        this.email = eMail;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
    

