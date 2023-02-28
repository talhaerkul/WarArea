package Shop;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Helper.Helper;
import ItemModel.Item;
import Model.Gamer;
import View.MainScreenGUI;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import java.awt.Font;

public class ShopGUI extends JFrame {

	static Gamer gamer = new Gamer();
	static Item item = new Item();
	
	private JPanel contentPane;
	private JTextField txtKolayKl;
	private JTextField txtOrtaKl;
	private JTextField txtZorKl;
	private JTextField txtDemirKl;
	private JTextField txtGmKl;
	private JTextField txtelikKl;
	private JTextField txtTitanyumKl;
	private JTextField txtDemirZrh;
	private JTextField txtDemirKl_1;
	private JTextField txtelikZrh;
	private JTextField txtTitanyumZrh;
	private JTextField txtTitanyumEldiven;
	private JTextField txtTitanyumKask;
	private JTextField textField_2;
	private JTextField txtInconelKl;
	private JTextField txtTungstenKl;
	private JTextField txtDemirZrh_1;
	private JTextField txtelikZrh_1;
	private JTextField txtAltn;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopGUI frame = new ShopGUI(gamer,item);
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
	public ShopGUI(Gamer gamer,Item item) {
		
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_11 = new JButton("Ma\u011Fazadan \u00C7\u0131k");
		btnNewButton_11.setForeground(new Color(102, 0, 51));
		btnNewButton_11.setBackground(new Color(245, 245, 220));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreenGUI GUI = new MainScreenGUI(gamer,item);
				GUI.setVisible(true);
				dispose();
			}
		});
		btnNewButton_11.setBounds(1153, 11, 121, 30);
		contentPane.add(btnNewButton_11);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(39, 29, 1202, 603);
		contentPane.add(tabbedPane);
		
		JPanel w_swordpanel = new JPanel();
		tabbedPane.addTab("Kýlýçlar", null, w_swordpanel, null);
		w_swordpanel.setLayout(null);
		
		JButton btnNewButton = new JButton("20 Alt\u0131n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(item.getEasySworddata()==2) {
					Helper.showMessage("Zaten bu kýlýcý kullanýyorsun!");
				}
				else if(item.getEasySworddata()==1) {
						if(Helper.confirm("Bu kýlýca sahipsin. Kullanmak istiyor musun?")) {
							try {
								gamer.setGamersword(item.getEasySworddmg());
								gamer.setGamerswordname(item.getEasySwordName());
								
								gamer.updateSword(gamer.getGamerusername(), item.getEasySworddmg());
								gamer.updateSwordName(gamer.getGamerusername(), item.getEasySwordName());
								
								item.sworditem2to1(gamer,item);
								
								item.setEasySworddata(2);
								item.updateEasySworddata(gamer.getGamerusername(), item.getEasySworddata());
								
								
								Helper.showMessage("Kýlýç Kullanýldý.");
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				else{
					if(gamer.getGamergold() >= 20) {
						try {
							gamer.setGamersword(item.getEasySworddmg());
							gamer.setGamerswordname(item.getEasySwordName());
							
							gamer.updateSword(gamer.getGamerusername(), item.getEasySworddmg());
							gamer.updateSwordName(gamer.getGamerusername(), item.getEasySwordName());
							
							item.sworditem2to1(gamer,item);
							
							item.setEasySworddata(2);
							item.updateEasySworddata(gamer.getGamerusername(), item.getEasySworddata());
							
							gamer.setGamergold(gamer.getGamergold()-20);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(gamer.getGamergold() < 20) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
			
			}
		});
		
		JButton btnNewButton_3 = new JButton("Hasar Tablosu");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Helper.showMessage("Can doldurmak için cebinde 5 Altýn býraktýðýndan emin ol!");
				Helper.showMessage(
						"\n\n"
						+ "Dolunay Kýlýcý - 7 Hasar"
						+ "\nUzun Kýlýç - 5 Hasar"
						+ "\nBambu Kýlýç - 3 Hasar"
						+ "\n"
						+ "\nBronz Kýlýç - 12 Hasar"
						+ "\nDemir Kýlýç - 16 Hasar"
						+ "\nÇelik Kýlýç - 25 Hasar"
						+ "\n"
						+ "\nTungsten Kýlýç - 50 Hasar"
						+ "\nInconel Kýlýç - 100 Hasar"
						+ "\n"
						+ "\nTitanyum Kýlýç - 200 Hasar"
						+ "\n"
						+ "\n"
						+ "\n");
			}
		});
		
		txtAltn = new JTextField();
		txtAltn.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtAltn.setEditable(false);
		txtAltn.setForeground(new Color(0, 0, 51));
		txtAltn.setBackground(new Color(255, 204, 0));
		txtAltn.setText("Alt\u0131n :  "+gamer.getGamergold());
		txtAltn.setBounds(1087, 555, 110, 20);
		w_swordpanel.add(txtAltn);
		txtAltn.setColumns(10);
		
		JButton btnNewButton_6_1 = new JButton("1200 Alt\u0131n");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item.getInconelSworddata()==2) {
					Helper.showMessage("Zaten bu kýlýcý kullanýyorsun!");
				}
				else if(item.getInconelSworddata()==1) {
						if(Helper.confirm("Bu kýlýca sahipsin. Kullanmak istiyor musun?")) {
							try {
								gamer.setGamersword(item.getInconelSworddmg());
								gamer.setGamerswordname(item.getInconelSwordName());
								
								gamer.updateSword(gamer.getGamerusername(), item.getInconelSworddmg());
								gamer.updateSwordName(gamer.getGamerusername(), item.getInconelSwordName());
								
								item.sworditem2to1(gamer,item); 
								
								item.setInconelSworddata(2);
								item.updateInconelSworddata(gamer.getGamerusername(), item.getInconelSworddata());
								
								Helper.showMessage("Kýlýç Kullanýldý.");
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				else{
					if(gamer.getGamergold() >= 1200) {
						try {
							gamer.setGamersword(item.getInconelSworddmg());
							gamer.setGamerswordname(item.getInconelSwordName());
							
							gamer.updateSword(gamer.getGamerusername(), item.getInconelSworddmg());
							gamer.updateSwordName(gamer.getGamerusername(), item.getInconelSwordName());
							
							item.sworditem2to1(gamer,item);
							
							item.setInconelSworddata(2);
							item.updateInconelSworddata(gamer.getGamerusername(), item.getInconelSworddata());
							
							gamer.setGamergold(gamer.getGamergold()-1200);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(gamer.getGamergold() < 1200) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
			}
		});
		btnNewButton_6_1.setForeground(Color.WHITE);
		btnNewButton_6_1.setBackground(new Color(0, 0, 0));
		btnNewButton_6_1.setBounds(1024, 341, 130, 20);
		w_swordpanel.add(btnNewButton_6_1);
		
		txtTungstenKl = new JTextField();
		txtTungstenKl.setText("Tungsten K\u0131l\u0131\u00E7");
		txtTungstenKl.setHorizontalAlignment(SwingConstants.CENTER);
		txtTungstenKl.setForeground(new Color(255, 250, 250));
		txtTungstenKl.setEditable(false);
		txtTungstenKl.setColumns(10);
		txtTungstenKl.setBackground(new Color(102, 204, 0));
		txtTungstenKl.setBounds(1024, 134, 130, 20);
		w_swordpanel.add(txtTungstenKl);
		
		JButton btnNewButton_2_1 = new JButton("700 Alt\u0131n");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item.getTungstenSworddata()==2) {
					Helper.showMessage("Zaten bu kýlýcý kullanýyorsun!");
				}
				else if(item.getTungstenSworddata()==1) {
						if(Helper.confirm("Bu kýlýca sahipsin. Kullanmak istiyor musun?")) {
							try {
								gamer.setGamersword(item.getTungstenSworddmg());
								gamer.setGamerswordname(item.getTungstenSwordName());
								
								gamer.updateSword(gamer.getGamerusername(), item.getTungstenSworddmg());
								gamer.updateSwordName(gamer.getGamerusername(), item.getTungstenSwordName());
								
								item.sworditem2to1(gamer,item); 
								
								item.setTungstenSworddata(2);
								item.updateTungstenSworddata(gamer.getGamerusername(), item.getTungstenSworddata());
								
								Helper.showMessage("Kýlýç Kullanýldý.");
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				else{
					if(gamer.getGamergold() >= 700) {
						try {
							gamer.setGamersword(item.getTungstenSworddmg());
							gamer.setGamerswordname(item.getTungstenSwordName());
							
							gamer.updateSword(gamer.getGamerusername(), item.getTungstenSworddmg());
							gamer.updateSwordName(gamer.getGamerusername(), item.getTungstenSwordName());
							
							item.sworditem2to1(gamer,item);
							
							item.setTungstenSworddata(2);
							item.updateTungstenSworddata(gamer.getGamerusername(), item.getTungstenSworddata());
							
							gamer.setGamergold(gamer.getGamergold()-700);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(gamer.getGamergold() < 700) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
			}
		});
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setBackground(new Color(0, 0, 0));
		btnNewButton_2_1.setBounds(1024, 153, 130, 20);
		w_swordpanel.add(btnNewButton_2_1);
		
		txtInconelKl = new JTextField();
		txtInconelKl.setText("Inconel K\u0131l\u0131\u00E7");
		txtInconelKl.setHorizontalAlignment(SwingConstants.CENTER);
		txtInconelKl.setForeground(new Color(255, 250, 250));
		txtInconelKl.setEditable(false);
		txtInconelKl.setColumns(10);
		txtInconelKl.setBackground(new Color(255, 102, 51));
		txtInconelKl.setBounds(1024, 322, 130, 20);
		w_swordpanel.add(txtInconelKl);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(51, 102, 153));
		btnNewButton_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnNewButton_3.setBounds(1084, 11, 103, 23);
		w_swordpanel.add(btnNewButton_3);
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(10, 153, 130, 20);
		w_swordpanel.add(btnNewButton);
		
		txtKolayKl = new JTextField();
		txtKolayKl.setEditable(false);
		txtKolayKl.setForeground(new Color(255, 250, 250));
		txtKolayKl.setBackground(new Color(51, 204, 102));
		txtKolayKl.setHorizontalAlignment(SwingConstants.CENTER);
		txtKolayKl.setText("Dolunay K\u0131l\u0131c\u0131");
		txtKolayKl.setBounds(10, 134, 130, 20);
		w_swordpanel.add(txtKolayKl);
		txtKolayKl.setColumns(10);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(10, 11, 130, 120);
		w_swordpanel.add(lblNewLabel);
		
		txtOrtaKl = new JTextField();
		txtOrtaKl.setText("Uzun K\u0131l\u0131\u00E7");
		txtOrtaKl.setHorizontalAlignment(SwingConstants.CENTER);
		txtOrtaKl.setForeground(new Color(255, 250, 250));
		txtOrtaKl.setEditable(false);
		txtOrtaKl.setColumns(10);
		txtOrtaKl.setBackground(new Color(153, 102, 0));
		txtOrtaKl.setBounds(222, 134, 130, 20);
		w_swordpanel.add(txtOrtaKl);
		
		JButton btnNewButton_1 = new JButton("15 Alt\u0131n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(item.getOrtaSworddata()==2) {
					Helper.showMessage("Zaten bu kýlýcý kullanýyorsun!");
				}
				else if(item.getOrtaSworddata()==1) {
						if(Helper.confirm("Bu kýlýca sahipsin. Kullanmak istiyor musun?")) {
							try {
								gamer.setGamersword(item.getOrtaSworddmg());
								gamer.setGamerswordname(item.getOrtaSwordName());
								
								gamer.updateSword(gamer.getGamerusername(), item.getOrtaSworddmg());
								gamer.updateSwordName(gamer.getGamerusername(), item.getOrtaSwordName());
								
								item.sworditem2to1(gamer,item);
								
								item.setOrtaSworddata(2);
								item.updateOrtaSworddata(gamer.getGamerusername(), item.getOrtaSworddata());
								
								Helper.showMessage("Kýlýç Kullanýldý.");
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				else{
					if(gamer.getGamergold() >= 15) {
						try {
							gamer.setGamersword(item.getOrtaSworddmg());
							gamer.setGamerswordname(item.getOrtaSwordName());
							
							gamer.updateSword(gamer.getGamerusername(), item.getOrtaSworddmg());
							gamer.updateSwordName(gamer.getGamerusername(), item.getOrtaSwordName());
							
							item.sworditem2to1(gamer,item);
							
							item.setOrtaSworddata(2);
							item.updateOrtaSworddata(gamer.getGamerusername(), item.getOrtaSworddata());
							
							gamer.setGamergold(gamer.getGamergold()-15);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						
					}
						}
					else if(gamer.getGamergold() < 15) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(222, 153, 130, 20);
		w_swordpanel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel((Icon) null);
		lblNewLabel_1.setBounds(222, 11, 130, 120);
		w_swordpanel.add(lblNewLabel_1);
		
		txtZorKl = new JTextField();
		txtZorKl.setText("Bambu K\u0131l\u0131\u00E7");
		txtZorKl.setHorizontalAlignment(SwingConstants.CENTER);
		txtZorKl.setForeground(new Color(255, 250, 250));
		txtZorKl.setEditable(false);
		txtZorKl.setColumns(10);
		txtZorKl.setBackground(new Color(255, 51, 0));
		txtZorKl.setBounds(432, 134, 130, 20);
		w_swordpanel.add(txtZorKl);
		
		JButton btnNewButton_2 = new JButton("10 Alt\u0131n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(item.getZorSworddata()==2) {
					Helper.showMessage("Zaten bu kýlýcý kullanýyorsun!");
				}
				else if(item.getZorSworddata()==1) {
						if(Helper.confirm("Bu kýlýca sahipsin. Kullanmak istiyor musun?")) {
							try {
								gamer.setGamersword(item.getZorSworddmg());
								gamer.setGamerswordname(item.getZorSwordName());
								
								gamer.updateSword(gamer.getGamerusername(), item.getZorSworddmg());
								gamer.updateSwordName(gamer.getGamerusername(), item.getZorSwordName());
								
								item.sworditem2to1(gamer,item);
								
								item.setZorSworddata(2);
								item.updateZorSworddata(gamer.getGamerusername(), item.getZorSworddata());
								
								Helper.showMessage("Kýlýç Kullanýldý.");
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				else{
					if(gamer.getGamergold() >= 10) {
						try {
							gamer.setGamersword(item.getZorSworddmg());
							gamer.setGamerswordname(item.getZorSwordName());
							
							gamer.updateSword(gamer.getGamerusername(), item.getZorSworddmg());
							gamer.updateSwordName(gamer.getGamerusername(), item.getZorSwordName());
							
							item.sworditem2to1(gamer,item);
							
							item.setZorSworddata(2);
							item.updateZorSworddata(gamer.getGamerusername(), item.getZorSworddata());
							
							gamer.setGamergold(gamer.getGamergold()-10);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						
					}
						}
					else if(gamer.getGamergold() < 10) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
				
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(432, 153, 130, 20);
		w_swordpanel.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel((Icon) null);
		lblNewLabel_2.setBounds(432, 11, 130, 120);
		w_swordpanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel((Icon) null);
		lblNewLabel_3.setBounds(628, 11, 130, 120);
		w_swordpanel.add(lblNewLabel_3);
		
		txtDemirKl = new JTextField();
		txtDemirKl.setText("Bronz K\u0131l\u0131\u00E7");
		txtDemirKl.setHorizontalAlignment(SwingConstants.CENTER);
		txtDemirKl.setForeground(new Color(255, 255, 255));
		txtDemirKl.setEditable(false);
		txtDemirKl.setColumns(10);
		txtDemirKl.setBackground(new Color(204, 204, 102));
		txtDemirKl.setBounds(10, 322, 130, 20);
		w_swordpanel.add(txtDemirKl);
		
		JButton btnNewButton_4 = new JButton("50 Alt\u0131n");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item.getBronzSworddata()==2) {
					Helper.showMessage("Zaten bu kýlýcý kullanýyorsun!");
				}
				else if(item.getBronzSworddata()==1) {
						if(Helper.confirm("Bu kýlýca sahipsin. Kullanmak istiyor musun?")) {
							try {
								gamer.setGamersword(item.getBronzSworddmg());
								gamer.setGamerswordname(item.getBronzSwordName());
								
								gamer.updateSword(gamer.getGamerusername(), item.getBronzSworddmg());
								gamer.updateSwordName(gamer.getGamerusername(), item.getBronzSwordName());
								
								item.sworditem2to1(gamer,item); 
								
								item.setBronzSworddata(2);
								item.updateBronzSworddata(gamer.getGamerusername(), item.getBronzSworddata());
								
								Helper.showMessage("Kýlýç Kullanýldý.");
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				else{
					if(gamer.getGamergold() >= 50) {
						try {
							gamer.setGamersword(item.getBronzSworddmg());
							gamer.setGamerswordname(item.getBronzSwordName());

							gamer.updateSword(gamer.getGamerusername(), item.getBronzSworddmg());
							gamer.updateSwordName(gamer.getGamerusername(), item.getBronzSwordName());
							
							item.sworditem2to1(gamer,item);
							
							item.setBronzSworddata(2);
							item.updateBronzSworddata(gamer.getGamerusername(), item.getBronzSworddata());
							
							gamer.setGamergold(gamer.getGamergold()-50);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(gamer.getGamergold() < 50) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
			}
		});
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(new Color(0, 0, 0));
		btnNewButton_4.setBounds(10, 341, 130, 20);
		w_swordpanel.add(btnNewButton_4);
		
		JLabel lblNewLabel_4 = new JLabel((Icon) null);
		lblNewLabel_4.setBounds(10, 199, 130, 120);
		w_swordpanel.add(lblNewLabel_4);
		
		txtGmKl = new JTextField();
		txtGmKl.setText("Demir K\u0131l\u0131\u00E7");
		txtGmKl.setHorizontalAlignment(SwingConstants.CENTER);
		txtGmKl.setForeground(new Color(255, 255, 255));
		txtGmKl.setEditable(false);
		txtGmKl.setColumns(10);
		txtGmKl.setBackground(new Color(128, 128, 128));
		txtGmKl.setBounds(222, 322, 130, 20);
		w_swordpanel.add(txtGmKl);
		
		JButton btnNewButton_5 = new JButton("100 Alt\u0131n");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item.getDemirSworddata()==2) {
					Helper.showMessage("Zaten bu kýlýcý kullanýyorsun!");
				}
				else if(item.getDemirSworddata()==1) {
						if(Helper.confirm("Bu kýlýca sahipsin. Kullanmak istiyor musun?")) {
							try {
								gamer.setGamersword(item.getDemirSworddmg());
								gamer.setGamerswordname(item.getDemirSwordName());
								
								gamer.updateSword(gamer.getGamerusername(), item.getDemirSworddmg());
								gamer.updateSwordName(gamer.getGamerusername(), item.getDemirSwordName());
								
								item.sworditem2to1(gamer,item); 
								
								item.setDemirSworddata(2);
								item.updateDemirSworddata(gamer.getGamerusername(), item.getDemirSworddata());
								
								Helper.showMessage("Kýlýç Kullanýldý.");
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				else{
					if(gamer.getGamergold() >= 100) {
						try {
							gamer.setGamersword(item.getDemirSworddmg());
							gamer.setGamerswordname(item.getDemirSwordName());
							
							gamer.updateSword(gamer.getGamerusername(), item.getDemirSworddmg());
							gamer.updateSwordName(gamer.getGamerusername(), item.getDemirSwordName());
							
							item.sworditem2to1(gamer,item);
							
							item.setDemirSworddata(2);
							item.updateDemirSworddata(gamer.getGamerusername(), item.getDemirSworddata());
							
							gamer.setGamergold(gamer.getGamergold()-100);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(gamer.getGamergold() < 100) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
			}
		});
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(new Color(0, 0, 0));
		btnNewButton_5.setBounds(222, 341, 130, 20);
		w_swordpanel.add(btnNewButton_5);
		
		JLabel lblNewLabel_5 = new JLabel((Icon) null);
		lblNewLabel_5.setBounds(222, 199, 130, 120);
		w_swordpanel.add(lblNewLabel_5);
		
		txtelikKl = new JTextField();
		txtelikKl.setText("\u00C7elik K\u0131l\u0131\u00E7");
		txtelikKl.setHorizontalAlignment(SwingConstants.CENTER);
		txtelikKl.setForeground(new Color(255, 255, 255));
		txtelikKl.setEditable(false);
		txtelikKl.setColumns(10);
		txtelikKl.setBackground(new Color(100, 149, 237));
		txtelikKl.setBounds(432, 322, 130, 20);
		w_swordpanel.add(txtelikKl);
		
		JButton btnNewButton_6 = new JButton("250 Alt\u0131n");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item.getCelikSworddata()==2) {
					Helper.showMessage("Zaten bu kýlýcý kullanýyorsun!");
				}
				else if(item.getCelikSworddata()==1) {
						if(Helper.confirm("Bu kýlýca sahipsin. Kullanmak istiyor musun?")) {
							try {
								gamer.setGamersword(item.getCelikSworddmg());
								gamer.setGamerswordname(item.getCelikSwordName());
								
								gamer.updateSword(gamer.getGamerusername(), item.getCelikSworddmg());
								gamer.updateSwordName(gamer.getGamerusername(), item.getCelikSwordName());
								
								item.sworditem2to1(gamer,item); 
								
								item.setCelikSworddata(2);
								item.updateCelikSworddata(gamer.getGamerusername(), item.getCelikSworddata());
								
								Helper.showMessage("Kýlýç Kullanýldý.");
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				else{
					if(gamer.getGamergold() >= 250) {
						try {
							gamer.setGamersword(item.getCelikSworddmg());
							gamer.setGamerswordname(item.getCelikSwordName());
							
							gamer.updateSword(gamer.getGamerusername(), item.getCelikSworddmg());
							gamer.updateSwordName(gamer.getGamerusername(), item.getCelikSwordName());
							
							item.sworditem2to1(gamer,item);
							
							item.setCelikSworddata(2);
							item.updateCelikSworddata(gamer.getGamerusername(), item.getCelikSworddata());
							
							gamer.setGamergold(gamer.getGamergold()-250);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(gamer.getGamergold() < 250) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
			}
		});
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBackground(new Color(0, 0, 0));
		btnNewButton_6.setBounds(432, 341, 130, 20);
		w_swordpanel.add(btnNewButton_6);
		
		JLabel lblNewLabel_6 = new JLabel((Icon) null);
		lblNewLabel_6.setBounds(432, 199, 130, 120);
		w_swordpanel.add(lblNewLabel_6);
		
		txtTitanyumKl = new JTextField();
		txtTitanyumKl.setText("Titanyum K\u0131l\u0131\u00E7");
		txtTitanyumKl.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitanyumKl.setForeground(new Color(255, 250, 250));
		txtTitanyumKl.setEditable(false);
		txtTitanyumKl.setColumns(10);
		txtTitanyumKl.setBackground(new Color(0, 0, 102));
		txtTitanyumKl.setBounds(721, 424, 130, 20);
		w_swordpanel.add(txtTitanyumKl);
		
		JButton btnNewButton_7 = new JButton("2000 Alt\u0131n");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item.getTitanyumSworddata()==2) {
					Helper.showMessage("Zaten bu kýlýcý kullanýyorsun!");
				}
				else if(item.getTitanyumSworddata()==1) {
						if(Helper.confirm("Bu kýlýca sahipsin. Kullanmak istiyor musun?")) {
							try {
								gamer.setGamersword(item.getTitanyumSworddmg());
								gamer.setGamerswordname(item.getTitanyumSwordName());
								
								gamer.updateSword(gamer.getGamerusername(), item.getTitanyumSworddmg());
								gamer.updateSwordName(gamer.getGamerusername(), item.getTitanyumSwordName());
								
								item.sworditem2to1(gamer,item); 
								
								item.setTitanyumSworddata(2);
								item.updateTitanyumSworddata(gamer.getGamerusername(), item.getTitanyumSworddata());
								
								Helper.showMessage("Kýlýç Kullanýldý.");
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				else{
					if(gamer.getGamergold() >= 2000) {
						try {
							gamer.setGamersword(item.getTitanyumSworddmg());
							gamer.setGamerswordname(item.getTitanyumSwordName());
							
							gamer.updateSword(gamer.getGamerusername(), item.getTitanyumSworddmg());
							gamer.updateSwordName(gamer.getGamerusername(), item.getTitanyumSwordName());
							
							item.sworditem2to1(gamer,item);
							
							item.setTitanyumSworddata(2);
							item.updateTitanyumSworddata(gamer.getGamerusername(), item.getTitanyumSworddata());
							
							gamer.setGamergold(gamer.getGamergold()-2000);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(gamer.getGamergold() < 2000) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
			}
		});
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setBackground(new Color(0, 0, 0));
		btnNewButton_7.setBounds(721, 443, 130, 20);
		w_swordpanel.add(btnNewButton_7);
		
		JLabel lblNewLabel_7 = new JLabel((Icon) null);
		lblNewLabel_7.setBounds(628, 199, 130, 120);
		w_swordpanel.add(lblNewLabel_7);
		
		JLabel lbl_backgr = new JLabel(new ImageIcon(getClass().getResource("swordgr.jpg")));
		lbl_backgr.setBounds(0, 0, 1197, 575);
		w_swordpanel.add(lbl_backgr);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Zýrhlar", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton_15 = new JButton("Yard\u0131m");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Helper.showMessage(
						"\n\n"
						+ "Kumaþ Zýrh +16 Koruma"
						+ "\nDeri Zýrh +23 Koruma"
						+ "\n"
						+ "\nPelerin +50 Koruma"
						+ "\n"
						+ "\nBronz Zýrh +30 Koruma"
						+ "\nDemir Zýrh +40 Koruma"
						+ "\nÇelik Zýrh +60 Koruma"
						+ "\n"
						+ "\n       Titanyum Set"
						+ "\nTitanyum Zýrh +150 Koruma"
						+ "\nTitanyum Kask +60 Koruma"
						+ "\nTitanyum Eldiven +40 Koruma"
						+ "\n"
						+ "\n"
						+ "\n");
			}
		});
		
		textField = new JTextField();
		textField.setText("Alt\u0131n :  "+gamer.getGamergold());
		textField.setForeground(new Color(0, 0, 51));
		textField.setFont(new Font("Times New Roman", Font.BOLD, 13));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(255, 204, 0));
		textField.setBounds(1087, 555, 110, 20);
		panel_1.add(textField);
		
		txtelikZrh_1 = new JTextField();
		txtelikZrh_1.setText("\u00C7elik Z\u0131rh");
		txtelikZrh_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtelikZrh_1.setForeground(Color.WHITE);
		txtelikZrh_1.setEditable(false);
		txtelikZrh_1.setColumns(10);
		txtelikZrh_1.setBackground(new Color(100, 149, 237));
		txtelikZrh_1.setBounds(955, 440, 130, 20);
		panel_1.add(txtelikZrh_1);
		
		txtDemirZrh_1 = new JTextField();
		txtDemirZrh_1.setText("Demir Z\u0131rh");
		txtDemirZrh_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtDemirZrh_1.setForeground(Color.WHITE);
		txtDemirZrh_1.setEditable(false);
		txtDemirZrh_1.setColumns(10);
		txtDemirZrh_1.setBackground(Color.GRAY);
		txtDemirZrh_1.setBounds(955, 276, 130, 20);
		panel_1.add(txtDemirZrh_1);
		btnNewButton_15.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnNewButton_15.setForeground(new Color(255, 255, 255));
		btnNewButton_15.setBackground(new Color(51, 102, 153));
		btnNewButton_15.setBounds(1095, 11, 89, 23);
		panel_1.add(btnNewButton_15);
		
		JButton btnNewButton_9_1 = new JButton("270 Alt\u0131n");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item.getDemirArmordata()==2) {
					Helper.showMessage("Zaten bu zýrhý kullanýyorsun!");
				}
				else if(item.getBronzArmordata()==1) {
						if(Helper.confirm("Bu zýrha sahipsin. Kullanmak istiyor musun?")) {
							try {
								gamer.setGamerarmor(item.getDemirArmordmg());
								gamer.setGamerarmorname(item.getDemirArmorName());
								
								gamer.updateArmor(gamer.getGamerusername(), item.getDemirArmordmg());
								gamer.updateArmorName(gamer.getGamerusername(), item.getDemirArmorName());
								
								item.armoritem2to1(gamer,item); 
								
								item.setDemirArmordata(2);
								item.updateDemirArmordata(gamer.getGamerusername(), item.getDemirArmordata());
								
								Helper.showMessage("Zýrh Kullanýldý.");
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				else{
					if(gamer.getGamergold() >= 270) {
						try {
							gamer.setGamerarmor(item.getDemirArmordmg());
							gamer.setGamerarmorname(item.getDemirArmorName());
							
							gamer.updateArmor(gamer.getGamerusername(), item.getDemirArmordmg());
							gamer.updateArmorName(gamer.getGamerusername(), item.getDemirArmorName());
							
							item.armoritem2to1(gamer,item);
							
							item.setDemirArmordata(2);
							item.updateDemirArmordata(gamer.getGamerusername(), item.getDemirArmordata());
							
							gamer.setGamergold(gamer.getGamergold()-270);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(gamer.getGamergold() < 270) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
				
			}
		});
		btnNewButton_9_1.setForeground(Color.WHITE);
		btnNewButton_9_1.setBackground(new Color(0, 0, 0));
		btnNewButton_9_1.setBounds(955, 295, 130, 20);
		panel_1.add(btnNewButton_9_1);
		
		JButton btnNewButton_10_1 = new JButton("400 Alt\u0131n");
		btnNewButton_10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item.getCelikArmordata()==2) {
					Helper.showMessage("Zaten bu zýrhý kullanýyorsun!");
				}
				else if(item.getCelikArmordata()==1) {
						if(Helper.confirm("Bu zýrha sahipsin. Kullanmak istiyor musun?")) {
							try {
								gamer.setGamerarmor(item.getCelikArmordmg());
								gamer.setGamerarmorname(item.getCelikArmorName());
								
								gamer.updateArmor(gamer.getGamerusername(), item.getCelikArmordmg());
								gamer.updateArmorName(gamer.getGamerusername(), item.getCelikArmorName());
								
								item.armoritem2to1(gamer,item); 
								
								item.setCelikArmordata(2);
								item.updateCelikArmordata(gamer.getGamerusername(), item.getCelikArmordata());
								
								Helper.showMessage("Zýrh Kullanýldý.");
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				else{
					if(gamer.getGamergold() >= 400) {
						try {
							gamer.setGamerarmor(item.getCelikArmordmg());
							gamer.setGamerarmorname(item.getCelikArmorName());
							
							gamer.updateArmor(gamer.getGamerusername(), item.getCelikArmordmg());
							gamer.updateArmorName(gamer.getGamerusername(), item.getCelikArmorName());
							
							item.armoritem2to1(gamer,item);
							
							item.setCelikArmordata(2);
							item.updateCelikArmordata(gamer.getGamerusername(), item.getCelikArmordata());
							
							gamer.setGamergold(gamer.getGamergold()-400);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(gamer.getGamergold() < 400) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
			}
		});
		btnNewButton_10_1.setForeground(Color.WHITE);
		btnNewButton_10_1.setBackground(new Color(0, 0, 0));
		btnNewButton_10_1.setBounds(955, 459, 130, 20);
		panel_1.add(btnNewButton_10_1);
		
		JButton btnNewButton_8_1 = new JButton("150 Alt\u0131n");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item.getBronzArmordata()==2) {
					Helper.showMessage("Zaten bu zýrhý kullanýyorsun!");
				}
				else if(item.getBronzArmordata()==1) {
						if(Helper.confirm("Bu zýrha sahipsin. Kullanmak istiyor musun?")) {
							try {
								gamer.setGamerarmor(item.getBronzArmordmg());
								gamer.setGamerarmorname(item.getBronzArmorName());
								
								gamer.updateArmor(gamer.getGamerusername(), item.getBronzArmordmg());
								gamer.updateArmorName(gamer.getGamerusername(), item.getBronzArmorName());
								
								item.armoritem2to1(gamer,item); 
								
								item.setBronzArmordata(2);
								item.updateBronzArmordata(gamer.getGamerusername(), item.getBronzArmordata());
								
								Helper.showMessage("Zýrh Kullanýldý.");
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				else{
					if(gamer.getGamergold() >= 150) {
						try {
							gamer.setGamerarmor(item.getBronzArmordmg());
							gamer.setGamerarmorname(item.getBronzArmorName());
							
							gamer.updateArmor(gamer.getGamerusername(), item.getBronzArmordmg());
							gamer.updateArmorName(gamer.getGamerusername(), item.getBronzArmorName());
							
							item.armoritem2to1(gamer,item);
							
							item.setBronzArmordata(2);
							item.updateBronzArmordata(gamer.getGamerusername(), item.getBronzArmordata());
							
							gamer.setGamergold(gamer.getGamergold()-40);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(gamer.getGamergold() < 150) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
			}
		});
		btnNewButton_8_1.setForeground(Color.WHITE);
		btnNewButton_8_1.setBackground(new Color(0, 0, 0));
		btnNewButton_8_1.setBounds(955, 123, 130, 20);
		panel_1.add(btnNewButton_8_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Bronz Z\u0131rh");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(new Color(255, 250, 250));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(204, 153, 51));
		textField_2.setBounds(955, 104, 130, 20);
		panel_1.add(textField_2);
		
		JButton btnNewButton_8 = new JButton("30  Alt\u0131n");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item.getKumasArmordata()==2) {
					Helper.showMessage("Zaten bu zýrhý kullanýyorsun!");
				}
				else if(item.getKumasArmordata()==1) {
						if(Helper.confirm("Bu zýrha sahipsin. Kullanmak istiyor musun?")) {
							try {
								gamer.setGamerarmor(item.getKumasArmordmg());
								gamer.setGamerarmorname(item.getKumasArmorName());
								
								gamer.updateArmor(gamer.getGamerusername(), item.getKumasArmordmg());
								gamer.updateArmorName(gamer.getGamerusername(), item.getKumasArmorName());
								
								item.armoritem2to1(gamer,item); 
								
								item.setKumasArmordata(2);
								item.updateKumasArmordata(gamer.getGamerusername(), item.getKumasArmordata());
								
								Helper.showMessage("Zýrh Kullanýldý.");
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				else{
					if(gamer.getGamergold() >= 30) {
						try {
							gamer.setGamerarmor(item.getKumasArmordmg());
							gamer.setGamerarmorname(item.getKumasArmorName());
							
							gamer.updateArmor(gamer.getGamerusername(), item.getKumasArmordmg());
							gamer.updateArmorName(gamer.getGamerusername(), item.getKumasArmorName());
							
							item.armoritem2to1(gamer,item);
							
							item.setKumasArmordata(2);
							item.updateKumasArmordata(gamer.getGamerusername(), item.getKumasArmordata());
							
							gamer.setGamergold(gamer.getGamergold()-30);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(gamer.getGamergold() < 30) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
			}
		});
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setBackground(new Color(0, 0, 0));
		btnNewButton_8.setBounds(27, 123, 130, 20);
		panel_1.add(btnNewButton_8);
		
		txtDemirZrh = new JTextField();
		txtDemirZrh.setText("Kuma\u015F Z\u0131rh");
		txtDemirZrh.setHorizontalAlignment(SwingConstants.CENTER);
		txtDemirZrh.setForeground(new Color(255, 250, 250));
		txtDemirZrh.setEditable(false);
		txtDemirZrh.setColumns(10);
		txtDemirZrh.setBackground(new Color(102, 102, 0));
		txtDemirZrh.setBounds(27, 104, 130, 20);
		panel_1.add(txtDemirZrh);
		
		JLabel lblNewLabel_8 = new JLabel((Icon) null);
		lblNewLabel_8.setBounds(27, 23, 130, 120);
		panel_1.add(lblNewLabel_8);
		
		JButton btnNewButton_9 = new JButton("50 Alt\u0131n");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item.getDeriArmordata()==2) {
					Helper.showMessage("Zaten bu zýrhý kullanýyorsun!");
				}
				else if(item.getDeriArmordata()==1) {
						if(Helper.confirm("Bu zýrha sahipsin. Kullanmak istiyor musun?")) {
							try {
								gamer.setGamerarmor(item.getDeriArmordmg());
								gamer.setGamerarmorname(item.getDeriArmorName());
								
								gamer.updateArmor(gamer.getGamerusername(), item.getDeriArmordmg());
								gamer.updateArmorName(gamer.getGamerusername(), item.getDeriArmorName());
								
								item.armoritem2to1(gamer,item); 
								
								item.setDeriArmordata(2);
								item.updateDeriArmordata(gamer.getGamerusername(), item.getDeriArmordata());
								
								Helper.showMessage("Zýrh Kullanýldý.");
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				else{
					if(gamer.getGamergold() >= 50) {
						try {
							gamer.setGamerarmor(item.getDeriArmordmg());
							gamer.setGamerarmorname(item.getDeriArmorName());
							
							gamer.updateArmor(gamer.getGamerusername(), item.getDeriArmordmg());
							gamer.updateArmorName(gamer.getGamerusername(), item.getDeriArmorName());
							
							item.armoritem2to1(gamer,item);
							
							item.setDeriArmordata(2);
							item.updateDeriArmordata(gamer.getGamerusername(), item.getDeriArmordata());
							
							gamer.setGamergold(gamer.getGamergold()-50);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(gamer.getGamergold() < 50) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
			}
		});
		btnNewButton_9.setForeground(Color.WHITE);
		btnNewButton_9.setBackground(new Color(0, 0, 0));
		btnNewButton_9.setBounds(27, 295, 130, 20);
		panel_1.add(btnNewButton_9);
		
		txtDemirKl_1 = new JTextField();
		txtDemirKl_1.setText("Deri Z\u0131rh");
		txtDemirKl_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtDemirKl_1.setForeground(new Color(255, 250, 250));
		txtDemirKl_1.setEditable(false);
		txtDemirKl_1.setColumns(10);
		txtDemirKl_1.setBackground(new Color(102, 51, 0));
		txtDemirKl_1.setBounds(27, 276, 130, 20);
		panel_1.add(txtDemirKl_1);
		
		JLabel lblNewLabel_9 = new JLabel((Icon) null);
		lblNewLabel_9.setBounds(27, 223, 130, 120);
		panel_1.add(lblNewLabel_9);
		
		JButton btnNewButton_10 = new JButton("200 Alt\u0131n");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item.getPelerinArmordata()==2) {
					Helper.showMessage("Pelerin zaten üstünde!");
				}
				else{
					if(gamer.getGamergold() >= 200) {
						try {
							gamer.setGamerpelerindmg(item.getPelerinArmordmg());
							gamer.setGamerpelerinyn("Var");
							gamer.updatePelerin(gamer.getGamerusername(),item.getPelerinArmordmg());
							gamer.updatePelerinyn(gamer.getGamerusername());
							
							
							item.setPelerinArmordata(2);
							item.updatePelerinArmordata(gamer.getGamerusername(), item.getPelerinArmordata());
							
							gamer.setGamergold(gamer.getGamergold()-200);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(gamer.getGamergold() < 200) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
			}
		});
		btnNewButton_10.setForeground(Color.WHITE);
		btnNewButton_10.setBackground(new Color(0, 0, 0));
		btnNewButton_10.setBounds(27, 459, 130, 20);
		panel_1.add(btnNewButton_10);
		
		txtelikZrh = new JTextField();
		txtelikZrh.setText("Pelerin");
		txtelikZrh.setHorizontalAlignment(SwingConstants.CENTER);
		txtelikZrh.setForeground(new Color(255, 250, 250));
		txtelikZrh.setEditable(false);
		txtelikZrh.setColumns(10);
		txtelikZrh.setBackground(new Color(255, 51, 51));
		txtelikZrh.setBounds(27, 440, 130, 20);
		panel_1.add(txtelikZrh);
		
		JLabel lblNewLabel_10 = new JLabel((Icon) null);
		lblNewLabel_10.setBounds(257, 23, 130, 120);
		panel_1.add(lblNewLabel_10);
		
		JButton btnNewButton_12 = new JButton("1000 Alt\u0131n");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item.getTitanyumArmordata()==2) {
					Helper.showMessage("Zaten bu zýrhý kullanýyorsun!");
				}
				else if(item.getTitanyumArmordata()==1) {
						if(Helper.confirm("Bu zýrha sahipsin. Kullanmak istiyor musun?")) {
							try {
								gamer.setGamerarmor(item.getTitanyumArmordmg());
								gamer.setGamerarmorname(item.getTitanyumArmorName());
								
								gamer.updateArmor(gamer.getGamerusername(), item.getTitanyumArmordmg());
								gamer.updateArmorName(gamer.getGamerusername(), item.getTitanyumArmorName());
								
								item.armoritem2to1(gamer,item); 
								
								item.setTitanyumArmordata(2);
								item.updateTitanyumArmordata(gamer.getGamerusername(), item.getTitanyumArmordata());
								
								Helper.showMessage("Zýrh Kullanýldý.");
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				else{
					if(gamer.getGamergold() >= 1000) {
						try {
							gamer.setGamerarmor(item.getTitanyumArmordmg());
							gamer.setGamerarmorname(item.getTitanyumArmorName());
							
							gamer.updateArmor(gamer.getGamerusername(), item.getTitanyumArmordmg());
							gamer.updateArmorName(gamer.getGamerusername(), item.getTitanyumArmorName());
							
							item.armoritem2to1(gamer,item);
							
							item.setTitanyumArmordata(2);
							item.updateTitanyumArmordata(gamer.getGamerusername(), item.getTitanyumArmordata());
							
							gamer.setGamergold(gamer.getGamergold()-1000);
							gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
							
							Helper.showMessage("Satýn Alým Baþarýlý.");
							dispose();
							ShopGUI GUI = new ShopGUI(gamer,item);
							GUI.setVisible(true);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(gamer.getGamergold() < 1000) {
						Helper.showMessage("Yeterli Altýnýn Yok!");
					}
				}
			}
		});
		btnNewButton_12.setForeground(Color.WHITE);
		btnNewButton_12.setBackground(new Color(0, 0, 0));
		btnNewButton_12.setBounds(584, 402, 130, 20);
		panel_1.add(btnNewButton_12);
		
		txtTitanyumZrh = new JTextField();
		txtTitanyumZrh.setText("Titanyum Z\u0131rh");
		txtTitanyumZrh.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitanyumZrh.setForeground(new Color(255, 250, 250));
		txtTitanyumZrh.setEditable(false);
		txtTitanyumZrh.setColumns(10);
		txtTitanyumZrh.setBackground(new Color(0, 0, 102));
		txtTitanyumZrh.setBounds(584, 383, 130, 20);
		panel_1.add(txtTitanyumZrh);
		
		JLabel lblNewLabel_11 = new JLabel((Icon) null);
		lblNewLabel_11.setBounds(257, 223, 130, 120);
		panel_1.add(lblNewLabel_11);
		
		JButton btnNewButton_13 = new JButton("350 Alt\u0131n");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item.getTitanyumArmordata()==2 && item.getTitanyum2Armordata()==2) {
					
					if(item.getTitanyum3Armordata()==2) {
						Helper.showMessage("Zaten bu eldiveni kullanýyorsun!");
					}
					else if(item.getTitanyum3Armordata()==1) {
							if(Helper.confirm("Bu eldivene sahipsin. Kullanmak istiyor musun?")) {
								try {
									
									gamer.setGamerarmor(item.getTitanyum3Armordmg()+item.getTitanyum2Armordmg()+item.getTitanyumArmordmg());
									gamer.updateArmor(gamer.getGamerusername(),gamer.getGamerarmor());
									
									item.setTitanyum3Armordata(2);
									item.updateTitanyum3Armordata(gamer.getGamerusername(), item.getTitanyum3Armordata());
									
									Helper.showMessage("Kask Kullanýldý.");
									
									gamer.setGamerarmorname("Titanyum Set");
									gamer.updateArmorName(gamer.getGamerusername(), gamer.getGamerarmorname());
									
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						}
					else{
						if(gamer.getGamergold() >= 350) {
							try {
								gamer.setGamerarmor(item.getTitanyum3Armordmg()+item.getTitanyum2Armordmg()+item.getTitanyumArmordmg());
								gamer.updateArmor(gamer.getGamerusername(),gamer.getGamerarmor());
								
								item.setTitanyum3Armordata(2);
								item.updateTitanyum3Armordata(gamer.getGamerusername(), item.getTitanyum3Armordata());
								
								gamer.setGamerarmorname("Titanyum Set");
								gamer.updateArmorName(gamer.getGamerusername(), gamer.getGamerarmorname());
								
								gamer.setGamergold(gamer.getGamergold()-350);
								gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
								
								Helper.showMessage("Satýn Alým Baþarýlý.");
								dispose();
								ShopGUI GUI = new ShopGUI(gamer,item);
								GUI.setVisible(true);
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}else if(gamer.getGamergold() < 350) {
							Helper.showMessage("Yeterli Altýnýn Yok!");
						}
					}
				}
			else{
				Helper.showMessage("Önce Titanyum Zýrh'ý ve Titanyum Kask'ý giyin.");
			}
			}
		});
		btnNewButton_13.setForeground(Color.WHITE);
		btnNewButton_13.setBackground(new Color(0, 0, 0));
		btnNewButton_13.setBounds(257, 362, 130, 20);
		panel_1.add(btnNewButton_13);
		
		txtTitanyumEldiven = new JTextField();
		txtTitanyumEldiven.setText("Titanyum Eldiven");
		txtTitanyumEldiven.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitanyumEldiven.setForeground(new Color(255, 250, 250));
		txtTitanyumEldiven.setEditable(false);
		txtTitanyumEldiven.setColumns(10);
		txtTitanyumEldiven.setBackground(new Color(0, 0, 102));
		txtTitanyumEldiven.setBounds(257, 343, 130, 20);
		panel_1.add(txtTitanyumEldiven);
		
		JLabel lblNewLabel_12 = new JLabel((Icon) null);
		lblNewLabel_12.setBounds(479, 23, 130, 120);
		panel_1.add(lblNewLabel_12);
		
		JButton btnNewButton_14 = new JButton("400 Alt\u0131n");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if(item.getTitanyumArmordata()==2) {
				
					if(item.getTitanyum2Armordata()==2) {
						Helper.showMessage("Zaten bu kaský kullanýyorsun!");
					}
					else if(item.getTitanyum2Armordata()==1) {
							if(Helper.confirm("Bu kaska sahipsin. Kullanmak istiyor musun?")) {
								try {
									
									gamer.setGamerarmor(item.getTitanyum2Armordmg()+item.getTitanyumArmordmg());
									gamer.updateArmor(gamer.getGamerusername(),gamer.getGamerarmor());
									
									item.setTitanyum2Armordata(2);
									item.updateTitanyum2Armordata(gamer.getGamerusername(), item.getTitanyum2Armordata());
									
									Helper.showMessage("Kask Kullanýldý.");
									
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						}
					else{
						if(gamer.getGamergold() >= 400) {
							try {
								gamer.setGamerarmor(item.getTitanyum2Armordmg()+item.getTitanyumArmordmg());
								gamer.updateArmor(gamer.getGamerusername(),gamer.getGamerarmor());
								
								item.setTitanyum2Armordata(2);
								item.updateTitanyum2Armordata(gamer.getGamerusername(), item.getTitanyum2Armordata());
								
								gamer.setGamergold(gamer.getGamergold()-400);
								gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
								
								Helper.showMessage("Satýn Alým Baþarýlý.");
								dispose();
								ShopGUI GUI = new ShopGUI(gamer,item);
								GUI.setVisible(true);
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}else if(gamer.getGamergold() < 400) {
							Helper.showMessage("Yeterli Altýnýn Yok!");
						}
					}
				}
			else{
				Helper.showMessage("Önce Titanyum Zýrh'ý giyin.");
			}
			}
		});
		btnNewButton_14.setForeground(Color.WHITE);
		btnNewButton_14.setBackground(new Color(0, 0, 0));
		btnNewButton_14.setBounds(584, 173, 130, 20);
		panel_1.add(btnNewButton_14);
		
		txtTitanyumKask = new JTextField();
		txtTitanyumKask.setText("Titanyum Kask");
		txtTitanyumKask.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitanyumKask.setForeground(new Color(255, 250, 250));
		txtTitanyumKask.setEditable(false);
		txtTitanyumKask.setColumns(10);
		txtTitanyumKask.setBackground(new Color(0, 0, 102));
		txtTitanyumKask.setBounds(584, 154, 130, 20);
		panel_1.add(txtTitanyumKask);
		
		JLabel lblNewLabel_13 = new JLabel((Icon) null);
		lblNewLabel_13.setBounds(479, 223, 130, 120);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel((Icon) null);
		lblNewLabel_14.setBounds(722, 23, 130, 120);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel((Icon) null);
		lblNewLabel_15.setBounds(722, 223, 130, 120);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel((Icon) null);
		lblNewLabel_16.setBounds(955, 23, 130, 120);
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel((Icon) null);
		lblNewLabel_17.setBounds(955, 223, 130, 120);
		panel_1.add(lblNewLabel_17);
		
		JLabel lbl_backgr_1 = new JLabel(new ImageIcon(getClass().getResource("armorgr.jpg")));
		lbl_backgr_1.setBounds(0, 0, 1197, 575);
		panel_1.add(lbl_backgr_1);
		
		JLabel lbl_allbackgr = new JLabel(new ImageIcon(getClass().getResource("shopgr.jpg")));
		lbl_allbackgr.setBounds(0, 0, 1284, 661);
		contentPane.add(lbl_allbackgr);
		
		
	}
	
	
	
}
