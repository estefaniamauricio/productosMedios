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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ProductosMedios extends JFrame {

    private JLabel etiquetax0, etiquetax1, etiquetari, etiquetaD;
    private JTextField textoX0, textoX1, textoRi, textoD;
    private JButton calcular, borrar, guardar;
    private JTable tabla;
    private int X0, X1, veces, dimensionX0, mult, dimencion, d1, d2;
    private String nt, nuevoX1, Multiplicacion, strMult, vRaiz, nn;

    public ProductosMedios() {
        setLayout(null);
        getContentPane().setBackground(new Color(100, 100, 250));

        etiquetax0 = new JLabel();
        textoX0 = new JTextField();

        etiquetax1 = new JLabel();
        textoX1 = new JTextField();

        etiquetari = new JLabel();
        textoRi = new JTextField();

        etiquetaD = new JLabel();
        textoD = new JTextField();

        calcular = new JButton("Calcular");
        borrar = new JButton("Borrar");
        guardar = new JButton("Guardar");

        construir();
        agregar();
    }

    private void construir() {
        Manejador objManejador = new Manejador();

        etiquetax0.setText("x0=");
        etiquetax0.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        etiquetax0.setForeground(Color.YELLOW);
        etiquetax0.setBounds(45, 40, 50, 50);

        textoX0.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        textoX0.setToolTipText("Semilla x0");
        textoX0.setBounds(80, 53, 100, 25);

        etiquetax1.setText("x1=");
        etiquetax1.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        etiquetax1.setForeground(Color.YELLOW);
        etiquetax1.setBounds(193, 40, 50, 50);

        textoX1.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        textoX1.setToolTipText("Semilla x1");
        textoX1.setBounds(230, 53, 100, 25);

        etiquetari.setText("ri=");
        etiquetari.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        etiquetari.setForeground(Color.YELLOW);
        etiquetari.setBounds(350, 40, 50, 50);

        textoRi.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        textoRi.setToolTipText("Número de iteraciones");
        textoRi.setBounds(380, 53, 50, 25);

        etiquetaD.setText("D=");
        etiquetaD.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        etiquetaD.setForeground(Color.YELLOW);
        etiquetaD.setBounds(175, 80, 50, 50);

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
        add(etiquetax0);
        add(textoX0);
        add(etiquetax1);
        add(textoX1);
        add(etiquetari);
        add(etiquetaD);
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
                calcular();
            }

            if (ae.getSource() == borrar) {
                textoX0.setText("");
                textoX1.setText("");
                textoRi.setText("");
                
                System.out.println("borrar");
            }

            if (ae.getSource() == guardar) {
                System.out.println("guardar");
            }
        }
    }

    private void calcular() {
        X0 = Integer.parseInt(textoX0.getText());
        String valorX0 = String.valueOf(X0);

        X1 = Integer.parseInt(textoX1.getText());
        String valorX1 = String.valueOf(X1);

        veces = Integer.parseInt(textoRi.getText());

        nt = String.valueOf(X0);
        dimensionX0 = nt.length();
        System.out.println(dimensionX0);

        if (valorX0.length() != valorX1.length()) {
            JOptionPane.showMessageDialog(null, "Los numeros deben ser iguales en Longitud", "Productos medios", JOptionPane.ERROR_MESSAGE);
            textoX0.setText("");
            textoX1.setText("");
        }

        for (int i = 0; i < veces; i++) {
            mult = X0 * X1;
            nuevoX1 = String.valueOf(X1);
            Multiplicacion = String.valueOf(mult);

            dimencion = Multiplicacion.length();

            if (dimencion % 2 == 0) {
                d1 = (dimencion - dimensionX0) / 2;
                //System.out.println("d1 "+d1);
                d2 = d1 + dimensionX0;
                //System.out.println("d2 "+d2);

                strMult = String.valueOf(mult);
                vRaiz = strMult.substring(d1, d2);
                //System.out.println("vRaiz " +vRaiz);
                X0 = Integer.parseInt(nuevoX1);
                X1 = Integer.parseInt(vRaiz);
                System.out.println("x" + i + " " + vRaiz);
            } else {
                String cadena = "0" + Multiplicacion;
                dimencion = cadena.length();

                d1 = (dimencion - dimensionX0) / 2;
                d2 = d1 + dimensionX0;
                nn = cadena;
                vRaiz = nn.substring(d1, d2);
                X0 = Integer.parseInt(nuevoX1);
                X1 = Integer.parseInt(vRaiz);

                System.out.println("x" + i + " " + vRaiz);
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
