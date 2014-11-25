/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.utcluj.sd.assign3.enities;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Eniko
 */
@Entity
@Table(name = "order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderE.findAll", query = "SELECT o FROM OrderE o"),
    @NamedQuery(name = "OrderE.findByIdorder", query = "SELECT o FROM OrderE o WHERE o.idorder = :idorder")})
public class OrderE implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idorder")
    private Integer idorder;
    @JoinColumn(name = "appuser_id", referencedColumnName = "id")
    @ManyToOne
    private Appuser appuserId;
    @OneToMany(mappedBy = "orderId")
    private List<Orderdetail> orderdetailList;

    public OrderE() {
        orderdetailList = new LinkedList<>();
    }

    public OrderE(Integer idorder) {
        this.idorder = idorder;
    }

    public Integer getIdorder() {
        return idorder;
    }

    public void setIdorder(Integer idorder) {
        this.idorder = idorder;
    }

    public Appuser getAppuserId() {
        return appuserId;
    }

    public void setAppuserId(Appuser appuserId) {
        this.appuserId = appuserId;
    }

    @XmlTransient
    public List<Orderdetail> getOrderdetailList() {
        return orderdetailList;
    }

    public void setOrderdetailList(List<Orderdetail> orderdetailList) {
        this.orderdetailList = orderdetailList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idorder != null ? idorder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderE)) {
            return false;
        }
        OrderE other = (OrderE) object;
        if ((this.idorder == null && other.idorder != null) || (this.idorder != null && !this.idorder.equals(other.idorder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.utcluj.sd.assign3.OrderE[ idorder=" + idorder + " ]";
    }

    public void addOrderdetail(Orderdetail orderdetail) {
       orderdetailList.add(orderdetail);
    }
    
}
