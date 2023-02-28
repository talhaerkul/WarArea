package NoxusView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import EnemyModel.Enemy;
import EnemyModel.NoxusOrmanBirlik;
import EnemyModel.NoxusOrmanBirlik2;
import EnemyModel.NoxusOrmanBirlik3;
import ItemModel.Item;
import Model.Gamer;
import View.MainScreenGUI;

import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JProgressBar;

public class NoxusOrmanGUI extends JFrame {

	static Gamer gamer = new Gamer();
	static Item item = new Item();
	
	
	private JPanel contentPane;
	private JTextField txtNoxusehri;
	private JTextField txtBalisilkOrmanBirlikleri;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoxusOrmanGUI frame = new NoxusOrmanGUI(gamer,item);
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
	public NoxusOrmanGUI(Gamer gamer,Item item) {
		
		gamer.setAttackcount(0);
		System.out.println("ormanda attackcount"+gamer.getAttackcount());
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("GER\u0130 Y\u00DCR\u00DC");
		btnNewButton_1.setBackground(new Color(102, 0, 51));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NoxusSýnýrýGUI GUI = new NoxusSýnýrýGUI(gamer,item);
				GUI.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(479, 563, 137, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("SOLA D\u00D6N");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NoxusOrmanBirlik nob = new NoxusOrmanBirlik();
				NoxusOrmanBirlik2 nob2 = new NoxusOrmanBirlik2();
				NoxusOrmanBirlik3 nob3 = new NoxusOrmanBirlik3();
				NoxusBasiliskGUI GUI = new NoxusBasiliskGUI(gamer,nob,nob2,nob3,item);
				GUI.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBackground(new Color(102, 0, 51));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(311, 278, 168, 30);
		contentPane.add(btnNewButton);
		
		JButton btnSaaDn = new JButton("SA\u011EA D\u00D6N");
		btnSaaDn.setForeground(new Color(255, 255, 255));
		btnSaaDn.setBackground(new Color(102, 0, 51));
		btnSaaDn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NoxusCityGUI GUI = new NoxusCityGUI(gamer,item);
				GUI.setVisible(true);
				dispose();
			}
		});
		btnSaaDn.setBounds(1062, 369, 184, 30);
		contentPane.add(btnSaaDn);
		
		JButton btnNewButton_2 = new JButton("MERKEZE D\u00D6N");
		btnNewButton_2.setBackground(new Color(102, 0, 51));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreenGUI GUI = new MainScreenGUI(gamer,item);
				GUI.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(232, 620, 137, 30);
		contentPane.add(btnNewButton_2);
		
		txtNoxusehri = new JTextField();
		txtNoxusehri.setText("NOXUS \u015EEHR\u0130 >>>");
		txtNoxusehri.setHorizontalAlignment(SwingConstants.CENTER);
		txtNoxusehri.setForeground(new Color(153, 0, 0));
		txtNoxusehri.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtNoxusehri.setEditable(false);
		txtNoxusehri.setColumns(10);
		txtNoxusehri.setBackground(new Color(153, 204, 102));
		txtNoxusehri.setBounds(1062, 278, 184, 80);
		contentPane.add(txtNoxusehri);
		
		txtBalisilkOrmanBirlikleri = new JTextField();
		txtBalisilkOrmanBirlikleri.setText("Basilisk Orman Birlikleri");
		txtBalisilkOrmanBirlikleri.setHorizontalAlignment(SwingConstants.CENTER);
		txtBalisilkOrmanBirlikleri.setForeground(new Color(153, 0, 0));
		txtBalisilkOrmanBirlikleri.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtBalisilkOrmanBirlikleri.setEditable(false);
		txtBalisilkOrmanBirlikleri.setColumns(10);
		txtBalisilkOrmanBirlikleri.setBackground(new Color(153, 204, 102));
		txtBalisilkOrmanBirlikleri.setBounds(311, 245, 168, 30);
		contentPane.add(txtBalisilkOrmanBirlikleri);
		
		JLabel lbl_backgr = new JLabel(new ImageIcon(getClass().getResource("orman.jpg")));
		lbl_backgr.setBounds(0, 0, 1284, 661);
		contentPane.add(lbl_backgr);
	}
}
