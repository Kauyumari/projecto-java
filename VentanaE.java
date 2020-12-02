import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaE extends JFrame implements ActionListener, ItemListener, KeyListener, MouseListener{

public JComboBox <String> combo1, combo2, combo3, combo4, combo5;
public JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5;
public JLabel etiqueta6, etiqueta7, etiqueta8, etiqueta9, etiqueta10, ayuda;
public JTextField campoTexto1, campoTexto2, campoTexto3, campoTexto4;
public JTextArea areaTexto;
public JButton boton;
public static String Seleccion1, Seleccion2, Seleccion3, Seleccion4, Seleccion5;
public static String eleccion;
public static String BaseDatos[] = new String[201];
public int x;
public boolean almacenamiento;

public VentanaE(){

setLayout(null);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
setTitle("Productos");
setIconImage(new ImageIcon(getClass().getResource("logo.jpg")).getImage());

ayuda = new JLabel("?");
ayuda.setBounds(0, 0, 50, 20);
add(ayuda);

etiqueta1 = new JLabel("Código");
etiqueta1.setBounds(10, 10, 150, 20);
add(etiqueta1);

combo1 = new JComboBox <String> ();
combo1.setBounds(170, 10, 150, 20);
add(combo1);

combo1.addItem("100");
combo1.addItem("101");
combo1.addItem("102");
combo1.addItem("103");
combo1.addItem("104");
combo1.addItem("105");
combo1.addItem("106");
combo1.addItem("107");
combo1.addItem("108");
combo1.addItem("109");
combo1.addItem("110");
combo1.addItem("111");
combo1.addItem("112");
combo1.addItem("113");
combo1.addItem("114");
combo1.addItem("115");
combo1.addItem("116");
combo1.addItem("117");
combo1.addItem("118");
combo1.addItem("119");
combo1.addItem("120");
combo1.addItem("121");
combo1.addItem("122");
combo1.addItem("123");
combo1.addItem("124");
combo1.addItem("125");
combo1.addItem("126");
combo1.addItem("127");
combo1.addItem("128");
combo1.addItem("139");
combo1.addItem("130");
combo1.addItem("131");
combo1.addItem("132");
combo1.addItem("133");
combo1.addItem("134");
combo1.addItem("135");
combo1.addItem("136");
combo1.addItem("137");
combo1.addItem("138");
combo1.addItem("139");
combo1.addItem("140");
combo1.addItem("141");
combo1.addItem("142");
combo1.addItem("143");
combo1.addItem("144");
combo1.addItem("145");
combo1.addItem("146");
combo1.addItem("147");
combo1.addItem("148");
combo1.addItem("149");
combo1.addItem("150");
combo1.addItem("151");
combo1.addItem("152");
combo1.addItem("153");
combo1.addItem("154");
combo1.addItem("155");
combo1.addItem("156");
combo1.addItem("157");
combo1.addItem("158");
combo1.addItem("159");
combo1.addItem("160");
combo1.addItem("161");
combo1.addItem("162");
combo1.addItem("163");
combo1.addItem("164");
combo1.addItem("165");
combo1.addItem("166");
combo1.addItem("167");
combo1.addItem("168");
combo1.addItem("169");
combo1.addItem("170");
combo1.addItem("171");
combo1.addItem("172");
combo1.addItem("173");
combo1.addItem("174");
combo1.addItem("175");
combo1.addItem("176");
combo1.addItem("177");
combo1.addItem("178");
combo1.addItem("179");
combo1.addItem("180");
combo1.addItem("181");
combo1.addItem("182");
combo1.addItem("183");
combo1.addItem("184");
combo1.addItem("185");
combo1.addItem("186");
combo1.addItem("187");
combo1.addItem("188");
combo1.addItem("189");
combo1.addItem("190");
combo1.addItem("191");
combo1.addItem("192");
combo1.addItem("193");
combo1.addItem("194");
combo1.addItem("195");
combo1.addItem("196");
combo1.addItem("197");
combo1.addItem("198");
combo1.addItem("199");
combo1.addItem("200");
combo1.addItem("201");
combo1.addItem("202");
combo1.addItem("203");
combo1.addItem("204");
combo1.addItem("205");
combo1.addItem("206");
combo1.addItem("207");
combo1.addItem("208");
combo1.addItem("209");
combo1.addItem("210");
combo1.addItem("211");
combo1.addItem("212");
combo1.addItem("213");
combo1.addItem("214");
combo1.addItem("215");
combo1.addItem("216");
combo1.addItem("217");
combo1.addItem("218");
combo1.addItem("219");
combo1.addItem("220");
combo1.addItem("221");
combo1.addItem("222");
combo1.addItem("223");
combo1.addItem("224");
combo1.addItem("225");
combo1.addItem("226");
combo1.addItem("227");
combo1.addItem("228");
combo1.addItem("229");
combo1.addItem("230");
combo1.addItem("231");
combo1.addItem("232");
combo1.addItem("232");
combo1.addItem("233");
combo1.addItem("234");
combo1.addItem("235");
combo1.addItem("236");
combo1.addItem("237");
combo1.addItem("238");
combo1.addItem("239");
combo1.addItem("240");
combo1.addItem("241");
combo1.addItem("242");
combo1.addItem("243");
combo1.addItem("244");
combo1.addItem("245");
combo1.addItem("246");
combo1.addItem("247");
combo1.addItem("248");
combo1.addItem("249");
combo1.addItem("250");
combo1.addItem("251");
combo1.addItem("252");
combo1.addItem("253");
combo1.addItem("254");
combo1.addItem("255");
combo1.addItem("256");
combo1.addItem("257");
combo1.addItem("258");
combo1.addItem("259");
combo1.addItem("260");
combo1.addItem("261");
combo1.addItem("262");
combo1.addItem("263");
combo1.addItem("264");
combo1.addItem("265");
combo1.addItem("266");
combo1.addItem("267");
combo1.addItem("268");
combo1.addItem("269");
combo1.addItem("270");
combo1.addItem("271");
combo1.addItem("272");
combo1.addItem("273");
combo1.addItem("274");
combo1.addItem("275");
combo1.addItem("275");
combo1.addItem("276");
combo1.addItem("277");
combo1.addItem("278");
combo1.addItem("279");
combo1.addItem("280");
combo1.addItem("281");
combo1.addItem("282");
combo1.addItem("283");
combo1.addItem("284");
combo1.addItem("285");
combo1.addItem("286");
combo1.addItem("287");
combo1.addItem("288");
combo1.addItem("289");
combo1.addItem("290");
combo1.addItem("291");
combo1.addItem("292");
combo1.addItem("293");
combo1.addItem("294");
combo1.addItem("295");
combo1.addItem("296");
combo1.addItem("297");
combo1.addItem("298");
combo1.addItem("299");
combo1.addItem("300");

combo1.setEditable(true);
combo1.setSelectedItem("Código");
combo1.setEditable(false);

etiqueta2 = new JLabel("Tipo de Producto: ");
etiqueta2.setBounds(10, 30, 150, 20);
add(etiqueta2);

combo2 = new JComboBox <String> ();
combo2.setBounds(170, 30, 150, 20);
add(combo2);

combo2.addItem("Pantalón de vestir");
combo2.addItem("Camisa");
combo2.addItem("Saco");
combo2.addItem("Zapatos de vestir");
combo2.addItem("Cinturón");
combo2.addItem("Corbata");
combo2.addItem("Playera");
combo2.addItem("Jeans");
combo2.addItem("Shorts");
combo2.addItem("Calcetas");
combo2.addItem("Chaquetas");
combo2.addItem("Boxer");
combo2.addItem("Camisa Interior");
combo2.addItem("Piyama");
combo2.addItem("Tennis");
combo2.addItem("Zapato casual");
combo2.addItem("Sandalias");
combo2.addItem("Reloj");
combo2.addItem("Gorra");
combo2.addItem("Sombrero");
combo2.addItem("Cartera");
combo2.addItem("Pulsera");
combo2.addItem("Bufanda");
combo2.addItem("Orejeras");
combo2.addItem("Guantes");
combo2.addItem("Sueter");
combo2.addItem("Pants");
combo2.addItem("Mallas");
combo2.addItem("Bañador");
combo2.addItem("Mochilas");
combo2.addItem("Lentes de sol");
combo2.addItem("Falda");
combo2.addItem("Vestido de Noche");
combo2.addItem("Vestido de Día");
combo2.addItem("Vestido de Playa");
combo2.addItem("Blusa");
combo2.addItem("Pantaletas");
combo2.addItem("Brasier");
combo2.addItem("Zapatillas de tacón");
combo2.addItem("Zapatillas de plataforma");
combo2.addItem("Aretes");
combo2.addItem("Collar");
combo2.addItem("Bolso");

combo2.setEditable(true);
combo2.setSelectedItem("Tipo");
combo2.setEditable(false);

etiqueta3 = new JLabel("Marca: ");
etiqueta3.setBounds(10, 50, 150, 20);
add(etiqueta3);

combo3 = new JComboBox <String> ();
combo3.setBounds(170, 50, 150, 20);
add(combo3);

combo3.addItem("Nike");
combo3.addItem("Puma");
combo3.addItem("Adidas");
combo3.addItem("Shein");
combo3.addItem("Calvin Klein");
combo3.addItem("Náutica");
combo3.addItem("Fruit of the Loom");
combo3.addItem("Victoria's Secret");
combo3.addItem("Intimissima");
combo3.addItem("Antifashion");
combo3.addItem("Todo Moda");
combo3.addItem("Hugo Boss");
combo3.addItem("That's it");
combo3.addItem("American Eagle");
combo3.addItem("Lacoste");
combo3.addItem("LEVI's");
combo3.addItem("Flexie");

combo3.setEditable(true);
combo3.setSelectedItem("Marcas");
combo3.setEditable(false);

etiqueta4 = new JLabel("Departamento: ");
etiqueta4.setBounds(10, 70, 150, 20);
add(etiqueta4);

combo4 = new JComboBox <String> ();
combo4.setBounds(170, 70, 150, 20);
add(combo4);

combo4.addItem("Chicos");
combo4.addItem("Chicas");

combo4.setEditable(true);
combo4.setSelectedItem("Departamento");
combo4.setEditable(false);

etiqueta5 = new JLabel("Color: ");
etiqueta5.setBounds(10, 90, 150, 20);
add(etiqueta5);

combo5 = new JComboBox <String> ();
combo5.setBounds(170, 90, 150, 20);
add(combo5);

combo5.addItem("Rojo");
combo5.addItem("Naranja");
combo5.addItem("Amarillo");
combo5.addItem("Verde");
combo5.addItem("Azul");
combo5.addItem("Morado");
combo5.addItem("Rosa");
combo5.addItem("Blanco");
combo5.addItem("Negro");
combo5.addItem("Gris");
combo5.addItem("Café");

combo5.setEditable(true);
combo5.setSelectedItem("Color");
combo5.setEditable(false);

etiqueta6 = new JLabel("Precio de Venta: ");
etiqueta6.setBounds(10, 110, 150, 20);
add(etiqueta6);

campoTexto1 = new JTextField();
campoTexto1.setBounds(170, 110, 150, 20);
add(campoTexto1);

etiqueta7 = new JLabel("Talla: ");
etiqueta7.setBounds(10, 130, 150, 20);
add(etiqueta7);

campoTexto2 = new JTextField();
campoTexto2.setBounds(170, 130, 150, 20);
add(campoTexto2);

etiqueta8 = new JLabel("Material: ");
etiqueta8.setBounds(10, 150, 150, 20);
add(etiqueta8);

campoTexto3 = new JTextField();
campoTexto3.setBounds(170, 150, 150, 20);
add(campoTexto3);

etiqueta9 = new JLabel("Precio de Compra: ");
etiqueta9.setBounds(10, 170, 150, 20);
add(etiqueta9);

campoTexto4 = new JTextField();
campoTexto4.setBounds(170, 170, 150, 20);
add(campoTexto4);

etiqueta10 = new JLabel("Descripciones Adicionales");
etiqueta10.setBounds(10, 190, 250, 20);
add(etiqueta10);

areaTexto = new JTextArea();
areaTexto.setBounds(10, 210, 250, 200);
add(areaTexto);

boton = new JButton("Finalizar");
boton.setBounds(50, 420, 100, 20);
add(boton);

boton.addActionListener(this);
combo1.addItemListener(this);
combo2.addItemListener(this);
combo3.addItemListener(this);
combo4.addItemListener(this);
combo5.addItemListener(this);
boton.addKeyListener(this);
ayuda.addMouseListener(this);

}

public void actionPerformed(ActionEvent e){

if(e.getSource() == boton){

int msj = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea dar de alta esta información?");

if(msj == JOptionPane.YES_OPTION){

eleccion = etiqueta1.getText() + Seleccion1 + "\n" + etiqueta2.getText()  + Seleccion2 + "\n" + etiqueta3.getText()  + Seleccion3 + "\n" + etiqueta4.getText() + Seleccion4 + "\n" + etiqueta5.getText() + Seleccion5 + "\n" + etiqueta6.getText() + campoTexto1.getText() + "\n" + etiqueta7.getText() + campoTexto2.getText() + "\n" + etiqueta8.getText() + campoTexto3.getText() + "\n" + etiqueta9.getText() + campoTexto4.getText() + "\n" + etiqueta10.getText() + areaTexto.getText() + "\n" + "--------------------------" + "\n";

if(Seleccion1.equals("100")){

x = 0;

}

if(Seleccion1.equals("101")){

x = 1;

}

if(Seleccion1.equals("102")){

x = 2;

}

if(Seleccion1.equals("103")){

x = 3;

}

if(Seleccion1.equals("104")){

x = 4;

}

if(Seleccion1.equals("105")){

x = 5;

}

if(Seleccion1.equals("106")){

x = 6;

}

if(Seleccion1.equals("107")){

x = 7;

}

if(Seleccion1.equals("108")){

x = 8;

}

if(Seleccion1.equals("109")){

x = 9;

}

if(Seleccion1.equals("110")){

x = 10;

}

if(Seleccion1.equals("111")){

x = 11;

}

if(Seleccion1.equals("112")){

x = 12;

}

if(Seleccion1.equals("113")){

x = 13;

}

if(Seleccion1.equals("114")){

x = 14;

}

if(Seleccion1.equals("115")){

x = 15;

}

if(Seleccion1.equals("116")){

x = 16;

}

if(Seleccion1.equals("117")){

x = 17;

}

if(Seleccion1.equals("118")){

x = 18;

}

if(Seleccion1.equals("119")){

x = 19;

}

if(Seleccion1.equals("120")){

x = 20;

}

if(Seleccion1.equals("121")){

x = 21;

}

if(Seleccion1.equals("122")){

x = 22;

}

if(Seleccion1.equals("123")){

x = 23;

}

if(Seleccion1.equals("124")){

x = 24;

}

if(Seleccion1.equals("125")){

x = 25;

}

if(Seleccion1.equals("126")){

x = 26;

}

if(Seleccion1.equals("127")){

x = 27;

}

if(Seleccion1.equals("128")){

x = 28;

}

if(Seleccion1.equals("129")){

x = 29;

}

if(Seleccion1.equals("130")){

x = 30;

}

if(Seleccion1.equals("131")){

x = 31;

}

if(Seleccion1.equals("132")){

x = 32;

}

if(Seleccion1.equals("133")){

x = 33;

}

if(Seleccion1.equals("134")){

x = 34;

}

if(Seleccion1.equals("135")){

x = 35;

}

if(Seleccion1.equals("136")){

x = 36;

}

if(Seleccion1.equals("137")){

x = 37;

}

if(Seleccion1.equals("138")){

x = 38;

}

if(Seleccion1.equals("139")){

x = 39;

}

if(Seleccion1.equals("140")){

x = 40;

}

if(Seleccion1.equals("141")){

x = 41;

}

if(Seleccion1.equals("142")){

x = 42;

}

if(Seleccion1.equals("143")){

x = 43;

}

if(Seleccion1.equals("144")){

x = 44;

}

if(Seleccion1.equals("145")){

x = 45;

}

if(Seleccion1.equals("146")){

x = 46;

}

if(Seleccion1.equals("147")){

x = 47;

}

if(Seleccion1.equals("148")){

x = 48;

}

if(Seleccion1.equals("149")){

x = 49;

}

if(Seleccion1.equals("150")){

x = 50;

}

if(Seleccion1.equals("151")){

x = 51;

}

if(Seleccion1.equals("152")){

x = 52;

}

if(Seleccion1.equals("153")){

x = 53;

}

if(Seleccion1.equals("154")){

x = 54;

}

if(Seleccion1.equals("155")){

x = 55;

}

if(Seleccion1.equals("156")){

x = 56;

}

if(Seleccion1.equals("157")){

x = 57;

}

if(Seleccion1.equals("158")){

x = 58;

}

if(Seleccion1.equals("159")){

x = 59;

}

if(Seleccion1.equals("160")){

x = 60;

}

if(Seleccion1.equals("161")){

x = 61;

}

if(Seleccion1.equals("162")){

x = 62;

}

if(Seleccion1.equals("163")){

x = 63;

}

if(Seleccion1.equals("164")){

x = 64;

}

if(Seleccion1.equals("165")){

x = 65;

}

if(Seleccion1.equals("166")){

x = 66;

}

if(Seleccion1.equals("167")){

x = 67;

}

if(Seleccion1.equals("168")){

x = 68;

}

if(Seleccion1.equals("169")){

x = 69;

}

if(Seleccion1.equals("170")){

x = 70;

}

if(Seleccion1.equals("171")){

x = 71;

}

if(Seleccion1.equals("172")){

x = 72;

}

if(Seleccion1.equals("173")){

x = 73;

}

if(Seleccion1.equals("174")){

x = 74;

}

if(Seleccion1.equals("175")){

x = 75;

}

if(Seleccion1.equals("176")){

x = 76;

}

if(Seleccion1.equals("177")){

x = 77;

}

if(Seleccion1.equals("178")){

x = 78;

}

if(Seleccion1.equals("729")){

x = 79;

}

if(Seleccion1.equals("180")){

x = 80;

}

if(Seleccion1.equals("181")){

x = 81;

}

if(Seleccion1.equals("182")){

x = 82;

}

if(Seleccion1.equals("183")){

x = 83;

}

if(Seleccion1.equals("184")){

x = 84;

}

if(Seleccion1.equals("185")){

x = 85;

}

if(Seleccion1.equals("186")){

x = 86;

}

if(Seleccion1.equals("187")){

x = 87;

}

if(Seleccion1.equals("188")){

x = 88;

}

if(Seleccion1.equals("189")){

x = 89;

}

if(Seleccion1.equals("190")){

x = 90;

}

if(Seleccion1.equals("191")){

x = 91;

}

if(Seleccion1.equals("192")){

x = 92;

}

if(Seleccion1.equals("193")){

x = 93;

}

if(Seleccion1.equals("194")){

x = 94;

}

if(Seleccion1.equals("195")){

x = 95;

}

if(Seleccion1.equals("196")){

x = 96;

}

if(Seleccion1.equals("197")){

x = 97;

}

if(Seleccion1.equals("198")){

x = 98;

}

if(Seleccion1.equals("199")){

x = 99;

}

if(Seleccion1.equals("200")){

x = 100;

}

if(Seleccion1.equals("201")){

x = 101;

}

if(Seleccion1.equals("202")){

x = 102;

}

if(Seleccion1.equals("203")){

x = 103;

}

if(Seleccion1.equals("204")){

x = 104;

}

if(Seleccion1.equals("205")){

x = 105;

}

if(Seleccion1.equals("206")){

x = 106;

}

if(Seleccion1.equals("207")){

x = 107;

}

if(Seleccion1.equals("208")){

x = 108;

}

if(Seleccion1.equals("209")){

x = 109;

}

if(Seleccion1.equals("210")){

x = 110;

}

if(Seleccion1.equals("211")){

x = 111;

}

if(Seleccion1.equals("212")){

x = 112;

}

if(Seleccion1.equals("213")){

x = 113;

}

if(Seleccion1.equals("214")){

x = 114;

}

if(Seleccion1.equals("215")){

x = 115;

}

if(Seleccion1.equals("216")){

x = 116;

}

if(Seleccion1.equals("217")){

x = 117;

}

if(Seleccion1.equals("218")){

x = 118;

}

if(Seleccion1.equals("219")){

x = 119;

}

if(Seleccion1.equals("220")){

x = 120;

}

if(Seleccion1.equals("221")){

x = 121;

}

if(Seleccion1.equals("222")){

x = 122;

}

if(Seleccion1.equals("223")){

x = 123;

}

if(Seleccion1.equals("224")){

x = 124;

}

if(Seleccion1.equals("225")){

x = 125;

}

if(Seleccion1.equals("226")){

x = 126;

}

if(Seleccion1.equals("227")){

x = 127;

}

if(Seleccion1.equals("228")){

x = 128;

}

if(Seleccion1.equals("229")){

x = 129;

}

if(Seleccion1.equals("230")){

x = 130;

}

if(Seleccion1.equals("231")){

x = 131;

}

if(Seleccion1.equals("232")){

x = 132;

}

if(Seleccion1.equals("233")){

x = 133;

}

if(Seleccion1.equals("234")){

x = 134;

}

if(Seleccion1.equals("235")){

x = 135;

}

if(Seleccion1.equals("236")){

x = 136;

}

if(Seleccion1.equals("237")){

x = 137;

}

if(Seleccion1.equals("238")){

x = 138;

}

if(Seleccion1.equals("239")){

x = 139;

}

if(Seleccion1.equals("240")){

x = 140;

}

if(Seleccion1.equals("241")){

x = 141;

}

if(Seleccion1.equals("242")){

x = 142;

}

if(Seleccion1.equals("243")){

x = 143;

}

if(Seleccion1.equals("244")){

x = 144;

}

if(Seleccion1.equals("245")){

x = 145;

}

if(Seleccion1.equals("246")){

x = 146;

}

if(Seleccion1.equals("247")){

x = 147;

}

if(Seleccion1.equals("248")){

x = 148;

}

if(Seleccion1.equals("249")){

x = 149;

}

if(Seleccion1.equals("250")){

x = 150;

}

if(Seleccion1.equals("251")){

x = 151;

}

if(Seleccion1.equals("252")){

x = 152;

}

if(Seleccion1.equals("253")){

x = 153;

}

if(Seleccion1.equals("254")){

x = 154;

}

if(Seleccion1.equals("255")){

x = 155;

}

if(Seleccion1.equals("256")){

x = 156;

}

if(Seleccion1.equals("257")){

x = 157;

}

if(Seleccion1.equals("258")){

x = 158;

}

if(Seleccion1.equals("259")){

x = 159;

}

if(Seleccion1.equals("260")){

x = 160;

}

if(Seleccion1.equals("261")){

x = 161;

}

if(Seleccion1.equals("262")){

x = 162;

}

if(Seleccion1.equals("263")){

x = 163;

}

if(Seleccion1.equals("264")){

x = 164;

}

if(Seleccion1.equals("265")){

x = 165;

}

if(Seleccion1.equals("266")){

x = 166;

}

if(Seleccion1.equals("267")){

x = 167;

}

if(Seleccion1.equals("268")){

x = 168;

}

if(Seleccion1.equals("269")){

x = 169;

}

if(Seleccion1.equals("270")){

x = 170;

}

if(Seleccion1.equals("271")){

x = 171;

}

if(Seleccion1.equals("272")){

x = 172;

}

if(Seleccion1.equals("273")){

x = 173;

}

if(Seleccion1.equals("274")){

x = 174;

}

if(Seleccion1.equals("275")){

x = 175;

}

if(Seleccion1.equals("276")){

x = 176;

}

if(Seleccion1.equals("277")){

x = 177;

}

if(Seleccion1.equals("278")){

x = 178;

}

if(Seleccion1.equals("279")){

x = 179;

}

if(Seleccion1.equals("280")){

x = 180;

}

if(Seleccion1.equals("281")){

x = 181;

}

if(Seleccion1.equals("282")){

x = 182;

}

if(Seleccion1.equals("283")){

x = 183;

}

if(Seleccion1.equals("284")){

x = 184;

}

if(Seleccion1.equals("285")){

x = 185;

}

if(Seleccion1.equals("286")){

x = 186;

}

if(Seleccion1.equals("287")){

x = 187;

}

if(Seleccion1.equals("288")){

x = 188;

}

if(Seleccion1.equals("289")){

x = 189;

}

if(Seleccion1.equals("290")){

x = 190;

}

if(Seleccion1.equals("291")){

x = 191;

}

if(Seleccion1.equals("292")){

x = 192;

}

if(Seleccion1.equals("293")){

x = 193;

}

if(Seleccion1.equals("294")){

x = 194;

}

if(Seleccion1.equals("295")){

x = 195;

}

if(Seleccion1.equals("296")){

x = 196;

}

if(Seleccion1.equals("297")){

x = 197;

}

if(Seleccion1.equals("298")){

x = 198;

}

if(Seleccion1.equals("299")){

x = 199;

}

if(Seleccion1.equals("300")){

x = 200;

}

if(almacenamiento){

int msj2 = JOptionPane.showConfirmDialog(null, "El producto ya fue dado de alta. ¿Deseas darlo de baja?");

if(msj2 == JOptionPane.YES_OPTION){

eleccion = " ";
BaseDatos[x] = eleccion;
almacenamiento = false;

}

}

else{

BaseDatos[x] = eleccion;
almacenamiento = true;

}

}

}

}

public void itemStateChanged(ItemEvent e){

Seleccion1 = combo1.getSelectedItem().toString();
Seleccion2 = combo2.getSelectedItem().toString();
Seleccion3 = combo3.getSelectedItem().toString();
Seleccion4 = combo4.getSelectedItem().toString();
Seleccion5 = combo5.getSelectedItem().toString();

}

public void keyPressed(KeyEvent e){}

public void keyReleased(KeyEvent e){

if(e.getSource() == boton){

if(e.getKeyCode() == 10){

int msj = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea dar de alta esta información?");

if(msj == JOptionPane.YES_OPTION){

eleccion = etiqueta1.getText() + Seleccion1 + "\n" + etiqueta2.getText()  + Seleccion2 + "\n" + etiqueta3.getText()  + Seleccion3 + "\n" + etiqueta4.getText() + Seleccion4 + "\n" + etiqueta5.getText() + Seleccion5 + "\n" + etiqueta6.getText() + campoTexto1.getText() + "\n" + etiqueta7.getText() + campoTexto2.getText() + "\n" + etiqueta8.getText() + campoTexto3.getText() + "\n" + etiqueta9.getText() + campoTexto4.getText() + "\n" + etiqueta10.getText() + areaTexto.getText() + "\n" + "--------------------------" + "\n";

if(Seleccion1.equals("100")){

x = 0;

}

if(Seleccion1.equals("101")){

x = 1;

}

if(Seleccion1.equals("102")){

x = 2;

}

if(Seleccion1.equals("103")){

x = 3;

}

if(Seleccion1.equals("104")){

x = 4;

}

if(Seleccion1.equals("105")){

x = 5;

}

if(Seleccion1.equals("106")){

x = 6;

}

if(Seleccion1.equals("107")){

x = 7;

}

if(Seleccion1.equals("108")){

x = 8;

}

if(Seleccion1.equals("109")){

x = 9;

}

if(Seleccion1.equals("110")){

x = 10;

}

if(Seleccion1.equals("111")){

x = 11;

}

if(Seleccion1.equals("112")){

x = 12;

}

if(Seleccion1.equals("113")){

x = 13;

}

if(Seleccion1.equals("114")){

x = 14;

}

if(Seleccion1.equals("115")){

x = 15;

}

if(Seleccion1.equals("116")){

x = 16;

}

if(Seleccion1.equals("117")){

x = 17;

}

if(Seleccion1.equals("118")){

x = 18;

}

if(Seleccion1.equals("119")){

x = 19;

}

if(Seleccion1.equals("120")){

x = 20;

}

if(Seleccion1.equals("121")){

x = 21;

}

if(Seleccion1.equals("122")){

x = 22;

}

if(Seleccion1.equals("123")){

x = 23;

}

if(Seleccion1.equals("124")){

x = 24;

}

if(Seleccion1.equals("125")){

x = 25;

}

if(Seleccion1.equals("126")){

x = 26;

}

if(Seleccion1.equals("127")){

x = 27;

}

if(Seleccion1.equals("128")){

x = 28;

}

if(Seleccion1.equals("129")){

x = 29;

}

if(Seleccion1.equals("130")){

x = 30;

}

if(Seleccion1.equals("131")){

x = 31;

}

if(Seleccion1.equals("132")){

x = 32;

}

if(Seleccion1.equals("133")){

x = 33;

}

if(Seleccion1.equals("134")){

x = 34;

}

if(Seleccion1.equals("135")){

x = 35;

}

if(Seleccion1.equals("136")){

x = 36;

}

if(Seleccion1.equals("137")){

x = 37;

}

if(Seleccion1.equals("138")){

x = 38;

}

if(Seleccion1.equals("139")){

x = 39;

}

if(Seleccion1.equals("140")){

x = 40;

}

if(Seleccion1.equals("141")){

x = 41;

}

if(Seleccion1.equals("142")){

x = 42;

}

if(Seleccion1.equals("143")){

x = 43;

}

if(Seleccion1.equals("144")){

x = 44;

}

if(Seleccion1.equals("145")){

x = 45;

}

if(Seleccion1.equals("146")){

x = 46;

}

if(Seleccion1.equals("147")){

x = 47;

}

if(Seleccion1.equals("148")){

x = 48;

}

if(Seleccion1.equals("149")){

x = 49;

}

if(Seleccion1.equals("150")){

x = 50;

}

if(Seleccion1.equals("151")){

x = 51;

}

if(Seleccion1.equals("152")){

x = 52;

}

if(Seleccion1.equals("153")){

x = 53;

}

if(Seleccion1.equals("154")){

x = 54;

}

if(Seleccion1.equals("155")){

x = 55;

}

if(Seleccion1.equals("156")){

x = 56;

}

if(Seleccion1.equals("157")){

x = 57;

}

if(Seleccion1.equals("158")){

x = 58;

}

if(Seleccion1.equals("159")){

x = 59;

}

if(Seleccion1.equals("160")){

x = 60;

}

if(Seleccion1.equals("161")){

x = 61;

}

if(Seleccion1.equals("162")){

x = 62;

}

if(Seleccion1.equals("163")){

x = 63;

}

if(Seleccion1.equals("164")){

x = 64;

}

if(Seleccion1.equals("165")){

x = 65;

}

if(Seleccion1.equals("166")){

x = 66;

}

if(Seleccion1.equals("167")){

x = 67;

}

if(Seleccion1.equals("168")){

x = 68;

}

if(Seleccion1.equals("169")){

x = 69;

}

if(Seleccion1.equals("170")){

x = 70;

}

if(Seleccion1.equals("171")){

x = 71;

}

if(Seleccion1.equals("172")){

x = 72;

}

if(Seleccion1.equals("173")){

x = 73;

}

if(Seleccion1.equals("174")){

x = 74;

}

if(Seleccion1.equals("175")){

x = 75;

}

if(Seleccion1.equals("176")){

x = 76;

}

if(Seleccion1.equals("177")){

x = 77;

}

if(Seleccion1.equals("178")){

x = 78;

}

if(Seleccion1.equals("729")){

x = 79;

}

if(Seleccion1.equals("180")){

x = 80;

}

if(Seleccion1.equals("181")){

x = 81;

}

if(Seleccion1.equals("182")){

x = 82;

}

if(Seleccion1.equals("183")){

x = 83;

}

if(Seleccion1.equals("184")){

x = 84;

}

if(Seleccion1.equals("185")){

x = 85;

}

if(Seleccion1.equals("186")){

x = 86;

}

if(Seleccion1.equals("187")){

x = 87;

}

if(Seleccion1.equals("188")){

x = 88;

}

if(Seleccion1.equals("189")){

x = 89;

}

if(Seleccion1.equals("190")){

x = 90;

}

if(Seleccion1.equals("191")){

x = 91;

}

if(Seleccion1.equals("192")){

x = 92;

}

if(Seleccion1.equals("193")){

x = 93;

}

if(Seleccion1.equals("194")){

x = 94;

}

if(Seleccion1.equals("195")){

x = 95;

}

if(Seleccion1.equals("196")){

x = 96;

}

if(Seleccion1.equals("197")){

x = 97;

}

if(Seleccion1.equals("198")){

x = 98;

}

if(Seleccion1.equals("199")){

x = 99;

}

if(Seleccion1.equals("200")){

x = 100;

}

if(Seleccion1.equals("201")){

x = 101;

}

if(Seleccion1.equals("202")){

x = 102;

}

if(Seleccion1.equals("203")){

x = 103;

}

if(Seleccion1.equals("204")){

x = 104;

}

if(Seleccion1.equals("205")){

x = 105;

}

if(Seleccion1.equals("206")){

x = 106;

}

if(Seleccion1.equals("207")){

x = 107;

}

if(Seleccion1.equals("208")){

x = 108;

}

if(Seleccion1.equals("209")){

x = 109;

}

if(Seleccion1.equals("210")){

x = 110;

}

if(Seleccion1.equals("211")){

x = 111;

}

if(Seleccion1.equals("212")){

x = 112;

}

if(Seleccion1.equals("213")){

x = 113;

}

if(Seleccion1.equals("214")){

x = 114;

}

if(Seleccion1.equals("215")){

x = 115;

}

if(Seleccion1.equals("216")){

x = 116;

}

if(Seleccion1.equals("217")){

x = 117;

}

if(Seleccion1.equals("218")){

x = 118;

}

if(Seleccion1.equals("219")){

x = 119;

}

if(Seleccion1.equals("220")){

x = 120;

}

if(Seleccion1.equals("221")){

x = 121;

}

if(Seleccion1.equals("222")){

x = 122;

}

if(Seleccion1.equals("223")){

x = 123;

}

if(Seleccion1.equals("224")){

x = 124;

}

if(Seleccion1.equals("225")){

x = 125;

}

if(Seleccion1.equals("226")){

x = 126;

}

if(Seleccion1.equals("227")){

x = 127;

}

if(Seleccion1.equals("228")){

x = 128;

}

if(Seleccion1.equals("229")){

x = 129;

}

if(Seleccion1.equals("230")){

x = 130;

}

if(Seleccion1.equals("231")){

x = 131;

}

if(Seleccion1.equals("232")){

x = 132;

}

if(Seleccion1.equals("233")){

x = 133;

}

if(Seleccion1.equals("234")){

x = 134;

}

if(Seleccion1.equals("235")){

x = 135;

}

if(Seleccion1.equals("236")){

x = 136;

}

if(Seleccion1.equals("237")){

x = 137;

}

if(Seleccion1.equals("238")){

x = 138;

}

if(Seleccion1.equals("239")){

x = 139;

}

if(Seleccion1.equals("240")){

x = 140;

}

if(Seleccion1.equals("241")){

x = 141;

}

if(Seleccion1.equals("242")){

x = 142;

}

if(Seleccion1.equals("243")){

x = 143;

}

if(Seleccion1.equals("244")){

x = 144;

}

if(Seleccion1.equals("245")){

x = 145;

}

if(Seleccion1.equals("246")){

x = 146;

}

if(Seleccion1.equals("247")){

x = 147;

}

if(Seleccion1.equals("248")){

x = 148;

}

if(Seleccion1.equals("249")){

x = 149;

}

if(Seleccion1.equals("250")){

x = 150;

}

if(Seleccion1.equals("251")){

x = 151;

}

if(Seleccion1.equals("252")){

x = 152;

}

if(Seleccion1.equals("253")){

x = 153;

}

if(Seleccion1.equals("254")){

x = 154;

}

if(Seleccion1.equals("255")){

x = 155;

}

if(Seleccion1.equals("256")){

x = 156;

}

if(Seleccion1.equals("257")){

x = 157;

}

if(Seleccion1.equals("258")){

x = 158;

}

if(Seleccion1.equals("259")){

x = 159;

}

if(Seleccion1.equals("260")){

x = 160;

}

if(Seleccion1.equals("261")){

x = 161;

}

if(Seleccion1.equals("262")){

x = 162;

}

if(Seleccion1.equals("263")){

x = 163;

}

if(Seleccion1.equals("264")){

x = 164;

}

if(Seleccion1.equals("265")){

x = 165;

}

if(Seleccion1.equals("266")){

x = 166;

}

if(Seleccion1.equals("267")){

x = 167;

}

if(Seleccion1.equals("268")){

x = 168;

}

if(Seleccion1.equals("269")){

x = 169;

}

if(Seleccion1.equals("270")){

x = 170;

}

if(Seleccion1.equals("271")){

x = 171;

}

if(Seleccion1.equals("272")){

x = 172;

}

if(Seleccion1.equals("273")){

x = 173;

}

if(Seleccion1.equals("274")){

x = 174;

}

if(Seleccion1.equals("275")){

x = 175;

}

if(Seleccion1.equals("276")){

x = 176;

}

if(Seleccion1.equals("277")){

x = 177;

}

if(Seleccion1.equals("278")){

x = 178;

}

if(Seleccion1.equals("279")){

x = 179;

}

if(Seleccion1.equals("280")){

x = 180;

}

if(Seleccion1.equals("281")){

x = 181;

}

if(Seleccion1.equals("282")){

x = 182;

}

if(Seleccion1.equals("283")){

x = 183;

}

if(Seleccion1.equals("284")){

x = 184;

}

if(Seleccion1.equals("285")){

x = 185;

}

if(Seleccion1.equals("286")){

x = 186;

}

if(Seleccion1.equals("287")){

x = 187;

}

if(Seleccion1.equals("288")){

x = 188;

}

if(Seleccion1.equals("289")){

x = 189;

}

if(Seleccion1.equals("290")){

x = 190;

}

if(Seleccion1.equals("291")){

x = 191;

}

if(Seleccion1.equals("292")){

x = 192;

}

if(Seleccion1.equals("293")){

x = 193;

}

if(Seleccion1.equals("294")){

x = 194;

}

if(Seleccion1.equals("295")){

x = 195;

}

if(Seleccion1.equals("296")){

x = 196;

}

if(Seleccion1.equals("297")){

x = 197;

}

if(Seleccion1.equals("298")){

x = 198;

}

if(Seleccion1.equals("299")){

x = 199;

}

if(Seleccion1.equals("300")){

x = 200;

}

if(almacenamiento){

int msj2 = JOptionPane.showConfirmDialog(null, "El producto ya fue dado de alta. ¿Deseas darlo de baja?");

if(msj2 == JOptionPane.YES_OPTION){

eleccion = " ";
BaseDatos[x] = eleccion;
almacenamiento = false;

}

}
else{

BaseDatos[x] = eleccion;
almacenamiento = true;

}

}

}

}

}

public void keyTyped(KeyEvent e){}

public void mouseEntered(MouseEvent accion){

if(accion.getSource() == ayuda){

JOptionPane.showMessageDialog(null, "En esta ventana puedes manejar la información de los porductos que vendes");

}

}

public void mouseExited(MouseEvent accion){}

public void mousePressed(MouseEvent accion){}

public void mouseReleased(MouseEvent accion){}

public void mouseClicked(MouseEvent accion){}


public static void main(String args[]){

VentanaE productos = new VentanaE();
productos.setBounds(200, 100, 400, 500);
productos.setVisible(true);

}

}