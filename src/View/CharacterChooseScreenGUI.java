package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Helper.DBConnection;
import Helper.Helper;

import Model.Gamer;


import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.Icon;

public class CharacterChooseScreenGUI extends JFrame {

	static Gamer gamer = new Gamer();
	
	
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
					CharacterChooseScreenGUI frame = new CharacterChooseScreenGUI(gamer);
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
	public CharacterChooseScreenGUI(Gamer gamer) {
		setBackground(new Color(0, 0, 0));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_warriorch = new JButton("Warrior Se\u00E7");
		btn_warriorch.setBackground(new Color(135, 206, 250));
		btn_warriorch.setForeground(new Color(255, 255, 255));
		btn_warriorch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int dmg = 5;
				int health = 10;
				String name = "Warrior";
				
				try {
					boolean control = gamer.updateDamage(gamer.getGamerusername(),dmg);
					boolean control2 = gamer.updateHealth(gamer.getGamerusername(),health);
					boolean control3 = gamer.updateHeal(gamer.getGamerusername(),health);
					boolean control4 = gamer.updateHeroName(gamer.getGamerusername(),name);
					
					boolean control8 = gamer.updatePelerin(gamer.getGamerusername(), 0);
					boolean control9 = gamer.updatePelerinyn("Yok");
					
					boolean control5 = gamer.updateHeroid(gamer.getGamerusername(),1);
					boolean control6 = gamer.updateLevel(gamer.getGamerusername(),1);
					boolean control7 = gamer.updateXp(gamer.getGamerusername(),0);
					
					gamer.setGamerdamage(dmg);
					gamer.setGamerhealth(health);
					gamer.setGamerheal(health);
					gamer.setGamerheroname(name);
					gamer.setGamerheroid(1);
					gamer.setGamerlevel(1);
					gamer.setGamerxp(0);
					gamer.setGamerpelerindmg(0);
					gamer.setGamerpelerinyn("Yok");
					
					
					if(control && control2 && control3 && control4 && control5 && control6 && control7 && control8 && control9) {
						Helper.showMessage("Warrior seçildi. Devam edebilirsiniz.");
						
						
						
						
					}else {
						Helper.showMessage("error");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_warriorch.setBounds(693, 521, 230, 36);
		contentPane.add(btn_warriorch);
		
		JButton btnNewButton_6 = new JButton("Devam");
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setBackground(new Color(135, 206, 250));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StuffChooseGUI GUI = new StuffChooseGUI(gamer);
				GUI.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_6.setBounds(1087, 597, 187, 53);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton = new JButton("Gunner Se\u00E7");
		btnNewButton.setForeground(new Color(255, 250, 250));
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dmg = 5;
				int health = 10;
				String name = "Gunner";
				
				try {
					boolean control = gamer.updateDamage(gamer.getGamerusername(),dmg);
					boolean control2 = gamer.updateHealth(gamer.getGamerusername(),health);
					boolean control3 = gamer.updateHeal(gamer.getGamerusername(),health);
					boolean control4 = gamer.updateHeroName(gamer.getGamerusername(),name);
					
					
					boolean control5 = gamer.updateHeroid(gamer.getGamerusername(),2);
					boolean control6 = gamer.updateLevel(gamer.getGamerusername(),1);
					boolean control7 = gamer.updateXp(gamer.getGamerusername(),0);
					
					gamer.setGamerdamage(dmg);
					gamer.setGamerhealth(health);
					gamer.setGamerheal(health);
					gamer.setGamerheroname(name);
					gamer.setGamerheroid(2);
					gamer.setGamerlevel(1);
					gamer.setGamerxp(0);
					
					if(control && control2 && control3 && control4 && control5 && control6 && control7) {
						Helper.showMessage("Gunner seçildi. Devam edebilirsiniz.");
						
						
						
						
					}else {
						Helper.showMessage("error");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(1002, 486, 230, 36);
		contentPane.add(btnNewButton);
		
		JButton btnSorcererSe = new JButton("Sorcerer Se\u00E7");
		btnSorcererSe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dmg = 5;
				int health = 10;
				String name = "Sorcerer";
				
				try {
					boolean control = gamer.updateDamage(gamer.getGamerusername(),dmg);
					boolean control2 = gamer.updateHealth(gamer.getGamerusername(),health);
					boolean control3 = gamer.updateHeal(gamer.getGamerusername(),health);
					boolean control4 = gamer.updateHeroName(gamer.getGamerusername(),name);
					
					
					boolean control5 = gamer.updateHeroid(gamer.getGamerusername(),4);
					boolean control6 = gamer.updateLevel(gamer.getGamerusername(),1);
					boolean control7 = gamer.updateXp(gamer.getGamerusername(),0);
					
					gamer.setGamerdamage(dmg);
					gamer.setGamerhealth(health);
					gamer.setGamerheal(health);
					gamer.setGamerheroname(name);
					gamer.setGamerheroid(4);
					gamer.setGamerlevel(1);
					gamer.setGamerxp(0);
					
					if(control && control2 && control3 && control4 && control5 && control6 && control7) {
						Helper.showMessage("Sorcerer seçildi. Devam edebilirsiniz.");
						
						
						
						
					}else {
						Helper.showMessage("error");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSorcererSe.setForeground(new Color(255, 250, 250));
		btnSorcererSe.setBackground(new Color(135, 206, 250));
		btnSorcererSe.setBounds(355, 521, 230, 36);
		contentPane.add(btnSorcererSe);
		
		JButton btnAssassinSe = new JButton("Assassin Se\u00E7");
		btnAssassinSe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dmg = 5;
				int health = 10;
				String name = "Assasin";
				
				try {
					boolean control = gamer.updateDamage(gamer.getGamerusername(),dmg);
					boolean control2 = gamer.updateHealth(gamer.getGamerusername(),health);
					boolean control3 = gamer.updateHeal(gamer.getGamerusername(),health);
					boolean control4 = gamer.updateHeroName(gamer.getGamerusername(),name);
					
					
					boolean control5 = gamer.updateHeroid(gamer.getGamerusername(),3);
					boolean control6 = gamer.updateLevel(gamer.getGamerusername(),1);
					boolean control7 = gamer.updateXp(gamer.getGamerusername(),0);
					
					gamer.setGamerdamage(dmg);
					gamer.setGamerhealth(health);
					gamer.setGamerheal(health);
					gamer.setGamerheroname(name);
					gamer.setGamerheroid(3);
					gamer.setGamerlevel(1);
					gamer.setGamerxp(0);
					
					if(control && control2 && control3 && control4 && control5 && control6 && control7) {
						Helper.showMessage("Assasin seçildi. Devam edebilirsiniz.");
						
						
						
						
					}else {
						Helper.showMessage("error");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAssassinSe.setForeground(new Color(255, 250, 250));
		btnAssassinSe.setBackground(new Color(135, 206, 250));
		btnAssassinSe.setBounds(49, 521, 230, 36);
		contentPane.add(btnAssassinSe);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(getClass().getResource("cc.jpg")));
		lblNewLabel_2.setBounds(0, 0, 1284, 661);
		contentPane.add(lblNewLabel_2);
	}
}
