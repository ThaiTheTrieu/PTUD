package test;

import dao.departmentDao;
import db.DBConnection;
import entity.Phongban;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author thait
 */
public class test {
    static departmentDao depDao = new departmentDao();
    static Connection con = new DBConnection().getInstance().getCon();
    public static void main(String[] args) throws Exception {
//        System.out.println(depDao.getdepartmentByID("p01"));
        List<Phongban> list = depDao.getListOfDepartment();
        list.forEach(p -> System.out.println(p));
//        System.out.println(con);
//        Phongban p = new Phongban("P04", "Phòng tài chính", "0987 777 999");
//        depDao.addNewDerpartment(p);
//    depDao.deleteDepartment("p4");
//    depDao.deleteDepartment("p01");
//        int rs = depDao.updateDepartment("p01", "", "0763 345 345");
//        System.out.println("--------Resuilt: "+rs);
    }
}
