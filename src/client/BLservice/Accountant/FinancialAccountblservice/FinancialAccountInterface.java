package client.BLservice.Accountant.FinancialAccountblservice;

import client.Vo.coVO;
import shared.ResultMessage;

import java.util.ArrayList;

public interface FinancialAccountInterface {

    /**
     * Add account
     *
     * @param vo
     * @return
     */
    public ResultMessage addAccount(coVO po);
    /**
     * Delete account
     *
     * @param vo
     * @return
     */
    public boolean deleteAccount(coVO po);
    /**
     * Modify account
     *
     * @param vo
     * @return
     */
    public coVO modifyAccount(coVO po);

    /**
     * Find accounts
     *
     * @param key
     * @return
     */
    public ArrayList<coVO> findAccount(String key);

    /**
     * show accounts
     *
     * @param
     * @return
     */

    public ArrayList<coVO> show() ;

}
