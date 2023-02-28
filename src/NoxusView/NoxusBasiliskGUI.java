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
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class NoxusBasiliskGUI extends JFrame {

	
	static Gamer gamer = new Gamer();
	static Enemy enemy = new Enemy();
	static Enemy enemy1 = new Enemy();
	static Enemy enemy2 = new Enemy();
	static Enemy enemy3 = new Enemy();
	static Item item = new Item();
	
	
	private JPanel w_pane;
	private JTextField fld_enemy3name;
	private JTextField fld_enemy3dmg;
	private JTextField fld_enemy3health;
	private JTextField fld_enemy3num;
	private JTextField fld_enemy3gold;
	private JTextField fld_enemy3xp;
	private JTextField fld_gamerdmg;
	private JTextField fld_gamerhealth;
	private JTextField fld_gamerarmor;
	private JTextField fld_enemy1name;
	private JTextField fld_enemy1dmg;
	private JTextField fld_enemy1health;
	private JTextField fld_enemy1num;
	private JTextField fld_enemy1gold;
	private JTextField fld_enemy1xp;
	private JTextField fld_enemy2name;
	private JTextField fld_enemy2dmg;
	private JTextField fld_enemy2health;
	private JTextField fld_enemy2num;
	private JTextField fld_enemy2gold;
	private JTextField fld_enemy2xp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoxusBasiliskGUI frame = new NoxusBasiliskGUI(gamer,enemy1,enemy2,enemy3,item);
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
	public NoxusBasiliskGUI(Gamer gamer,Enemy enemy1,Enemy enemy2,Enemy enemy3,Item item) {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		w_pane = new JPanel();
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JPanel w_gamerpanel = new JPanel();
		w_gamerpanel.setBackground(new Color(102, 102, 102));
		w_gamerpanel.setBounds(28, 11, 108, 85);
		w_pane.add(w_gamerpanel);
		w_gamerpanel.setLayout(null);
		
		fld_gamerdmg = new JTextField("Hasar\u0131n = "+(gamer.getGamerdamage()+gamer.getGamersword()));
		fld_gamerdmg.setBounds(10, 11, 86, 20);
		w_gamerpanel.add(fld_gamerdmg);
		fld_gamerdmg.setForeground(Color.WHITE);
		fld_gamerdmg.setEditable(false);
		fld_gamerdmg.setColumns(10);
		fld_gamerdmg.setBackground(new Color(51, 153, 102));
		
		fld_gamerhealth = new JTextField("Can\u0131n = "+gamer.getGamerhealth());
		fld_gamerhealth.setBounds(10, 35, 86, 20);
		w_gamerpanel.add(fld_gamerhealth);
		fld_gamerhealth.setForeground(Color.WHITE);
		fld_gamerhealth.setEditable(false);
		fld_gamerhealth.setColumns(10);
		fld_gamerhealth.setBackground(new Color(255, 0, 102));
		
		fld_gamerarmor = new JTextField("Z\u0131rh\u0131n = "+(gamer.getGamerarmor()+gamer.getGamerpelerindmg()));
		fld_gamerarmor.setBounds(10, 58, 86, 20);
		w_gamerpanel.add(fld_gamerarmor);
		fld_gamerarmor.setForeground(Color.WHITE);
		fld_gamerarmor.setEditable(false);
		fld_gamerarmor.setColumns(10);
		fld_gamerarmor.setBackground(new Color(51, 153, 204));
		
		JButton btn_goto = new JButton("Yol Ayr\u0131m\u0131na D\u00F6n");
		btn_goto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NoxusOrmanGUI GUI = new NoxusOrmanGUI(gamer,item);
				GUI.setVisible(true);
				dispose();
			}
		});
		btn_goto.setForeground(new Color(153, 0, 51));
		btn_goto.setBackground(new Color(255, 255, 102));
		btn_goto.setBounds(1069, 592, 152, 41);
		w_pane.add(btn_goto);
		
		fld_enemy1name = new JTextField(enemy1.getName());
		fld_enemy1name.setHorizontalAlignment(SwingConstants.CENTER);
		fld_enemy1name.setForeground(Color.WHITE);
		fld_enemy1name.setEditable(false);
		fld_enemy1name.setColumns(10);
		fld_enemy1name.setBackground(new Color(255, 51, 0));
		fld_enemy1name.setBounds(102, 412, 135, 20);
		w_pane.add(fld_enemy1name);
		
		fld_enemy1dmg = new JTextField("Hasar = "+enemy1.getDamage());
		fld_enemy1dmg.setForeground(Color.WHITE);
		fld_enemy1dmg.setEditable(false);
		fld_enemy1dmg.setColumns(10);
		fld_enemy1dmg.setBackground(new Color(255, 51, 0));
		fld_enemy1dmg.setBounds(139, 436, 98, 20);
		w_pane.add(fld_enemy1dmg);
		
		fld_enemy1health = new JTextField("Can = "+enemy1.getHealth());
		fld_enemy1health.setForeground(Color.WHITE);
		fld_enemy1health.setEditable(false);
		fld_enemy1health.setColumns(10);
		fld_enemy1health.setBackground(new Color(255, 51, 0));
		fld_enemy1health.setBounds(139, 459, 98, 20);
		w_pane.add(fld_enemy1health);
		
		fld_enemy1num = new JTextField("Birlik Say\u0131s\u0131 = "+enemy1.getMaxNumber());
		fld_enemy1num.setForeground(Color.WHITE);
		fld_enemy1num.setEditable(false);
		fld_enemy1num.setColumns(10);
		fld_enemy1num.setBackground(new Color(255, 51, 0));
		fld_enemy1num.setBounds(139, 483, 98, 20);
		w_pane.add(fld_enemy1num);
		
		fld_enemy1gold = new JTextField("\u00D6d\u00FCl Alt\u0131n\u0131 = "+enemy1.getAward());
		fld_enemy1gold.setForeground(Color.BLACK);
		fld_enemy1gold.setEditable(false);
		fld_enemy1gold.setColumns(10);
		fld_enemy1gold.setBackground(new Color(255, 204, 51));
		fld_enemy1gold.setBounds(139, 507, 98, 20);
		w_pane.add(fld_enemy1gold);
		
		fld_enemy1xp = new JTextField("\u00D6d\u00FCl Xp = "+enemy1.getXp());
		fld_enemy1xp.setEditable(false);
		fld_enemy1xp.setColumns(10);
		fld_enemy1xp.setBackground(new Color(204, 255, 153));
		fld_enemy1xp.setBounds(139, 530, 98, 20);
		w_pane.add(fld_enemy1xp);
		
		JButton btn_enemy1s = new JButton("Sava\u015F");
		btn_enemy1s.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enemy.combat(gamer,enemy1);
				dispose();
				NoxusBasiliskGUI GUI = new NoxusBasiliskGUI(gamer,enemy1,enemy2,enemy3,item);
				GUI.setVisible(true);
				
			}
		});
		btn_enemy1s.setForeground(Color.WHITE);
		btn_enemy1s.setBackground(new Color(153, 0, 51));
		btn_enemy1s.setBounds(136, 553, 101, 41);
		w_pane.add(btn_enemy1s);
		
		fld_enemy2name = new JTextField(enemy2.getName());
		fld_enemy2name.setHorizontalAlignment(SwingConstants.CENTER);
		fld_enemy2name.setForeground(Color.WHITE);
		fld_enemy2name.setEditable(false);
		fld_enemy2name.setColumns(10);
		fld_enemy2name.setBackground(new Color(255, 51, 0));
		fld_enemy2name.setBounds(1069, 109, 135, 20);
		w_pane.add(fld_enemy2name);
		
		fld_enemy2dmg = new JTextField("Hasar = "+enemy2.getDamage());
		fld_enemy2dmg.setForeground(Color.WHITE);
		fld_enemy2dmg.setEditable(false);
		fld_enemy2dmg.setColumns(10);
		fld_enemy2dmg.setBackground(new Color(255, 51, 0));
		fld_enemy2dmg.setBounds(1106, 133, 98, 20);
		w_pane.add(fld_enemy2dmg);
		
		fld_enemy2health = new JTextField("Can = "+enemy2.getHealth());
		fld_enemy2health.setForeground(Color.WHITE);
		fld_enemy2health.setEditable(false);
		fld_enemy2health.setColumns(10);
		fld_enemy2health.setBackground(new Color(255, 51, 0));
		fld_enemy2health.setBounds(1106, 156, 98, 20);
		w_pane.add(fld_enemy2health);
		
		fld_enemy2num = new JTextField("Birlik Say\u0131s\u0131 = "+enemy2.getMaxNumber());
		fld_enemy2num.setForeground(Color.WHITE);
		fld_enemy2num.setEditable(false);
		fld_enemy2num.setColumns(10);
		fld_enemy2num.setBackground(new Color(255, 51, 0));
		fld_enemy2num.setBounds(1106, 180, 98, 20);
		w_pane.add(fld_enemy2num);
		
		fld_enemy2gold = new JTextField("\u00D6d\u00FCl Alt\u0131n\u0131 = "+enemy2.getAward());
		fld_enemy2gold.setForeground(Color.BLACK);
		fld_enemy2gold.setEditable(false);
		fld_enemy2gold.setColumns(10);
		fld_enemy2gold.setBackground(new Color(255, 204, 51));
		fld_enemy2gold.setBounds(1106, 204, 98, 20);
		w_pane.add(fld_enemy2gold);
		
		fld_enemy2xp = new JTextField("\u00D6d\u00FCl Xp = "+enemy2.getXp());
		fld_enemy2xp.setEditable(false);
		fld_enemy2xp.setColumns(10);
		fld_enemy2xp.setBackground(new Color(204, 255, 153));
		fld_enemy2xp.setBounds(1106, 227, 98, 20);
		w_pane.add(fld_enemy2xp);
		
		JButton btn_enemy2s = new JButton("Sava\u015F");
		btn_enemy2s.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enemy.combat(gamer,enemy2);
				dispose();
				NoxusBasiliskGUI GUI = new NoxusBasiliskGUI(gamer,enemy1,enemy2,enemy3,item);
				GUI.setVisible(true);
			}
		});
		btn_enemy2s.setForeground(Color.WHITE);
		btn_enemy2s.setBackground(new Color(153, 0, 51));
		btn_enemy2s.setBounds(1103, 252, 101, 41);
		w_pane.add(btn_enemy2s);
		
		fld_enemy3xp = new JTextField("\u00D6d\u00FCl Xp = "+enemy3.getXp());
		fld_enemy3xp.setEditable(false);
		fld_enemy3xp.setColumns(10);
		fld_enemy3xp.setBackground(new Color(204, 255, 153));
		fld_enemy3xp.setBounds(612, 486, 98, 20);
		w_pane.add(fld_enemy3xp);
		
		JButton btn_s3 = new JButton("Sava\u015F");
		btn_s3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enemy.combat(gamer,enemy3);
				dispose();
				NoxusBasiliskGUI GUI = new NoxusBasiliskGUI(gamer,enemy1,enemy2,enemy3,item);
				GUI.setVisible(true);
			}
		});
		btn_s3.setForeground(Color.WHITE);
		btn_s3.setBackground(new Color(153, 0, 51));
		btn_s3.setBounds(612, 509, 101, 41);
		w_pane.add(btn_s3);
		
		fld_enemy3num = new JTextField("Birlik Say\u0131s\u0131 = "+enemy3.getMaxNumber());
		fld_enemy3num.setForeground(Color.WHITE);
		fld_enemy3num.setEditable(false);
		fld_enemy3num.setColumns(10);
		fld_enemy3num.setBackground(new Color(255, 51, 0));
		fld_enemy3num.setBounds(612, 439, 98, 20);
		w_pane.add(fld_enemy3num);
		
		fld_enemy3dmg = new JTextField("Hasar = "+enemy3.getDamage());
		fld_enemy3dmg.setForeground(Color.WHITE);
		fld_enemy3dmg.setEditable(false);
		fld_enemy3dmg.setColumns(10);
		fld_enemy3dmg.setBackground(new Color(255, 51, 0));
		fld_enemy3dmg.setBounds(612, 392, 98, 20);
		w_pane.add(fld_enemy3dmg);
		
		fld_enemy3name = new JTextField(enemy3.getName());
		fld_enemy3name.setHorizontalAlignment(SwingConstants.CENTER);
		fld_enemy3name.setForeground(Color.WHITE);
		fld_enemy3name.setEditable(false);
		fld_enemy3name.setColumns(10);
		fld_enemy3name.setBackground(new Color(255, 51, 0));
		fld_enemy3name.setBounds(575, 368, 135, 20);
		w_pane.add(fld_enemy3name);
		
		fld_enemy3health = new JTextField("Can = "+enemy3.getHealth());
		fld_enemy3health.setForeground(Color.WHITE);
		fld_enemy3health.setEditable(false);
		fld_enemy3health.setColumns(10);
		fld_enemy3health.setBackground(new Color(255, 51, 0));
		fld_enemy3health.setBounds(612, 415, 98, 20);
		w_pane.add(fld_enemy3health);
		
		fld_enemy3gold = new JTextField("\u00D6d\u00FCl Alt\u0131n\u0131 = "+enemy3.getAward());
		fld_enemy3gold.setForeground(Color.BLACK);
		fld_enemy3gold.setEditable(false);
		fld_enemy3gold.setColumns(10);
		fld_enemy3gold.setBackground(new Color(255, 204, 51));
		fld_enemy3gold.setBounds(612, 463, 98, 20);
		w_pane.add(fld_enemy3gold);
		
		JLabel lbl_enemy3logo = new JLabel(new ImageIcon(getClass().getResource("ob.jpg")));
		lbl_enemy3logo.setBounds(455, 163, 358, 191);
		w_pane.add(lbl_enemy3logo);
		
		JLabel lbl_enemy1logo = new JLabel(new ImageIcon(getClass().getResource("abb.jpg")));
		lbl_enemy1logo.setBounds(20, 207, 276, 197);
		w_pane.add(lbl_enemy1logo);
		
		JLabel lbl_enemy2logo = new JLabel(new ImageIcon(getClass().getResource("rb.jpg")));
		lbl_enemy2logo.setBounds(931, 304, 343, 180);
		w_pane.add(lbl_enemy2logo);
		
		JLabel lbl_backgr = new JLabel(new ImageIcon(getClass().getResource("rock.png")));
		lbl_backgr.setBounds(0, 0, 1284, 661);
		w_pane.add(lbl_backgr);
	}
	
}
