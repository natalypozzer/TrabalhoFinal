package model.tablemodel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author aluno
 */
public class MoedaHeaderRenderer extends DefaultTableCellRenderer{
    JLabel lbl = new JLabel();
    
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column){
        lbl.setText(value.toString());
        lbl.setFont(new Font("Dialog", Font.BOLD, 14));
        lbl.setHorizontalAlignment(JLabel.CENTER);
        return lbl;
    } 
}
