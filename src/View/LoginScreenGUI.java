package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Helper.DBConnection;
import Helper.Helper;
import ItemModel.Item;
import Model.Gamer;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class LoginScreenGUI extends JFrame {

	private DBConnection dbconnection = new DBConnection();
	
	private JPanel w_pane;
	private JTextField fld_username;
	private JPasswordField fld_password;
	private JTextField txtSavaAlannaHo;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreenGUI frame = new LoginScreenGUI();
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
	public LoginScreenGUI() {
		setTitle("SAVA\u015E ALANI");
		setBackground(Color.BLACK);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		w_pane = new JPanel();
		w_pane.setBackground(new Color(153, 0, 51));
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Kullan\u0131c\u0131 Ad\u0131");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(595, 104, 93, 26);
		w_pane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Parola");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setBounds(595, 172, 93, 26);
		w_pane.add(lblNewLabel_2_1);
		
		fld_username = new JTextField();
		fld_username.setBounds(595, 141, 93, 20);
		w_pane.add(fld_username);
		fld_username.setColumns(10);
		
		fld_password = new JPasswordField();
		fld_password.setBounds(595, 211, 93, 20);
		w_pane.add(fld_password);
		
		JButton btn_login = new JButton("Giri\u015F Yap");
		btn_login.setForeground(new Color(255, 255, 255));
		btn_login.setBackground(Color.ORANGE);
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fld_username.getText().length() == 0 || fld_password.getText().length() == 0 ) {
					Helper.showMessage("fill");
				}else {
					boolean key = true;
					try {
						Connection connection = dbconnection.connectiondbMethod();
						Statement statement = connection.createStatement();
						ResultSet resultset = statement.executeQuery("SELECT * FROM gamer");
						
						
						while(resultset.next()) {
							if(fld_username.getText().equals(resultset.getString("gamerusername_data")) && fld_password.getText().equals(resultset.getString("gamerpassword_data"))) {
								
								if(resultset.getInt("gamerheroid_data") == 0) {
									Gamer gamer = new Gamer();
									gamer.setGamername(resultset.getString("gamername_data"));
									gamer.setGamerusername(resultset.getString("gamerusername_data"));
									gamer.setGamerpassword(resultset.getString("gamerpassword_data"));
									CharacterChooseScreenGUI GUI = new CharacterChooseScreenGUI(gamer);
									GUI.setVisible(true);
									dispose();
									key = false;
								}else if(resultset.getInt("gamerheroid_data") == 1 || resultset.getInt("gamerheroid_data") == 2 || resultset.getInt("gamerheroid_data") == 3 || resultset.getInt("gamerheroid_data") == 4) {
									Gamer gamer = new Gamer();
									gamer.setGamername(resultset.getString("gamername_data"));
									gamer.setGamerusername(resultset.getString("gamerusername_data"));
									gamer.setGamerpassword(resultset.getString("gamerpassword_data"));
									gamer.setGamerheroname(resultset.getString("gamerheroname_data"));
									gamer.setGamerheroid(resultset.getInt("gamerheroid_data"));
									
									gamer.setGamerlevel(resultset.getInt("gamerlevel_data"));
									gamer.setGamerxp(resultset.getInt("gamerxp_data"));
									gamer.setGamerdamage(resultset.getInt("gamerdamage_data"));
									gamer.setGamerhealth(resultset.getInt("gamerhealth_data"));
									gamer.setGamerheal(resultset.getInt("gamerheal_data"));
									gamer.setGamersword(resultset.getInt("gamersword_data"));
									gamer.setGamerarmor(resultset.getInt("gamerarmor_data"));
									gamer.setGamergold(resultset.getInt("gamergold_data"));
									gamer.setGamerarmy(resultset.getInt("gamerarmy_data"));
									
									gamer.setGamerswordname(resultset.getString("gamerswordname_data"));
									gamer.setGamerarmorname(resultset.getString("gamerarmorname_data"));
									gamer.setGameruniqeitem(resultset.getString("gameruniqeitem_data"));
									
									gamer.setGamerpelerindmg(resultset.getInt("gamerpelerin_data"));
									gamer.setGamerpelerinyn(resultset.getString("gamerpelerinyn_data"));
									
									
									Item item = new Item();
									
									item.setEasySworddata(resultset.getInt("item_easysword_data"));
									
									item.setEasyArmordata(resultset.getInt("item_easyarmor_data"));
									
									item.setOrtaSworddata(resultset.getInt("item_ortasword_data"));
									
									item.setOrtaArmordata(resultset.getInt("item_ortaarmor_data"));
									
									item.setZorSworddata(resultset.getInt("item_zorsword_data"));
									
									item.setZorArmordata(resultset.getInt("item_zorarmor_data"));
									
									item.setZorArmordata(resultset.getInt("item_zorarmor_data"));
									
									item.setBronzSworddata(resultset.getInt("item_bronzsword_data"));
									
									item.setDemirSworddata(resultset.getInt("item_demirsword_data"));
									
									item.setCelikSworddata(resultset.getInt("item_celiksword_data"));
									
									item.setTungstenSworddata(resultset.getInt("item_tungstensword_data"));
									
									item.setInconelSworddata(resultset.getInt("item_inconelsword_data"));
									
									item.setTitanyumSworddata(resultset.getInt("item_titanyumsword_data"));
									
									item.setKumasArmordata(resultset.getInt("item_kumasarmor_data"));
									
									item.setDeriArmordata(resultset.getInt("item_deriarmor_data"));
									
									item.setPelerinArmordata(resultset.getInt("item_pelerinarmor_data"));
									
									item.setBronzArmordata(resultset.getInt("item_bronzarmor_data"));
									
									item.setDemirArmordata(resultset.getInt("item_demirarmor_data"));
									
									item.setCelikArmordata(resultset.getInt("item_celikarmor_data"));
									
									item.setTitanyumArmordata(resultset.getInt("item_titanyumarmor_data"));
									item.setTitanyum2Armordata(resultset.getInt("item_titanyum2armor_data"));
									item.setTitanyum3Armordata(resultset.getInt("item_titanyum3armor_data"));
									
									
									MainScreenGUI GUI = new MainScreenGUI(gamer,item);
									GUI.setVisible(true);
									dispose();
									key = false;
								}
								else {
									Helper.showMessage("error");
								}
							}
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
					if(key) {
						Helper.showMessage("Oyuncu bulunamadý");
					}
					
				}
			}
		});
		btn_login.setBounds(595, 254, 93, 33);
		w_pane.add(btn_login);
		
		JButton btn_register = new JButton("Kay\u0131t Ol");
		btn_register.setBackground(Color.ORANGE);
		btn_register.setForeground(new Color(255, 255, 255));
		btn_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterScreenGUI GUI = new RegisterScreenGUI();
				GUI.setVisible(true);
			}
		});
		btn_register.setBounds(595, 304, 93, 20);
		w_pane.add(btn_register);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 0, 51));
		panel.setBounds(579, 94, 125, 243);
		w_pane.add(panel);
		
		txtSavaAlannaHo = new JTextField();
		txtSavaAlannaHo.setEditable(false);
		txtSavaAlannaHo.setHorizontalAlignment(SwingConstants.CENTER);
		txtSavaAlannaHo.setForeground(new Color(255, 255, 255));
		txtSavaAlannaHo.setBackground(new Color(153, 0, 51));
		txtSavaAlannaHo.setFont(new Font("Times New Roman", Font.BOLD, 21));
		txtSavaAlannaHo.setText("SAVA\u015E ALANI'NA HO\u015E GELD\u0130N ASKER");
		txtSavaAlannaHo.setBounds(437, 24, 410, 39);
		w_pane.add(txtSavaAlannaHo);
		txtSavaAlannaHo.setColumns(10);
		
		JLabel lbl_picture = new JLabel(new ImageIcon(getClass().getResource("dari.png")));
		lbl_picture.setBounds(10, 11, 1264, 639);
		w_pane.add(lbl_picture);
	}
}
