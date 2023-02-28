package NoxusView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import EnemyModel.Enemy;
import Helper.Helper;
import ItemModel.Item;
import Model.Gamer;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class NoxusKarakolGUI extends JFrame {

	static Gamer gamer = new Gamer();
	static Enemy enemy = new Enemy();
	static Item item = new Item();
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
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
					NoxusKarakolGUI frame = new NoxusKarakolGUI(gamer,enemy,item);
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
	public NoxusKarakolGUI(Gamer gamer,Enemy enemy,Item item) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Sald\u0131r");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enemy.combat(gamer,enemy);
				dispose();
				NoxusKarakolGUI GUI = new NoxusKarakolGUI(gamer, enemy, item);
				GUI.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(102, 0, 51));
		btnNewButton.setBounds(153, 571, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sald\u0131r");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enemy.combat(gamer,enemy);
				dispose();
				NoxusKarakolGUI GUI = new NoxusKarakolGUI(gamer, enemy, item);
				GUI.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(102, 0, 51));
		btnNewButton_1.setBounds(136, 186, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Geri D\u00F6n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NoxusSýnýrýGUI GUI = new NoxusSýnýrýGUI(gamer,item);
				GUI.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setForeground(new Color(204, 0, 0));
		btnNewButton_2.setBackground(new Color(255, 255, 102));
		btnNewButton_2.setBounds(332, 627, 132, 23);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField("\u00D6d\u00FCl Xp = "+enemy.getXp());
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(204, 255, 153));
		textField.setBounds(366, 129, 98, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField("\u00D6d\u00FCl Alt\u0131n\u0131 = "+enemy.getAward());
		textField_1.setForeground(Color.BLACK);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 204, 51));
		textField_1.setBounds(366, 106, 98, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField("Birlik Say\u0131s\u0131 = "+enemy.getMaxNumber());
		textField_2.setForeground(Color.WHITE);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(255, 51, 0));
		textField_2.setBounds(366, 82, 98, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField("Can = "+enemy.getHealth());
		textField_3.setForeground(Color.WHITE);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(255, 51, 0));
		textField_3.setBounds(366, 58, 98, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField("Hasar = "+enemy.getDamage());
		textField_4.setForeground(Color.WHITE);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(255, 51, 0));
		textField_4.setBounds(366, 35, 98, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField(enemy.getName());
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setForeground(Color.WHITE);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(255, 51, 0));
		textField_5.setBounds(329, 11, 135, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField("Hasar\u0131n = "+(gamer.getGamerdamage()+gamer.getGamersword()));
		textField_6.setBounds(0, 594, 86, 20);
		contentPane.add(textField_6);
		textField_6.setForeground(Color.WHITE);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(51, 153, 102));
		
		textField_7 = new JTextField("Can\u0131n = "+gamer.getGamerhealth());
		textField_7.setBounds(0, 618, 86, 20);
		contentPane.add(textField_7);
		textField_7.setForeground(Color.WHITE);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(255, 0, 102));
		
		textField_8 = new JTextField("Z\u0131rh\u0131n = "+(gamer.getGamerarmor()+gamer.getGamerpelerindmg()));
		textField_8.setBounds(0, 641, 86, 20);
		contentPane.add(textField_8);
		textField_8.setForeground(Color.WHITE);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(51, 153, 204));
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(getClass().getResource("karakol.jpg")));
		lblNewLabel.setBounds(0, 0, 482, 661);
		contentPane.add(lblNewLabel);
	}
	
}
