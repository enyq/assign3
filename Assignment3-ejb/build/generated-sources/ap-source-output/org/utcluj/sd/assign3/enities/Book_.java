package org.utcluj.sd.assign3.enities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.utcluj.sd.assign3.enities.Orderdetail;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-11-25T23:16:24")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, String> author;
    public static volatile SingularAttribute<Book, Float> price;
    public static volatile ListAttribute<Book, Orderdetail> orderdetailList;
    public static volatile SingularAttribute<Book, Integer> idbook;
    public static volatile SingularAttribute<Book, String> publisher;
    public static volatile SingularAttribute<Book, String> title;
    public static volatile SingularAttribute<Book, Integer> stock;

}