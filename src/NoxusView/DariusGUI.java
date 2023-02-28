package NoxusView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import EnemyModel.Darius;
import EnemyModel.Enemy;
import Helper.Helper;
import ItemModel.Item;
import Model.Gamer;
import View.MainScreenGUI;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class DariusGUI extends JFrame {

	static Gamer gamer = new Gamer();
	static Darius darius = new Darius();
	static Item item = new Item();
	
	private JPanel contentPane;
	private JTextField txtDarusunHasar;
	private JTextField txtDarusunCan;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DariusGUI frame = new DariusGUI(gamer,darius,item);
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
	public DariusGUI(Gamer gamer,Darius darius,Item item) {
		setResizable(false);
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDarusunHasar = new JTextField("DARUIS'un Hasar\u0131 = "+darius.getDamage());
		txtDarusunHasar.setForeground(Color.WHITE);
		txtDarusunHasar.setEditable(false);
		txtDarusunHasar.setColumns(10);
		txtDarusunHasar.setBackground(new Color(153, 0, 51));
		txtDarusunHasar.setBounds(22, 540, 141, 20);
		contentPane.add(txtDarusunHasar);
		
		txtDarusunCan = new JTextField("DARIUS'un Can\u0131 = "+darius.getHeal());
		txtDarusunCan.setForeground(Color.WHITE);
		txtDarusunCan.setEditable(false);
		txtDarusunCan.setColumns(10);
		txtDarusunCan.setBackground(new Color(153, 0, 51));
		txtDarusunCan.setBounds(22, 562, 141, 20);
		contentPane.add(txtDarusunCan);
		
		textField_3 = new JTextField("\u00D6d\u00FCl Alt\u0131n\u0131 = "+darius.getAward());
		textField_3.setForeground(Color.BLACK);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(255, 204, 51));
		textField_3.setBounds(1101, 580, 162, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField("\u00D6d\u00FCl Xp = "+darius.getXp());
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(204, 255, 153));
		textField_4.setBounds(1101, 602, 162, 20);
		contentPane.add(textField_4);
		
		JProgressBar darican = new JProgressBar();
		darican.setBackground(new Color(70, 130, 180));
		darican.setForeground(new Color(255, 0, 0));
		darican.setBounds(22, 593, 1013, 29);
		darican.setMaximum(darius.getHealth());
		darican.setValue(darius.getHeal());
		contentPane.add(darican);
		
		textField = new JTextField("Hasar\u0131n = "+(gamer.getGamerdamage()+gamer.getGamersword()));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.WHITE);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(51, 153, 102));
		textField.setBounds(1022, 86, 155, 29);
		contentPane.add(textField);
		
		textField_1 = new JTextField("Can\u0131n = "+gamer.getGamerhealth());
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.WHITE);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 0, 102));
		textField_1.setBounds(1022, 119, 155, 29);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField("Z\u0131rh\u0131n = "+(gamer.getGamerarmor()+gamer.getGamerpelerindmg()));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.WHITE);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(51, 153, 204));
		textField_2.setBounds(1022, 152, 155, 29);
		contentPane.add(textField_2);
		
		btnNewButton = new JButton("Hamle Yap");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(102, 0, 51));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int dariusdmg = darius.getDamage()-((gamer.getGamerarmor()+gamer.getGamerpelerindmg())/2);
				int gamerdmg = gamer.getGamerdamage()+gamer.getGamersword();
				
				if(dariusdmg >= gamer.getGamerhealth()) {
					
					try {
						Helper.showMessage("Darius seni yendi.");
						gamer.setGamerhealth(1);
						gamer.updateHealth(gamer.getGamerusername(), 1);
						gamer.setGamergold(gamer.getGamergold()-100);
						gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
						
						MainScreenGUI GUI = new MainScreenGUI(gamer,item);
						GUI.setVisible(true);
						dispose();
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}else if(dariusdmg < gamer.getGamerhealth()){
					
					try {
						Helper.showMessage("Darius'a saldýrdýn, o da karþýlýk verdi.");
						darius.setHeal(darius.getHeal() - gamerdmg );
						
						if(dariusdmg >= 0) {
							gamer.setGamerhealth(gamer.getGamerhealth()-dariusdmg);
							}
						gamer.updateHealth(gamer.getGamerusername(), gamer.getGamerhealth());
							
						if(darius.getHeal()>0) {
						dispose();
						DariusGUI GUI = new DariusGUI(gamer,darius,item);
						GUI.setVisible(true);
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}if(darius.getHeal() <= 0){
					
					try {
						Helper.showMessage("Darius'u yendin.");
						gamer.setGamergold(gamer.getGamergold()+darius.getAward());
						gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold());
						
						MainScreenGUI GUI = new MainScreenGUI(gamer,item);
						GUI.setVisible(true);
						dispose();
						
						
					}catch(SQLException e1) {
						e1.printStackTrace();
					}
					
				}
			}
		});
		btnNewButton.setBounds(1022, 192, 155, 72);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(getClass().getResource("darri.png")));
		lblNewLabel.setBounds(0, 0, 1284, 661);
		contentPane.add(lblNewLabel);
	}
}
