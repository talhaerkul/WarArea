package NoxusView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import EnemyModel.NoxusDevriye;
import EnemyModel.NoxusDevriye2;
import EnemyModel.NoxusKaleAskeri;
import ItemModel.Item;
import Model.Gamer;
import View.MainScreenGUI;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class NoxusSýnýrýGUI extends JFrame {
	
	static Gamer gamer = new Gamer();
	static Item item = new Item();
	
	private JPanel contentPane;
	private JTextField txtNoxusDevriyeleri;
	private JTextField txtNoxusKarakolu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoxusSýnýrýGUI frame = new NoxusSýnýrýGUI(gamer,item);
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
	public NoxusSýnýrýGUI(Gamer gamer,Item item) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(178, 34, 34));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2_1 = new JButton("MERKEZE GER\u0130 D\u00D6N");
		btnNewButton_2_1.setForeground(new Color(255, 255, 255));
		btnNewButton_2_1.setBackground(new Color(153, 0, 51));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreenGUI GUI = new MainScreenGUI(gamer,item);
				GUI.setVisible(true);
				dispose();
			}
			
		});
		btnNewButton_2_1.setBounds(720, 615, 212, 35);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2 = new JButton("BU YOLDA DEVAM ET");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(153, 0, 51));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NoxusOrmanGUI GUI = new NoxusOrmanGUI(gamer,item);
				GUI.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(774, 344, 172, 42);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("SOLA D\u00D6N");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random random = new Random();
				int num = random.nextInt(4);
				NoxusDevriye nd = new NoxusDevriye();
				NoxusDevriye2 nd2 = new NoxusDevriye2();
				System.out.println(num);
				if(num == 2) {
					NoxusDevriye2GUI GUI = new NoxusDevriye2GUI(gamer,nd2,item);
					GUI.setVisible(true);
					dispose();
				}else{
					NoxusDevriyeGUI GUI = new NoxusDevriyeGUI(gamer,nd,item);
					GUI.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(153, 0, 51));
		btnNewButton.setBounds(10, 459, 126, 28);
		contentPane.add(btnNewButton);
		
		JButton btnSaaDn = new JButton("SA\u011EA D\u00D6N");
		btnSaaDn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NoxusKaleAskeri nka = new NoxusKaleAskeri();
				NoxusKarakolGUI GUI = new NoxusKarakolGUI(gamer,nka,item);
				GUI.setVisible(true);
				dispose();
				
			}
		});
		btnSaaDn.setForeground(new Color(255, 255, 255));
		btnSaaDn.setBackground(new Color(153, 0, 51));
		btnSaaDn.setBounds(1137, 279, 119, 28);
		contentPane.add(btnSaaDn);
		
		txtNoxusDevriyeleri = new JTextField();
		txtNoxusDevriyeleri.setHorizontalAlignment(SwingConstants.CENTER);
		txtNoxusDevriyeleri.setEditable(false);
		txtNoxusDevriyeleri.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtNoxusDevriyeleri.setForeground(new Color(153, 0, 0));
		txtNoxusDevriyeleri.setText("Noxus Devriyeleri");
		txtNoxusDevriyeleri.setBackground(new Color(153, 204, 102));
		txtNoxusDevriyeleri.setBounds(10, 432, 126, 20);
		contentPane.add(txtNoxusDevriyeleri);
		txtNoxusDevriyeleri.setColumns(10);
		
		txtNoxusKarakolu = new JTextField();
		txtNoxusKarakolu.setHorizontalAlignment(SwingConstants.CENTER);
		txtNoxusKarakolu.setText("Noxus Karakolu");
		txtNoxusKarakolu.setForeground(new Color(153, 0, 0));
		txtNoxusKarakolu.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtNoxusKarakolu.setEditable(false);
		txtNoxusKarakolu.setColumns(10);
		txtNoxusKarakolu.setBackground(new Color(153, 204, 102));
		txtNoxusKarakolu.setBounds(1137, 252, 119, 20);
		contentPane.add(txtNoxusKarakolu);
		
		JLabel lbl_backgr = new JLabel(new ImageIcon(getClass().getResource("sýnýr.jpg")));
		lbl_backgr.setBounds(0, 0, 1284, 661);
		contentPane.add(lbl_backgr);
	}
}
