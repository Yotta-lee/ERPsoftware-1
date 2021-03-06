package server.Data.Billdata;

import server.Data.pub.publicDB;
import server.Data.tools.hibtools;
import server.Dataservice.Billdataservice.selloutBill;
import server.Po.selloutPO;
import server.hibernate.SelloutEntity;
import shared.copyclass;

import java.util.List;

/**
 * @author: pis
 * @description: good good study
 * @date: create in 12:37 2017/11/26
 */
public class SelloutBillDB extends publicDB implements selloutBill {


    @Override
    public selloutPO selloutfindByNO(String No) {
        hibtools.session = hibtools.sessionFactory.openSession();
        hibtools.tx = hibtools.session.beginTransaction();
        String hql = "from SelloutEntity where keyno = ?";
        List<SelloutEntity> SelloutEntitys = (List<SelloutEntity>)hibtools.session.createQuery(hql)
                .setParameter(0,No);
        hibtools.session.close();
        SelloutEntity ret = SelloutEntitys.get(0);
        selloutPO selloutpo = new selloutPO();
        copyclass.copy(ret,selloutpo);
        return selloutpo;
    }
}
