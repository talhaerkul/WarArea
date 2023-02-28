package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import EnemyModel.Enemy;
import EnemyModel.NoxusCityAskeri;
import Helper.Helper;
import ItemModel.Item;
import Model.Gamer;
import NoxusView.NoxusCityGUI;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class CombatGUI extends JFrame {

	static Gamer gamer = new Gamer();
	static Enemy enemy = new Enemy();
	static Item item = new Item();
	
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CombatGUI frame = new CombatGUI(gamer,enemy,item);
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
	public CombatGUI(Gamer gamer,Enemy enemy,Item item) {
		setBackground(Color.BLACK);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Vazge\u00E7");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 255, 102));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NoxusCityGUI GUI = new NoxusCityGUI(gamer,item);
				GUI.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(617, 402, 101, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Sava\u015F");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(153, 0, 51));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean control = enemy.combat(gamer,enemy);
				if(control) {
					System.out.println("ilk"+gamer.getAttackcount());
					if(gamer.getAttackcount()>=4) {
						gamer.setAttackcount(30);
					}else if(enemy.getName().equals("Noxus Kale Muhafýzý")){
						gamer.setAttackcount(5);
					}
					System.out.println("son"+gamer.getAttackcount());
					NoxusCityGUI GUI = new NoxusCityGUI(gamer,item);
					GUI.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(617, 300, 101, 41);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField("Hasarýn = "+(gamer.getGamerdamage()+gamer.getGamersword()));
		textField_1.setEditable(false);
		textField_1.setForeground(new Color(255, 255, 255));
		textField_1.setBackground(new Color(51, 153, 102));
		textField_1.setColumns(10);
		textField_1.setBounds(115, 114, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField("Canýn = "+gamer.getGamerhealth());
		textField_2.setEditable(false);
		textField_2.setForeground(new Color(255, 255, 255));
		textField_2.setBackground(new Color(255, 0, 102));
		textField_2.setColumns(10);
		textField_2.setBounds(115, 138, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField("Zýrhýn = "+(gamer.getGamerarmor()+gamer.getGamerpelerindmg()));
		textField_3.setEditable(false);
		textField_3.setForeground(new Color(255, 255, 255));
		textField_3.setBackground(new Color(51, 153, 204));
		textField_3.setColumns(10);
		textField_3.setBounds(115, 161, 86, 20);
		contentPane.add(textField_3);
		
		textField = new JTextField("Birlik Sayýsý = "+enemy.getMaxNumber());
		textField.setEditable(false);
		textField.setBackground(new Color(255, 51, 0));
		textField.setForeground(new Color(255, 255, 255));
		textField.setColumns(10);
		textField.setBounds(617, 209, 98, 20);
		contentPane.add(textField);
		
		textField_4 = new JTextField("Ödül Altýný = "+enemy.getAward());
		textField_4.setEditable(false);
		textField_4.setForeground(new Color(0, 0, 0));
		textField_4.setBackground(new Color(255, 204, 51));
		textField_4.setColumns(10);
		textField_4.setBounds(617, 233, 98, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField("Ödül Xp = "+enemy.getXp());
		textField_5.setEditable(false);
		textField_5.setBackground(new Color(204, 255, 153));
		textField_5.setColumns(10);
		textField_5.setBounds(617, 256, 98, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField("Can = "+enemy.getHealth());
		textField_6.setEditable(false);
		textField_6.setForeground(new Color(255, 255, 255));
		textField_6.setBackground(new Color(255, 51, 0));
		textField_6.setColumns(10);
		textField_6.setBounds(617, 185, 98, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField("Hasar = "+enemy.getDamage());
		textField_7.setEditable(false);
		textField_7.setBackground(new Color(255, 51, 0));
		textField_7.setForeground(new Color(255, 255, 255));
		textField_7.setColumns(10);
		textField_7.setBounds(617, 162, 98, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField(enemy.getName());
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setEditable(false);
		textField_8.setBackground(new Color(255, 51, 0));
		textField_8.setForeground(new Color(255, 255, 255));
		textField_8.setColumns(10);
		textField_8.setBounds(580, 138, 135, 20);
		contentPane.add(textField_8);
		
		JLabel lbl_backgr = new JLabel(new ImageIcon(getClass().getResource("rd.jpg")));
		lbl_backgr.setBounds(-27, 0, 773, 463);
		contentPane.add(lbl_backgr);
	}
	
	
}
