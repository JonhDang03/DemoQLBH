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
public class TableActionsCelledit extends DefaultCellEditor{

   private TableActionEvents event;
    
    public TableActionsCelledit(TableActionEvents event) {
        super(new JCheckBox());
        this.event = event;
    }

    
     
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
         PanelDelete panel = new PanelDelete();
         panel.initEvent(event, row);
         panel.setBackground(table.getSelectionBackground());
         return panel;
    }
    
}
