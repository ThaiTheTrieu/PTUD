package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class Menu extends JComponent {

    private MenuEvent event;
    private MigLayout layout;
    private final String[][] menuItems = new String[][]{
        {"Menu"},
        {"Nhân viên", "Danh sách nhân viên", "Tìm kiếm"},
        {"Công nhân", "Danh sách công nhân", "Tìm kiếm" ,"Phân công"},
        {"Sản phẩm", "Danh sách sản phẩm", "Tìm kiếm", "Quản lý công đoạn"},
        {"Đơn vị quản lí", "Danh sách phòng ban", "Tìm kiếm phòng ban","Danh sách tổ sản xuất","Tìm kiếm tổ sản xuất"},
        {"Bảng lương", "Công nhân", "Nhân viên", "Thống kê"},
        {"Bảng chấm công", "Chấm công công nhân", "Chấm công nhân viên"},
        {"Tài khoản", "Thông tin tài khoản", "Quản lý tài khoản", "Đổi mật khẩu"}
    };

    public MenuEvent getEvent() {
        return event;
    }

    public void setEvent(MenuEvent event) {
        this.event = event;
    }

    public String[][] getMenuItems() {
        return menuItems;
    }

    public Menu() {
        init();
    }

    private void init() {
        layout = new MigLayout("wrap 1, fillx, gapy 0, inset 2", "fill");
        setLayout(layout);
        setOpaque(true);
        for (int i = 0; i < menuItems.length; i++) {
            addMenu(menuItems[i][0], i);
        }
    }

    private Icon getIcon(int index) {
        URL url = getClass().getResource("/image/" + index + ".png");
        if (url != null) {
            return new ImageIcon(url);
        } else {
            return null;
        }

    }

    private void addMenu(String menuName, int index) {
        int lenght = menuItems[index].length;
        MenuItem item = new MenuItem(menuName, index, lenght > 1);
        Icon icon = getIcon(index);
        if (icon != null) {
            item.setIcon(icon);
        }

        item.addActionListener((ActionEvent e) -> {
            if (lenght > 1) {
                if (!item.isSelected()) {
                    item.setSelected(true);
                    addSubMenu(item, index, lenght, getComponentZOrder(item));
                } else {
                    hideMenu(item, index);
                    item.setSelected(false);
                }
            } else {
                   if(event!=null){
                       event.selected(index, 0);
                   }
            }
        });
        add(item);
        revalidate();
        repaint();
    }

    private void addSubMenu(MenuItem item, int index, int lenght, int indexZorder) {
        JPanel panel = new JPanel(new MigLayout("wrap 1, fillx, inset 0, gapy 0", "fill"));
        panel.setName(index + "");
        panel.setOpaque(false);
        for (int i = 1; i < lenght; i++) {
            MenuItem subItem = new MenuItem(menuItems[index][i], i, false);
            subItem.addActionListener((ActionEvent e) -> {
                if(event!=null){
                    event.selected(index, subItem.getIndex());
                }
            });
            subItem.initSubMenu(i, lenght);
            panel.add(subItem);
        }
        add(panel, "h 0!", indexZorder + 1);
        revalidate();
        repaint();
        MenuAnimation.ShowMenu(panel, item, layout, true);
    }

    private void hideMenu(MenuItem item, int index) {
        for (Component com : getComponents()) {
            if (com instanceof JPanel && com.getName() != null && com.getName().equals(index + "")) {
                com.setName(null);
                MenuAnimation.ShowMenu(com, item, layout, false);
                break;
            }
        }
    }

    /**
     *
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(new Color(21, 110, 71));
        g2.fill(new Rectangle(0, 0, getWidth(), getHeight()));
        super.paintComponent(g);
    }

}
