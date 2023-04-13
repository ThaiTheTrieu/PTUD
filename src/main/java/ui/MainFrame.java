
package ui;


public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        pnlMenu.setEvent((int index, int subintex) -> {
            if(index == 1&& subintex ==1){
                tbdMenu.setSelectedIndex(0);
            }
            if(index == 1 && subintex == 2){
                tbdMenu.setSelectedIndex(1);
            }
            if(index == 2 && subintex == 1){
                tbdMenu.setSelectedIndex(2);
            }
            if(index == 2 && subintex == 2){
                tbdMenu.setSelectedIndex(3);
            }
            if(index == 4 && subintex == 1){
                tbdMenu.setSelectedIndex(4);
            }
            if(index == 3 && subintex == 1){
                tbdMenu.setSelectedIndex(5);
            }
            if(index == 3 && subintex == 2){
                tbdMenu.setSelectedIndex(6);
            }
            if(index == 4 && subintex == 2){
                tbdMenu.setSelectedIndex(7);
            }
        });
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new scrollpanel.ScrollPaneWin11();
        pnlMenu = new ui.Menu();
        tbdMenu = new javax.swing.JTabbedPane();
        employeeUI2 = new ui.EmployeeUI();
        timKiemNhanVien1 = new ui.TimKiemNhanVien();
        congNhanUI1 = new ui.CongNhanUI();
        timKiemCongNhan1 = new ui.TimKiemCongNhan();
        departmentUI1 = new ui.DepartmentUI();
        sanPhamUI1 = new ui.SanPhamUI();
        timKiemSanPham1 = new ui.TimKiemSanPham();
        timKiemPhonggBan1 = new ui.TimKiemPhonggBan();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setViewportView(pnlMenu);

        getContentPane().add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 700));

        employeeUI2.setPreferredSize(new java.awt.Dimension(1000, 699));
        tbdMenu.addTab("tab3", employeeUI2);
        tbdMenu.addTab("tab4", timKiemNhanVien1);
        tbdMenu.addTab("tab2", congNhanUI1);
        tbdMenu.addTab("tab5", timKiemCongNhan1);
        tbdMenu.addTab("tab3", departmentUI1);
        tbdMenu.addTab("tab6", sanPhamUI1);
        tbdMenu.addTab("tab7", timKiemSanPham1);
        tbdMenu.addTab("tab8", timKiemPhonggBan1);

        getContentPane().add(tbdMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, -30, 1080, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.CongNhanUI congNhanUI1;
    private ui.DepartmentUI departmentUI1;
    private ui.EmployeeUI employeeUI2;
    private ui.Menu pnlMenu;
    private ui.SanPhamUI sanPhamUI1;
    private scrollpanel.ScrollPaneWin11 scroll;
    private javax.swing.JTabbedPane tbdMenu;
    private ui.TimKiemCongNhan timKiemCongNhan1;
    private ui.TimKiemNhanVien timKiemNhanVien1;
    private ui.TimKiemPhonggBan timKiemPhonggBan1;
    private ui.TimKiemSanPham timKiemSanPham1;
    // End of variables declaration//GEN-END:variables
}
