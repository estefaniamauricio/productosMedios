package Frame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class TablaEjemplo extends JFrame {

    public TablaEjemplo() {
        Object [][] datos = {
            {"Juan", new Integer(25), new Boolean(false)},
            {"Sonia", new Integer(33), new Boolean(true)},
            {"Pedro", new Integer(42), new Boolean(false)},
            {"Pedro", new Integer(42), new Boolean(false)},
            {"Pedro", new Integer(42), new Boolean(false)},
            {"Pedro", new Integer(42), new Boolean(false)},
            {"Pedro", new Integer(42), new Boolean(false)},
            {"Pedro", new Integer(42), new Boolean(false)},
            {"Pedro", new Integer(42), new Boolean(false)},
            {"Pedro", new Integer(42), new Boolean(false)},
        };

        String[] columnNames = {"Nombre", "Años", "Apto",};
        DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);
        final JTable table = new JTable(dtm);

        // Agregar nueva columna
        String[] columnaNueva1 = {"vago", "diestro", "normal",};
        dtm.addColumn("Tipo", columnaNueva1);

        // Agregar nueva fila
        Object[] newRow = {"Maria", new Integer(55), new Boolean(false)};
        dtm.addRow(newRow);

        // Modificar celda especifica
        dtm.setValueAt("XXX", 3, 1); // Row/Col
        table.setPreferredScrollableViewportSize(new Dimension(250, 100));
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        TablaEjemplo frame = new TablaEjemplo();
        frame.pack();
        frame.setVisible(true);
    }
}
