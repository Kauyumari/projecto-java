import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaG extends JFrame implements ActionListener, KeyListener, MouseListener{

public JLabel etiqueta, ayuda;
public JTextArea areaTexto;
public JButton boton;
public JScrollPane scroll;
public String recopilacion;

public VentanaG(){

setLayout(null);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
setTitle("Reporte_Inventario");
setIconImage(new ImageIcon(getClass().getResource("logo.jpg")).getImage());
getContentPane().setBackground(Color.WHITE);

VentanaH vent = new VentanaH();
recopilacion = vent.eleccion;

ayuda = new JLabel("?");
ayuda.setBounds(0, 0, 50, 20);
add(ayuda);

etiqueta = new JLabel("Reporte de Inventarios:");
etiqueta.setBounds(10, 10, 400, 20);
add(etiqueta);

areaTexto = new JTextArea("");
scroll  = new JScrollPane(areaTexto);
scroll.setBounds(30, 30, 300, 200);
add(scroll);

boton = new JButton("Imprimir");
boton.setBounds(125, 240, 100, 20);
add(boton);

areaTexto.setText(recopilacion);

boton.addActionListener(this);
boton.addKeyListener(this);
ayuda.addMouseListener(this);

}

public void actionPerformed(ActionEvent e){

if(e.getSource() == boton){

JOptionPane.showMessageDialog(null, "Imprimiento Reporte...");

}

}

public void keyPressed(KeyEvent e){}

public void keyReleased(KeyEvent e){

if(e.getSource() == boton){

if(e.getKeyCode() == 10){

JOptionPane.showMessageDialog(null, "Imprimiento Reporte...");

}

}

}

public void keyTyped(KeyEvent e){}

public void mouseEntered(MouseEvent accion){

if(accion.getSource() == ayuda){

JOptionPane.showMessageDialog(null, "En esta ventana puedes ver el estado de tu inventario e imprimirlo");

}

}

public void mouseExited(MouseEvent accion){}

public void mousePressed(MouseEvent accion){}

public void mouseReleased(MouseEvent accion){}

public void mouseClicked(MouseEvent accion){}


public static void main(String args[]){

VentanaG Reporte_i = new VentanaG();
Reporte_i.setBounds(200, 100, 400, 500);
Reporte_i.setVisible(true);

}

}