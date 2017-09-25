/*
 */
package Frame;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ProductosMedios extends JFrame {

    private JLabel x0, x1, ri, D;
    private JTextField textoX0, textoX1, textoRi, textoD;
    private JButton calcular, borrar, guardar;
    private JTable tabla;

    public ProductosMedios() {
        setLayout(null);
        getContentPane().setBackground(new Color(100, 100, 250));

        x0 = new JLabel();
        textoX0 = new JTextField();

        x1 = new JLabel();
        textoX1 = new JTextField();

        ri = new JLabel();
        textoRi = new JTextField();
        
        D = new JLabel();
        textoD = new JTextField();

        calcular = new JButton("Calcular");
        borrar = new JButton("Borrar");
        guardar = new JButton("Guardar");

        construir();
        agregar();
    }

    private void construir() {
        Manejador objManejador = new Manejador();

        x0.setText("x0=");
        x0.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        x0.setForeground(Color.YELLOW);
        x0.setBounds(45, 40, 50, 50);

        textoX0.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        textoX0.setToolTipText("Semilla x0");
        textoX0.setBounds(80, 53, 100, 25);

        x1.setText("x1=");
        x1.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        x1.setForeground(Color.YELLOW);
        x1.setBounds(193, 40, 50, 50);

        textoX1.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        textoX1.setToolTipText("Semilla x1");
        textoX1.setBounds(230, 53, 100, 25);

        ri.setText("ri=");
        ri.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        ri.setForeground(Color.YELLOW);
        ri.setBounds(350, 40, 50, 50);

        textoRi.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        textoRi.setToolTipText("Número de iteraciones");
        textoRi.setBounds(380, 53, 50, 25);
        
        D.setText("D=");
        D.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        D.setForeground(Color.YELLOW);
        D.setBounds(175, 80, 50, 50);
                
        textoD.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        textoD.setToolTipText("Número de dígitos");
        textoD.setBounds(205, 93, 100, 25);

        calcular.setBounds(0, 0, 150, 40);
        calcular.setBackground(new Color(100, 255, 100));
        calcular.setForeground(Color.BLACK);
        calcular.setCursor(new Cursor(Cursor.HAND_CURSOR));
        calcular.setFont(new Font("Verdana", Font.BOLD, 12));
        calcular.addActionListener(objManejador);

        borrar.setBounds(175, 0, 150, 40);
        borrar.setBackground(new Color(100, 255, 100));
        borrar.setForeground(Color.BLACK);
        borrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        borrar.setFont(new Font("Verdana", Font.BOLD, 12));
        borrar.addActionListener(objManejador);

        guardar.setBounds(350, 0, 150, 40);
        guardar.setBackground(new Color(100, 255, 100));
        guardar.setForeground(Color.BLACK);
        guardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        guardar.setFont(new Font("Verdana", Font.BOLD, 12));
        guardar.addActionListener(objManejador);
    }

    private void agregar() {
        add(x0);
        add(textoX0);
        add(x1);
        add(textoX1);
        add(ri);
        add(D);
        add(textoD);
        add(textoRi);
        add(calcular);
        add(borrar);
        add(guardar);
    }

    private class Manejador implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == calcular) {
                System.out.println("calcular");
            }

            if (ae.getSource() == borrar) {
                System.out.println("borrar");
            }

            if (ae.getSource() == guardar) {
                System.out.println("guardar");
            }
        }
    }

    public static void main(String[] args) {
        ProductosMedios pm = new ProductosMedios();

        pm.setSize(500, 600);
        pm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pm.setResizable(false);
        pm.setLocationRelativeTo(null);
        pm.setVisible(true);
    }
}
