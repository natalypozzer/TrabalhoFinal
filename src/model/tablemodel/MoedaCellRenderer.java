package model.tablemodel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Moeda;

/**
 *
 * @author aluno
 */
public class MoedaCellRenderer extends DefaultTableCellRenderer{
    List<Moeda> lista;
    JLabel lbl = new JLabel();

    //----------construtor------------------------------------------------------
    public MoedaCellRenderer(List<Moeda> list) {
        lista = list;
    }

    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            setHorizontalAlignment(JLabel.CENTER);
            
            if (row % 2 == 0) {
                c.setBackground(Color.WHITE);
            } else {
                c.setBackground(Color.LIGHT_GRAY);
            }

            if (column == 0) {
                Font f = c.getFont();
                f = new Font(f.getName(), f.BOLD, f.getSize() + 2);
                c.setFont(f);
            }
            return c;
        }
    }

