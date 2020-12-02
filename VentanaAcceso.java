import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaAcceso extends JFrame implements ActionListener, FocusListener, KeyListener{

public JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5, etiqueta6, etiqueta7;
public JTextField campoTexto1, campoTexto2;
public JButton boton;
public String cadena1 = "Oscar Rubio León", cadena2 = "Inventarios", cadena3 = "Jefe de Departamento", cadena4 = "7726";
public int x;

public VentanaAcceso(){

setLayout(null);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
setTitle("Control de Acceso");
setIconImage(new ImageIcon(getClass().getResource("logo.jpg")).getImage());
getContentPane().setBackground(Color.WHITE);

VentanaA vent_principal = new VentanaA();
x = vent_principal.opc;

etiqueta1 = new JLabel("Por favor ingrese su número de empleado para continuar");
etiqueta1.setBounds(10, 10, 400, 15);
add(etiqueta1);

etiqueta2 = new JLabel("No. de Empleado:");
etiqueta2.setBounds(10, 30, 150, 15);
add(etiqueta2);

campoTexto1 = new JTextField();
campoTexto1.setBounds(170, 30, 150, 15);
add(campoTexto1);

etiqueta3 = new JLabel("Contraseña:");
etiqueta3.setBounds(10, 50, 150, 15);
add(etiqueta3);

campoTexto2 = new JTextField();
campoTexto2.setBounds(170, 50, 150, 15);
add(campoTexto2);

etiqueta4 = new JLabel();
etiqueta4.setBounds(10, 70, 250, 15);
add(etiqueta4);

etiqueta5 = new JLabel();
etiqueta5.setBounds(10, 90, 250, 15);
add(etiqueta5);

etiqueta6 = new JLabel();
etiqueta6.setBounds(10, 110, 250, 15);
add(etiqueta6);

etiqueta7 = new JLabel();
etiqueta7.setBounds(10, 130, 250, 15);
add(etiqueta7);

boton = new JButton("Ingresar");
boton.setBounds(30, 150, 100, 15);
add(boton);

boton.addActionListener(this);
campoTexto1.addFocusListener(this);
campoTexto1.addKeyListener(this);
campoTexto2.addKeyListener(this);

}

public void actionPerformed(ActionEvent e){

if(e.getSource() == boton){

if(campoTexto1.getText().equals(cadena4)){

if(x == 1 || x == 2 || x == 3){

VentanaB Empleados = new VentanaB();
Empleados.setBounds(200, 100, 400, 350);
Empleados.setVisible(true);

}

if(x == 4){

VentanaD Reporte = new VentanaD();
Reporte.setBounds(200, 100, 400, 350);
Reporte.setVisible(true);

}

if(x == 5 || x == 6){

VentanaE productos = new VentanaE();
productos.setBounds(200, 100, 400, 500);
productos.setVisible(true);

}

if(x == 10 || x == 11 || x == 14){

VentanaH Inventarios = new VentanaH();
Inventarios.setBounds(200, 100, 400, 350);
Inventarios.setVisible(true);

}

if(x == 13){

VentanaG Reporte_i = new VentanaG();
Reporte_i.setBounds(200, 100, 400, 500);
Reporte_i.setVisible(true);

}

}
else{

JOptionPane.showMessageDialog(null, "No tienes permiso de ingresar a la siguiente opción");

}

}

}

public void focusGained(FocusEvent e){}

public void focusLost(FocusEvent e){

if(e.getSource() == campoTexto1){

if(campoTexto1.getText().equals(cadena4)){

etiqueta4.setText("Nombre: " + cadena1);
etiqueta5.setText("Departamento: " + cadena2);
etiqueta6.setText("Puesto: " + cadena3);
etiqueta7.setText("No. Empleado: " + cadena4);

}
else{

JOptionPane.showMessageDialog(null, "No tienes permiso de ingresar a la siguiente opción");

}

}

}

public void keyPressed(KeyEvent e){}

public void keyReleased(KeyEvent e){

if(e.getKeyCode() == 10){

if(campoTexto1.getText().equals(cadena4)){

VentanaB Empleados = new VentanaB();
Empleados.setBounds(200, 100, 400, 350);
setVisible(true);

}
else{

JOptionPane.showMessageDialog(null, "No tienes permiso de ingresar a la siguiente opción");

}

}

}

public void keyTyped(KeyEvent e){}

public static void main(String args[]){

VentanaAcceso acceso = new VentanaAcceso();
acceso.setBounds(200, 150, 400, 250);
acceso.setVisible(true);

}

}