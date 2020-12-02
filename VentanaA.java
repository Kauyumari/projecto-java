import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaA extends JFrame implements ActionListener, MouseListener{

private JMenuBar menubar;
private JMenu menu1, menu2, menu3, submenu1, submenu2;
private JMenuItem opcion1, opcion2, opcion3, opcion4, opcion5, opcion6, opcion7;
private JMenuItem opcion8, opcion9, opcion10, opcion11, opcion12, opcion13, opcion14;
public JLabel etiqueta, ayuda;
public static int opc;

public VentanaA(){

setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setTitle("Rabbit on the Moon");
setIconImage(new ImageIcon(getClass().getResource("logo.jpg")).getImage());
getContentPane().setBackground(Color.WHITE);

ImageIcon imagen = new ImageIcon("inventarios.jpg");
etiqueta = new JLabel(imagen);
etiqueta.setBounds(0, 20, 400, 300);
Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_DEFAULT));
add(etiqueta);

menubar = new JMenuBar();
setJMenuBar(menubar);

menu1 = new JMenu("Departamento");
submenu1 = new JMenu("Empleados");
menu2 = new JMenu("Productos");
submenu2 = new JMenu("Búsqueda");
menu3 = new JMenu("Inventario");
menubar.add(menu1);
menubar.add(menu2);
menubar.add(menu3);

opcion1 = new JMenuItem("Alta a Nuevo Empleado");
opcion2 = new JMenuItem("Baja de Empleado");
opcion3 = new JMenuItem("Modificar Información");
opcion4 = new JMenuItem("Reporte de Departamento");
opcion5 = new JMenuItem("Alta de Productos");
opcion6 = new JMenuItem("Baja de Productos");
opcion7 = new JMenuItem("Por código");
opcion8 = new JMenuItem("Por tipo");
opcion9 = new JMenuItem("Por marca");
opcion10 = new JMenuItem("Existencias");
opcion11 = new JMenuItem("Ingresos");
opcion12 = new JMenuItem("Egresos");
opcion13 = new JMenuItem("Generar Reporte");
opcion14 = new JMenuItem("Modificar Inventario");

menu1.add(submenu1);
submenu1.add(opcion1);
submenu1.add(opcion2);
submenu1.add(opcion3);
submenu1.add(opcion4);
menu2.add(opcion5);
menu2.add(opcion6);
menu2.add(submenu2);
menu2.add(opcion10);
submenu2.add(opcion7);
submenu2.add(opcion8);
submenu2.add(opcion9);
menu3.add(opcion11);
menu3.add(opcion12);
menu3.add(opcion13);
menu3.add(opcion14);

ayuda = new JLabel("?");
ayuda.setBounds(0, 0, 50, 20);
add(ayuda);

opcion1.addActionListener(this);
opcion2.addActionListener(this);
opcion3.addActionListener(this);
opcion4.addActionListener(this);
opcion5.addActionListener(this);
opcion6.addActionListener(this);
opcion7.addActionListener(this);
opcion8.addActionListener(this);
opcion9.addActionListener(this);
opcion10.addActionListener(this);
opcion11.addActionListener(this);
opcion12.addActionListener(this);
opcion13.addActionListener(this);
opcion14.addActionListener(this);
ayuda.addMouseListener(this);

} 

public void actionPerformed(ActionEvent e){

if(e.getSource() == opcion1){

opc = 1;

VentanaAcceso acceso = new VentanaAcceso();
acceso.setBounds(200, 150, 400, 250);
acceso.setVisible(true);

}

if(e.getSource() == opcion2){

opc = 2;

VentanaAcceso acceso = new VentanaAcceso();
acceso.setBounds(200, 150, 400, 250);
acceso.setVisible(true);

}

if(e.getSource() == opcion3){

opc = 3;

VentanaAcceso acceso = new VentanaAcceso();
acceso.setBounds(200, 150, 400, 250);
acceso.setVisible(true);

}

if(e.getSource() == opcion4){

opc = 4;

VentanaAcceso acceso = new VentanaAcceso();
acceso.setBounds(200, 150, 400, 250);
acceso.setVisible(true);

}

if(e.getSource() == opcion5){

opc = 5;

VentanaAcceso acceso = new VentanaAcceso();
acceso.setBounds(200, 150, 400, 250);
acceso.setVisible(true);

}

if(e.getSource() == opcion6){

opc = 6;

VentanaAcceso acceso = new VentanaAcceso();
acceso.setBounds(200, 150, 400, 250);
acceso.setVisible(true);

}

if(e.getSource() == opcion7){

opc = 7;

VentanaF_C codigo = new VentanaF_C();
codigo.setBounds(200, 100, 400, 350);
codigo.setVisible(true);


}

if(e.getSource() == opcion8){

opc = 8;

VentanaF_T tipo = new VentanaF_T();
tipo.setBounds(200, 100, 400, 350);
tipo.setVisible(true);


}

if(e.getSource() == opcion9){

opc = 9;

VentanaF_M marca = new VentanaF_M();
marca.setBounds(200, 100, 400, 350);
marca.setVisible(true);

}

if(e.getSource() == opcion10){

opc = 10;

VentanaI Existencias = new VentanaI();
Existencias.setBounds(200, 100, 500, 400);
Existencias.setVisible(true);

}

if(e.getSource() == opcion11){

opc = 11;

VentanaAcceso acceso = new VentanaAcceso();
acceso.setBounds(200, 150, 400, 250);
acceso.setVisible(true);

}

if(e.getSource() == opcion12){

opc = 12;

VentanaAcceso acceso = new VentanaAcceso();
acceso.setBounds(200, 150, 400, 250);
acceso.setVisible(true);

}

if(e.getSource() == opcion13){

opc = 13;

VentanaAcceso acceso = new VentanaAcceso();
acceso.setBounds(200, 150, 400, 250);
acceso.setVisible(true);

}

if(e.getSource() == opcion14){

opc = 14;

VentanaAcceso acceso = new VentanaAcceso();
acceso.setBounds(200, 150, 400, 250);
acceso.setVisible(true);

}

}

public void mouseEntered(MouseEvent accion){

if(accion.getSource() == ayuda){

JOptionPane.showMessageDialog(null, "Este es la ventana principal. Despliega los menús para conocer las acciones");

}

}

public void mouseExited(MouseEvent accion){}

public void mousePressed(MouseEvent accion){}

public void mouseReleased(MouseEvent accion){}

public void mouseClicked(MouseEvent accion){}

public static void main(String args[]){

VentanaA principal = new VentanaA();
principal.setBounds(200, 100, 400, 350);
principal.setVisible(true);

}

} 