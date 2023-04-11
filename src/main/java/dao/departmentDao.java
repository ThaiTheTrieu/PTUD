package dao;

import db.DBConnection;
import entity.Phongban;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class departmentDao {

    private final Connection con;

    public departmentDao() {
        this.con = DBConnection.getInstance().getCon();
    }
    
    

    public Phongban getdepartmentByID(String id) throws SQLException {
        String sql = "select * from PhongBan  where maPB = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            return new Phongban(rs.getString("maPB"), rs.getString("tenPB"), rs.getString("soDienThoaiPB"));
        }
        return null;
    }

    public List<Phongban> getListOfDepartment() throws SQLException {
        List<Phongban> list = new ArrayList<Phongban>();
        System.out.println("connection: " +con);
        String sql = "select * from PhongBan";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Phongban p = new Phongban(rs.getString("maPB"), rs.getString("tenPB"), rs.getString("soDienThoaiPB"));
            list.add(p);
        }
        return list;
    }

    public boolean updateDepartment(String id, String name, String phone) throws Exception {
        String sql;
        PreparedStatement stmt;
        int rs;
        if (!id.isBlank()) {
            if (name.isBlank()) {
                sql = "update PhongBan Set soDienThoaiPB =? where maPB =?";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, phone);
                stmt.setString(2, id);
                rs = stmt.executeUpdate();
            } else if (phone.isBlank()) {
                sql = "update PhongBan Set tenPB =? where maPB =?";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, name);
                stmt.setString(2, id);
                rs = stmt.executeUpdate();
            } else if (name.isBlank() && phone.isBlank()) {
                throw new Exception("Vui lòng điền đầy đủ thông tin");
            } else {
                sql = "update PhongBan Set tenPB =?, soDienThoaiPB =? where maPB =?";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, name);
                stmt.setString(2, phone);
                stmt.setString(3, id);
                rs = stmt.executeUpdate();
            }
        } else {
            throw new Exception("Vui lòng nhập mã phòng ban");
        }

        return rs>0;
    }

    public int addNewDerpartment(Phongban p) throws Exception {
        if (getdepartmentByID(p.getMaPhong()) != null) {
            throw new Exception("Trùng mã phòng");
        }
        String sql = "INSERT INTO PhongBan VALUES (?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, p.getMaPhong());
        stmt.setString(2, p.getTenPhong());
        stmt.setString(3, p.getSoDT());
        int n = stmt.executeUpdate();
        return n;
    }

    public boolean deleteDepartment(String id) throws SQLException {
        String sql = "DELETE FROM PhongBan WHERE maPB = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, id);
        int rs = stmt.executeUpdate();
        return rs > 0;
    }
}
