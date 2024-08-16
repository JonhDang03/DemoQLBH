/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChangeCell;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/**
 *
 * @author dangm
 */
public class TableActionsCellEditer extends DefaultCellEditor{

   private TableActionEvents event;
    
    public TableActionsCellEditer(TableActionEvents event) {
        super(new JCheckBox());
        this.event = event;
    }

    
     
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
         PanelAction panel = new PanelAction();
         panel.initEvent(event, row);
         panel.setBackground(table.getSelectionBackground());
         return panel;
    }
    
}
