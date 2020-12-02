import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaB extends JFrame implements ActionListener, ItemListener, ChangeListener, FocusListener, KeyListener, MouseListener{

public JPanel panel;
public JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5, etiqueta6, etiqueta7;
public JLabel etiqueta8, etiqueta9, etiqueta10, etiqueta11, etiqueta12, etiqueta13, etiqueta14;
public JLabel etiqueta15, etiqueta16, etiqueta17, etiqueta18, etiqueta19, etiqueta20, etiqueta21;
public JLabel etiqueta22, etiqueta23, etiqueta24, etiqueta25, etiqueta26, etiqueta27, etiqueta28;
public JLabel etiqueta29, etiqueta30, etiqueta31, etiqueta32, etiqueta33, ayuda;
public JTextField campoTexto1, campoTexto2, campoTexto3, campoTexto4, campoTexto5, campoTexto6, campoTexto7, campoTexto8;
public JTextField campoTexto9, campoTexto10, campoTexto11, campoTexto12, campoTexto13, campoTexto14, campoTexto15, campoTexto16;
public JComboBox <String> combo1, combo2, combo3, combo4, combo5;
public JCheckBox check1, check2, check3, check4, check5, check6, check7, check8, check9;
public JCheckBox check10, check11, check12, check13, check14, check15, check16, check17, check18;
public JRadioButton radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8;
public JRadioButton radio9, radio10, radio11, radio12, radio13, radio14, radio15, radio16;
public JRadioButton radio17, radio18, radio19, radio20, radio21, radio22, radio23, radio24;
public JRadioButton radio25, radio26, radio27, radio28, radio29, radio30, radio31, radio32;
public JRadioButton radio33, radio34, radio35, radio36, radio37;
public ButtonGroup opciones1, opciones2, opciones3, opciones4, opciones5, opciones6, opciones7, opciones8;
public JTextArea areaTexto;
public JScrollPane scroll1, scroll2;
public JButton boton;
public String cadena1, cadena2, cadena3, cadena4, cadena5, cadena6, cadena7, cadena8, cadena9, cadena10, cadena11;
public static String Seleccion1, Seleccion2, Seleccion3, Seleccion4, Seleccion5;
public static String eleccion;
public static String BaseDatos[] = new String[12];
public static int x;
public static boolean almacenamiento;
public static String lista;
public String AccionSQL;

public VentanaB(){

panel = new JPanel();
panel.setLayout(null);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
setTitle("Departamento");
setIconImage(new ImageIcon(getClass().getResource("logo.jpg")).getImage());
getContentPane().setBackground(Color.WHITE);

ayuda = new JLabel("?");
ayuda.setBounds(0, 0, 50, 20);
panel.add(ayuda);

etiqueta1 = new JLabel("No. Empleado: ");
etiqueta1.setBounds(10, 10, 150, 20);
panel.add(etiqueta1);

combo1 = new JComboBox <String> ();
combo1.setBounds(170, 10, 150, 20);
panel.add(combo1);

combo1.addItem("7726");
combo1.addItem("7727");
combo1.addItem("7728");
combo1.addItem("7729");
combo1.addItem("7730");
combo1.addItem("7731");
combo1.addItem("7732");
combo1.addItem("7733");
combo1.addItem("7734");
combo1.addItem("7735");
combo1.addItem("7736");

combo1.setEditable(true);
combo1.setSelectedItem("No. Empleado");
combo1.setEditable(false);

etiqueta2 = new JLabel("Puesto: ");
etiqueta2.setBounds(10, 30, 150, 20);
panel.add(etiqueta2);

radio1 = new JRadioButton("Almacenista");
radio1.setBounds(10, 50, 150, 20);
panel.add(radio1);

radio2 = new JRadioButton("Carga/Descarga");
radio2.setBounds(170, 50, 150, 20);
panel.add(radio2);

radio3 = new JRadioButton("Display");
radio3.setBounds(330, 50, 150, 20);
panel.add(radio3);

radio4 = new JRadioButton("Marcaje");
radio4.setBounds(490, 50, 150, 20);
panel.add(radio4);

radio5 = new JRadioButton("Jefe de Departamento");
radio5.setBounds(650, 50, 250, 20);
panel.add(radio5);

opciones1 = new ButtonGroup();
opciones1.add(radio1);
opciones1.add(radio2);
opciones1.add(radio3);
opciones1.add(radio4);
opciones1.add(radio5);

etiqueta3 = new JLabel("Tipo de Empleado: ");
etiqueta3.setBounds(10, 70, 150, 20);
panel.add(etiqueta3);

radio6 = new JRadioButton("Planta");
radio6.setBounds(10, 90, 150, 20);
panel.add(radio6);

radio7 = new JRadioButton("Contrato");
radio7.setBounds(170, 90, 150, 20);
panel.add(radio7);

opciones2 = new ButtonGroup();
opciones2.add(radio6);
opciones2.add(radio7);

etiqueta4 = new JLabel("Nombre completo: ");
etiqueta4.setBounds(10, 110, 150, 20);
panel.add(etiqueta4);

campoTexto1 = new JTextField();
campoTexto1.setBounds(170, 110, 150, 20);
panel.add(campoTexto1);

etiqueta5 = new JLabel("Edad: ");
etiqueta5.setBounds(10, 130, 150, 20);
panel.add(etiqueta5);

combo2 = new JComboBox <String> ();
combo2.setBounds(170, 130, 150, 20);
panel.add(combo2);

combo2.addItem("18");
combo2.addItem("19");
combo2.addItem("20");
combo2.addItem("21");
combo2.addItem("22");
combo2.addItem("23");
combo2.addItem("24");
combo2.addItem("25");
combo2.addItem("26");
combo2.addItem("27");
combo2.addItem("28");
combo2.addItem("29");
combo2.addItem("30");
combo2.addItem("31");
combo2.addItem("32");
combo2.addItem("33");
combo2.addItem("34");
combo2.addItem("35");
combo2.addItem("36");
combo2.addItem("37");
combo2.addItem("38");
combo2.addItem("39");
combo2.addItem("40");
combo2.addItem("41");
combo2.addItem("42");
combo2.addItem("43");
combo2.addItem("44");
combo2.addItem("45");
combo2.addItem("46");
combo2.addItem("47");
combo2.addItem("48");
combo2.addItem("49");
combo2.addItem("50");
combo2.addItem("51");
combo2.addItem("52");
combo2.addItem("53");
combo2.addItem("54");
combo2.addItem("55");

combo2.setEditable(true);
combo2.setSelectedItem("Edad");
combo2.setEditable(false);

etiqueta6 = new JLabel("Fecha de Nacimiento: ");
etiqueta6.setBounds(10, 150, 150, 20);
panel.add(etiqueta6);

combo3 = new JComboBox <String> ();
combo3.setBounds(10, 170, 150, 20);
panel.add(combo3);

combo3.addItem("1");
combo3.addItem("2");
combo3.addItem("3");
combo3.addItem("4");
combo3.addItem("5");
combo3.addItem("6");
combo3.addItem("7");
combo3.addItem("8");
combo3.addItem("9");
combo3.addItem("10");
combo3.addItem("11");
combo3.addItem("12");
combo3.addItem("13");
combo3.addItem("14");
combo3.addItem("15");
combo3.addItem("16");
combo3.addItem("17");
combo3.addItem("18");
combo3.addItem("19");
combo3.addItem("20");
combo3.addItem("21");
combo3.addItem("22");
combo3.addItem("23");
combo3.addItem("24");
combo3.addItem("25");
combo3.addItem("26");
combo3.addItem("27");
combo3.addItem("28");
combo3.addItem("29");
combo3.addItem("30");
combo3.addItem("31");

combo3.setEditable(true);
combo3.setSelectedItem("Día");
combo3.setEditable(false);

combo4 = new JComboBox <String> ();
combo4.setBounds(170, 170, 150, 20);
panel.add(combo4);

combo4.addItem("enero");
combo4.addItem("febrero");
combo4.addItem("marzo");
combo4.addItem("abril");
combo4.addItem("mayo");
combo4.addItem("junio");
combo4.addItem("julio");
combo4.addItem("agosto");
combo4.addItem("septiembre");
combo4.addItem("octubre");
combo4.addItem("noviembre");
combo4.addItem("diciembre");

combo4.setEditable(true);
combo4.setSelectedItem("Mes");
combo4.setEditable(false);

combo5 = new JComboBox <String> ();
combo5.setBounds(330, 170, 150, 20);
panel.add(combo5);

combo5.addItem("1966");
combo5.addItem("1967");
combo5.addItem("1968");
combo5.addItem("1969");
combo5.addItem("1970");
combo5.addItem("1971");
combo5.addItem("1972");
combo5.addItem("1973");
combo5.addItem("1974");
combo5.addItem("1975");
combo5.addItem("1976");
combo5.addItem("1977");
combo5.addItem("1978");
combo5.addItem("1979");
combo5.addItem("1980");
combo5.addItem("1981");
combo5.addItem("1982");
combo5.addItem("1983");
combo5.addItem("1984");
combo5.addItem("1985");
combo5.addItem("1986");
combo5.addItem("1987");
combo5.addItem("1988");
combo5.addItem("1989");
combo5.addItem("1990");
combo5.addItem("1991");
combo5.addItem("1992");
combo5.addItem("1993");
combo5.addItem("1994");
combo5.addItem("1995");
combo5.addItem("1996");
combo5.addItem("1997");
combo5.addItem("1998");
combo5.addItem("1999");
combo5.addItem("2000");
combo5.addItem("2001");
combo5.addItem("2002");

combo5.setEditable(true);
combo5.setSelectedItem("Año");
combo5.setEditable(false);

etiqueta7 = new JLabel("Sexo: ");
etiqueta7.setBounds(10, 190, 150, 20);
panel.add(etiqueta7);

radio8 = new JRadioButton("Masculino");
radio8.setBounds(170, 190, 150, 20);
panel.add(radio8);

radio9 = new JRadioButton("Femenino");
radio9.setBounds(330, 190, 150, 20);
panel.add(radio9);

opciones3 = new ButtonGroup();
opciones3.add(radio8);
opciones3.add(radio9);

etiqueta8 = new JLabel("Estado Civil: ");
etiqueta8.setBounds(10, 210, 150, 20);
panel.add(etiqueta8);

radio10 = new JRadioButton("Soltero(a)");
radio10.setBounds(10, 230, 150, 20);
panel.add(radio10);

radio11 = new JRadioButton("Casado(a)");
radio11.setBounds(170, 230, 150, 20);
panel.add(radio11);

radio12 = new JRadioButton("Divorciado(a)");
radio12.setBounds(330, 230, 150, 20);
panel.add(radio12);

radio13 = new JRadioButton("Viudo(a)");
radio13.setBounds(490, 230, 150, 20);
panel.add(radio13);

radio14 = new JRadioButton("Concubinato");
radio14.setBounds(650, 230, 150, 20);
panel.add(radio14);

radio15 = new JRadioButton("Unión Libre");
radio15.setBounds(810, 230, 150, 20);
panel.add(radio15);

opciones4 = new ButtonGroup();
opciones4.add(radio10);
opciones4.add(radio11);
opciones4.add(radio12);
opciones4.add(radio13);
opciones4.add(radio14);
opciones4.add(radio15);

etiqueta9 = new JLabel("Domicilio: ");
etiqueta9.setBounds(10, 250, 150, 20);
panel.add(etiqueta9);

etiqueta10 = new JLabel("Calle: ");
etiqueta10.setBounds(10, 270, 150, 20);
panel.add(etiqueta10);

campoTexto2 = new JTextField();
campoTexto2.setBounds(170, 270, 150, 20);
panel.add(campoTexto2);

etiqueta11 = new JLabel("No. Exterior: ");
etiqueta11.setBounds(330, 270, 150, 20);
panel.add(etiqueta11);

campoTexto3 = new JTextField();
campoTexto3.setBounds(490, 270, 75, 20);
panel.add(campoTexto3);

etiqueta12 = new JLabel("No. Interior: ");
etiqueta12.setBounds(575, 270, 150, 20);
panel.add(etiqueta12);

campoTexto4 = new JTextField();
campoTexto4.setBounds(735, 270, 75, 20);
panel.add(campoTexto4);

etiqueta13 = new JLabel("Colonia: ");
etiqueta13.setBounds(10, 290, 150, 20);
panel.add(etiqueta13);

campoTexto5 = new JTextField();
campoTexto5.setBounds(170, 290, 150, 20);
panel.add(campoTexto5);

etiqueta14 = new JLabel("Municipio: ");
etiqueta14.setBounds(330, 290, 150, 20);
panel.add(etiqueta14);

campoTexto6 = new JTextField();
campoTexto6.setBounds(490, 290, 150, 20);
panel.add(campoTexto6);

etiqueta15 = new JLabel("C.P: ");
etiqueta15.setBounds(650, 290, 75, 20);
panel.add(etiqueta15);

campoTexto7 = new JTextField();
campoTexto7.setBounds(735, 290, 75, 20);
panel.add(campoTexto7);

etiqueta16 = new JLabel("CURP: ");
etiqueta16.setBounds(10, 310, 75, 20);
panel.add(etiqueta16);

campoTexto8 = new JTextField();
campoTexto8.setBounds(95, 310, 150, 20);
panel.add(campoTexto8);

etiqueta17 = new JLabel("RFC: ");
etiqueta17.setBounds(255, 310, 75, 20);
panel.add(etiqueta17);

campoTexto9 = new JTextField();
campoTexto9.setBounds(340, 310, 150, 20);
panel.add(campoTexto9);

etiqueta18 = new JLabel("NSS (Número de Seguridad Social): ");
etiqueta18.setBounds(500, 310, 250, 20);
panel.add(etiqueta18);

campoTexto10 = new JTextField();
campoTexto10.setBounds(760, 310, 150, 20);
panel.add(campoTexto10);

etiqueta19 = new JLabel("Escolaridad: ");
etiqueta19.setBounds(10, 330, 150, 20);
panel.add(etiqueta19);

radio16 = new JRadioButton("Primaria");
radio16.setBounds(10, 350, 150, 20);
panel.add(radio16);

radio17 = new JRadioButton("Secundaria");
radio17.setBounds(170, 350, 150, 20);
panel.add(radio17);

radio18 = new JRadioButton("Bachillerato");
radio18.setBounds(330, 350, 150, 20);
panel.add(radio18);

radio19 = new JRadioButton("Licenciatura");
radio19.setBounds(490, 350, 150, 20);
panel.add(radio19);

radio20 = new JRadioButton("Técnico Superior Universitario");
radio20.setBounds(650, 350, 250, 20);
panel.add(radio20);

opciones5 = new ButtonGroup();
opciones5.add(radio16);
opciones5.add(radio17);
opciones5.add(radio18);
opciones5.add(radio19);
opciones5.add(radio20);

etiqueta20 = new JLabel("Enfermedades: ");
etiqueta20.setBounds(10, 370, 150, 20);
panel.add(etiqueta20);

check1 = new JCheckBox("Asma");
check1.setBounds(10, 390, 150, 20);
panel.add(check1);

check2 = new JCheckBox("Cáncer");
check2.setBounds(170, 390, 150, 20);
panel.add(check2);

check3 = new JCheckBox("VIH/Sida");
check3.setBounds(330, 390, 150, 20);
panel.add(check3);

check4 = new JCheckBox("Diabetes");
check4.setBounds(490, 390, 150, 20);
panel.add(check4);

check5 = new JCheckBox("Hipertensión");
check5.setBounds(650, 390, 150, 20);
panel.add(check5);

etiqueta21 = new JLabel("Discapacidades: ");
etiqueta21.setBounds(10, 410, 150, 20);
panel.add(etiqueta21);

check6 = new JCheckBox("Invidencia");
check6.setBounds(10, 430, 100, 20);
panel.add(check6);

check7 = new JCheckBox("Sordera");
check7.setBounds(120, 430, 100, 20);
panel.add(check7);

check8 = new JCheckBox("Mudez");
check8.setBounds(230, 430, 100, 20);
panel.add(check8);

check9 = new JCheckBox("Uso de Prótesis");
check9.setBounds(340, 430, 150, 20);
panel.add(check9);

check10 = new JCheckBox("Falta de Extremidad");
check10.setBounds(500, 430, 150, 20);
panel.add(check10);

check11 = new JCheckBox("Abasia");
check11.setBounds(660, 430, 100, 20);
panel.add(check11);

check12 = new JCheckBox("Intelectual");
check12.setBounds(770, 430, 150, 20);
panel.add(check12);

etiqueta22 = new JLabel("Tipo de Sangre: ");
etiqueta22.setBounds(10, 450, 150, 20);
panel.add(etiqueta22);

radio21 = new JRadioButton("A+");
radio21.setBounds(10, 470, 75, 20);
panel.add(radio21);

radio22 = new JRadioButton("A-");
radio22.setBounds(95, 470, 75, 20);
panel.add(radio22);

radio23 = new JRadioButton("B+");
radio23.setBounds(180, 470, 75, 20);
panel.add(radio23);

radio24 = new JRadioButton("B-");
radio24.setBounds(265, 470, 75, 20);
panel.add(radio24);

radio25 = new JRadioButton("AB+");
radio25.setBounds(350, 470, 75, 20);
panel.add(radio25);

radio26 = new JRadioButton("AB-");
radio26.setBounds(435, 470, 75, 20);
panel.add(radio26);

radio27 = new JRadioButton("O+");
radio27.setBounds(520, 470, 75, 20);
panel.add(radio27);

radio28 = new JRadioButton("O-");
radio28.setBounds(605, 470, 75, 20);
panel.add(radio28);

opciones6 = new ButtonGroup();
opciones6.add(radio21);
opciones6.add(radio22);
opciones6.add(radio23);
opciones6.add(radio24);
opciones6.add(radio25);
opciones6.add(radio26);
opciones6.add(radio27);
opciones6.add(radio28);

etiqueta23 = new JLabel("Teléfono de Casa: ");
etiqueta23.setBounds(10, 490, 150, 20);
panel.add(etiqueta23);

campoTexto11 = new JTextField();
campoTexto11.setBounds(170, 490, 150, 20);
panel.add(campoTexto11);

etiqueta24 = new JLabel("Teléfono Celular: ");
etiqueta24.setBounds(330, 490, 150, 20);
panel.add(etiqueta24);

campoTexto12 = new JTextField();
campoTexto12.setBounds(490, 490, 150, 20);
panel.add(campoTexto12);

etiqueta25 = new JLabel("Correo Electrónico: ");
etiqueta25.setBounds(650, 490, 150, 20);
panel.add(etiqueta25);

campoTexto13 = new JTextField();
campoTexto13.setBounds(810, 490, 150, 20);
panel.add(campoTexto13);

etiqueta26 = new JLabel("Contacto de Emergencia: ");
etiqueta26.setBounds(10, 510, 150, 20);
panel.add(etiqueta26);

etiqueta27 = new JLabel("Nombre Completo: ");
etiqueta27.setBounds(10, 530, 150, 20);
panel.add(etiqueta27);

campoTexto14 = new JTextField();
campoTexto14.setBounds(170, 530, 150, 20);
panel.add(campoTexto14);

etiqueta28 = new JLabel("Parentesco: ");
etiqueta28.setBounds(10, 550, 150, 20);
panel.add(etiqueta28);

radio29 = new JRadioButton("Esposo(a)/Pareja");
radio29.setBounds(10, 570, 150, 20);
panel.add(radio29);

radio30 = new JRadioButton("Padre/Madre");
radio30.setBounds(170, 570, 150, 20);
panel.add(radio30);

radio31 = new JRadioButton("Hijo(a)");
radio31.setBounds(330, 570, 150, 20);
panel.add(radio31);

radio32 = new JRadioButton("Hermano(a)");
radio32.setBounds(490, 570, 150, 20);
panel.add(radio32);

radio33 = new JRadioButton("Nieto(a)");
radio33.setBounds(650, 570, 150, 20);
panel.add(radio33);

radio34 = new JRadioButton("Otro");
radio34.setBounds(810, 570, 150, 20);
panel.add(radio34);

opciones7 = new ButtonGroup();
opciones7.add(radio29);
opciones7.add(radio30);
opciones7.add(radio31);
opciones7.add(radio32);
opciones7.add(radio33);
opciones7.add(radio34);

etiqueta29 = new JLabel("Teléfono de Casa: ");
etiqueta29.setBounds(10, 590, 150, 20);
panel.add(etiqueta29);

campoTexto15 = new JTextField();
campoTexto15.setBounds(170, 590, 150, 20);
panel.add(campoTexto15);

etiqueta30 = new JLabel("Teléfono Celular: ");
etiqueta30.setBounds(330, 590, 150, 20);
panel.add(etiqueta30);

campoTexto16 = new JTextField();
campoTexto16.setBounds(490, 590, 150, 20);
panel.add(campoTexto16);

etiqueta31 = new JLabel("Personas que dependen de usted: ");
etiqueta31.setBounds(10, 610, 250, 20);
panel.add(etiqueta31);

radio35 = new JRadioButton("1 a 3");
radio35.setBounds(10, 630, 75, 20);
panel.add(radio35);

radio36 = new JRadioButton("4 a 6");
radio36.setBounds(95, 630, 75, 20);
panel.add(radio36);

radio37 = new JRadioButton("7 o más");
radio37.setBounds(180, 630, 75, 20);
panel.add(radio37);

opciones8 = new ButtonGroup();
opciones8.add(radio35);
opciones8.add(radio36);
opciones8.add(radio37);

etiqueta32 = new JLabel("Especifique: ");
etiqueta32.setBounds(10, 650, 150, 20);
panel.add(etiqueta32);

check13 = new JCheckBox("Hijos");
check13.setBounds(10, 670, 150, 20);
panel.add(check13);

check14 = new JCheckBox("Esposo(a)/Pareja");
check14.setBounds(170, 670, 150, 20);
panel.add(check14);

check15 = new JCheckBox("Hermanos");
check15.setBounds(330, 670, 150, 20);
panel.add(check15);

check16 = new JCheckBox("Padres");
check16.setBounds(490, 670, 150, 20);
panel.add(check16);

check17 = new JCheckBox("Abuelos");
check17.setBounds(650, 670, 150, 20);
panel.add(check17);

check18 = new JCheckBox("Otros");
check18.setBounds(810, 670, 150, 20);
panel.add(check18);

etiqueta33 = new JLabel("Mencionelos: ");
etiqueta33.setBounds(10, 690, 150, 20);
panel.add(etiqueta33);

areaTexto = new JTextArea();
areaTexto.setBounds(10, 710, 400, 300);
panel.add(areaTexto);

boton = new JButton("Finalizar");
boton.setBounds(50, 1020, 100, 20);
panel.add(boton);

scroll1 = new JScrollPane(panel);
panel.setPreferredSize(new Dimension(1000, 1300));
scroll1.getVerticalScrollBar().setUnitIncrement(16);
add(scroll1);

scroll2 = new JScrollPane(panel);
panel.setPreferredSize(new Dimension(1000, 1300));
scroll2.getHorizontalScrollBar().setUnitIncrement(16);
add(scroll2);

boton.addActionListener(this);
combo1.addItemListener(this);
combo2.addItemListener(this);
combo3.addItemListener(this);
combo4.addItemListener(this);
combo5.addItemListener(this);
check1.addChangeListener(this);
check2.addChangeListener(this);
check3.addChangeListener(this);
check4.addChangeListener(this);
check5.addChangeListener(this);
check6.addChangeListener(this);
check7.addChangeListener(this);
check8.addChangeListener(this);
check9.addChangeListener(this);
check10.addChangeListener(this);
check11.addChangeListener(this);
check12.addChangeListener(this);
check13.addChangeListener(this);
check14.addChangeListener(this);
check15.addChangeListener(this);
check16.addChangeListener(this);
check17.addChangeListener(this);
check18.addChangeListener(this);
radio1.addChangeListener(this);
radio2.addChangeListener(this);
radio3.addChangeListener(this);
radio4.addChangeListener(this);
radio5.addChangeListener(this);
radio6.addChangeListener(this);
radio7.addChangeListener(this);
radio8.addChangeListener(this);
radio9.addChangeListener(this);
radio10.addChangeListener(this);
radio11.addChangeListener(this);
radio12.addChangeListener(this);
radio13.addChangeListener(this);
radio14.addChangeListener(this);
radio15.addChangeListener(this);
radio16.addChangeListener(this);
radio17.addChangeListener(this);
radio18.addChangeListener(this);
radio19.addChangeListener(this);
radio20.addChangeListener(this);
radio21.addChangeListener(this);
radio22.addChangeListener(this);
radio23.addChangeListener(this);
radio24.addChangeListener(this);
radio25.addChangeListener(this);
radio26.addChangeListener(this);
radio27.addChangeListener(this);
radio28.addChangeListener(this);
radio29.addChangeListener(this);
radio30.addChangeListener(this);
radio31.addChangeListener(this);
radio32.addChangeListener(this);
radio33.addChangeListener(this);
radio34.addChangeListener(this);
radio35.addChangeListener(this);
radio36.addChangeListener(this);
radio37.addChangeListener(this);
campoTexto1.addFocusListener(this);
campoTexto2.addFocusListener(this);
campoTexto3.addFocusListener(this);
campoTexto4.addFocusListener(this);
campoTexto5.addFocusListener(this);
campoTexto6.addFocusListener(this);
campoTexto7.addFocusListener(this);
campoTexto8.addFocusListener(this);
campoTexto9.addFocusListener(this);
campoTexto10.addFocusListener(this);
campoTexto11.addFocusListener(this);
campoTexto12.addFocusListener(this);
campoTexto13.addFocusListener(this);
campoTexto14.addFocusListener(this);
campoTexto15.addFocusListener(this);
campoTexto16.addFocusListener(this);
ayuda.addMouseListener(this);

}

public void actionPerformed(ActionEvent e){

if(e.getSource() == boton){

int msj = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea dar de alta esta información?");

if(msj == JOptionPane.YES_OPTION){

eleccion = etiqueta1.getText() + Seleccion1 + "\n" + etiqueta2.getText()  + cadena1 + "\n" + etiqueta3.getText()  + cadena2 + "\n" + etiqueta4.getText() + campoTexto1.getText() + "\n" + etiqueta5.getText() + Seleccion2 + "\n" + etiqueta6.getText() + Seleccion3 + " de " + Seleccion4 + " de " + Seleccion5 + "\n" + etiqueta7.getText() + cadena3 + "\n" + etiqueta8.getText() + cadena4 + "\n" + etiqueta9.getText() + "\n" + etiqueta10.getText() + campoTexto2.getText() + "\n" + etiqueta11.getText() + campoTexto3.getText() + "\n" + etiqueta12.getText() + campoTexto4.getText() + "\n" + etiqueta13.getText() + campoTexto5.getText() + "\n" + etiqueta14.getText() + campoTexto6.getText() + "\n" + etiqueta15.getText() + campoTexto7.getText() + "\n" + etiqueta16.getText() + campoTexto8.getText() + "\n" + etiqueta17.getText() + campoTexto9.getText() + "\n" + etiqueta18.getText() + campoTexto10.getText() + etiqueta19.getText() + cadena5 + "\n" + etiqueta20.getText() + cadena9 + "\n" + etiqueta21.getText() + cadena10 + "\n" + etiqueta22.getText() + cadena6 + "\n" + etiqueta23.getText() + campoTexto11.getText() + "\n" + etiqueta24.getText() + campoTexto12.getText() + "\n" + etiqueta25.getText() + campoTexto13.getText() + "\n" + etiqueta26.getText() + "\n" + etiqueta27.getText() + campoTexto14.getText() + "\n" + etiqueta28.getText() + cadena7 + "\n" + etiqueta29.getText() + campoTexto15.getText() + "\n" + etiqueta30.getText() + campoTexto16.getText() + "\n" + etiqueta31.getText() + cadena8 + "\n" + etiqueta32.getText() + cadena11 + "\n" + etiqueta33.getText() + areaTexto.getText() + "--------------------------" + "\n";

lista = campoTexto1.getText();

if(Seleccion1.equals("7726")){

x = 0;

}

if(Seleccion1.equals("7727")){

x = 1;

}

if(Seleccion1.equals("7728")){

x = 2;

}

if(Seleccion1.equals("7729")){

x = 3;

}

if(Seleccion1.equals("7730")){

x = 4;

}

if(Seleccion1.equals("7731")){

x = 5;

}

if(Seleccion1.equals("7732")){

x = 6;

}

if(Seleccion1.equals("7733")){

x = 7;

}

if(Seleccion1.equals("7734")){

x = 8;

}

if(Seleccion1.equals("7735")){

x = 9;

}

if(Seleccion1.equals("7736")){

x = 10;

}

if(Seleccion1.equals("7737")){

x = 11;

}

if(almacenamiento){

int msj2 = JOptionPane.showConfirmDialog(null, "El empleado ya fue dado de alta. ¿Deseas darlo de baja?");

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

public void stateChanged(ChangeEvent e){

if(radio1.isSelected() == true){

cadena1 = cadena1 + "Almacenista" + "\n";

}

if(radio2.isSelected() == true){

cadena1 = cadena1 + "Carga/Descarga" + "\n";

}

if(radio3.isSelected() == true){

cadena1 = cadena1 + "Display" + "\n";

}

if(radio4.isSelected() == true){

cadena1 = cadena1 + "Marcaje" + "\n";

}

if(radio5.isSelected() == true){

cadena1 = cadena1 + "Jefe de Departamento" + "\n";

}

if(radio6.isSelected() == true){

cadena2 = cadena2 + "Planta" + "\n";

}

if(radio7.isSelected() == true){

cadena2 = cadena2 + "Contrato" + "\n";

}

if(radio8.isSelected() == true){

cadena3 = cadena3 + "Masculino" + "\n";

}

if(radio9.isSelected() == true){

cadena3 = cadena3 + "Femenino" + "\n";

}

if(radio10.isSelected() == true){

cadena4 = cadena4 + "Soltero(a)" + "\n";

}

if(radio11.isSelected() == true){

cadena4 = cadena4 + "Casado(a)" + "\n";

}

if(radio12.isSelected() == true){

cadena4 = cadena4 + "Divorciado(a)" + "\n";

}

if(radio13.isSelected() == true){

cadena4 = cadena4 + "Viudo(a)" + "\n";

}

if(radio14.isSelected() == true){

cadena4 = cadena4 + "Concubinato" + "\n";

}

if(radio15.isSelected() == true){

cadena4 = cadena4 + "Unión Libre" + "\n";

}

if(radio16.isSelected() == true){

cadena5 = cadena5 + "Primaria" + "\n";

}

if(radio17.isSelected() == true){

cadena5 = cadena5 + "Secundaria" + "\n";

}

if(radio18.isSelected() == true){

cadena5 = cadena5 + "Bachillerato" + "\n";

}

if(radio19.isSelected() == true){

cadena5 = cadena5 + "Licenciatura" + "\n";

}

if(radio20.isSelected() == true){

cadena5 = cadena5 + "Técnico Superior Universitario" + "\n";

}

if(radio21.isSelected() == true){

cadena6 = cadena6 + "A+" + "\n";

}

if(radio22.isSelected() == true){

cadena6 = cadena6 + "A-" + "\n";

}

if(radio23.isSelected() == true){

cadena6 = cadena6 + "B+" + "\n";

}

if(radio24.isSelected() == true){

cadena6 = cadena6 + "B-" + "\n";

}

if(radio25.isSelected() == true){

cadena6 = cadena6 + "AB+" + "\n";

}

if(radio26.isSelected() == true){

cadena6 = cadena6 + "AB-" + "\n";

}

if(radio27.isSelected() == true){

cadena6 = cadena6 + "O+" + "\n";

}

if(radio28.isSelected() == true){

cadena6 = cadena6 + "O-" + "\n";

}

if(radio29.isSelected() == true){

cadena7 = cadena7 + "Esposo(a)/Pareja" + "\n";

}

if(radio30.isSelected() == true){

cadena7 = cadena7 + "Padre/Madre" + "\n";

}

if(radio31.isSelected() == true){

cadena7 = cadena7 + "Hijo(a)" + "\n";

}

if(radio32.isSelected() == true){

cadena7 = cadena7 + "Hermano(a)" + "\n";

}

if(radio33.isSelected() == true){

cadena7 = cadena7 + "Nieto(a)" + "\n";

}

if(radio34.isSelected() == true){

cadena7 = cadena7 + "Otro" + "\n";

}

if(radio35.isSelected() == true){

cadena8 = cadena8 + "1 a 3" + "\n";

}

if(radio36.isSelected() == true){

cadena8 = cadena8 + "4 a 6" + "\n";

}

if(radio37.isSelected() == true){

cadena8 = cadena8 + "7 o más" + "\n";

}

if(check1.isSelected() == true){

cadena9 = cadena9 + "Asma" + "\n";

}

if(check2.isSelected() == true){

cadena9 = cadena9 + "Cáncer" + "\n";

}

if(check3.isSelected() == true){

cadena9 = cadena9 + "VIH/Sida" + "\n";

}

if(check4.isSelected() == true){

cadena9 = cadena9 + "Diabetes" + "\n";

}

if(check5.isSelected() == true){

cadena9 = cadena9 + "Hipertensión" + "\n";

}

if(check6.isSelected() == true){

cadena10 = cadena10 + "Invidencia" + "\n";

}

if(check7.isSelected() == true){

cadena10 = cadena10 + "Sordera" + "\n";

}

if(check8.isSelected() == true){

cadena10 = cadena10 + "Mudez" + "\n";

}

if(check9.isSelected() == true){

cadena10 = cadena10 + "Uso de Prótesis" + "\n";

}

if(check10.isSelected() == true){

cadena10 = cadena10 + "Falta de Extremidad" + "\n";

}

if(check11.isSelected() == true){

cadena10 = cadena10 + "Abasia" + "\n";

}

if(check12.isSelected() == true){

cadena10 = cadena10 + "Intelectual" + "\n";

}

if(check13.isSelected() == true){

cadena11 = cadena11 + "Hijos" + "\n";

}

if(check14.isSelected() == true){

cadena11 = cadena11 + "Esposo(a)/Pareja" + "\n";

}

if(check15.isSelected() == true){

cadena11 = cadena11 + "Hermanos" + "\n";

}

if(check16.isSelected() == true){

cadena11 = cadena11 + "Padres" + "\n";

}

if(check17.isSelected() == true){

cadena11 = cadena11 + "Abuelos" + "\n";

}

if(check18.isSelected() == true){

cadena11 = cadena11 + "Otros" + "\n";

}

}

public void itemStateChanged(ItemEvent accion){

Seleccion1 = combo1.getSelectedItem().toString();
Seleccion2 = combo2.getSelectedItem().toString();
Seleccion3 = combo3.getSelectedItem().toString();
Seleccion4 = combo4.getSelectedItem().toString();
Seleccion5 = combo5.getSelectedItem().toString();

}

public void focusGained(FocusEvent e){}

public void focusLost(FocusEvent e){

if(e.getSource() == campoTexto1){

if(campoTexto1.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

if(e.getSource() == campoTexto2){

if(campoTexto2.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

if(e.getSource() == campoTexto3){

if(campoTexto3.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

if(e.getSource() == campoTexto4){

if(campoTexto4.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

if(e.getSource() == campoTexto5){

if(campoTexto5.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

if(e.getSource() == campoTexto6){

if(campoTexto6.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

if(e.getSource() == campoTexto7){

if(campoTexto7.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

if(e.getSource() == campoTexto8){

if(campoTexto8.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

if(e.getSource() == campoTexto9){

if(campoTexto9.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

if(e.getSource() == campoTexto10){

if(campoTexto10.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

if(e.getSource() == campoTexto11){

if(campoTexto11.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

if(e.getSource() == campoTexto12){

if(campoTexto12.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

if(e.getSource() == campoTexto13){

if(campoTexto13.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

if(e.getSource() == campoTexto14){

if(campoTexto14.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

if(e.getSource() == campoTexto15){

if(campoTexto15.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

if(e.getSource() == campoTexto16){

if(campoTexto16.getText().equals("")){

JOptionPane.showMessageDialog(null, "Debes llenar obligatoriamente la información que se te pide correctamente");

}

}

}

public void keyPressed(KeyEvent e){}

public void keyReleased(KeyEvent e){

if(e.getSource() == boton){

if(e.getKeyCode() == 10){

int msj = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea dar de alta esta información?");

if(msj == JOptionPane.YES_OPTION){

eleccion = etiqueta1.getText() + Seleccion1 + "\n" + etiqueta2.getText()  + cadena1 + "\n" + etiqueta3.getText()  + cadena2 + "\n" + etiqueta4.getText() + campoTexto1.getText() + "\n" + etiqueta5.getText() + Seleccion2 + "\n" + etiqueta6.getText() + Seleccion3 + " de " + Seleccion4 + " de " + Seleccion5 + "\n" + etiqueta7.getText() + cadena3 + "\n" + etiqueta8.getText() + cadena4 + "\n" + etiqueta9.getText() + "\n" + etiqueta10.getText() + campoTexto2.getText() + "\n" + etiqueta11.getText() + campoTexto3.getText() + "\n" + etiqueta12.getText() + campoTexto4.getText() + "\n" + etiqueta13.getText() + campoTexto5.getText() + "\n" + etiqueta14.getText() + campoTexto6.getText() + "\n" + etiqueta15.getText() + campoTexto7.getText() + "\n" + etiqueta16.getText() + campoTexto8.getText() + "\n" + etiqueta17.getText() + campoTexto9.getText() + "\n" + etiqueta18.getText() + campoTexto10.getText() + etiqueta19.getText() + cadena5 + "\n" + etiqueta20.getText() + cadena9 + "\n" + etiqueta21.getText() + cadena10 + "\n" + etiqueta22.getText() + cadena6 + "\n" + etiqueta23.getText() + campoTexto11.getText() + "\n" + etiqueta24.getText() + campoTexto12.getText() + "\n" + etiqueta25.getText() + campoTexto13.getText() + "\n" + etiqueta26.getText() + "\n" + etiqueta27.getText() + campoTexto14.getText() + "\n" + etiqueta28.getText() + cadena7 + "\n" + etiqueta29.getText() + campoTexto15.getText() + "\n" + etiqueta30.getText() + campoTexto16.getText() + "\n" + etiqueta31.getText() + cadena8 + "\n" + etiqueta32.getText() + cadena11 + "\n" + etiqueta33.getText() + areaTexto.getText() + "--------------------------" + "\n";

if(Seleccion1.equals("7726")){

x = 0;

}

if(Seleccion1.equals("7727")){

x = 1;

}

if(Seleccion1.equals("7728")){

x = 2;

}

if(Seleccion1.equals("7729")){

x = 3;

}

if(Seleccion1.equals("7730")){

x = 4;

}

if(Seleccion1.equals("7731")){

x = 5;

}

if(Seleccion1.equals("7732")){

x = 6;

}

if(Seleccion1.equals("7733")){

x = 7;

}

if(Seleccion1.equals("7734")){

x = 8;

}

if(Seleccion1.equals("7735")){

x = 9;

}

if(Seleccion1.equals("7736")){

x = 10;

}

if(Seleccion1.equals("7737")){

x = 11;

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

JOptionPane.showMessageDialog(null, "En esta ventana puedes manejar la información de tus empleados");

}

}

public void mouseExited(MouseEvent accion){}

public void mousePressed(MouseEvent accion){}

public void mouseReleased(MouseEvent accion){}

public void mouseClicked(MouseEvent accion){}

public static void main(String args[]){

VentanaB Empleados = new VentanaB();
Empleados.setBounds(200, 100, 400, 350);
Empleados.setVisible(true);

}

}