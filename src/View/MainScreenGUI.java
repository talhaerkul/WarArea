package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Helper.Helper;
import Helper.ItemHelper;
import ItemModel.Item;
import Model.Gamer;
import NoxusView.NoxusSýnýrýGUI;
import Shop.ShopGUI;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.table.TableModel;

public class MainScreenGUI extends JFrame {

	
	static Gamer gamer = new Gamer();
	static Item item = new Item();
	
	
	private JPopupMenu itemuseMenu;
	
	private JPanel contentPane;
	
	private JTable table_gamerstats;
	private DefaultTableModel tablegamerstatsModel = null;
	private Object[] tablegamerstatsData = null;
	
	private DefaultTableModel tablegamerswarModel = null;
	private Object[] tablegamerswarData = null;
	
	private DefaultTableModel tablegamerswarnaModel = null;
	private Object[] tablegamerswarnaData = null;
	
	private DefaultTableModel tablegamerstats2Model = null;
	private Object[] tablegamerstats2Data = null;

	private DefaultTableModel tablegamerstats3Model = null;
	private Object[] tablegamerstats3Data = null;

	private DefaultTableModel tablegamerstats4Model = null;
	private Object[] tablegamerstats4Data = null;
	
	private DefaultTableModel tableitemModel = null;
	private Object[] tableitemData = null;
	private Object[] tableitemData2 = null;
	private Object[] tableitemData3 = null;
	private Object[] tableitemData4 = null;
	private Object[] tableitemData5 = null;
	private Object[] tableitemData6 = null;
	private Object[] tableitemData7 = null;
	private Object[] tableitemData8 = null;
	private Object[] tableitemData9 = null;
	private Object[] tableitemData10 = null;
	private Object[] tableitemData11 = null;
	private Object[] tableitemData12 = null;
	private Object[] tableitemData13 = null;
	private Object[] tableitemData14 = null;
	private Object[] tableitemData15 = null;
	private Object[] tableitemData16 = null;
	private Object[] tableitemData17 = null;
	private Object[] tableitemData18 = null;
	private Object[] tableitemData19 = null;
	private Object[] tableitemData20 = null;
	
	
	private JTable table_army;
	private JTable table_army2;
	private JTable table_army3;
	private JTable table_gamerswar;
	private JTable table_gamerswarna;
	private JTable table_item;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreenGUI frame = new MainScreenGUI(gamer,item);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainScreenGUI(Gamer gamer,Item item) {
		setTitle("SAVA\u015E ALANI");
		setResizable(false);
		setBackground(new Color(0, 0, 0));
		
		
		tablegamerstatsModel = new DefaultTableModel();
		Object[] columngamerstatsTableHead = new Object[5];
		columngamerstatsTableHead[0] = "Karakter";
		columngamerstatsTableHead[1] = "Seviye";
		columngamerstatsTableHead[2] = "Hasar";
		columngamerstatsTableHead[3] = "Can";
		columngamerstatsTableHead[4] = "Altýn";
		
		tablegamerstatsModel.setColumnIdentifiers(columngamerstatsTableHead);
		tablegamerstatsData = new Object[5];
		tablegamerstatsData[0] = gamer.getGamerheroname();
		tablegamerstatsData[1] = gamer.getGamerlevel();
		tablegamerstatsData[2] = gamer.getGamerdamage();
		tablegamerstatsData[3] = gamer.getGamerhealth()+" / "+gamer.getGamerheal();
		tablegamerstatsData[4] = gamer.getGamergold();
		tablegamerstatsModel.addRow(tablegamerstatsData);
		
		
		tablegamerswarModel = new DefaultTableModel();
		Object[] columngamerswarTableHead = new Object[4];
		columngamerswarTableHead[0] = "Kýlýç";
		columngamerswarTableHead[1] = "Zýrh";
		columngamerswarTableHead[2] = "Pelerin";
		columngamerswarTableHead[3] = "Xp";
	
		
		tablegamerswarModel.setColumnIdentifiers(columngamerswarTableHead);
		tablegamerswarData = new Object[4];
		tablegamerswarData[0] = gamer.getGamersword();
		tablegamerswarData[1] = gamer.getGamerarmor();
		tablegamerswarData[2] = gamer.getGamerpelerinyn()+"  (+"+gamer.getGamerpelerindmg()+" Zýrh)";
		tablegamerswarData[3] = gamer.getGamerxp();
		tablegamerswarModel.addRow(tablegamerswarData);
		
		
		tablegamerswarnaModel = new DefaultTableModel();
		Object[] columngamerswarnaTableHead = new Object[2];
		columngamerswarnaTableHead[0] = "Kýlýç Adý";
		columngamerswarnaTableHead[1] = "Zýrh Adý";
		
		tablegamerswarnaModel.setColumnIdentifiers(columngamerswarnaTableHead);
		tablegamerswarnaData = new Object[2];
		tablegamerswarnaData[0] = gamer.getGamerswordname();
		tablegamerswarnaData[1] = gamer.getGamerarmorname();
		tablegamerswarnaModel.addRow(tablegamerswarnaData);
		
		
		
		tablegamerstats2Model = new DefaultTableModel();
		Object[] columngamerstats2TableHead = new Object[1];
		columngamerstats2TableHead[0] = "Ordudaki Asker Sayýsý";
		tablegamerstats2Model.setColumnIdentifiers(columngamerstats2TableHead);
		tablegamerstats2Data = new Object[1];
		tablegamerstats2Data[0] = gamer.getGamerarmy();
		tablegamerstats2Model.addRow(tablegamerstats2Data);
		
		tablegamerstats3Model = new DefaultTableModel();
		Object[] columngamerstats3TableHead = new Object[2];
		columngamerstats3TableHead[0] = "Asker Caný";
		columngamerstats3TableHead[1] = "Asker Hasarý";
		tablegamerstats3Model.setColumnIdentifiers(columngamerstats3TableHead);
		tablegamerstats3Data = new Object[2];
		tablegamerstats3Data[0] = " ";
		tablegamerstats3Data[1] = " ";
		tablegamerstats3Model.addRow(tablegamerstats3Data);
		
		tablegamerstats4Model = new DefaultTableModel();
		Object[] columngamerstats4TableHead = new Object[2];
		columngamerstats4TableHead[0] = "Asker Zýrhý";
		columngamerstats4TableHead[1] = "Asker Silahý";
		tablegamerstats4Model.setColumnIdentifiers(columngamerstats4TableHead);
		tablegamerstats4Data = new Object[2];
		tablegamerstats4Data[0] = " ";
		tablegamerstats4Data[1] = " ";
		tablegamerstats4Model.addRow(tablegamerstats4Data);
		
		
		tableitemModel = new DefaultTableModel();
		Object[] columnitemTableHead = new Object[1];
		columnitemTableHead[0] = "Sahip Olunan Eþyalar";
		tableitemModel.setColumnIdentifiers(columnitemTableHead);
			
		tableitemData = new Object[1];	
		tableitemData2 = new Object[1];
		tableitemData3 = new Object[1];
		tableitemData4 = new Object[1];
		tableitemData5 = new Object[1];
		tableitemData6 = new Object[1];
		tableitemData7 = new Object[1];
		tableitemData8 = new Object[1];
		tableitemData9 = new Object[1];
		tableitemData10 = new Object[1];
		tableitemData11 = new Object[1];
		tableitemData12 = new Object[1];
		tableitemData13 = new Object[1];
		tableitemData14 = new Object[1];
		tableitemData15 = new Object[1];
		tableitemData16 = new Object[1];
		tableitemData17 = new Object[1];
		tableitemData18 = new Object[1];
		tableitemData19 = new Object[1];
		tableitemData20 = new Object[1];


		tableitemData[0] = item.getTitanyumSwordName();
		tableitemData2[0] = item.getTitanyumArmorName();
		tableitemData3[0] = item.getTitanyum2ArmorName();
		tableitemData4[0] = item.getTitanyum3ArmorName();
		
		tableitemData5[0] = item.getInconelSwordName();
		tableitemData6[0] = item.getTungstenSwordName();
		
		tableitemData7[0] = item.getCelikArmorName();
		tableitemData8[0] = item.getCelikSwordName();
		
		tableitemData9[0] = item.getDemirArmorName();
		tableitemData10[0] = item.getDemirSwordName();
		
		tableitemData11[0] = item.getBronzArmorName();
		tableitemData12[0] = item.getDeriArmorName();
		tableitemData13[0] = item.getKumasArmorName();
		tableitemData14[0] = item.getBronzSwordName();
		
		tableitemData15[0] = item.getEasySwordName();
		tableitemData16[0] = item.getEasyArmorName();
		tableitemData17[0] = item.getOrtaSwordName();
		tableitemData18[0] = item.getOrtaArmorName();
		tableitemData19[0] = item.getZorSwordName();
		tableitemData20[0] = item.getZorArmorName();
		
		itemaddrow(item);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Xp");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Helper.showMessage("2 Level - 50xp"
						+ "\n3 Level - 120xp"
						+ "\n4 Level - 400xp"
						+ "\n5 Level - 800xp"
						+ "\n6 Level - 1500xp"
						+ "\n7 Level - 3000xp"
						+ "\n8 Level - 4000xp"
						+ "\n9 Level - 6000xp"
						+ "\n10 Level - 8000xp");
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Xp");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(81, 55, 32, 21);
		contentPane.add(lblNewLabel_2);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(153, 204, 51));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 5));
		btnNewButton.setBounds(78, 53, 35, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel(gamer.getGamerheroname()+" "+gamer.getGamername());
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_1.setForeground(new Color(255, 255, 240));
		lblNewLabel_1.setBounds(385, 11, 564, 65);
		contentPane.add(lblNewLabel_1);
		
		JButton btn_refresh = new JButton("Tabloyu G\u00FCncelle");
		btn_refresh.setForeground(new Color(176, 196, 222));
		btn_refresh.setBackground(new Color(105, 105, 105));
		btn_refresh.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		btn_refresh.setBounds(892, 638, 392, 23);
		contentPane.add(btn_refresh);
		btn_refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				updatelists(gamer,item);
				
			}
		});
		
		JButton btn_close = new JButton("Oturumu Kapat");
		btn_close.setForeground(new Color(255, 255, 255));
		btn_close.setBackground(new Color(165, 42, 42));
		btn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginScreenGUI GUI = new LoginScreenGUI();
				GUI.setVisible(true);
				dispose();
			}
		});
		btn_close.setBounds(1156, 0, 128, 32);
		contentPane.add(btn_close);
		
		System.out.println("gamerheroid> "+gamer.getGamerheroid());
		
		String playericon = " ";
		if(gamer.getGamerheroid() == 1) {
			playericon = "warrior.jpg";
		}if(gamer.getGamerheroid() == 2) {
			playericon = "gunner.jpg";
		}if(gamer.getGamerheroid() == 3) {
			playericon = "assasin.jpg";
		}if(gamer.getGamerheroid() == 4) {
			playericon = "sorcerer.jpg";
		}
		
		JLabel lbl_mainscwar = new JLabel();
		lbl_mainscwar.setIcon(new ImageIcon(getClass().getResource(playericon)));
		lbl_mainscwar.setBounds(456, 230, 221, 372);
		contentPane.add(lbl_mainscwar);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(176, 196, 222));
		tabbedPane.setBounds(892, 449, 392, 190);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		tabbedPane.addTab("Karakter", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(0, 0, 387, 53);
		panel.add(scrollPane);
		
		table_gamerstats = new JTable(tablegamerstatsModel);
		table_gamerstats.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(table_gamerstats);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setEnabled(false);
		scrollPane_4.setBounds(0, 54, 387, 53);
		panel.add(scrollPane_4);
		
		table_gamerswar = new JTable(tablegamerswarModel);
		table_gamerswar.setBackground(Color.LIGHT_GRAY);
		scrollPane_4.setViewportView(table_gamerswar);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setEnabled(false);
		scrollPane_5.setBounds(0, 108, 387, 53);
		panel.add(scrollPane_5);
		
		table_gamerswarna = new JTable(tablegamerswarnaModel);
		table_gamerswarna.setBackground(Color.LIGHT_GRAY);
		scrollPane_5.setViewportView(table_gamerswarna);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(176, 196, 222));
		tabbedPane.addTab("Eþyalar", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 11, 367, 140);
		panel_2.add(scrollPane_2);
		
		
		
		
		
		
		itemuseMenu = new JPopupMenu();
		JMenuItem useMenu = new JMenuItem("Kullan");
		itemuseMenu.add(useMenu);
		useMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					String selected = table_item.getValueAt(table_item.getSelectedRow(), 0).toString();
					
					
					boolean control = useitem(gamer,selected,item);
					
					if(control) {
						Helper.showMessage("Eþya Kullanýldý.");
						dispose();
						MainScreenGUI GUI = new MainScreenGUI(gamer, item);
						GUI.setVisible(true);
						
					}
					
			}
		});
		
		
		table_item = new JTable(tableitemModel);
		table_item.setComponentPopupMenu(itemuseMenu);
		table_item.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Point point = e.getPoint();
				int selectedRow = table_item.rowAtPoint(point);
				System.out.println("týklandý");
				table_item.setRowSelectionInterval(selectedRow, selectedRow);}} );
		scrollPane_2.setViewportView(table_item);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 196, 222));
		tabbedPane.addTab("Ordu", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setEnabled(false);
		scrollPane_1.setBounds(112, 11, 163, 43);
		panel_1.add(scrollPane_1);
		
		table_army = new JTable(tablegamerstats2Model);
		table_army.setBackground(Color.LIGHT_GRAY);
		scrollPane_1.setViewportView(table_army);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setEnabled(false);
		scrollPane_1_1.setBounds(41, 65, 305, 43);
		panel_1.add(scrollPane_1_1);
		
		table_army2 = new JTable(tablegamerstats3Model);
		table_army2.setBackground(Color.LIGHT_GRAY);
		scrollPane_1_1.setViewportView(table_army2);
		
		JScrollPane scrollPane_1_2 = new JScrollPane();
		scrollPane_1_2.setEnabled(false);
		scrollPane_1_2.setBounds(41, 108, 305, 43);
		panel_1.add(scrollPane_1_2);
		
		table_army3 = new JTable(tablegamerstats4Model);
		table_army3.setBackground(Color.LIGHT_GRAY);
		scrollPane_1_2.setViewportView(table_army3);
		
		JComboBox select_location = new JComboBox();
		select_location.setForeground(new Color(255, 255, 255));
		select_location.setBackground(new Color(176, 196, 222));
		select_location.setToolTipText("");
		select_location.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		select_location.setModel(new DefaultComboBoxModel(new String[] {"B\u00F6lge Se\u00E7", "Noxus", "Zaun", "Piltover", "Freljord", "Ionia", "Hi\u00E7lik"}));
		select_location.setBounds(39, 540, 262, 40);
		contentPane.add(select_location);
		
		JButton btnNewButton_1 = new JButton("Maceraya \u00C7\u0131k");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(176, 196, 222));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sel = select_location.getSelectedIndex();
						System.out.println(sel);
				switch(sel) {
				case 1: 
					NoxusSýnýrýGUI GUI = new NoxusSýnýrýGUI(gamer,item);
					GUI.setVisible(true);
					dispose();
					break;
				case 2: 
					Helper.showMessage("Yapým Aþamasýnda!");
					break;
				case 3: 
					Helper.showMessage("Yapým Aþamasýnda!");
					break;
				case 4: 
					Helper.showMessage("Yapým Aþamasýnda!");
					break;
				case 5: 
					Helper.showMessage("Yapým Aþamasýnda!");
					break;
				case 6: 
					Helper.showMessage("Yapým Aþamasýnda!");
					break;
				default : 	
					
				break;	
				}
				
			}
			
		});
		btnNewButton_1.setBounds(39, 591, 262, 48);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("E\u015Fya Sat\u0131n Al");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ShopGUI GUI = new ShopGUI(gamer,item);
				GUI.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBackground(new Color(176, 196, 222));
		btnNewButton_1_1.setBounds(990, 406, 118, 32);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("\u00D6\u011Fren");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Helper.showMessage("Merhaba Asker, SAVAÞ ALANI'na Hoþgeldin. "
						+ "\nOyunun temel amacý karakterini ve ordunu güçlendirip yeni bölgeler fethetmek, gücüne güç katmak. "
						+ "\nSað üst köþeden oturumu kapatabilirsin, sað kenardan markete girip silah ve zýrh alabilir, ordu toplayýp güçlendirebilirsin, tabii paran yeterse."
						+ "\nSol alt köþedeki tablolardan karakterinin sahip olduklarý hakkýnda bilgi edinebilirsin."
						+ "\nSað alttaki bölge seçim menüsünden gitmek istediðin yeri seç ve maceraya baþla. Eve döndüðünde 5 altýn karþýlýðýnda canýný yenilemeyi unutma.");
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(153, 0, 51));
		btnNewButton_2.setBounds(10, 53, 70, 23);
		contentPane.add(btnNewButton_2);
		
		
		
		JButton btnNewButton_3 = new JButton("Ordu Topla");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Helper.showMessage("Yapým Aþamasýnda!");
			}
			
		});
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(176, 196, 222));
		btnNewButton_3.setBounds(1156, 406, 118, 32);
		contentPane.add(btnNewButton_3);
		
		JButton btn_heal = new JButton("5 Altýn Vererek 100 Can Doldur");
		btn_heal.setForeground(Color.WHITE);
		btn_heal.setBackground(new Color(51, 102, 0));
		btn_heal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(gamer.getGamerhealth() == gamer.getGamerheal()) {
					Helper.showMessage("Can dolu");
				}else {
				
					try {
						if(gamer.getGamerhealth()+100 > gamer.getGamerheal()) 
						{
							gamer.setGamerhealth(gamer.getGamerheal());
							gamer.updateHealth(gamer.getGamerusername(), gamer.getGamerheal());
						}else {
					gamer.setGamerhealth(gamer.getGamerhealth()+100);
					gamer.updateHealth(gamer.getGamerusername(), (gamer.getGamerhealth()+100));
						}
						
					gamer.setGamergold(gamer.getGamergold()-5);
					gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
					updatelists(gamer,item);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				}
				
			}
		});
		btn_heal.setBounds(39, 510, 262, 23);
		contentPane.add(btn_heal);
		
		JTextPane txtpnNaslOynandnrenmek = new JTextPane();
		txtpnNaslOynandnrenmek.setFont(new Font("Times New Roman", Font.BOLD, 10));
		txtpnNaslOynandnrenmek.setBackground(new Color(105, 105, 105));
		txtpnNaslOynandnrenmek.setForeground(new Color(255, 255, 255));
		txtpnNaslOynandnrenmek.setEditable(false);
		txtpnNaslOynandnrenmek.setText("Nas\u0131l Oynand\u0131\u011F\u0131n\u0131 \u00D6\u011Frenmek \u0130\u00E7in T\u0131kla");
		txtpnNaslOynandnrenmek.setBounds(10, 11, 103, 66);
		contentPane.add(txtpnNaslOynandnrenmek);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(getClass().getResource("kale.jpg")));
		lblNewLabel.setBounds(0, 0, 1284, 661);
		contentPane.add(lblNewLabel);
	}
	
	
	
	public void updatelists(Gamer gamer,Item item) {
		
		DefaultTableModel clearModel = (DefaultTableModel) table_gamerstats.getModel();
		clearModel.setRowCount(0);
		DefaultTableModel clear2Model = (DefaultTableModel) table_army.getModel();
		clear2Model.setRowCount(0);
		DefaultTableModel clear3Model = (DefaultTableModel) table_army2.getModel();
		clear3Model.setRowCount(0);
		DefaultTableModel clear4Model = (DefaultTableModel) table_army3.getModel();
		clear4Model.setRowCount(0);
		DefaultTableModel clear5Model = (DefaultTableModel) table_gamerswar.getModel();
		clear5Model.setRowCount(0);
		DefaultTableModel clear6Model = (DefaultTableModel) table_gamerswarna.getModel();
		clear6Model.setRowCount(0);
		
		try {
			tablegamerstatsData[0] = gamer.getGamerheroname();
			tablegamerstatsData[1] = gamer.getGamerlevel();
			tablegamerstatsData[2] = gamer.getGamerdamage();
			tablegamerstatsData[3] = gamer.getGamerhealth()+" / "+gamer.getGamerheal();
			tablegamerstatsData[4] = gamer.getGamergold();
			tablegamerstatsModel.addRow(tablegamerstatsData);
			
			tablegamerstats2Data[0] = gamer.getGamerarmy();
			tablegamerstats2Model.addRow(tablegamerstats2Data);	
			
			tablegamerstats3Data[0] = " ";
			tablegamerstats3Data[1] = " ";
			tablegamerstats3Model.addRow(tablegamerstats3Data);
				
			tablegamerstats4Data[0] = " ";
			tablegamerstats4Data[1] = " ";
			tablegamerstats4Model.addRow(tablegamerstats4Data);
			
			tablegamerswarData[0] = gamer.getGamersword();
			tablegamerswarData[1] = gamer.getGamerarmor();
			tablegamerswarData[2] = gamer.getGamerpelerinyn()+"  (+"+gamer.getGamerpelerindmg()+" Zýrh)";
			tablegamerswarData[3] = gamer.getGamerxp();
			tablegamerswarModel.addRow(tablegamerswarData);
			
			tablegamerswarnaData[0] = gamer.getGamerswordname();
			tablegamerswarnaData[1] = gamer.getGamerarmorname();
			tablegamerswarnaModel.addRow(tablegamerswarnaData);
			
			
			
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		
	}
	
	public boolean useitem(Gamer gamer,String selected,Item item) {
		
		boolean key = false;
		
		if(selected.equals(item.getEasySwordName())) {
			try {
				item.sworditem2to1(gamer,item);
				item.updateEasySworddata(gamer.getGamerusername(), 2);
				item.setEasySworddata(2);
				gamer.setGamersword(item.getEasySworddmg());
				gamer.setGamerswordname(item.getEasySwordName());
				gamer.updateSword(gamer.getGamerusername(), item.getEasySworddmg());
				gamer.updateSwordName(gamer.getGamerusername(), item.getEasySwordName());
				key = true;
				System.out.println("easy 2 oldu");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(selected.equals(item.getOrtaSwordName())) {
			try {
				item.sworditem2to1(gamer,item);
				item.updateOrtaSworddata(gamer.getGamerusername(), 2);
				item.setOrtaSworddata(2);
				gamer.setGamersword(item.getOrtaSworddmg());
				gamer.setGamerswordname(item.getOrtaSwordName());
				gamer.updateSword(gamer.getGamerusername(), item.getOrtaSworddmg());
				gamer.updateSwordName(gamer.getGamerusername(), item.getOrtaSwordName());
				key = true;
				System.out.println("orta 2 oldu");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(selected.equals(item.getZorSwordName())) {
			try {
				item.sworditem2to1(gamer,item);
				item.updateZorSworddata(gamer.getGamerusername(), 2);
				item.setZorSworddata(2);
				gamer.setGamersword(item.getZorSworddmg());
				gamer.setGamerswordname(item.getZorSwordName());
				gamer.updateSword(gamer.getGamerusername(), item.getZorSworddmg());
				gamer.updateSwordName(gamer.getGamerusername(), item.getZorSwordName());
				key = true;
				System.out.println("zor 2 oldu");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(selected.equals(item.getBronzSwordName())) {
			try {
				item.sworditem2to1(gamer,item);
				item.updateBronzSworddata(gamer.getGamerusername(), 2);
				item.setBronzSworddata(2);
				gamer.setGamersword(item.getBronzSworddmg());
				gamer.setGamerswordname(item.getBronzSwordName());
				gamer.updateSword(gamer.getGamerusername(), item.getBronzSworddmg());
				gamer.updateSwordName(gamer.getGamerusername(), item.getBronzSwordName());
				key = true;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(selected.equals(item.getDemirSwordName())) {
			try {
				item.sworditem2to1(gamer,item);
				item.updateDemirSworddata(gamer.getGamerusername(), 2);
				item.setDemirSworddata(2);
				gamer.setGamersword(item.getDemirSworddmg());
				gamer.setGamerswordname(item.getDemirSwordName());
				gamer.updateSword(gamer.getGamerusername(), item.getDemirSworddmg());
				gamer.updateSwordName(gamer.getGamerusername(), item.getDemirSwordName());
				key = true;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(selected.equals(item.getCelikSwordName())) {
			try {
				item.sworditem2to1(gamer,item);
				item.updateCelikSworddata(gamer.getGamerusername(), 2);
				item.setCelikSworddata(2);
				gamer.setGamersword(item.getCelikSworddmg());
				gamer.setGamerswordname(item.getCelikSwordName());
				gamer.updateSword(gamer.getGamerusername(), item.getCelikSworddmg());
				gamer.updateSwordName(gamer.getGamerusername(), item.getCelikSwordName());
				key = true;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(selected.equals(item.getTungstenSwordName())) {
			try {
				item.sworditem2to1(gamer,item);
				item.updateTungstenSworddata(gamer.getGamerusername(), 2);
				item.setTungstenSworddata(2);
				gamer.setGamersword(item.getTungstenSworddmg());
				gamer.setGamerswordname(item.getTungstenSwordName());
				gamer.updateSword(gamer.getGamerusername(), item.getTungstenSworddmg());
				gamer.updateSwordName(gamer.getGamerusername(), item.getTungstenSwordName());
				key = true;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(selected.equals(item.getInconelSwordName())) {
			try {
				item.sworditem2to1(gamer,item);
				item.updateInconelSworddata(gamer.getGamerusername(), 2);
				item.setInconelSworddata(2);
				gamer.setGamersword(item.getInconelSworddmg());
				gamer.setGamerswordname(item.getInconelSwordName());
				gamer.updateSword(gamer.getGamerusername(), item.getInconelSworddmg());
				gamer.updateSwordName(gamer.getGamerusername(), item.getInconelSwordName());
				key = true;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(selected.equals(item.getTitanyumSwordName())) {
			try {
				item.sworditem2to1(gamer,item);
				item.updateTitanyumSworddata(gamer.getGamerusername(), 2);
				item.setTitanyumSworddata(2);
				gamer.setGamersword(item.getTitanyumSworddmg());
				gamer.setGamerswordname(item.getTitanyumSwordName());
				gamer.updateSword(gamer.getGamerusername(), item.getTitanyumSworddmg());
				gamer.updateSwordName(gamer.getGamerusername(), item.getTitanyumSwordName());
				key = true;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(selected.equals(item.getKumasArmorName())) {
			try {
				item.armoritem2to1(gamer,item);
				item.updateKumasArmordata(gamer.getGamerusername(), 2);
				item.setKumasArmordata(2);
				gamer.setGamerarmor(item.getKumasArmordmg());
				gamer.setGamerarmorname(item.getKumasArmorName());
				gamer.updateArmor(gamer.getGamerusername(), item.getKumasArmordmg());
				gamer.updateArmorName(gamer.getGamerusername(), item.getKumasArmorName());
				key = true;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(selected.equals(item.getDeriArmorName())) {
			try {
				item.armoritem2to1(gamer,item);
				item.updateDeriArmordata(gamer.getGamerusername(), 2);
				item.setDeriArmordata(2);
				gamer.setGamerarmor(item.getDeriArmordmg());
				gamer.setGamerarmorname(item.getDeriArmorName());
				gamer.updateArmor(gamer.getGamerusername(), item.getDeriArmordmg());
				gamer.updateArmorName(gamer.getGamerusername(), item.getDeriArmorName());
				key = true;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(selected.equals(item.getBronzArmorName())) {
			try {
				item.armoritem2to1(gamer,item);
				item.updateBronzArmordata(gamer.getGamerusername(), 2);
				item.setBronzArmordata(2);
				gamer.setGamerarmor(item.getBronzArmordmg());
				gamer.setGamerarmorname(item.getBronzArmorName());
				gamer.updateArmor(gamer.getGamerusername(), item.getBronzArmordmg());
				gamer.updateArmorName(gamer.getGamerusername(), item.getBronzArmorName());
				key = true;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(selected.equals(item.getDemirArmorName())) {
			try {
				item.armoritem2to1(gamer,item);
				item.updateDemirArmordata(gamer.getGamerusername(), 2);
				item.setDemirArmordata(2);
				gamer.setGamerarmor(item.getDemirArmordmg());
				gamer.setGamerarmorname(item.getDemirArmorName());
				gamer.updateArmor(gamer.getGamerusername(), item.getDemirArmordmg());
				gamer.updateArmorName(gamer.getGamerusername(), item.getDemirArmorName());
				key = true;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(selected.equals(item.getCelikArmorName())) {
			try {
				item.armoritem2to1(gamer,item);
				item.updateCelikArmordata(gamer.getGamerusername(), 2);
				item.setCelikArmordata(2);
				gamer.setGamerarmor(item.getCelikArmordmg());
				gamer.setGamerarmorname(item.getCelikArmorName());
				gamer.updateArmor(gamer.getGamerusername(), item.getCelikArmordmg());
				gamer.updateArmorName(gamer.getGamerusername(), item.getCelikArmorName());
				key = true;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		
		
		
		
		if(selected.equals(item.getTitanyumArmorName())) {
			try {
				item.armoritem2to1(gamer,item);
				item.updateTitanyumArmordata(gamer.getGamerusername(), 2);
				item.setTitanyumArmordata(2);
				gamer.setGamerarmor(item.getTitanyumArmordmg());
				gamer.setGamerarmorname(item.getTitanyumArmorName());
				gamer.updateArmor(gamer.getGamerusername(), item.getTitanyumArmordmg());
				gamer.updateArmorName(gamer.getGamerusername(), item.getTitanyumArmorName());
				key = true;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(selected.equals(item.getTitanyum2ArmorName())) {
			if(item.getTitanyumArmordata()==2){
				try {
					item.updateTitanyum2Armordata(gamer.getGamerusername(), 2);
					item.setTitanyum2Armordata(2);
					gamer.setGamerarmor(item.getTitanyumArmordmg()+item.getTitanyum2Armordmg());
					gamer.updateArmor(gamer.getGamerusername(), gamer.getGamerarmor());
					key = true;
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else {
				Helper.showMessage("Önce Titanyum Zýrh'ý giyin.");
			}
			
		}
		if(selected.equals(item.getTitanyum3ArmorName())) {
			if(item.getTitanyumArmordata()==2 && item.getTitanyum2Armordata()==2){
				try {
					item.updateTitanyum3Armordata(gamer.getGamerusername(), 2);
					item.setTitanyum3Armordata(2);
					gamer.setGamerarmor(item.getTitanyumArmordmg()+item.getTitanyum2Armordmg()+item.getTitanyum3Armordmg());
					gamer.setGamerarmorname("Titanyum Set");
					gamer.updateArmor(gamer.getGamerusername(), gamer.getGamerarmor());
					gamer.updateArmorName(gamer.getGamerusername(), gamer.getGamerarmorname());
					key = true;
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else {
				Helper.showMessage("Önce Titanyum Zýrh ve Titanyum Kask'ý giyin.");
			}
			
		}
		return key;
	}
		
	public void itemaddrow(Item item) {
		
		if(item.getTitanyumSworddata()==1) {
			tableitemModel.addRow(tableitemData);
		}
		if(item.getTitanyumArmordata()==1) {
			tableitemModel.addRow(tableitemData2);
		}
		if(item.getTitanyum2Armordata()==1) {
			tableitemModel.addRow(tableitemData3);
		}
		if(item.getTitanyum3Armordata()==1) {
			tableitemModel.addRow(tableitemData4);
		}
		
		if(item.getInconelSworddata()==1) {
			tableitemModel.addRow(tableitemData5);
		}
		if(item.getTungstenSworddata()==1) {
			tableitemModel.addRow(tableitemData6);
		}
		
		if(item.getCelikSworddata()==1) {
			tableitemModel.addRow(tableitemData8);
		}
		if(item.getCelikArmordata()==1) {
			tableitemModel.addRow(tableitemData7);
		}
		
		
		if(item.getDemirSworddata()==1) {
			tableitemModel.addRow(tableitemData10);
		}
		if(item.getDemirArmordata()==1) {
			tableitemModel.addRow(tableitemData9);
		}
		
		
		if(item.getBronzSworddata()==1) {
			tableitemModel.addRow(tableitemData14);
		}
		if(item.getBronzArmordata()==1) {
			tableitemModel.addRow(tableitemData11);
		}
		if(item.getDeriArmordata()==1) {
			tableitemModel.addRow(tableitemData12);
		}
		if(item.getKumasArmordata()==1) {
			tableitemModel.addRow(tableitemData13);
		}
		
		if(item.getEasySworddata()==1) {
			tableitemModel.addRow(tableitemData15);
		}
		if(item.getOrtaSworddata()==1) {
			tableitemModel.addRow(tableitemData17);
		}
		if(item.getZorSworddata()==1) {
			tableitemModel.addRow(tableitemData19);
		}
	}
		
		
		
		
		
		
		
		
		
	
}
