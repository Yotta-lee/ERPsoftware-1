package client.BL.Accountant.FinancialMoneybl.Mock;

import client.BL.Accountant.FinancialMoneybl.FinancialMoneyController;
import client.Vo.moneyVO;
import shared.ResultMessage;

public class FinancialMoneyControllerMock extends FinancialMoneyController {

    public ResultMessage getMoneyID(){
        return null;
    }

    public moneyVO find(String iD){
        return null;
    }

    public ResultMessage addBill(moneyVO vo){
        return null;
    }

    public moneyVO summit(){
        return null;
    }

    public ResultMessage getSum(){
        return null;
    }
}
