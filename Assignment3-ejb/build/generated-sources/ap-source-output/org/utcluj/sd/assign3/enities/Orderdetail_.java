package org.utcluj.sd.assign3.enities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.utcluj.sd.assign3.enities.Book;
import org.utcluj.sd.assign3.enities.OrderE;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-11-25T23:16:24")
@StaticMetamodel(Orderdetail.class)
public class Orderdetail_ { 

    public static volatile SingularAttribute<Orderdetail, Integer> idorderDetail;
    public static volatile SingularAttribute<Orderdetail, Integer> quantity;
    public static volatile SingularAttribute<Orderdetail, OrderE> orderId;
    public static volatile SingularAttribute<Orderdetail, Book> bookId;

}