import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaH extends JFrame implements ActionListener, ItemListener, ChangeListener, FocusListener, KeyListener, MouseListener{

public JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4, ayuda;
public JLabel etiqueta5, etiqueta6, etiqueta7, etiqueta8, etiqueta9;
public JComboBox <String> combo;
public JTextField campoTexto1, campoTexto2;
public JRadioButton radio1, radio2, radio3;
public ButtonGroup opciones;
public JTextArea areaTexto;
public JButton boton1, boton2;
public JScrollPane scroll;
public String Datos[] = new String[201];
public String Reporte[] = new String[201];
public static String Articulo, Seleccion, eleccion, cadena, descripcion, dhl;
public int x, y, z;
public int existencias;
public boolean almacenamiento = false;

public VentanaH(){

setLayout(null);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
setTitle("Control de Inventario");
setIconImage(new ImageIcon(getClass().getResource("logo.jpg")).getImage());
getContentPane().setBackground(Color.WHITE);

VentanaE productos = new VentanaE();
Datos = productos.BaseDatos;

ayuda = new JLabel("?");
ayuda.setBounds(0, 0, 50, 20);
add(ayuda);

etiqueta1 = new JLabel("Código: ");
etiqueta1.setBounds(10, 10, 150, 20);
add(etiqueta1);

combo = new JComboBox <String> ();
combo.setBounds(170, 10, 150, 20);
add(combo);

combo.addItem("100");
combo.addItem("101");
combo.addItem("102");
combo.addItem("103");
combo.addItem("104");
combo.addItem("105");
combo.addItem("106");
combo.addItem("107");
combo.addItem("108");
combo.addItem("109");
combo.addItem("110");
combo.addItem("111");
combo.addItem("112");
combo.addItem("113");
combo.addItem("114");
combo.addItem("115");
combo.addItem("116");
combo.addItem("117");
combo.addItem("118");
combo.addItem("119");
combo.addItem("120");
combo.addItem("121");
combo.addItem("122");
combo.addItem("123");
combo.addItem("124");
combo.addItem("125");
combo.addItem("126");
combo.addItem("127");
combo.addItem("128");
combo.addItem("139");
combo.addItem("130");
combo.addItem("131");
combo.addItem("132");
combo.addItem("133");
combo.addItem("134");
combo.addItem("135");
combo.addItem("136");
combo.addItem("137");
combo.addItem("138");
combo.addItem("139");
combo.addItem("140");
combo.addItem("141");
combo.addItem("142");
combo.addItem("143");
combo.addItem("144");
combo.addItem("145");
combo.addItem("146");
combo.addItem("147");
combo.addItem("148");
combo.addItem("149");
combo.addItem("150");
combo.addItem("151");
combo.addItem("152");
combo.addItem("153");
combo.addItem("154");
combo.addItem("155");
combo.addItem("156");
combo.addItem("157");
combo.addItem("158");
combo.addItem("159");
combo.addItem("160");
combo.addItem("161");
combo.addItem("162");
combo.addItem("163");
combo.addItem("164");
combo.addItem("165");
combo.addItem("166");
combo.addItem("167");
combo.addItem("168");
combo.addItem("169");
combo.addItem("170");
combo.addItem("171");
combo.addItem("172");
combo.addItem("173");
combo.addItem("174");
combo.addItem("175");
combo.addItem("176");
combo.addItem("177");
combo.addItem("178");
combo.addItem("179");
combo.addItem("180");
combo.addItem("181");
combo.addItem("182");
combo.addItem("183");
combo.addItem("184");
combo.addItem("185");
combo.addItem("186");
combo.addItem("187");
combo.addItem("188");
combo.addItem("189");
combo.addItem("190");
combo.addItem("191");
combo.addItem("192");
combo.addItem("193");
combo.addItem("194");
combo.addItem("195");
combo.addItem("196");
combo.addItem("197");
combo.addItem("198");
combo.addItem("199");
combo.addItem("200");
combo.addItem("201");
combo.addItem("202");
combo.addItem("203");
combo.addItem("204");
combo.addItem("205");
combo.addItem("206");
combo.addItem("207");
combo.addItem("208");
combo.addItem("209");
combo.addItem("210");
combo.addItem("211");
combo.addItem("212");
combo.addItem("213");
combo.addItem("214");
combo.addItem("215");
combo.addItem("216");
combo.addItem("217");
combo.addItem("218");
combo.addItem("219");
combo.addItem("220");
combo.addItem("221");
combo.addItem("222");
combo.addItem("223");
combo.addItem("224");
combo.addItem("225");
combo.addItem("226");
combo.addItem("227");
combo.addItem("228");
combo.addItem("229");
combo.addItem("230");
combo.addItem("231");
combo.addItem("232");
combo.addItem("232");
combo.addItem("233");
combo.addItem("234");
combo.addItem("235");
combo.addItem("236");
combo.addItem("237");
combo.addItem("238");
combo.addItem("239");
combo.addItem("240");
combo.addItem("241");
combo.addItem("242");
combo.addItem("243");
combo.addItem("244");
combo.addItem("245");
combo.addItem("246");
combo.addItem("247");
combo.addItem("248");
combo.addItem("249");
combo.addItem("250");
combo.addItem("251");
combo.addItem("252");
combo.addItem("253");
combo.addItem("254");
combo.addItem("255");
combo.addItem("256");
combo.addItem("257");
combo.addItem("258");
combo.addItem("259");
combo.addItem("260");
combo.addItem("261");
combo.addItem("262");
combo.addItem("263");
combo.addItem("264");
combo.addItem("265");
combo.addItem("266");
combo.addItem("267");
combo.addItem("268");
combo.addItem("269");
combo.addItem("270");
combo.addItem("271");
combo.addItem("272");
combo.addItem("273");
combo.addItem("274");
combo.addItem("275");
combo.addItem("275");
combo.addItem("276");
combo.addItem("277");
combo.addItem("278");
combo.addItem("279");
combo.addItem("280");
combo.addItem("281");
combo.addItem("282");
combo.addItem("283");
combo.addItem("284");
combo.addItem("285");
combo.addItem("286");
combo.addItem("287");
combo.addItem("288");
combo.addItem("289");
combo.addItem("290");
combo.addItem("291");
combo.addItem("292");
combo.addItem("293");
combo.addItem("294");
combo.addItem("295");
combo.addItem("296");
combo.addItem("297");
combo.addItem("298");
combo.addItem("299");
combo.addItem("300");

combo.setEditable(true);
combo.setSelectedItem("Código");
combo.setEditable(false);

etiqueta2 = new JLabel("Artículo: ");
etiqueta2.setBounds(10, 30, 150, 20);
add(etiqueta2);

areaTexto = new JTextArea("");
scroll  = new JScrollPane(areaTexto);
scroll.setBounds(170, 30, 200, 150);
add(scroll);

etiqueta3 = new JLabel("Cantidad: ");
etiqueta3.setBounds(10, 190, 150, 20);
add(etiqueta3);

campoTexto1 = new JTextField();
campoTexto1.setBounds(170, 190, 150, 20);
add(campoTexto1);

etiqueta4 = new JLabel("Unidades: ");
etiqueta4.setBounds(10, 210, 150, 20);
add(etiqueta4);

etiqueta5 = new JLabel("Si el ingreso/egreso es menor a 10, seleccionar PIEZAS");
etiqueta5.setBounds(10, 230, 350, 20);
add(etiqueta5);

etiqueta6 = new JLabel("Si el ingreso/egreso es en PACAS y es mayor a 5, seleccionar CAJAS");
etiqueta6.setBounds(10, 250, 400, 20);
add(etiqueta6);

radio1 = new JRadioButton("Piezas");
radio1.setBounds(10, 270, 100, 20);
add(radio1);

radio2 = new JRadioButton("Pacas");
radio2.setBounds(120, 270, 100, 20);
add(radio2);

radio3 = new JRadioButton("Cajas");
radio3.setBounds(230, 270, 100, 20);
add(radio3);

opciones = new ButtonGroup();
opciones.add(radio1);
opciones.add(radio2);
opciones.add(radio3);

etiqueta7 = new JLabel("Fecha: ");
etiqueta7.setBounds(10, 290, 100, 20);
add(etiqueta7);

campoTexto2 = new JTextField();
campoTexto2.setBounds(120, 290, 100, 20);
add(campoTexto2);

etiqueta8 = new JLabel("Existencias: ");
etiqueta8.setBounds(10, 310, 150, 20);
add(etiqueta8);

etiqueta9 = new JLabel(" ");
etiqueta9.setBounds(170, 310, 150, 20);
add(etiqueta9);

boton1 = new JButton("Ingreso");
boton1.setBounds(50, 330, 100, 20);
add(boton1);

boton2 = new JButton("Egreso");
boton2.setBounds(250, 330, 100, 20);
add(boton2);

boton1.addActionListener(this);
boton2.addActionListener(this);
boton1.addKeyListener(this);
boton2.addKeyListener(this);
combo.addItemListener(this);
radio1.addChangeListener(this);
radio2.addChangeListener(this);
radio3.addChangeListener(this);
campoTexto1.addFocusListener(this);
campoTexto2.addFocusListener(this);
ayuda.addMouseListener(this);

}

public void actionPerformed(ActionEvent e){

if(e.getSource() == boton1){

if(etiqueta9.getText().equals(" ")){

etiqueta9.setText("0");

y = Integer.parseInt(etiqueta9.getText());

}

z = Integer.parseInt(campoTexto1.getText());

if(cadena.equals("Pacas")){

z = y * 10;

}

if(cadena.equals("Cajas")){

z = y * 50;

}

y = y + z;

dhl = Integer.toString(y);
etiqueta9.setText(dhl);

int msj = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea seguir con el proceso?");

if(msj == JOptionPane.YES_OPTION){

eleccion = etiqueta1.getText() + Seleccion + "\n" + etiqueta2.getText()  + areaTexto.getText() + "\n" + "Ingresó al almacen: " + "\n" + etiqueta3.getText()  + campoTexto1.getText() + "\n" + etiqueta4.getText() + cadena + "\n" + etiqueta7.getText() + campoTexto2.getText() + "\n" + etiqueta8.getText() + etiqueta9.getText() + "--------------------------" + "\n";

if(Seleccion.equals("100")){

x = 0;

}

if(Seleccion.equals("101")){

x = 1;

}

if(Seleccion.equals("102")){

x = 2;

}

if(Seleccion.equals("103")){

x = 3;

}

if(Seleccion.equals("104")){

x = 4;

}

if(Seleccion.equals("105")){

x = 5;

}

if(Seleccion.equals("106")){

x = 6;

}

if(Seleccion.equals("107")){

x = 7;

}

if(Seleccion.equals("108")){

x = 8;

}

if(Seleccion.equals("109")){

x = 9;

}

if(Seleccion.equals("110")){

x = 10;

}

if(Seleccion.equals("111")){

x = 11;

}

if(Seleccion.equals("112")){

x = 12;

}

if(Seleccion.equals("113")){

x = 13;

}

if(Seleccion.equals("114")){

x = 14;

}

if(Seleccion.equals("115")){

x = 15;

}

if(Seleccion.equals("116")){

x = 16;

}

if(Seleccion.equals("117")){

x = 17;

}

if(Seleccion.equals("118")){

x = 18;

}

if(Seleccion.equals("119")){

x = 19;

}

if(Seleccion.equals("120")){

x = 20;

}

if(Seleccion.equals("121")){

x = 21;

}

if(Seleccion.equals("122")){

x = 22;

}

if(Seleccion.equals("123")){

x = 23;

}

if(Seleccion.equals("124")){

x = 24;

}

if(Seleccion.equals("125")){

x = 25;

}

if(Seleccion.equals("126")){

x = 26;

}

if(Seleccion.equals("127")){

x = 27;

}

if(Seleccion.equals("128")){

x = 28;

}

if(Seleccion.equals("129")){

x = 29;

}

if(Seleccion.equals("130")){

x = 30;

}

if(Seleccion.equals("131")){

x = 31;

}

if(Seleccion.equals("132")){

x = 32;

}

if(Seleccion.equals("133")){

x = 33;

}

if(Seleccion.equals("134")){

x = 34;

}

if(Seleccion.equals("135")){

x = 35;

}

if(Seleccion.equals("136")){

x = 36;

}

if(Seleccion.equals("137")){

x = 37;

}

if(Seleccion.equals("138")){

x = 38;

}

if(Seleccion.equals("139")){

x = 39;

}

if(Seleccion.equals("140")){

x = 40;

}

if(Seleccion.equals("141")){

x = 41;

}

if(Seleccion.equals("142")){

x = 42;

}

if(Seleccion.equals("143")){

x = 43;

}

if(Seleccion.equals("144")){

x = 44;

}

if(Seleccion.equals("145")){

x = 45;

}

if(Seleccion.equals("146")){

x = 46;

}

if(Seleccion.equals("147")){

x = 47;

}

if(Seleccion.equals("148")){

x = 48;

}

if(Seleccion.equals("149")){

x = 49;

}

if(Seleccion.equals("150")){

x = 50;

}

if(Seleccion.equals("151")){

x = 51;

}

if(Seleccion.equals("152")){

x = 52;

}

if(Seleccion.equals("153")){

x = 53;

}

if(Seleccion.equals("154")){

x = 54;

}

if(Seleccion.equals("155")){

x = 55;

}

if(Seleccion.equals("156")){

x = 56;

}

if(Seleccion.equals("157")){

x = 57;

}

if(Seleccion.equals("158")){

x = 58;

}

if(Seleccion.equals("159")){

x = 59;

}

if(Seleccion.equals("160")){

x = 60;

}

if(Seleccion.equals("161")){

x = 61;

}

if(Seleccion.equals("162")){

x = 62;

}

if(Seleccion.equals("163")){

x = 63;

}

if(Seleccion.equals("164")){

x = 64;

}

if(Seleccion.equals("165")){

x = 65;

}

if(Seleccion.equals("166")){

x = 66;

}

if(Seleccion.equals("167")){

x = 67;

}

if(Seleccion.equals("168")){

x = 68;

}

if(Seleccion.equals("169")){

x = 69;

}

if(Seleccion.equals("170")){

x = 70;

}

if(Seleccion.equals("171")){

x = 71;

}

if(Seleccion.equals("172")){

x = 72;

}

if(Seleccion.equals("173")){

x = 73;

}

if(Seleccion.equals("174")){

x = 74;

}

if(Seleccion.equals("175")){

x = 75;

}

if(Seleccion.equals("176")){

x = 76;

}

if(Seleccion.equals("177")){

x = 77;

}

if(Seleccion.equals("178")){

x = 78;

}

if(Seleccion.equals("729")){

x = 79;

}

if(Seleccion.equals("180")){

x = 80;

}

if(Seleccion.equals("181")){

x = 81;

}

if(Seleccion.equals("182")){

x = 82;

}

if(Seleccion.equals("183")){

x = 83;

}

if(Seleccion.equals("184")){

x = 84;

}

if(Seleccion.equals("185")){

x = 85;

}

if(Seleccion.equals("186")){

x = 86;

}

if(Seleccion.equals("187")){

x = 87;

}

if(Seleccion.equals("188")){

x = 88;

}

if(Seleccion.equals("189")){

x = 89;

}

if(Seleccion.equals("190")){

x = 90;

}

if(Seleccion.equals("191")){

x = 91;

}

if(Seleccion.equals("192")){

x = 92;

}

if(Seleccion.equals("193")){

x = 93;

}

if(Seleccion.equals("194")){

x = 94;

}

if(Seleccion.equals("195")){

x = 95;

}

if(Seleccion.equals("196")){

x = 96;

}

if(Seleccion.equals("197")){

x = 97;

}

if(Seleccion.equals("198")){

x = 98;

}

if(Seleccion.equals("199")){

x = 99;

}

if(Seleccion.equals("200")){

x = 100;

}

if(Seleccion.equals("201")){

x = 101;

}

if(Seleccion.equals("202")){

x = 102;

}

if(Seleccion.equals("203")){

x = 103;

}

if(Seleccion.equals("204")){

x = 104;

}

if(Seleccion.equals("205")){

x = 105;

}

if(Seleccion.equals("206")){

x = 106;

}

if(Seleccion.equals("207")){

x = 107;

}

if(Seleccion.equals("208")){

x = 108;

}

if(Seleccion.equals("209")){

x = 109;

}

if(Seleccion.equals("210")){

x = 110;

}

if(Seleccion.equals("211")){

x = 111;

}

if(Seleccion.equals("212")){

x = 112;

}

if(Seleccion.equals("213")){

x = 113;

}

if(Seleccion.equals("214")){

x = 114;

}

if(Seleccion.equals("215")){

x = 115;

}

if(Seleccion.equals("216")){

x = 116;

}

if(Seleccion.equals("217")){

x = 117;

}

if(Seleccion.equals("218")){

x = 118;

}

if(Seleccion.equals("219")){

x = 119;

}

if(Seleccion.equals("220")){

x = 120;

}

if(Seleccion.equals("221")){

x = 121;

}

if(Seleccion.equals("222")){

x = 122;

}

if(Seleccion.equals("223")){

x = 123;

}

if(Seleccion.equals("224")){

x = 124;

}

if(Seleccion.equals("225")){

x = 125;

}

if(Seleccion.equals("226")){

x = 126;

}

if(Seleccion.equals("227")){

x = 127;

}

if(Seleccion.equals("228")){

x = 128;

}

if(Seleccion.equals("229")){

x = 129;

}

if(Seleccion.equals("230")){

x = 130;

}

if(Seleccion.equals("231")){

x = 131;

}

if(Seleccion.equals("232")){

x = 132;

}

if(Seleccion.equals("233")){

x = 133;

}

if(Seleccion.equals("234")){

x = 134;

}

if(Seleccion.equals("235")){

x = 135;

}

if(Seleccion.equals("236")){

x = 136;

}

if(Seleccion.equals("237")){

x = 137;

}

if(Seleccion.equals("238")){

x = 138;

}

if(Seleccion.equals("239")){

x = 139;

}

if(Seleccion.equals("240")){

x = 140;

}

if(Seleccion.equals("241")){

x = 141;

}

if(Seleccion.equals("242")){

x = 142;

}

if(Seleccion.equals("243")){

x = 143;

}

if(Seleccion.equals("244")){

x = 144;

}

if(Seleccion.equals("245")){

x = 145;

}

if(Seleccion.equals("246")){

x = 146;

}

if(Seleccion.equals("247")){

x = 147;

}

if(Seleccion.equals("248")){

x = 148;

}

if(Seleccion.equals("249")){

x = 149;

}

if(Seleccion.equals("250")){

x = 150;

}

if(Seleccion.equals("251")){

x = 151;

}

if(Seleccion.equals("252")){

x = 152;

}

if(Seleccion.equals("253")){

x = 153;

}

if(Seleccion.equals("254")){

x = 154;

}

if(Seleccion.equals("255")){

x = 155;

}

if(Seleccion.equals("256")){

x = 156;

}

if(Seleccion.equals("257")){

x = 157;

}

if(Seleccion.equals("258")){

x = 158;

}

if(Seleccion.equals("259")){

x = 159;

}

if(Seleccion.equals("260")){

x = 160;

}

if(Seleccion.equals("261")){

x = 161;

}

if(Seleccion.equals("262")){

x = 162;

}

if(Seleccion.equals("263")){

x = 163;

}

if(Seleccion.equals("264")){

x = 164;

}

if(Seleccion.equals("265")){

x = 165;

}

if(Seleccion.equals("266")){

x = 166;

}

if(Seleccion.equals("267")){

x = 167;

}

if(Seleccion.equals("268")){

x = 168;

}

if(Seleccion.equals("269")){

x = 169;

}

if(Seleccion.equals("270")){

x = 170;

}

if(Seleccion.equals("271")){

x = 171;

}

if(Seleccion.equals("272")){

x = 172;

}

if(Seleccion.equals("273")){

x = 173;

}

if(Seleccion.equals("274")){

x = 174;

}

if(Seleccion.equals("275")){

x = 175;

}

if(Seleccion.equals("276")){

x = 176;

}

if(Seleccion.equals("277")){

x = 177;

}

if(Seleccion.equals("278")){

x = 178;

}

if(Seleccion.equals("279")){

x = 179;

}

if(Seleccion.equals("280")){

x = 180;

}

if(Seleccion.equals("281")){

x = 181;

}

if(Seleccion.equals("282")){

x = 182;

}

if(Seleccion.equals("283")){

x = 183;

}

if(Seleccion.equals("284")){

x = 184;

}

if(Seleccion.equals("285")){

x = 185;

}

if(Seleccion.equals("286")){

x = 186;

}

if(Seleccion.equals("287")){

x = 187;

}

if(Seleccion.equals("288")){

x = 188;

}

if(Seleccion.equals("289")){

x = 189;

}

if(Seleccion.equals("290")){

x = 190;

}

if(Seleccion.equals("291")){

x = 191;

}

if(Seleccion.equals("292")){

x = 192;

}

if(Seleccion.equals("293")){

x = 193;

}

if(Seleccion.equals("294")){

x = 194;

}

if(Seleccion.equals("295")){

x = 195;

}

if(Seleccion.equals("296")){

x = 196;

}

if(Seleccion.equals("297")){

x = 197;

}

if(Seleccion.equals("298")){

x = 198;

}

if(Seleccion.equals("299")){

x = 199;

}

if(Seleccion.equals("300")){

x = 200;

}

if(almacenamiento){

int msj2 = JOptionPane.showConfirmDialog(null, "El ingreso ya fue registrado. ¿Deseas continuar?");

if(msj2 == JOptionPane.YES_OPTION){

eleccion = " ";
Reporte[x] = eleccion;
almacenamiento = false;
y = Integer.parseInt(etiqueta9.getText());

}

}
else{

Reporte[x] = eleccion;
almacenamiento = true;

}

}

}

if(e.getSource() == boton2){

if(etiqueta9.getText().equals(" ")){

etiqueta9.setText("0");

y = Integer.parseInt(etiqueta9.getText());

}

z = Integer.parseInt(campoTexto1.getText());

if(cadena.equals("Pacas")){

z = y * 10;

}

if(cadena.equals("Cajas")){

z = y * 50;

}

y = y - z;

if(y < 0){

JOptionPane.showMessageDialog(null, "El retiro no puede hacerse efectivo porque no hay mercancía en el almacén");

}

y = Integer.parseInt(etiqueta9.getText());

int msj = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea seguir con el proceso?");

if(msj == JOptionPane.YES_OPTION){

eleccion = etiqueta1.getText() + Seleccion + "\n" + etiqueta2.getText()  + areaTexto.getText() + "\n" + "Se retiró del almacen: " + "\n" + etiqueta3.getText()  + campoTexto1.getText() + "\n" + etiqueta4.getText() + cadena + "\n" + etiqueta7.getText() + campoTexto2.getText() + "\n" + etiqueta8.getText() + etiqueta9.getText() + "--------------------------" + "\n";

if(Seleccion.equals("100")){

x = 0;

}

if(Seleccion.equals("101")){

x = 1;

}

if(Seleccion.equals("102")){

x = 2;

}

if(Seleccion.equals("103")){

x = 3;

}

if(Seleccion.equals("104")){

x = 4;

}

if(Seleccion.equals("105")){

x = 5;

}

if(Seleccion.equals("106")){

x = 6;

}

if(Seleccion.equals("107")){

x = 7;

}

if(Seleccion.equals("108")){

x = 8;

}

if(Seleccion.equals("109")){

x = 9;

}

if(Seleccion.equals("110")){

x = 10;

}

if(Seleccion.equals("111")){

x = 11;

}

if(Seleccion.equals("112")){

x = 12;

}

if(Seleccion.equals("113")){

x = 13;

}

if(Seleccion.equals("114")){

x = 14;

}

if(Seleccion.equals("115")){

x = 15;

}

if(Seleccion.equals("116")){

x = 16;

}

if(Seleccion.equals("117")){

x = 17;

}

if(Seleccion.equals("118")){

x = 18;

}

if(Seleccion.equals("119")){

x = 19;

}

if(Seleccion.equals("120")){

x = 20;

}

if(Seleccion.equals("121")){

x = 21;

}

if(Seleccion.equals("122")){

x = 22;

}

if(Seleccion.equals("123")){

x = 23;

}

if(Seleccion.equals("124")){

x = 24;

}

if(Seleccion.equals("125")){

x = 25;

}

if(Seleccion.equals("126")){

x = 26;

}

if(Seleccion.equals("127")){

x = 27;

}

if(Seleccion.equals("128")){

x = 28;

}

if(Seleccion.equals("129")){

x = 29;

}

if(Seleccion.equals("130")){

x = 30;

}

if(Seleccion.equals("131")){

x = 31;

}

if(Seleccion.equals("132")){

x = 32;

}

if(Seleccion.equals("133")){

x = 33;

}

if(Seleccion.equals("134")){

x = 34;

}

if(Seleccion.equals("135")){

x = 35;

}

if(Seleccion.equals("136")){

x = 36;

}

if(Seleccion.equals("137")){

x = 37;

}

if(Seleccion.equals("138")){

x = 38;

}

if(Seleccion.equals("139")){

x = 39;

}

if(Seleccion.equals("140")){

x = 40;

}

if(Seleccion.equals("141")){

x = 41;

}

if(Seleccion.equals("142")){

x = 42;

}

if(Seleccion.equals("143")){

x = 43;

}

if(Seleccion.equals("144")){

x = 44;

}

if(Seleccion.equals("145")){

x = 45;

}

if(Seleccion.equals("146")){

x = 46;

}

if(Seleccion.equals("147")){

x = 47;

}

if(Seleccion.equals("148")){

x = 48;

}

if(Seleccion.equals("149")){

x = 49;

}

if(Seleccion.equals("150")){

x = 50;

}

if(Seleccion.equals("151")){

x = 51;

}

if(Seleccion.equals("152")){

x = 52;

}

if(Seleccion.equals("153")){

x = 53;

}

if(Seleccion.equals("154")){

x = 54;

}

if(Seleccion.equals("155")){

x = 55;

}

if(Seleccion.equals("156")){

x = 56;

}

if(Seleccion.equals("157")){

x = 57;

}

if(Seleccion.equals("158")){

x = 58;

}

if(Seleccion.equals("159")){

x = 59;

}

if(Seleccion.equals("160")){

x = 60;

}

if(Seleccion.equals("161")){

x = 61;

}

if(Seleccion.equals("162")){

x = 62;

}

if(Seleccion.equals("163")){

x = 63;

}

if(Seleccion.equals("164")){

x = 64;

}

if(Seleccion.equals("165")){

x = 65;

}

if(Seleccion.equals("166")){

x = 66;

}

if(Seleccion.equals("167")){

x = 67;

}

if(Seleccion.equals("168")){

x = 68;

}

if(Seleccion.equals("169")){

x = 69;

}

if(Seleccion.equals("170")){

x = 70;

}

if(Seleccion.equals("171")){

x = 71;

}

if(Seleccion.equals("172")){

x = 72;

}

if(Seleccion.equals("173")){

x = 73;

}

if(Seleccion.equals("174")){

x = 74;

}

if(Seleccion.equals("175")){

x = 75;

}

if(Seleccion.equals("176")){

x = 76;

}

if(Seleccion.equals("177")){

x = 77;

}

if(Seleccion.equals("178")){

x = 78;

}

if(Seleccion.equals("729")){

x = 79;

}

if(Seleccion.equals("180")){

x = 80;

}

if(Seleccion.equals("181")){

x = 81;

}

if(Seleccion.equals("182")){

x = 82;

}

if(Seleccion.equals("183")){

x = 83;

}

if(Seleccion.equals("184")){

x = 84;

}

if(Seleccion.equals("185")){

x = 85;

}

if(Seleccion.equals("186")){

x = 86;

}

if(Seleccion.equals("187")){

x = 87;

}

if(Seleccion.equals("188")){

x = 88;

}

if(Seleccion.equals("189")){

x = 89;

}

if(Seleccion.equals("190")){

x = 90;

}

if(Seleccion.equals("191")){

x = 91;

}

if(Seleccion.equals("192")){

x = 92;

}

if(Seleccion.equals("193")){

x = 93;

}

if(Seleccion.equals("194")){

x = 94;

}

if(Seleccion.equals("195")){

x = 95;

}

if(Seleccion.equals("196")){

x = 96;

}

if(Seleccion.equals("197")){

x = 97;

}

if(Seleccion.equals("198")){

x = 98;

}

if(Seleccion.equals("199")){

x = 99;

}

if(Seleccion.equals("200")){

x = 100;

}

if(Seleccion.equals("201")){

x = 101;

}

if(Seleccion.equals("202")){

x = 102;

}

if(Seleccion.equals("203")){

x = 103;

}

if(Seleccion.equals("204")){

x = 104;

}

if(Seleccion.equals("205")){

x = 105;

}

if(Seleccion.equals("206")){

x = 106;

}

if(Seleccion.equals("207")){

x = 107;

}

if(Seleccion.equals("208")){

x = 108;

}

if(Seleccion.equals("209")){

x = 109;

}

if(Seleccion.equals("210")){

x = 110;

}

if(Seleccion.equals("211")){

x = 111;

}

if(Seleccion.equals("212")){

x = 112;

}

if(Seleccion.equals("213")){

x = 113;

}

if(Seleccion.equals("214")){

x = 114;

}

if(Seleccion.equals("215")){

x = 115;

}

if(Seleccion.equals("216")){

x = 116;

}

if(Seleccion.equals("217")){

x = 117;

}

if(Seleccion.equals("218")){

x = 118;

}

if(Seleccion.equals("219")){

x = 119;

}

if(Seleccion.equals("220")){

x = 120;

}

if(Seleccion.equals("221")){

x = 121;

}

if(Seleccion.equals("222")){

x = 122;

}

if(Seleccion.equals("223")){

x = 123;

}

if(Seleccion.equals("224")){

x = 124;

}

if(Seleccion.equals("225")){

x = 125;

}

if(Seleccion.equals("226")){

x = 126;

}

if(Seleccion.equals("227")){

x = 127;

}

if(Seleccion.equals("228")){

x = 128;

}

if(Seleccion.equals("229")){

x = 129;

}

if(Seleccion.equals("230")){

x = 130;

}

if(Seleccion.equals("231")){

x = 131;

}

if(Seleccion.equals("232")){

x = 132;

}

if(Seleccion.equals("233")){

x = 133;

}

if(Seleccion.equals("234")){

x = 134;

}

if(Seleccion.equals("235")){

x = 135;

}

if(Seleccion.equals("236")){

x = 136;

}

if(Seleccion.equals("237")){

x = 137;

}

if(Seleccion.equals("238")){

x = 138;

}

if(Seleccion.equals("239")){

x = 139;

}

if(Seleccion.equals("240")){

x = 140;

}

if(Seleccion.equals("241")){

x = 141;

}

if(Seleccion.equals("242")){

x = 142;

}

if(Seleccion.equals("243")){

x = 143;

}

if(Seleccion.equals("244")){

x = 144;

}

if(Seleccion.equals("245")){

x = 145;

}

if(Seleccion.equals("246")){

x = 146;

}

if(Seleccion.equals("247")){

x = 147;

}

if(Seleccion.equals("248")){

x = 148;

}

if(Seleccion.equals("249")){

x = 149;

}

if(Seleccion.equals("250")){

x = 150;

}

if(Seleccion.equals("251")){

x = 151;

}

if(Seleccion.equals("252")){

x = 152;

}

if(Seleccion.equals("253")){

x = 153;

}

if(Seleccion.equals("254")){

x = 154;

}

if(Seleccion.equals("255")){

x = 155;

}

if(Seleccion.equals("256")){

x = 156;

}

if(Seleccion.equals("257")){

x = 157;

}

if(Seleccion.equals("258")){

x = 158;

}

if(Seleccion.equals("259")){

x = 159;

}

if(Seleccion.equals("260")){

x = 160;

}

if(Seleccion.equals("261")){

x = 161;

}

if(Seleccion.equals("262")){

x = 162;

}

if(Seleccion.equals("263")){

x = 163;

}

if(Seleccion.equals("264")){

x = 164;

}

if(Seleccion.equals("265")){

x = 165;

}

if(Seleccion.equals("266")){

x = 166;

}

if(Seleccion.equals("267")){

x = 167;

}

if(Seleccion.equals("268")){

x = 168;

}

if(Seleccion.equals("269")){

x = 169;

}

if(Seleccion.equals("270")){

x = 170;

}

if(Seleccion.equals("271")){

x = 171;

}

if(Seleccion.equals("272")){

x = 172;

}

if(Seleccion.equals("273")){

x = 173;

}

if(Seleccion.equals("274")){

x = 174;

}

if(Seleccion.equals("275")){

x = 175;

}

if(Seleccion.equals("276")){

x = 176;

}

if(Seleccion.equals("277")){

x = 177;

}

if(Seleccion.equals("278")){

x = 178;

}

if(Seleccion.equals("279")){

x = 179;

}

if(Seleccion.equals("280")){

x = 180;

}

if(Seleccion.equals("281")){

x = 181;

}

if(Seleccion.equals("282")){

x = 182;

}

if(Seleccion.equals("283")){

x = 183;

}

if(Seleccion.equals("284")){

x = 184;

}

if(Seleccion.equals("285")){

x = 185;

}

if(Seleccion.equals("286")){

x = 186;

}

if(Seleccion.equals("287")){

x = 187;

}

if(Seleccion.equals("288")){

x = 188;

}

if(Seleccion.equals("289")){

x = 189;

}

if(Seleccion.equals("290")){

x = 190;

}

if(Seleccion.equals("291")){

x = 191;

}

if(Seleccion.equals("292")){

x = 192;

}

if(Seleccion.equals("293")){

x = 193;

}

if(Seleccion.equals("294")){

x = 194;

}

if(Seleccion.equals("295")){

x = 195;

}

if(Seleccion.equals("296")){

x = 196;

}

if(Seleccion.equals("297")){

x = 197;

}

if(Seleccion.equals("298")){

x = 198;

}

if(Seleccion.equals("299")){

x = 199;

}

if(Seleccion.equals("300")){

x = 200;

}

if(almacenamiento){

int msj2 = JOptionPane.showConfirmDialog(null, "El egreso ya fue registrado. ¿Deseas continuar?");

if(msj2 == JOptionPane.YES_OPTION){

eleccion = " ";
Reporte[x] = eleccion;
almacenamiento = false;
y = Integer.parseInt(etiqueta9.getText());

}

}
else{

Reporte[x] = eleccion;
almacenamiento = true;

}

}

}

}

public void stateChanged(ChangeEvent e){

if(radio1.isSelected() == true){

cadena = cadena + "Piezas" + "\n";

}

if(radio2.isSelected() == true){

cadena = cadena + "Pacas" + "\n";

}

if(radio3.isSelected() == true){

cadena = cadena + "Cajas" + "\n";

}

}

public void itemStateChanged(ItemEvent accion){

Seleccion = combo.getSelectedItem().toString();

if(Seleccion.equals("100")){

x = 0;

}

if(Seleccion.equals("101")){

x = 1;

}

if(Seleccion.equals("102")){

x = 2;

}

if(Seleccion.equals("103")){

x = 3;

}

if(Seleccion.equals("104")){

x = 4;

}

if(Seleccion.equals("105")){

x = 5;

}

if(Seleccion.equals("106")){

x = 6;

}

if(Seleccion.equals("107")){

x = 7;

}

if(Seleccion.equals("108")){

x = 8;

}

if(Seleccion.equals("109")){

x = 9;

}

if(Seleccion.equals("110")){

x = 10;

}

if(Seleccion.equals("111")){

x = 11;

}

if(Seleccion.equals("112")){

x = 12;

}

if(Seleccion.equals("113")){

x = 13;

}

if(Seleccion.equals("114")){

x = 14;

}

if(Seleccion.equals("115")){

x = 15;

}

if(Seleccion.equals("116")){

x = 16;

}

if(Seleccion.equals("117")){

x = 17;

}

if(Seleccion.equals("118")){

x = 18;

}

if(Seleccion.equals("119")){

x = 19;

}

if(Seleccion.equals("120")){

x = 20;

}

if(Seleccion.equals("121")){

x = 21;

}

if(Seleccion.equals("122")){

x = 22;

}

if(Seleccion.equals("123")){

x = 23;

}

if(Seleccion.equals("124")){

x = 24;

}

if(Seleccion.equals("125")){

x = 25;

}

if(Seleccion.equals("126")){

x = 26;

}

if(Seleccion.equals("127")){

x = 27;

}

if(Seleccion.equals("128")){

x = 28;

}

if(Seleccion.equals("129")){

x = 29;

}

if(Seleccion.equals("130")){

x = 30;

}

if(Seleccion.equals("131")){

x = 31;

}

if(Seleccion.equals("132")){

x = 32;

}

if(Seleccion.equals("133")){

x = 33;

}

if(Seleccion.equals("134")){

x = 34;

}

if(Seleccion.equals("135")){

x = 35;

}

if(Seleccion.equals("136")){

x = 36;

}

if(Seleccion.equals("137")){

x = 37;

}

if(Seleccion.equals("138")){

x = 38;

}

if(Seleccion.equals("139")){

x = 39;

}

if(Seleccion.equals("140")){

x = 40;

}

if(Seleccion.equals("141")){

x = 41;

}

if(Seleccion.equals("142")){

x = 42;

}

if(Seleccion.equals("143")){

x = 43;

}

if(Seleccion.equals("144")){

x = 44;

}

if(Seleccion.equals("145")){

x = 45;

}

if(Seleccion.equals("146")){

x = 46;

}

if(Seleccion.equals("147")){

x = 47;

}

if(Seleccion.equals("148")){

x = 48;

}

if(Seleccion.equals("149")){

x = 49;

}

if(Seleccion.equals("150")){

x = 50;

}

if(Seleccion.equals("151")){

x = 51;

}

if(Seleccion.equals("152")){

x = 52;

}

if(Seleccion.equals("153")){

x = 53;

}

if(Seleccion.equals("154")){

x = 54;

}

if(Seleccion.equals("155")){

x = 55;

}

if(Seleccion.equals("156")){

x = 56;

}

if(Seleccion.equals("157")){

x = 57;

}

if(Seleccion.equals("158")){

x = 58;

}

if(Seleccion.equals("159")){

x = 59;

}

if(Seleccion.equals("160")){

x = 60;

}

if(Seleccion.equals("161")){

x = 61;

}

if(Seleccion.equals("162")){

x = 62;

}

if(Seleccion.equals("163")){

x = 63;

}

if(Seleccion.equals("164")){

x = 64;

}

if(Seleccion.equals("165")){

x = 65;

}

if(Seleccion.equals("166")){

x = 66;

}

if(Seleccion.equals("167")){

x = 67;

}

if(Seleccion.equals("168")){

x = 68;

}

if(Seleccion.equals("169")){

x = 69;

}

if(Seleccion.equals("170")){

x = 70;

}

if(Seleccion.equals("171")){

x = 71;

}

if(Seleccion.equals("172")){

x = 72;

}

if(Seleccion.equals("173")){

x = 73;

}

if(Seleccion.equals("174")){

x = 74;

}

if(Seleccion.equals("175")){

x = 75;

}

if(Seleccion.equals("176")){

x = 76;

}

if(Seleccion.equals("177")){

x = 77;

}

if(Seleccion.equals("178")){

x = 78;

}

if(Seleccion.equals("729")){

x = 79;

}

if(Seleccion.equals("180")){

x = 80;

}

if(Seleccion.equals("181")){

x = 81;

}

if(Seleccion.equals("182")){

x = 82;

}

if(Seleccion.equals("183")){

x = 83;

}

if(Seleccion.equals("184")){

x = 84;

}

if(Seleccion.equals("185")){

x = 85;

}

if(Seleccion.equals("186")){

x = 86;

}

if(Seleccion.equals("187")){

x = 87;

}

if(Seleccion.equals("188")){

x = 88;

}

if(Seleccion.equals("189")){

x = 89;

}

if(Seleccion.equals("190")){

x = 90;

}

if(Seleccion.equals("191")){

x = 91;

}

if(Seleccion.equals("192")){

x = 92;

}

if(Seleccion.equals("193")){

x = 93;

}

if(Seleccion.equals("194")){

x = 94;

}

if(Seleccion.equals("195")){

x = 95;

}

if(Seleccion.equals("196")){

x = 96;

}

if(Seleccion.equals("197")){

x = 97;

}

if(Seleccion.equals("198")){

x = 98;

}

if(Seleccion.equals("199")){

x = 99;

}

if(Seleccion.equals("200")){

x = 100;

}

if(Seleccion.equals("201")){

x = 101;

}

if(Seleccion.equals("202")){

x = 102;

}

if(Seleccion.equals("203")){

x = 103;

}

if(Seleccion.equals("204")){

x = 104;

}

if(Seleccion.equals("205")){

x = 105;

}

if(Seleccion.equals("206")){

x = 106;

}

if(Seleccion.equals("207")){

x = 107;

}

if(Seleccion.equals("208")){

x = 108;

}

if(Seleccion.equals("209")){

x = 109;

}

if(Seleccion.equals("210")){

x = 110;

}

if(Seleccion.equals("211")){

x = 111;

}

if(Seleccion.equals("212")){

x = 112;

}

if(Seleccion.equals("213")){

x = 113;

}

if(Seleccion.equals("214")){

x = 114;

}

if(Seleccion.equals("215")){

x = 115;

}

if(Seleccion.equals("216")){

x = 116;

}

if(Seleccion.equals("217")){

x = 117;

}

if(Seleccion.equals("218")){

x = 118;

}

if(Seleccion.equals("219")){

x = 119;

}

if(Seleccion.equals("220")){

x = 120;

}

if(Seleccion.equals("221")){

x = 121;

}

if(Seleccion.equals("222")){

x = 122;

}

if(Seleccion.equals("223")){

x = 123;

}

if(Seleccion.equals("224")){

x = 124;

}

if(Seleccion.equals("225")){

x = 125;

}

if(Seleccion.equals("226")){

x = 126;

}

if(Seleccion.equals("227")){

x = 127;

}

if(Seleccion.equals("228")){

x = 128;

}

if(Seleccion.equals("229")){

x = 129;

}

if(Seleccion.equals("230")){

x = 130;

}

if(Seleccion.equals("231")){

x = 131;

}

if(Seleccion.equals("232")){

x = 132;

}

if(Seleccion.equals("233")){

x = 133;

}

if(Seleccion.equals("234")){

x = 134;

}

if(Seleccion.equals("235")){

x = 135;

}

if(Seleccion.equals("236")){

x = 136;

}

if(Seleccion.equals("237")){

x = 137;

}

if(Seleccion.equals("238")){

x = 138;

}

if(Seleccion.equals("239")){

x = 139;

}

if(Seleccion.equals("240")){

x = 140;

}

if(Seleccion.equals("241")){

x = 141;

}

if(Seleccion.equals("242")){

x = 142;

}

if(Seleccion.equals("243")){

x = 143;

}

if(Seleccion.equals("244")){

x = 144;

}

if(Seleccion.equals("245")){

x = 145;

}

if(Seleccion.equals("246")){

x = 146;

}

if(Seleccion.equals("247")){

x = 147;

}

if(Seleccion.equals("248")){

x = 148;

}

if(Seleccion.equals("249")){

x = 149;

}

if(Seleccion.equals("250")){

x = 150;

}

if(Seleccion.equals("251")){

x = 151;

}

if(Seleccion.equals("252")){

x = 152;

}

if(Seleccion.equals("253")){

x = 153;

}

if(Seleccion.equals("254")){

x = 154;

}

if(Seleccion.equals("255")){

x = 155;

}

if(Seleccion.equals("256")){

x = 156;

}

if(Seleccion.equals("257")){

x = 157;

}

if(Seleccion.equals("258")){

x = 158;

}

if(Seleccion.equals("259")){

x = 159;

}

if(Seleccion.equals("260")){

x = 160;

}

if(Seleccion.equals("261")){

x = 161;

}

if(Seleccion.equals("262")){

x = 162;

}

if(Seleccion.equals("263")){

x = 163;

}

if(Seleccion.equals("264")){

x = 164;

}

if(Seleccion.equals("265")){

x = 165;

}

if(Seleccion.equals("266")){

x = 166;

}

if(Seleccion.equals("267")){

x = 167;

}

if(Seleccion.equals("268")){

x = 168;

}

if(Seleccion.equals("269")){

x = 169;

}

if(Seleccion.equals("270")){

x = 170;

}

if(Seleccion.equals("271")){

x = 171;

}

if(Seleccion.equals("272")){

x = 172;

}

if(Seleccion.equals("273")){

x = 173;

}

if(Seleccion.equals("274")){

x = 174;

}

if(Seleccion.equals("275")){

x = 175;

}

if(Seleccion.equals("276")){

x = 176;

}

if(Seleccion.equals("277")){

x = 177;

}

if(Seleccion.equals("278")){

x = 178;

}

if(Seleccion.equals("279")){

x = 179;

}

if(Seleccion.equals("280")){

x = 180;

}

if(Seleccion.equals("281")){

x = 181;

}

if(Seleccion.equals("282")){

x = 182;

}

if(Seleccion.equals("283")){

x = 183;

}

if(Seleccion.equals("284")){

x = 184;

}

if(Seleccion.equals("285")){

x = 185;

}

if(Seleccion.equals("286")){

x = 186;

}

if(Seleccion.equals("287")){

x = 187;

}

if(Seleccion.equals("288")){

x = 188;

}

if(Seleccion.equals("289")){

x = 189;

}

if(Seleccion.equals("290")){

x = 190;

}

if(Seleccion.equals("291")){

x = 191;

}

if(Seleccion.equals("292")){

x = 192;

}

if(Seleccion.equals("293")){

x = 193;

}

if(Seleccion.equals("294")){

x = 194;

}

if(Seleccion.equals("295")){

x = 195;

}

if(Seleccion.equals("296")){

x = 196;

}

if(Seleccion.equals("297")){

x = 197;

}

if(Seleccion.equals("298")){

x = 198;

}

if(Seleccion.equals("299")){

x = 199;

}

if(Seleccion.equals("300")){

x = 200;

}

descripcion = Datos[x];

areaTexto.setText(descripcion);

}

public void focusGained(FocusEvent e){}

public void focusLost(FocusEvent e){

if(e.getSource() == campoTexto1){

JOptionPane.showMessageDialog(null, "Ingrese únicamente números enteros positivos");

}

if(e.getSource() == campoTexto2){

JOptionPane.showMessageDialog(null, "Es importante que captures la fecha correcta");

}

}

public void keyPressed(KeyEvent e){}

public void keyReleased(KeyEvent e){

if(e.getSource() == boton1){

if(e.getKeyCode() == 10){

if(etiqueta9.getText().equals(" ")){

etiqueta9.setText("0");

y = Integer.parseInt(etiqueta9.getText());

}

z = Integer.parseInt(campoTexto1.getText());

if(cadena.equals("Pacas")){

z = y * 10;

}

if(cadena.equals("Cajas")){

z = y * 50;

}

y = y + z;

y = Integer.parseInt(etiqueta9.getText());

int msj = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea seguir con el proceso?");

if(msj == JOptionPane.YES_OPTION){

eleccion = etiqueta1.getText() + Seleccion + "\n" + etiqueta2.getText()  + areaTexto.getText() + "\n" + "Ingresó al almacen: " + "\n" + etiqueta3.getText()  + campoTexto1.getText() + "\n" + etiqueta4.getText() + cadena + "\n" + etiqueta7.getText() + campoTexto2.getText() + "\n" + etiqueta8.getText() + etiqueta9.getText() + "--------------------------" + "\n";

if(Seleccion.equals("100")){

x = 0;

}

if(Seleccion.equals("101")){

x = 1;

}

if(Seleccion.equals("102")){

x = 2;

}

if(Seleccion.equals("103")){

x = 3;

}

if(Seleccion.equals("104")){

x = 4;

}

if(Seleccion.equals("105")){

x = 5;

}

if(Seleccion.equals("106")){

x = 6;

}

if(Seleccion.equals("107")){

x = 7;

}

if(Seleccion.equals("108")){

x = 8;

}

if(Seleccion.equals("109")){

x = 9;

}

if(Seleccion.equals("110")){

x = 10;

}

if(Seleccion.equals("111")){

x = 11;

}

if(Seleccion.equals("112")){

x = 12;

}

if(Seleccion.equals("113")){

x = 13;

}

if(Seleccion.equals("114")){

x = 14;

}

if(Seleccion.equals("115")){

x = 15;

}

if(Seleccion.equals("116")){

x = 16;

}

if(Seleccion.equals("117")){

x = 17;

}

if(Seleccion.equals("118")){

x = 18;

}

if(Seleccion.equals("119")){

x = 19;

}

if(Seleccion.equals("120")){

x = 20;

}

if(Seleccion.equals("121")){

x = 21;

}

if(Seleccion.equals("122")){

x = 22;

}

if(Seleccion.equals("123")){

x = 23;

}

if(Seleccion.equals("124")){

x = 24;

}

if(Seleccion.equals("125")){

x = 25;

}

if(Seleccion.equals("126")){

x = 26;

}

if(Seleccion.equals("127")){

x = 27;

}

if(Seleccion.equals("128")){

x = 28;

}

if(Seleccion.equals("129")){

x = 29;

}

if(Seleccion.equals("130")){

x = 30;

}

if(Seleccion.equals("131")){

x = 31;

}

if(Seleccion.equals("132")){

x = 32;

}

if(Seleccion.equals("133")){

x = 33;

}

if(Seleccion.equals("134")){

x = 34;

}

if(Seleccion.equals("135")){

x = 35;

}

if(Seleccion.equals("136")){

x = 36;

}

if(Seleccion.equals("137")){

x = 37;

}

if(Seleccion.equals("138")){

x = 38;

}

if(Seleccion.equals("139")){

x = 39;

}

if(Seleccion.equals("140")){

x = 40;

}

if(Seleccion.equals("141")){

x = 41;

}

if(Seleccion.equals("142")){

x = 42;

}

if(Seleccion.equals("143")){

x = 43;

}

if(Seleccion.equals("144")){

x = 44;

}

if(Seleccion.equals("145")){

x = 45;

}

if(Seleccion.equals("146")){

x = 46;

}

if(Seleccion.equals("147")){

x = 47;

}

if(Seleccion.equals("148")){

x = 48;

}

if(Seleccion.equals("149")){

x = 49;

}

if(Seleccion.equals("150")){

x = 50;

}

if(Seleccion.equals("151")){

x = 51;

}

if(Seleccion.equals("152")){

x = 52;

}

if(Seleccion.equals("153")){

x = 53;

}

if(Seleccion.equals("154")){

x = 54;

}

if(Seleccion.equals("155")){

x = 55;

}

if(Seleccion.equals("156")){

x = 56;

}

if(Seleccion.equals("157")){

x = 57;

}

if(Seleccion.equals("158")){

x = 58;

}

if(Seleccion.equals("159")){

x = 59;

}

if(Seleccion.equals("160")){

x = 60;

}

if(Seleccion.equals("161")){

x = 61;

}

if(Seleccion.equals("162")){

x = 62;

}

if(Seleccion.equals("163")){

x = 63;

}

if(Seleccion.equals("164")){

x = 64;

}

if(Seleccion.equals("165")){

x = 65;

}

if(Seleccion.equals("166")){

x = 66;

}

if(Seleccion.equals("167")){

x = 67;

}

if(Seleccion.equals("168")){

x = 68;

}

if(Seleccion.equals("169")){

x = 69;

}

if(Seleccion.equals("170")){

x = 70;

}

if(Seleccion.equals("171")){

x = 71;

}

if(Seleccion.equals("172")){

x = 72;

}

if(Seleccion.equals("173")){

x = 73;

}

if(Seleccion.equals("174")){

x = 74;

}

if(Seleccion.equals("175")){

x = 75;

}

if(Seleccion.equals("176")){

x = 76;

}

if(Seleccion.equals("177")){

x = 77;

}

if(Seleccion.equals("178")){

x = 78;

}

if(Seleccion.equals("729")){

x = 79;

}

if(Seleccion.equals("180")){

x = 80;

}

if(Seleccion.equals("181")){

x = 81;

}

if(Seleccion.equals("182")){

x = 82;

}

if(Seleccion.equals("183")){

x = 83;

}

if(Seleccion.equals("184")){

x = 84;

}

if(Seleccion.equals("185")){

x = 85;

}

if(Seleccion.equals("186")){

x = 86;

}

if(Seleccion.equals("187")){

x = 87;

}

if(Seleccion.equals("188")){

x = 88;

}

if(Seleccion.equals("189")){

x = 89;

}

if(Seleccion.equals("190")){

x = 90;

}

if(Seleccion.equals("191")){

x = 91;

}

if(Seleccion.equals("192")){

x = 92;

}

if(Seleccion.equals("193")){

x = 93;

}

if(Seleccion.equals("194")){

x = 94;

}

if(Seleccion.equals("195")){

x = 95;

}

if(Seleccion.equals("196")){

x = 96;

}

if(Seleccion.equals("197")){

x = 97;

}

if(Seleccion.equals("198")){

x = 98;

}

if(Seleccion.equals("199")){

x = 99;

}

if(Seleccion.equals("200")){

x = 100;

}

if(Seleccion.equals("201")){

x = 101;

}

if(Seleccion.equals("202")){

x = 102;

}

if(Seleccion.equals("203")){

x = 103;

}

if(Seleccion.equals("204")){

x = 104;

}

if(Seleccion.equals("205")){

x = 105;

}

if(Seleccion.equals("206")){

x = 106;

}

if(Seleccion.equals("207")){

x = 107;

}

if(Seleccion.equals("208")){

x = 108;

}

if(Seleccion.equals("209")){

x = 109;

}

if(Seleccion.equals("210")){

x = 110;

}

if(Seleccion.equals("211")){

x = 111;

}

if(Seleccion.equals("212")){

x = 112;

}

if(Seleccion.equals("213")){

x = 113;

}

if(Seleccion.equals("214")){

x = 114;

}

if(Seleccion.equals("215")){

x = 115;

}

if(Seleccion.equals("216")){

x = 116;

}

if(Seleccion.equals("217")){

x = 117;

}

if(Seleccion.equals("218")){

x = 118;

}

if(Seleccion.equals("219")){

x = 119;

}

if(Seleccion.equals("220")){

x = 120;

}

if(Seleccion.equals("221")){

x = 121;

}

if(Seleccion.equals("222")){

x = 122;

}

if(Seleccion.equals("223")){

x = 123;

}

if(Seleccion.equals("224")){

x = 124;

}

if(Seleccion.equals("225")){

x = 125;

}

if(Seleccion.equals("226")){

x = 126;

}

if(Seleccion.equals("227")){

x = 127;

}

if(Seleccion.equals("228")){

x = 128;

}

if(Seleccion.equals("229")){

x = 129;

}

if(Seleccion.equals("230")){

x = 130;

}

if(Seleccion.equals("231")){

x = 131;

}

if(Seleccion.equals("232")){

x = 132;

}

if(Seleccion.equals("233")){

x = 133;

}

if(Seleccion.equals("234")){

x = 134;

}

if(Seleccion.equals("235")){

x = 135;

}

if(Seleccion.equals("236")){

x = 136;

}

if(Seleccion.equals("237")){

x = 137;

}

if(Seleccion.equals("238")){

x = 138;

}

if(Seleccion.equals("239")){

x = 139;

}

if(Seleccion.equals("240")){

x = 140;

}

if(Seleccion.equals("241")){

x = 141;

}

if(Seleccion.equals("242")){

x = 142;

}

if(Seleccion.equals("243")){

x = 143;

}

if(Seleccion.equals("244")){

x = 144;

}

if(Seleccion.equals("245")){

x = 145;

}

if(Seleccion.equals("246")){

x = 146;

}

if(Seleccion.equals("247")){

x = 147;

}

if(Seleccion.equals("248")){

x = 148;

}

if(Seleccion.equals("249")){

x = 149;

}

if(Seleccion.equals("250")){

x = 150;

}

if(Seleccion.equals("251")){

x = 151;

}

if(Seleccion.equals("252")){

x = 152;

}

if(Seleccion.equals("253")){

x = 153;

}

if(Seleccion.equals("254")){

x = 154;

}

if(Seleccion.equals("255")){

x = 155;

}

if(Seleccion.equals("256")){

x = 156;

}

if(Seleccion.equals("257")){

x = 157;

}

if(Seleccion.equals("258")){

x = 158;

}

if(Seleccion.equals("259")){

x = 159;

}

if(Seleccion.equals("260")){

x = 160;

}

if(Seleccion.equals("261")){

x = 161;

}

if(Seleccion.equals("262")){

x = 162;

}

if(Seleccion.equals("263")){

x = 163;

}

if(Seleccion.equals("264")){

x = 164;

}

if(Seleccion.equals("265")){

x = 165;

}

if(Seleccion.equals("266")){

x = 166;

}

if(Seleccion.equals("267")){

x = 167;

}

if(Seleccion.equals("268")){

x = 168;

}

if(Seleccion.equals("269")){

x = 169;

}

if(Seleccion.equals("270")){

x = 170;

}

if(Seleccion.equals("271")){

x = 171;

}

if(Seleccion.equals("272")){

x = 172;

}

if(Seleccion.equals("273")){

x = 173;

}

if(Seleccion.equals("274")){

x = 174;

}

if(Seleccion.equals("275")){

x = 175;

}

if(Seleccion.equals("276")){

x = 176;

}

if(Seleccion.equals("277")){

x = 177;

}

if(Seleccion.equals("278")){

x = 178;

}

if(Seleccion.equals("279")){

x = 179;

}

if(Seleccion.equals("280")){

x = 180;

}

if(Seleccion.equals("281")){

x = 181;

}

if(Seleccion.equals("282")){

x = 182;

}

if(Seleccion.equals("283")){

x = 183;

}

if(Seleccion.equals("284")){

x = 184;

}

if(Seleccion.equals("285")){

x = 185;

}

if(Seleccion.equals("286")){

x = 186;

}

if(Seleccion.equals("287")){

x = 187;

}

if(Seleccion.equals("288")){

x = 188;

}

if(Seleccion.equals("289")){

x = 189;

}

if(Seleccion.equals("290")){

x = 190;

}

if(Seleccion.equals("291")){

x = 191;

}

if(Seleccion.equals("292")){

x = 192;

}

if(Seleccion.equals("293")){

x = 193;

}

if(Seleccion.equals("294")){

x = 194;

}

if(Seleccion.equals("295")){

x = 195;

}

if(Seleccion.equals("296")){

x = 196;

}

if(Seleccion.equals("297")){

x = 197;

}

if(Seleccion.equals("298")){

x = 198;

}

if(Seleccion.equals("299")){

x = 199;

}

if(Seleccion.equals("300")){

x = 200;

}

if(almacenamiento){

int msj2 = JOptionPane.showConfirmDialog(null, "El ingreso ya fue registrado. ¿Deseas continuar?");

if(msj2 == JOptionPane.YES_OPTION){

eleccion = " ";
Reporte[x] = eleccion;
almacenamiento = false;
y = Integer.parseInt(etiqueta9.getText());

}

}
else{

Reporte[x] = eleccion;
almacenamiento = true;

}

}

}

}

if(e.getSource() == boton2){

if(e.getKeyCode() == 10){

if(etiqueta9.getText().equals(" ")){

etiqueta9.setText("0");

y = Integer.parseInt(etiqueta9.getText());

}

z = Integer.parseInt(campoTexto1.getText());

if(cadena.equals("Pacas")){

z = y * 10;

}

if(cadena.equals("Cajas")){

z = y * 50;

}

y = y - z;

if(y < 0){

JOptionPane.showMessageDialog(null, "El retiro no puede hacerse efectivo porque no hay mercancía en el almacén");

}

y = Integer.parseInt(etiqueta9.getText());

int msj = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea seguir con el proceso?");

if(msj == JOptionPane.YES_OPTION){

eleccion = etiqueta1.getText() + Seleccion + "\n" + etiqueta2.getText()  + areaTexto.getText() + "\n" + "Se retiró del almacen: " + "\n" + etiqueta3.getText()  + campoTexto1.getText() + "\n" + etiqueta4.getText() + cadena + "\n" + etiqueta7.getText() + campoTexto2.getText() + "\n" + etiqueta8.getText() + etiqueta9.getText() + "--------------------------" + "\n";

if(Seleccion.equals("100")){

x = 0;

}

if(Seleccion.equals("101")){

x = 1;

}

if(Seleccion.equals("102")){

x = 2;

}

if(Seleccion.equals("103")){

x = 3;

}

if(Seleccion.equals("104")){

x = 4;

}

if(Seleccion.equals("105")){

x = 5;

}

if(Seleccion.equals("106")){

x = 6;

}

if(Seleccion.equals("107")){

x = 7;

}

if(Seleccion.equals("108")){

x = 8;

}

if(Seleccion.equals("109")){

x = 9;

}

if(Seleccion.equals("110")){

x = 10;

}

if(Seleccion.equals("111")){

x = 11;

}

if(Seleccion.equals("112")){

x = 12;

}

if(Seleccion.equals("113")){

x = 13;

}

if(Seleccion.equals("114")){

x = 14;

}

if(Seleccion.equals("115")){

x = 15;

}

if(Seleccion.equals("116")){

x = 16;

}

if(Seleccion.equals("117")){

x = 17;

}

if(Seleccion.equals("118")){

x = 18;

}

if(Seleccion.equals("119")){

x = 19;

}

if(Seleccion.equals("120")){

x = 20;

}

if(Seleccion.equals("121")){

x = 21;

}

if(Seleccion.equals("122")){

x = 22;

}

if(Seleccion.equals("123")){

x = 23;

}

if(Seleccion.equals("124")){

x = 24;

}

if(Seleccion.equals("125")){

x = 25;

}

if(Seleccion.equals("126")){

x = 26;

}

if(Seleccion.equals("127")){

x = 27;

}

if(Seleccion.equals("128")){

x = 28;

}

if(Seleccion.equals("129")){

x = 29;

}

if(Seleccion.equals("130")){

x = 30;

}

if(Seleccion.equals("131")){

x = 31;

}

if(Seleccion.equals("132")){

x = 32;

}

if(Seleccion.equals("133")){

x = 33;

}

if(Seleccion.equals("134")){

x = 34;

}

if(Seleccion.equals("135")){

x = 35;

}

if(Seleccion.equals("136")){

x = 36;

}

if(Seleccion.equals("137")){

x = 37;

}

if(Seleccion.equals("138")){

x = 38;

}

if(Seleccion.equals("139")){

x = 39;

}

if(Seleccion.equals("140")){

x = 40;

}

if(Seleccion.equals("141")){

x = 41;

}

if(Seleccion.equals("142")){

x = 42;

}

if(Seleccion.equals("143")){

x = 43;

}

if(Seleccion.equals("144")){

x = 44;

}

if(Seleccion.equals("145")){

x = 45;

}

if(Seleccion.equals("146")){

x = 46;

}

if(Seleccion.equals("147")){

x = 47;

}

if(Seleccion.equals("148")){

x = 48;

}

if(Seleccion.equals("149")){

x = 49;

}

if(Seleccion.equals("150")){

x = 50;

}

if(Seleccion.equals("151")){

x = 51;

}

if(Seleccion.equals("152")){

x = 52;

}

if(Seleccion.equals("153")){

x = 53;

}

if(Seleccion.equals("154")){

x = 54;

}

if(Seleccion.equals("155")){

x = 55;

}

if(Seleccion.equals("156")){

x = 56;

}

if(Seleccion.equals("157")){

x = 57;

}

if(Seleccion.equals("158")){

x = 58;

}

if(Seleccion.equals("159")){

x = 59;

}

if(Seleccion.equals("160")){

x = 60;

}

if(Seleccion.equals("161")){

x = 61;

}

if(Seleccion.equals("162")){

x = 62;

}

if(Seleccion.equals("163")){

x = 63;

}

if(Seleccion.equals("164")){

x = 64;

}

if(Seleccion.equals("165")){

x = 65;

}

if(Seleccion.equals("166")){

x = 66;

}

if(Seleccion.equals("167")){

x = 67;

}

if(Seleccion.equals("168")){

x = 68;

}

if(Seleccion.equals("169")){

x = 69;

}

if(Seleccion.equals("170")){

x = 70;

}

if(Seleccion.equals("171")){

x = 71;

}

if(Seleccion.equals("172")){

x = 72;

}

if(Seleccion.equals("173")){

x = 73;

}

if(Seleccion.equals("174")){

x = 74;

}

if(Seleccion.equals("175")){

x = 75;

}

if(Seleccion.equals("176")){

x = 76;

}

if(Seleccion.equals("177")){

x = 77;

}

if(Seleccion.equals("178")){

x = 78;

}

if(Seleccion.equals("729")){

x = 79;

}

if(Seleccion.equals("180")){

x = 80;

}

if(Seleccion.equals("181")){

x = 81;

}

if(Seleccion.equals("182")){

x = 82;

}

if(Seleccion.equals("183")){

x = 83;

}

if(Seleccion.equals("184")){

x = 84;

}

if(Seleccion.equals("185")){

x = 85;

}

if(Seleccion.equals("186")){

x = 86;

}

if(Seleccion.equals("187")){

x = 87;

}

if(Seleccion.equals("188")){

x = 88;

}

if(Seleccion.equals("189")){

x = 89;

}

if(Seleccion.equals("190")){

x = 90;

}

if(Seleccion.equals("191")){

x = 91;

}

if(Seleccion.equals("192")){

x = 92;

}

if(Seleccion.equals("193")){

x = 93;

}

if(Seleccion.equals("194")){

x = 94;

}

if(Seleccion.equals("195")){

x = 95;

}

if(Seleccion.equals("196")){

x = 96;

}

if(Seleccion.equals("197")){

x = 97;

}

if(Seleccion.equals("198")){

x = 98;

}

if(Seleccion.equals("199")){

x = 99;

}

if(Seleccion.equals("200")){

x = 100;

}

if(Seleccion.equals("201")){

x = 101;

}

if(Seleccion.equals("202")){

x = 102;

}

if(Seleccion.equals("203")){

x = 103;

}

if(Seleccion.equals("204")){

x = 104;

}

if(Seleccion.equals("205")){

x = 105;

}

if(Seleccion.equals("206")){

x = 106;

}

if(Seleccion.equals("207")){

x = 107;

}

if(Seleccion.equals("208")){

x = 108;

}

if(Seleccion.equals("209")){

x = 109;

}

if(Seleccion.equals("210")){

x = 110;

}

if(Seleccion.equals("211")){

x = 111;

}

if(Seleccion.equals("212")){

x = 112;

}

if(Seleccion.equals("213")){

x = 113;

}

if(Seleccion.equals("214")){

x = 114;

}

if(Seleccion.equals("215")){

x = 115;

}

if(Seleccion.equals("216")){

x = 116;

}

if(Seleccion.equals("217")){

x = 117;

}

if(Seleccion.equals("218")){

x = 118;

}

if(Seleccion.equals("219")){

x = 119;

}

if(Seleccion.equals("220")){

x = 120;

}

if(Seleccion.equals("221")){

x = 121;

}

if(Seleccion.equals("222")){

x = 122;

}

if(Seleccion.equals("223")){

x = 123;

}

if(Seleccion.equals("224")){

x = 124;

}

if(Seleccion.equals("225")){

x = 125;

}

if(Seleccion.equals("226")){

x = 126;

}

if(Seleccion.equals("227")){

x = 127;

}

if(Seleccion.equals("228")){

x = 128;

}

if(Seleccion.equals("229")){

x = 129;

}

if(Seleccion.equals("230")){

x = 130;

}

if(Seleccion.equals("231")){

x = 131;

}

if(Seleccion.equals("232")){

x = 132;

}

if(Seleccion.equals("233")){

x = 133;

}

if(Seleccion.equals("234")){

x = 134;

}

if(Seleccion.equals("235")){

x = 135;

}

if(Seleccion.equals("236")){

x = 136;

}

if(Seleccion.equals("237")){

x = 137;

}

if(Seleccion.equals("238")){

x = 138;

}

if(Seleccion.equals("239")){

x = 139;

}

if(Seleccion.equals("240")){

x = 140;

}

if(Seleccion.equals("241")){

x = 141;

}

if(Seleccion.equals("242")){

x = 142;

}

if(Seleccion.equals("243")){

x = 143;

}

if(Seleccion.equals("244")){

x = 144;

}

if(Seleccion.equals("245")){

x = 145;

}

if(Seleccion.equals("246")){

x = 146;

}

if(Seleccion.equals("247")){

x = 147;

}

if(Seleccion.equals("248")){

x = 148;

}

if(Seleccion.equals("249")){

x = 149;

}

if(Seleccion.equals("250")){

x = 150;

}

if(Seleccion.equals("251")){

x = 151;

}

if(Seleccion.equals("252")){

x = 152;

}

if(Seleccion.equals("253")){

x = 153;

}

if(Seleccion.equals("254")){

x = 154;

}

if(Seleccion.equals("255")){

x = 155;

}

if(Seleccion.equals("256")){

x = 156;

}

if(Seleccion.equals("257")){

x = 157;

}

if(Seleccion.equals("258")){

x = 158;

}

if(Seleccion.equals("259")){

x = 159;

}

if(Seleccion.equals("260")){

x = 160;

}

if(Seleccion.equals("261")){

x = 161;

}

if(Seleccion.equals("262")){

x = 162;

}

if(Seleccion.equals("263")){

x = 163;

}

if(Seleccion.equals("264")){

x = 164;

}

if(Seleccion.equals("265")){

x = 165;

}

if(Seleccion.equals("266")){

x = 166;

}

if(Seleccion.equals("267")){

x = 167;

}

if(Seleccion.equals("268")){

x = 168;

}

if(Seleccion.equals("269")){

x = 169;

}

if(Seleccion.equals("270")){

x = 170;

}

if(Seleccion.equals("271")){

x = 171;

}

if(Seleccion.equals("272")){

x = 172;

}

if(Seleccion.equals("273")){

x = 173;

}

if(Seleccion.equals("274")){

x = 174;

}

if(Seleccion.equals("275")){

x = 175;

}

if(Seleccion.equals("276")){

x = 176;

}

if(Seleccion.equals("277")){

x = 177;

}

if(Seleccion.equals("278")){

x = 178;

}

if(Seleccion.equals("279")){

x = 179;

}

if(Seleccion.equals("280")){

x = 180;

}

if(Seleccion.equals("281")){

x = 181;

}

if(Seleccion.equals("282")){

x = 182;

}

if(Seleccion.equals("283")){

x = 183;

}

if(Seleccion.equals("284")){

x = 184;

}

if(Seleccion.equals("285")){

x = 185;

}

if(Seleccion.equals("286")){

x = 186;

}

if(Seleccion.equals("287")){

x = 187;

}

if(Seleccion.equals("288")){

x = 188;

}

if(Seleccion.equals("289")){

x = 189;

}

if(Seleccion.equals("290")){

x = 190;

}

if(Seleccion.equals("291")){

x = 191;

}

if(Seleccion.equals("292")){

x = 192;

}

if(Seleccion.equals("293")){

x = 193;

}

if(Seleccion.equals("294")){

x = 194;

}

if(Seleccion.equals("295")){

x = 195;

}

if(Seleccion.equals("296")){

x = 196;

}

if(Seleccion.equals("297")){

x = 197;

}

if(Seleccion.equals("298")){

x = 198;

}

if(Seleccion.equals("299")){

x = 199;

}

if(Seleccion.equals("300")){

x = 200;

}

if(almacenamiento){

int msj2 = JOptionPane.showConfirmDialog(null, "El egreso ya fue registrado. ¿Deseas continuar?");

if(msj2 == JOptionPane.YES_OPTION){

eleccion = " ";
Reporte[x] = eleccion;
almacenamiento = false;
y = Integer.parseInt(etiqueta9.getText());

}

}
else{

Reporte[x] = eleccion;
almacenamiento = true;

}

}

}

}

}

public void keyTyped(KeyEvent e){}

public void mouseEntered(MouseEvent accion){

if(accion.getSource() == ayuda){

JOptionPane.showMessageDialog(null, "En esta ventana puedes manejar la información de las entradas y salidas en tu almacén");

}

}

public void mouseExited(MouseEvent accion){}

public void mousePressed(MouseEvent accion){}

public void mouseReleased(MouseEvent accion){}

public void mouseClicked(MouseEvent accion){}


public static void main(String args[]){

VentanaH Inventarios = new VentanaH();
Inventarios.setBounds(200, 100, 500, 400);
Inventarios.setVisible(true);

}

}