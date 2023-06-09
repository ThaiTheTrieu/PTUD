package ui;

import dao.departmentDao;
import entity.Phongban;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DepartmentUI extends javax.swing.JPanel {

    private static departmentDao depDao  = new departmentDao();;
    private List<Phongban> list;

    public DepartmentUI() {
        try {
            
            initComponents();
            btnDelete.setEnabled(false);
            DefaultTableModel dtbModel = (DefaultTableModel) tbEmployee1.getModel();
            list = depDao.getListOfDepartment();
            int i = 1;
            for (Phongban p : list) {
                dtbModel.addRow(new Object[]{i, p.getMaPhong(), p.getTenPhong(), p.getSoDT()});
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll1 = new scrollpanel.ScrollPaneWin11();
        tbEmployee1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCanel = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        lblDepartmentId = new java.awt.Label();
        txtDepId = new javax.swing.JTextField();
        lblDepName = new java.awt.Label();
        txtDepName = new javax.swing.JTextField();
        lblDepPhone = new java.awt.Label();
        txtDepPhone = new javax.swing.JTextField();
        txtDepPhone1 = new javax.swing.JTextField();
        lblDepPhone1 = new java.awt.Label();

        setBackground(new java.awt.Color(255, 255, 255));

        scroll1.setBackground(new java.awt.Color(255, 255, 255));

        tbEmployee1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tbEmployee1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã PB", "Tên phong ban ", "Số điện thoại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEmployee1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEmployee1MouseClicked(evt);
            }
        });
        scroll1.setViewportView(tbEmployee1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin phòng ban"));

        btnAdd.setBackground(new java.awt.Color(51, 255, 51));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Thêm");
        btnAdd.setToolTipText("");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(51, 255, 51));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCanel.setBackground(new java.awt.Color(255, 0, 0));
        btnCanel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCanel.setForeground(new java.awt.Color(255, 255, 255));
        btnCanel.setText("Hủy");
        btnCanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanelActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Tìm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblDepartmentId.setText("Mã Phòng ban:");

        txtDepId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepIdActionPerformed(evt);
            }
        });

        lblDepName.setText("Tên Phòng ban:");

        lblDepPhone.setText("Số điện thoại:");

        lblDepPhone1.setText("Số lượng nhân viên:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblDepName, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDepName)
                            .addComponent(txtDepId, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCanel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblDepPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(txtDepPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblDepPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDepPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(95, 95, 95)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDepPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDepPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(1, 1, 1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtDepId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDepName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDepPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnCanel)
                    .addComponent(btnAdd)
                    .addComponent(btnSearch))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scroll1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        btnAdd.setEnabled(true);
        int i = tbEmployee1.getRowCount() + 1;
        String id = txtDepId.getText();
        String name = txtDepName.getText();
        String phone = txtDepPhone.getText();
        try {
            if (!id.isBlank() || !name.isBlank() || !phone.isBlank()) {
                Phongban p = new Phongban(id, name, phone);
                depDao = new departmentDao();
                depDao.addNewDerpartment(p);
                DefaultTableModel tbModel = (DefaultTableModel) tbEmployee1.getModel();
                tbModel.addRow(new Object[]{i, p.getMaPhong(), p.getTenPhong(), p.getSoDT()});
                txtDepId.setText("");
                txtDepName.setText("");
                txtDepPhone.setText("");
                JOptionPane.showMessageDialog(null, "Đã thêm " + p.getTenPhong() +" thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            int i = 1;
            String id = txtDepId.getText();
            String depName = txtDepName.getText();
            String depPhone = txtDepPhone.getText();
            if (depDao.updateDepartment(id, depName, depPhone)) {
                DefaultTableModel dtbModel = (DefaultTableModel) tbEmployee1.getModel();
                dtbModel.setNumRows(0);
                for (Phongban p : depDao.getListOfDepartment()) {
                    dtbModel.addRow(new Object[]{i, p.getMaPhong(), p.getTenPhong(), p.getSoDT()});
                    i++;
                }
                btnCanel.doClick();
                JOptionPane.showMessageDialog(null, "Cập nhật thành công!");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
//            int selectedRow = tbEmployee1.getSelectedRow();
            DefaultTableModel dtbModel = (DefaultTableModel) tbEmployee1.getModel();
//            list = depDao.getListOfDepartment();
            Phongban department = depDao.getdepartmentByID(txtDepId.getText());
            if (JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa?", "Xác nhận", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                boolean deleted = depDao.deleteDepartment(department.getMaPhong());
                if (deleted) {
//                dtbModel.removeRow(selectedRow);
                    dtbModel.setNumRows(0);
                    int i = 1;
                    for (Phongban p : depDao.getListOfDepartment()) {
                        dtbModel.addRow(new Object[]{i++, p.getMaPhong(), p.getTenPhong(), p.getSoDT()});
                    }
                    txtDepId.setText("");
                    txtDepName.setText("");
                    txtDepPhone.setText("");
                    JOptionPane.showMessageDialog(null, "Phòng " + department.getTenPhong() + " đã được xóa!");

                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tbEmployee1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEmployee1MouseClicked
        try {
            int row = tbEmployee1.getSelectedRow();
            Phongban p = depDao.getListOfDepartment().get(row);
            txtDepId.setText(p.getMaPhong());
            txtDepId.setEditable(false);
            txtDepName.setText(p.getTenPhong());
            txtDepPhone.setText(p.getSoDT());
            btnAdd.setEnabled(false);
            btnDelete.setEnabled(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_tbEmployee1MouseClicked

    private void btnCanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanelActionPerformed
        txtDepId.setText("");
        txtDepId.setEditable(true);
        txtDepName.setText("");
        txtDepPhone.setText("");
        btnAdd.setEnabled(true);
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnCanelActionPerformed

    private void txtDepIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepIdActionPerformed

    private void refreshTable() throws SQLException {
        DefaultTableModel dftbModel = (DefaultTableModel) tbEmployee1.getModel();
        dftbModel.setNumRows(0);
        for (Phongban phongban : depDao.getListOfDepartment()) {
            dftbModel.addRow(new Object[]{});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCanel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label lblDepName;
    private java.awt.Label lblDepPhone;
    private java.awt.Label lblDepPhone1;
    private java.awt.Label lblDepartmentId;
    private scrollpanel.ScrollPaneWin11 scroll1;
    private javax.swing.JTable tbEmployee1;
    private javax.swing.JTextField txtDepId;
    private javax.swing.JTextField txtDepName;
    private javax.swing.JTextField txtDepPhone;
    private javax.swing.JTextField txtDepPhone1;
    // End of variables declaration//GEN-END:variables
}
