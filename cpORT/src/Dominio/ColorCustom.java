package Dominio;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class ColorCustom extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value.toString().startsWith("+")) {
            c.setBackground(Color.GREEN);
        } else {
            if (value.toString().startsWith("-")) {
                c.setBackground(Color.YELLOW);
            } else {
                c.setBackground(Color.RED);
            }
        }
        return c;
    }
}
