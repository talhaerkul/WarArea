package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Helper.Helper;
import ItemModel.Item;
import Model.Gamer;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class RegisterScreenGUI extends JFrame {

	
	
	static Gamer gamer = new Gamer();
	static Item armor = new Item();
	
	private JPanel contentPane;
	private JTextField fld_gamerusername;
	private JTextField fld_gamername;
	private JPasswordField fld_gamerpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterScreenGUI frame = new RegisterScreenGUI();
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
	public RegisterScreenGUI() {
		setBackground(Color.BLACK);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		fld_gamerusername = new JTextField();
		fld_gamerusername.setBounds(123, 198, 86, 20);
		contentPane.add(fld_gamerusername);
		fld_gamerusername.setColumns(10);
		
		fld_gamername = new JTextField();
		fld_gamername.setBounds(123, 78, 86, 20);
		contentPane.add(fld_gamername);
		fld_gamername.setColumns(10);
		
		JButton btn_register = new JButton("Kay\u0131t Ol");
		btn_register.setBackground(Color.ORANGE);
		btn_register.setForeground(Color.WHITE);
		btn_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fld_gamername.getText().length() == 0 || fld_gamername.getText().length() == 0 || fld_gamername.getText().length() == 0) {
					Helper.showMessage("fill");
				}else {
					try {
						boolean control = gamer.register(fld_gamerusername.getText(),fld_gamerpassword.getText(),fld_gamername.getText(),0);
						if(control) {
							Helper.showMessage("Kayýt Olundu");
							dispose();
						}
					} catch (Exception e2) {
						// TODO: handle exception
					}
					
				}
			}
		});
		btn_register.setBounds(120, 285, 89, 23);
		contentPane.add(btn_register);
		
		JButton btn_backto = new JButton("Geri D\u00F6n");
		btn_backto.setBackground(Color.ORANGE);
		btn_backto.setForeground(Color.WHITE);
		btn_backto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_backto.setBounds(120, 352, 89, 23);
		contentPane.add(btn_backto);
		
		JLabel lbl_gamername = new JLabel("Oyuncu Ad\u0131");
		lbl_gamername.setForeground(Color.WHITE);
		lbl_gamername.setBackground(new Color(204, 204, 204));
		lbl_gamername.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbl_gamername.setBounds(123, 47, 86, 20);
		contentPane.add(lbl_gamername);
		
		fld_gamerpassword = new JPasswordField();
		fld_gamerpassword.setBounds(123, 254, 86, 20);
		contentPane.add(fld_gamerpassword);
		
		JLabel lbl_gamername_1 = new JLabel("Kullan\u0131c\u0131 Ad\u0131");
		lbl_gamername_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbl_gamername_1.setForeground(Color.WHITE);
		lbl_gamername_1.setBounds(123, 170, 86, 20);
		contentPane.add(lbl_gamername_1);
		
		JLabel lbl_gamername_2 = new JLabel("Parola");
		lbl_gamername_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbl_gamername_2.setForeground(Color.WHITE);
		lbl_gamername_2.setBounds(123, 229, 86, 20);
		contentPane.add(lbl_gamername_2);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(getClass().getResource("LeBlanc2.png")));
		lblNewLabel.setBounds(0, 0, 336, 402);
		contentPane.add(lblNewLabel);
	}
}
