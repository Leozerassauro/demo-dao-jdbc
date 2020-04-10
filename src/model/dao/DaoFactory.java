package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

/*
 * @author Leonardo
 */
public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

}
