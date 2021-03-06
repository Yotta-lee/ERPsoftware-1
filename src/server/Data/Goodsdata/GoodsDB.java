package server.Data.Goodsdata;

import server.Data.pub.publicDB;
import shared.copyclass;
import server.Dataservice.Goodsdataservice.Goods;
import server.Po.goodsPO;
import server.Data.tools.hibtools;
import server.hibernate.GoodsEntity;
import shared.ResultMessage;


import java.util.ArrayList;
import java.util.List;

public class GoodsDB extends publicDB implements Goods{

    @Override
    public List goodsfindGoods(String keyword) {
        hibtools.session = hibtools.sessionFactory.openSession();
        hibtools.tx = hibtools.session.beginTransaction();
        String hql = "from GoodsEntity where keyno like ? or keyname like ?";
        List<GoodsEntity> goodsEntities = (List<GoodsEntity>)hibtools.session.createQuery(hql)
                .setParameter(0,keyword).setParameter(1,keyword).list();
        List<goodsPO> goodsPOS = new ArrayList<>() ;
        for(GoodsEntity i : goodsEntities){
            goodsPO temp = new goodsPO();
            copyclass.copy(i,temp);
            goodsPOS.add(temp);

        }
        hibtools.session.close();
        return goodsPOS;
    }

    @Override
    public List goodsfindByKind(String kind) {
        hibtools.session = hibtools.sessionFactory.openSession();
        hibtools.tx = hibtools.session.beginTransaction();
        String hql = "from GoodsEntity where kinds like ?";
        List<GoodsEntity> goodsEntities = (List<GoodsEntity>)hibtools.session.createQuery(hql)
                .setParameter(0,kind).list();
        List<goodsPO> goodsPOS = new ArrayList<>() ;
        for(GoodsEntity i : goodsEntities){
            goodsPO temp = new goodsPO();
            copyclass.copy(i,temp);
            goodsPOS.add(temp);

        }
        hibtools.session.close();
        return goodsPOS;
    }

    @Override
    public List goodsfindAll() {
        hibtools.session = hibtools.sessionFactory.openSession();
        hibtools.tx = hibtools.session.beginTransaction();
        String hql = "from GoodsEntity";
        List<GoodsEntity> goodsEntities = (List<GoodsEntity>)hibtools.session.createQuery(hql).list();
        List<goodsPO> goodsPOS = new ArrayList<>() ;
        for(GoodsEntity i : goodsEntities){
            goodsPO temp = new goodsPO();
            copyclass.copy(i,temp);
            goodsPOS.add(temp);

        }
        hibtools.session.close();
        return goodsPOS;
    }

}
