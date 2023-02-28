package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Helper.DBConnection;
import Helper.Helper;
import ItemModel.Item;
import Model.Gamer;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.SwingConstants;

public class StuffChooseGUI extends JFrame {

	
	static Gamer gamer = new Gamer();
	static Item item = new Item();
	
	
	private DBConnection dbconnection = new DBConnection();
	Connection localconnection = dbconnection.connectiondbMethod();
	Statement statement = null;
	ResultSet resultset = null;
	PreparedStatement preparedStatement = null;
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StuffChooseGUI frame = new StuffChooseGUI(gamer);
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
	public StuffChooseGUI(Gamer gamer) {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Orta");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ortagold = 15;
				int ortawarriorarmy = 0;
				
				try {
					
					boolean control = gamer.updateSword(gamer.getGamerusername(),item.getOrtaSworddmg());
					boolean control2 = gamer.updateSwordName(gamer.getGamerusername(),item.getOrtaSwordName());
					boolean control3 = gamer.updateArmor(gamer.getGamerusername(),item.getOrtaArmordmg());
					boolean control4 = gamer.updateArmorName(gamer.getGamerusername(),item.getOrtaArmorName());
					boolean control5 = gamer.updateGold(gamer.getGamerusername(),ortagold);
					boolean control6 = gamer.updateArmy(gamer.getGamerusername(),ortawarriorarmy);
					
					boolean control7 = item.updateOrtaSworddata(gamer.getGamerusername(), 2);
					
					gamer.setGamersword(item.getOrtaSworddmg());
					gamer.setGamerswordname(item.getOrtaSwordName());
					gamer.setGamerarmor(item.getOrtaArmordmg());
					gamer.setGamerarmorname(item.getOrtaArmorName());
					gamer.setGamergold(ortagold);
					gamer.setGamerarmy(ortawarriorarmy);
					
					if(control && control2 && control3 && control4 && control5 && control6 && control7) {
						Helper.showMessage("Orta seçildi. Devam edebilirsiniz.");
						
						
						
						
					}else {
						Helper.showMessage("error");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBackground(new Color(135, 206, 250));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(470, 503, 354, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Zor");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int zorgold = 5;
				int zorwarriorarmy = 0;
				
				try {
					boolean control = gamer.updateSword(gamer.getGamerusername(),item.getZorSworddmg());
					boolean control2 = gamer.updateSwordName(gamer.getGamerusername(),item.getZorSwordName());
					boolean control3 = gamer.updateArmor(gamer.getGamerusername(),item.getZorArmordmg());
					boolean control4 = gamer.updateArmorName(gamer.getGamerusername(),item.getZorArmorName());
					boolean control5 = gamer.updateGold(gamer.getGamerusername(),zorgold);
					boolean control6 = gamer.updateArmy(gamer.getGamerusername(),zorwarriorarmy);
					
					boolean control7 = item.updateZorSworddata(gamer.getGamerusername(), 2);
					
					gamer.setGamersword(item.getZorSworddmg());
					gamer.setGamerswordname(item.getZorSwordName());
					gamer.setGamerarmor(item.getZorArmordmg());
					gamer.setGamerarmorname(item.getZorArmorName());
					gamer.setGamergold(zorgold);
					gamer.setGamerarmy(zorwarriorarmy);
					
					if(control && control2 && control3 && control4 && control5 && control6 && control7) {
						Helper.showMessage("Zor seçildi. Devam edebilirsiniz.");
						
						
						
						
					}else {
						Helper.showMessage("error");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(135, 206, 250));
		btnNewButton_2.setBounds(909, 503, 354, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btn_easyc = new JButton("Kolay");
		btn_easyc.setForeground(new Color(255, 255, 255));
		btn_easyc.setBackground(new Color(135, 206, 250));
		btn_easyc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int easygold = 25;
				int easywarriorarmy = 0;
				
				try {
					boolean control = gamer.updateSword(gamer.getGamerusername(),item.getEasySworddmg());
					boolean control2 = gamer.updateSwordName(gamer.getGamerusername(),item.getEasySwordName());
					boolean control3 = gamer.updateArmor(gamer.getGamerusername(),item.getEasyArmordmg());
					boolean control4 = gamer.updateArmorName(gamer.getGamerusername(),item.getEasyArmorName());
					boolean control5 = gamer.updateGold(gamer.getGamerusername(),easygold);
					boolean control6 = gamer.updateArmy(gamer.getGamerusername(),easywarriorarmy);
					
					boolean control7 = item.updateEasySworddata(gamer.getGamerusername(), 2);
					
					gamer.setGamersword(item.getEasySworddmg());
					gamer.setGamerswordname(item.getEasySwordName());
					gamer.setGamerarmor(item.getEasyArmordmg());
					gamer.setGamerarmorname(item.getEasyArmorName());
					gamer.setGamergold(easygold);
					gamer.setGamerarmy(easywarriorarmy);
					
					if(control && control2 && control3 && control4 && control5 && control6 && control7) {
						Helper.showMessage("Kolay seçildi. Devam edebilirsiniz.");
						
						
						
						
					}else {
						Helper.showMessage("error");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_easyc.setBounds(30, 503, 354, 29);
		contentPane.add(btn_easyc);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(getClass().getResource("easy.jpg")));
		lblNewLabel.setBounds(69, 82, 280, 378);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("Oyuna Baþla");
		btnNewButton_3.setBackground(new Color(135, 206, 250));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreenGUI GUI = new MainScreenGUI(gamer,item);
				GUI.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(977, 576, 280, 55);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(getClass().getResource("normal.jpg")));
		lblNewLabel_1.setBounds(494, 82, 292, 378);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(getClass().getResource("hard.png")));
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setBounds(935, 82, 292, 378);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("-BU SE\u00C7\u0130M BA\u015ELANGI\u00C7 S\u0130LAH VE ZIRH'INIZI ETK\u0130LER !\r\n");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(494, 578, 473, 48);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(935, 82, 292, 378);
		contentPane.add(panel);
	}
}
