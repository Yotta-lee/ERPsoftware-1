package client.RMI;


import server.Dataservice.Billdataservice.*;
import server.Dataservice.Codataservice.Coaccount;
import server.Dataservice.Consumerdataservice.Consumer;
import server.Dataservice.Cutdataservice.cut;
import server.Dataservice.Goodsdataservice.Goods;
import server.Dataservice.Goodsdataservice.GoodsKinds;
import server.Dataservice.Logdataservice.log;
import server.Dataservice.Packdataservice.pack;
import server.Dataservice.Userdataservice.user;
import server.Dataservice.pubservice.pub;

import java.rmi.Remote;



public class RemoteHelper {

    private Remote remote;

    private static RemoteHelper remoteHelper = new RemoteHelper();

    public static RemoteHelper getInstance() {

        return remoteHelper;

    }


    private RemoteHelper() {

    }


    public void setRemote(Remote remote) {

        this.remote = remote;

    }

    public buyinBill getBuyinBill(){
        return (buyinBill)remote;
    }

    public giftBill getGiftBill(){
        return (giftBill)remote;
    }

    public moneyBill getMoneyBill(){
        return (moneyBill)remote;
    }

    public selloutBill getSelloutBill(){
        return (selloutBill)remote;
    }

    public stockDamageBill getStockDamageBill(){
        return (stockDamageBill)remote;
    }

    public stockOverflowBill getStockOverflowBill(){
        return (stockOverflowBill)remote;
    }

    public stockwarningBill getStockwarningBill(){
        return (stockwarningBill)remote;
    }

    public Coaccount getCoaccount(){
        return (Coaccount)remote;
    }

    public Consumer getConsumer(){
        return (Consumer)remote;
    }

    public cut getCut(){
        return (cut)remote;
    }

    public Goods getGoods(){
        return (Goods)remote;
    }

    public GoodsKinds getGoodsKinds(){
        return (GoodsKinds)remote;
    }

    public log getLog(){
        return (log)remote;
    }

    public pack getPack(){
        return (pack)remote;
    }

    public pub getPub(){
        return (pub)remote;
    }

    public user getUser(){
        return (user)remote;
    }
}
