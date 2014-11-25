/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.utcluj.sd.assign3.enities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Eniko
 */
@Entity
@Table(name = "orderdetail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderdetail.findAll", query = "SELECT o FROM Orderdetail o"),
    @NamedQuery(name = "Orderdetail.findByIdorderDetail", query = "SELECT o FROM Orderdetail o WHERE o.idorderDetail = :idorderDetail"),
    @NamedQuery(name = "Orderdetail.findByQuantity", query = "SELECT o FROM Orderdetail o WHERE o.quantity = :quantity")})
public class Orderdetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idorderDetail")
    private Integer idorderDetail;
    @Column(name = "quantity")
    private Integer quantity;
    @JoinColumn(name = "book_id", referencedColumnName = "idbook")
    @ManyToOne
    private Book bookId;
    @JoinColumn(name = "order_id", referencedColumnName = "idorder")
    @ManyToOne
    private OrderE orderId;

    public Orderdetail() {
    }

    public Orderdetail(Integer idorderDetail) {
        this.idorderDetail = idorderDetail;
    }

    public Integer getIdorderDetail() {
        return idorderDetail;
    }

    public void setIdorderDetail(Integer idorderDetail) {
        this.idorderDetail = idorderDetail;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    public OrderE getOrderId() {
        return orderId;
    }

    public void setOrderId(OrderE orderId) {
        this.orderId = orderId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idorderDetail != null ? idorderDetail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderdetail)) {
            return false;
        }
        Orderdetail other = (Orderdetail) object;
        if ((this.idorderDetail == null && other.idorderDetail != null) || (this.idorderDetail != null && !this.idorderDetail.equals(other.idorderDetail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.utcluj.sd.assign3.Orderdetail[ idorderDetail=" + idorderDetail + " ]";
    }
    
}
