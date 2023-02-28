package NoxusView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import EnemyModel.Enemy;
import EnemyModel.NoxusCityAskeri;
import EnemyModel.NoxusKaleAskeri;
import EnemyModel.NoxusKaleMuhafýzý;
import Helper.Helper;
import ItemModel.Item;
import View.CombatGUI;
import View.MainScreenGUI;
import Model.Gamer;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Font;

public class NoxusCityGUI extends JFrame {

	static Gamer gamer = new Gamer();
	static Item item = new Item();

	private JPanel contentPane;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JTextField txtA;
	private JLabel lbl_backgr;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtKaleYolu;
	private JTextField txtehirBirlikleri;
	private JTextField txtKaleMuhafzlar;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoxusCityGUI frame = new NoxusCityGUI(gamer,item);
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
	public NoxusCityGUI(Gamer gamer,Item item) {
		
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton_7 = new JButton("SALDIR");
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setBackground(new Color(153, 0, 51));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					NoxusKaleMuhafýzý nka = new NoxusKaleMuhafýzý();
					CombatGUI GUI = new CombatGUI(gamer,nka,item);
					GUI.setVisible(true);
					dispose();
					
				
				
			}
		});
		
		textField = new JTextField();
		textField.setText("Kale Muhaf\u0131zlar\u0131");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(153, 0, 0));
		textField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(153, 204, 102));
		textField.setBounds(871, 531, 119, 20);
		contentPane.add(textField);
		
		txtKaleMuhafzlar = new JTextField();
		txtKaleMuhafzlar.setText("Kale Muhaf\u0131zlar\u0131");
		txtKaleMuhafzlar.setHorizontalAlignment(SwingConstants.CENTER);
		txtKaleMuhafzlar.setForeground(new Color(153, 0, 0));
		txtKaleMuhafzlar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtKaleMuhafzlar.setEditable(false);
		txtKaleMuhafzlar.setColumns(10);
		txtKaleMuhafzlar.setBackground(new Color(153, 204, 102));
		txtKaleMuhafzlar.setBounds(690, 456, 119, 20);
		contentPane.add(txtKaleMuhafzlar);
		
		txtehirBirlikleri = new JTextField();
		txtehirBirlikleri.setText("\u015Eehir Birlikleri");
		txtehirBirlikleri.setHorizontalAlignment(SwingConstants.CENTER);
		txtehirBirlikleri.setForeground(new Color(153, 0, 0));
		txtehirBirlikleri.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtehirBirlikleri.setEditable(false);
		txtehirBirlikleri.setColumns(10);
		txtehirBirlikleri.setBackground(new Color(153, 204, 102));
		txtehirBirlikleri.setBounds(5, 385, 119, 20);
		contentPane.add(txtehirBirlikleri);
		btnNewButton_7.setBounds(871, 518, 119, 14);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_5 = new JButton("SALDIR");
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setBackground(new Color(153, 0, 51));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					NoxusCityAskeri nca = new NoxusCityAskeri();
					CombatGUI GUI = new CombatGUI(gamer,nca,item);
					GUI.setVisible(true);
					dispose();
					
					
				
				
				
				
			}
		});
		btnNewButton_5.setBounds(5, 403, 119, 23);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("SALDIR");
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setBackground(new Color(153, 0, 51));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("2.muhafýz attackcount"+gamer.getAttackcount());
				if(gamer.getAttackcount()>=4) {
					
					System.out.println(gamer.getAttackcount());
					NoxusKaleMuhafýzý nkm = new NoxusKaleMuhafýzý();
					CombatGUI GUI = new CombatGUI(gamer,nkm,item);
					GUI.setVisible(true);
					dispose();
					
				}else {
					Helper.showMessage("Ýlk muhafýzlarý geçmeden bu birlikle savaþamazsýnýz.");
				}
			}
		});
		btnNewButton_6.setBounds(690, 474, 119, 14);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_4 = new JButton("Sat\u0131c\u0131");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(153, 0, 102));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton_4.setBounds(413, 586, 100, 23);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_3 = new JButton("KALEYE G\u0130T");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(102, 0, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(gamer.getAttackcount()==30) {
					if(Helper.confirm("Kaleye girerseniz savaþmadan çýkamazsýnýz. Emin misiniz ?")) {
						NoxusKaleGUI GUI = new NoxusKaleGUI(gamer,item);
						GUI.setVisible(true);
						dispose();
					}
				
				}else {
					Helper.showMessage("Muhafýzlarý yenmelisiniz!!!");
				}
				
				
			}
		});
		btnNewButton_3.setBounds(709, 315, 100, 37);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_2 = new JButton("GER\u0130 Y\u00DCR\u00DC");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 51, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NoxusOrmanGUI GUI = new NoxusOrmanGUI(gamer,item);
				GUI.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(181, 635, 114, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_1 = new JButton("MERKEZE KA\u00C7");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(112, 128, 144));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreenGUI GUI = new MainScreenGUI(gamer,item);
				GUI.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(5, 635, 114, 23);
		contentPane.add(btnNewButton_1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(new Color(255, 0, 0));
		progressBar.setForeground(new Color(0, 255, 0));
		progressBar.setBounds(5, 11, 165, 14);
		progressBar.setMaximum(gamer.getGamerheal());
		progressBar.setValue(gamer.getGamerhealth());
		contentPane.add(progressBar);
		
		txtA = new JTextField();
		txtA.setText("Can "+ gamer.getGamerhealth() +" Hasar "+(gamer.getGamerdamage()+gamer.getGamersword()));
		txtA.setEditable(false);
		txtA.setBackground(UIManager.getColor("Button.light"));
		txtA.setBounds(5, 25, 165, 14);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtKaleYolu = new JTextField();
		txtKaleYolu.setEditable(false);
		txtKaleYolu.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtKaleYolu.setBackground(new Color(102, 102, 102));
		txtKaleYolu.setForeground(new Color(255, 255, 255));
		txtKaleYolu.setHorizontalAlignment(SwingConstants.CENTER);
		txtKaleYolu.setText("KALE YOLU");
		txtKaleYolu.setBounds(287, 281, 119, 37);
		contentPane.add(txtKaleYolu);
		txtKaleYolu.setColumns(10);
		
		lblNewLabel_1 = new JLabel(new ImageIcon(getClass().getResource("kale yolu.png")));
		lblNewLabel_1.setBounds(559, 270, 725, 391);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel(new ImageIcon(getClass().getResource("kale.jpg")));
		lblNewLabel.setBounds(0, 0, 1284, 273);
		contentPane.add(lblNewLabel);
		
		lbl_backgr = new JLabel(new ImageIcon(getClass().getResource("þehir.jpg")));
		lbl_backgr.setBounds(0, 270, 561, 391);
		contentPane.add(lbl_backgr);
	}
}
