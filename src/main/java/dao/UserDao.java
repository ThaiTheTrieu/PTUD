package dao;

import db.DBConnection;
import entity.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author thait
 */
public class UserDao {
    private Connection con = DBConnection.getInstance().getCon();
    
    public TaiKhoan getTaiKhoan(String tenTaiKhoan) throws SQLException {
        TaiKhoan tk = null;
        String sql = "select * from TaiKhoan where TaiKhoan.tenDangNhap = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, tenTaiKhoan);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            tk = new TaiKhoan(rs.getString("ma"), rs.getString("tenDangNhap"),
                    rs.getString("matKhau"), rs.getString("quyenHan"));
            return tk;
        }
        return null;
    }
}
