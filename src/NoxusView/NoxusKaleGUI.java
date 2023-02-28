package NoxusView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import EnemyModel.Darius;
import EnemyModel.Enemy;
import EnemyModel.NoxusKaleAskeri;
import Helper.Helper;
import ItemModel.Item;
import Model.Gamer;
import View.MainScreenGUI;

import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import java.awt.Font;

public class NoxusKaleGUI extends JFrame {
	
	static Gamer gamer = new Gamer();
	static Item item = new Item();
 
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JTextField txtDarus;
	private JLabel lblNewLabel_2_6;
	private JLabel lblNewLabel_2_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoxusKaleGUI frame = new NoxusKaleGUI(gamer,item);
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
	public NoxusKaleGUI(Gamer gamer,Item item) {
		
		NoxusKaleAskeri enemy = new NoxusKaleAskeri();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_4_1 = new JButton("SALDIR");
		btnNewButton_4_1.setForeground(new Color(255, 255, 255));
		btnNewButton_4_1.setBackground(new Color(153, 0, 0));
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(gamer.getAttackcount()==30) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(31);
					}
				}else if(gamer.getAttackcount()==32) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(33); 
					}
				}
				else if(gamer.getAttackcount() < 31){
					Helper.showMessage("Önceki Birliði Yenin!!!");
				}else {
					Helper.showMessage("Bu birliði yendin.");
				}
				
			}
		});
		btnNewButton_4_1.setBounds(1048, 567, 79, 23);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_2_1 = new JButton("SALDIR");
		btnNewButton_2_1.setForeground(new Color(255, 255, 255));
		btnNewButton_2_1.setBackground(new Color(153, 0, 0));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(gamer.getAttackcount()==39 ) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(41);
					}
				}
				else if(gamer.getAttackcount()==40) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(42);
					}
				}else if(gamer.getAttackcount() < 41){
					Helper.showMessage("Önceki Birliði Yenin!!!");
				}else {
					Helper.showMessage("Bu birliði yendin.");
				}
			}
		});
		btnNewButton_2_1.setBounds(434, 400, 79, 23);
		contentPane.add(btnNewButton_2_1);
		
		lblNewLabel_2_7 = new JLabel(new ImageIcon(getClass().getResource("k.png")));
		lblNewLabel_2_7.setBounds(139, 372, 89, 196);
		contentPane.add(lblNewLabel_2_7);
		
		lblNewLabel_2_6 = new JLabel(new ImageIcon(getClass().getResource("k.png")));
		lblNewLabel_2_6.setBounds(1038, 372, 89, 196);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_5 = new JLabel(new ImageIcon(getClass().getResource("k.png")));
		lblNewLabel_2_5.setBounds(939, 309, 89, 196);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_4 = new JLabel(new ImageIcon(getClass().getResource("k.png")));
		lblNewLabel_2_4.setBounds(840, 253, 89, 196);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_3 = new JLabel(new ImageIcon(getClass().getResource("k.png")));
		lblNewLabel_2_3.setBounds(236, 309, 89, 196);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_2 = new JLabel(new ImageIcon(getClass().getResource("k.png")));
		lblNewLabel_2_2.setBounds(325, 253, 89, 196);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1 = new JLabel(new ImageIcon(getClass().getResource("k.png")));
		lblNewLabel_2_1.setBounds(424, 205, 89, 196);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(getClass().getResource("k.png")));
		lblNewLabel_2.setBounds(741, 205, 89, 196);
		contentPane.add(lblNewLabel_2);
		
		txtDarus = new JTextField();
		txtDarus.setFont(new Font("Castellar", Font.BOLD, 16));
		txtDarus.setForeground(new Color(255, 255, 255));
		txtDarus.setBackground(new Color(153, 0, 51));
		txtDarus.setEditable(false);
		txtDarus.setHorizontalAlignment(SwingConstants.CENTER);
		txtDarus.setText("DARIUS");
		txtDarus.setBounds(559, 119, 158, 34);
		contentPane.add(txtDarus);
		txtDarus.setColumns(10);
		
		btnNewButton_10 = new JButton("KAFA TUT");
		btnNewButton_10.setBackground(new Color(153, 0, 102));
		btnNewButton_10.setForeground(new Color(255, 255, 255));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(gamer.getAttackcount()==42) {
					gamer.setGamerhealth(gamer.getGamerheal());
					Helper.showMessage("Canýn Yenilendi! Darius'la Savaþmaya Hazýrsýn.");
					Darius darius = new Darius();
					DariusGUI GUI = new DariusGUI(gamer,darius,item);
					GUI.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton_10.setBounds(559, 164, 158, 34);
		contentPane.add(btnNewButton_10);
		
		btnNewButton = new JButton("SALDIR");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(153, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(gamer.getAttackcount()==36 ) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(38);
					}
				}
				else if(gamer.getAttackcount()==37) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(39);
					}
				}else if(gamer.getAttackcount() < 38){
					Helper.showMessage("Önceki Birliði Yenin!!!");
				}else {
					Helper.showMessage("Bu birliði yendin.");
				}
			}
		});
		btnNewButton.setBounds(335, 454, 79, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_2 = new JButton("SALDIR");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(153, 0, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(gamer.getAttackcount()==30 ) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(32);
					}
				}
				else if(gamer.getAttackcount()==31) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(33);
					}
				}else if(gamer.getAttackcount() < 32){
					Helper.showMessage("Önceki Birliði Yenin!!!");
				}else {
					Helper.showMessage("Bu birliði yendin.");
				}
			}
		});
		btnNewButton_2.setBounds(149, 567, 79, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("SALDIR");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(153, 0, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(gamer.getAttackcount()==36) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(37);
					}
				}else if(gamer.getAttackcount()==38) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(39);
					}
				}else if(gamer.getAttackcount() < 37){
					Helper.showMessage("Önceki Birliði Yenin!!!");
				}else {
					Helper.showMessage("Bu birliði yendin.");
				}
				
			}
		});
		btnNewButton_3.setBounds(850, 460, 79, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("SALDIR");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(153, 0, 0));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(gamer.getAttackcount()==33) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(34);
					}
				}else if(gamer.getAttackcount()==35) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(36);
					}
				}else if(gamer.getAttackcount() < 34){
					Helper.showMessage("Önceki Birliði Yenin!!!");
				}else {
					Helper.showMessage("Bu birliði yendin.");
				}
			}
		});
		btnNewButton_4.setBounds(949, 516, 79, 23);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_6 = new JButton("SALDIR");
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setBackground(new Color(153, 0, 0));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(gamer.getAttackcount()==39) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(40);
					}
				}else if(gamer.getAttackcount()==41) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(42);
					}
				}else if(gamer.getAttackcount() < 40){
					Helper.showMessage("Önceki Birliði Yenin!!!");
				}else {
					Helper.showMessage("Bu birliði yendin.");
				}
			}
		});
		btnNewButton_6.setBounds(751, 400, 79, 23);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("SALDIR");
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setBackground(new Color(153, 0, 0));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(gamer.getAttackcount()==33 ) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(35);
					}
				}
				else if(gamer.getAttackcount()==34) {
					boolean control = enemy.combat(gamer,enemy);
					if(control) {
						Helper.showMessage("Canýn : "+gamer.getGamerhealth());
						gamer.setAttackcount(36);
					}
				}else if(gamer.getAttackcount() < 35){
					Helper.showMessage("Önceki Birliði Yenin!!!");
				}else {
					Helper.showMessage("Bu birliði yendin.");
				}
			}
		});
		btnNewButton_7.setBounds(238, 516, 87, 23);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_11 = new JButton("TESL\u0130M OL");
		btnNewButton_11.setForeground(new Color(153, 0, 51));
		btnNewButton_11.setBackground(new Color(255, 255, 102));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Helper.confirm("Teslim olursan merkeze kaçarsýn ama altýn kaybedersin. Emin misin?")) {
					
					MainScreenGUI GUI = new MainScreenGUI(gamer,item);
					GUI.setVisible(true);
					dispose();
					try {
						gamer.setGamergold(gamer.getGamergold()-100);
						gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				
			}
		});
		btnNewButton_11.setBounds(586, 605, 106, 34);
		contentPane.add(btnNewButton_11);
		
		JLabel lbl_dari = new JLabel(new ImageIcon(getClass().getResource("dari.jpg")));
		lbl_dari.setBounds(559, 175, 158, 181);
		contentPane.add(lbl_dari);
		
		JLabel lbl_backgr = new JLabel(new ImageIcon(getClass().getResource("hall.jpg")));
		lbl_backgr.setBounds(0, -59, 1284, 709);
		contentPane.add(lbl_backgr);
	}
	
}
