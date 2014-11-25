package org.utcluj.sd.assign3.enities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.utcluj.sd.assign3.enities.Appuser;
import org.utcluj.sd.assign3.enities.Orderdetail;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-11-25T23:16:24")
@StaticMetamodel(OrderE.class)
public class OrderE_ { 

    public static volatile SingularAttribute<OrderE, Appuser> appuserId;
    public static volatile SingularAttribute<OrderE, Integer> idorder;
    public static volatile ListAttribute<OrderE, Orderdetail> orderdetailList;

}