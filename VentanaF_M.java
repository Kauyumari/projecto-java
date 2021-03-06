import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaF_M extends JFrame implements ActionListener, KeyListener{

public JLabel etiqueta1, etiqueta2;
public JTextField campoTexto;
public JTextArea areaTexto;
public JButton boton;
public JScrollPane scroll;
public String Recopilacion;
public String Datos[] = new String[201];

public VentanaF_M(){

setLayout(null);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
setTitle("Busqueda_Por_Marca");
setIconImage(new ImageIcon(getClass().getResource("logo.jpg")).getImage());
getContentPane().setBackground(Color.WHITE);

VentanaE venP = new VentanaE();
Datos = venP.BaseDatos;
Recopilacion = venP.eleccion;

etiqueta1 = new JLabel("Ingrese la marca: ");
etiqueta1.setBounds(10, 10, 150, 20);
add(etiqueta1);

etiqueta2 = new JLabel("Marca: ");
etiqueta2.setBounds(10, 30, 150, 20);
add(etiqueta2);

campoTexto = new JTextField();
campoTexto.setBounds(170, 30, 150, 20);
add(campoTexto);

areaTexto = new JTextArea("");
scroll  = new JScrollPane(areaTexto);
scroll.setBounds(10, 50, 350, 200);
add(scroll);

boton = new JButton("Buscar");
boton.setBounds(40, 260, 100, 20);
add(boton);

boton.addActionListener(this);
boton.addKeyListener(this);

}

public void actionPerformed(ActionEvent e){

if(e.getSource() == boton){

if(Recopilacion.indexOf(campoTexto.getText()) > -1){

for(int i = 0; i < 201; i++){

areaTexto.setText(Datos[i]);

}

}
else{

JOptionPane.showMessageDialog(null, "La marca que buscas no est� registrada");

}

}

}

public void keyPressed(KeyEvent e){}

public void keyReleased(KeyEvent e){

if(e.getSource() == boton){

if(e.getKeyCode() == 10){

if(Recopilacion.indexOf(campoTexto.getText()) > -1){

for(int i = 0; i < 201; i++){

areaTexto.setText(Datos[i]);

}

}
else{

JOptionPane.showMessageDialog(null, "La marca que buscas no est� registrada");

}

}

}

}

public void keyTyped(KeyEvent e){}

public static void main(String args[]){

VentanaF_M marca = new VentanaF_M();
marca.setBounds(200, 100, 400, 350);
marca.setVisible(true);

}

}