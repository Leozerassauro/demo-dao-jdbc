package model.dao;

import model.dao.impl.SellerDaoJDBC;

/*
 * @author Leonardo
 */
public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }

}