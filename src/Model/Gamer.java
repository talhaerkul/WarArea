package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Helper.DBConnection;
import Helper.Helper;

public class Gamer {

	private int gamerid;
	String gamerusername,gamerpassword,gamername,gamerheroname;
	
	int gamerlevel,gamerxp,gamerdamage,gamerhealth,gamerheal,gamersword,gamerarmor,gamergold,gamerarmy;
	String gamerswordname,gamerarmorname,gameruniqeitem;
	
	int gamerheroid;
	int gamerpelerindmg; String gamerpelerinyn;
	
	public int getGamerheroid() {
		return gamerheroid;
	}

	public void setGamerheroid(int gamerheroid) {
		this.gamerheroid = gamerheroid;
	}





	int attackcount;
	
	public int getAttackcount() {
		return attackcount;
	}

	public void setAttackcount(int attackcount) {
		this.attackcount = attackcount;
	}

	public Gamer() {}
	
	public Gamer(int gamerid, String gamerusername, String gamerpassword, String gamername,String gamerheroname,int gamerlevel,int gamerxp, int gamerdamage,
			int gamerhealth,int gamerheal, int gamersword, int gamerarmor, int gamergold, int gamerarmy, String gamerswordname,
			String gamerarmorname, String gameruniqeitem,int gamerpelerindmg,String gamerpelerinyn) {
		super();
		this.gamerid = gamerid;
		this.gamerusername = gamerusername;
		this.gamerpassword = gamerpassword;
		this.gamername = gamername;
		this.gamerheroname = gamerheroname;
		this.gamerlevel = gamerlevel;
		this.gamerxp = gamerxp;
		this.gamerdamage = gamerdamage;
		this.gamerhealth = gamerhealth;
		this.gamerheal = gamerheal;
		this.gamersword = gamersword;
		this.gamerarmor = gamerarmor;
		this.gamergold = gamergold;
		this.gamerarmy = gamerarmy;
		this.gamerswordname = gamerswordname;
		this.gamerarmorname = gamerarmorname;
		this.gameruniqeitem = gameruniqeitem;
		this.gamerpelerindmg = gamerpelerindmg;
		this.gamerpelerinyn = gamerpelerinyn;
	}





	DBConnection dbconnection = new DBConnection();
	
	
	Connection localconnection = dbconnection.connectiondbMethod();
	Statement statement = null;
	ResultSet resultset = null;
	PreparedStatement preparedStatement = null;
	
	public boolean Level(Gamer gamer , int comxp) throws SQLException {
		boolean key = false;
		if(comxp < 120 && comxp >=50) {
			if(gamer.getGamerlevel()!=2) {
			gamer.setGamerlevel(2);
			Helper.showMessage("Seviye atladýn. Yeni seviyen : "+gamer.getGamerlevel());
			
			gamer.setGamerheal(gamer.getGamerheal()+10);
			gamer.setGamerhealth(gamer.getGamerheal());
			gamer.updateHeal(gamerusername, gamer.getGamerheal());
			gamer.updateHealth(gamerusername, gamer.getGamerheal());
			
			gamer.setGamerdamage(gamer.getGamerdamage()+5);
			gamer.updateDamage(gamerusername, gamer.getGamerdamage());
			
			key = true;}
		}
		if(comxp < 400 && comxp >=120) {
			if(gamer.getGamerlevel()!=3) {
			gamer.setGamerlevel(3);
			Helper.showMessage("Seviye atladýn. Yeni seviyen : "+gamer.getGamerlevel());

			gamer.setGamerheal(gamer.getGamerheal()+20);
			gamer.setGamerhealth(gamer.getGamerheal());
			gamer.updateHeal(gamerusername, gamer.getGamerheal());
			gamer.updateHealth(gamerusername, gamer.getGamerheal());
			
			gamer.setGamerdamage(gamer.getGamerdamage()+10);
			gamer.updateDamage(gamerusername, gamer.getGamerdamage());
			
			key = true;}
		}
		if(comxp < 800 && comxp >=400) {
			if(gamer.getGamerlevel()!=4) {
			gamer.setGamerlevel(4);
			Helper.showMessage("Seviye atladýn. Yeni seviyen : "+gamer.getGamerlevel());
			
			gamer.setGamerheal(gamer.getGamerheal()+30);
			gamer.setGamerhealth(gamer.getGamerheal());
			gamer.updateHeal(gamerusername, gamer.getGamerheal());
			gamer.updateHealth(gamerusername, gamer.getGamerheal());
			
			gamer.setGamerdamage(gamer.getGamerdamage()+15);
			gamer.updateDamage(gamerusername, gamer.getGamerdamage());
			key = true;}
		}
		if(comxp < 1500 && comxp >=800) {
			if(gamer.getGamerlevel()!=5) {
			gamer.setGamerlevel(5);
			Helper.showMessage("Seviye atladýn. Yeni seviyen : "+gamer.getGamerlevel());
			
			gamer.setGamerheal(gamer.getGamerheal()+40);
			gamer.setGamerhealth(gamer.getGamerheal());
			gamer.updateHeal(gamerusername, gamer.getGamerheal());
			gamer.updateHealth(gamerusername, gamer.getGamerheal());
			
			gamer.setGamerdamage(gamer.getGamerdamage()+20);
			gamer.updateDamage(gamerusername, gamer.getGamerdamage());
			key = true;}
		}
		if(comxp < 3000 && comxp >=1500) {
			if(gamer.getGamerlevel()!=6) {
			gamer.setGamerlevel(6);
			Helper.showMessage("Seviye atladýn. Yeni seviyen : "+gamer.getGamerlevel());
			
			gamer.setGamerheal(gamer.getGamerheal()+50);
			gamer.setGamerhealth(gamer.getGamerheal());
			gamer.updateHeal(gamerusername, gamer.getGamerheal());
			gamer.updateHealth(gamerusername, gamer.getGamerheal());
			
			gamer.setGamerdamage(gamer.getGamerdamage()+25);
			gamer.updateDamage(gamerusername, gamer.getGamerdamage());
			key = true;}
		}
		if(comxp < 4000 && comxp >=3000) {
			if(gamer.getGamerlevel()!=7) {
			gamer.setGamerlevel(7);
			Helper.showMessage("Seviye atladýn. Yeni seviyen : "+gamer.getGamerlevel());
			
			gamer.setGamerheal(gamer.getGamerheal()+100);
			gamer.setGamerhealth(gamer.getGamerheal());
			gamer.updateHeal(gamerusername, gamer.getGamerheal());
			gamer.updateHealth(gamerusername, gamer.getGamerheal());
			
			gamer.setGamerdamage(gamer.getGamerdamage()+50);
			gamer.updateDamage(gamerusername, gamer.getGamerdamage());
			
			key = true;}
		}
		if(comxp < 6000 && comxp >=4000) {
			if(gamer.getGamerlevel()!=8) {
			gamer.setGamerlevel(8);
			Helper.showMessage("Seviye atladýn. Yeni seviyen : "+gamer.getGamerlevel());
			
			gamer.setGamerheal(gamer.getGamerheal()+200);
			gamer.setGamerhealth(gamer.getGamerheal());
			gamer.updateHeal(gamerusername, gamer.getGamerheal());
			gamer.updateHealth(gamerusername, gamer.getGamerheal());
			
			gamer.setGamerdamage(gamer.getGamerdamage()+100);
			gamer.updateDamage(gamerusername, gamer.getGamerdamage());
			
			key = true;}
		}
		if(comxp < 8000 && comxp >=6000) {
			if(gamer.getGamerlevel()!=9) {
			gamer.setGamerlevel(9);
			Helper.showMessage("Seviye atladýn. Yeni seviyen : "+gamer.getGamerlevel());
			
			gamer.setGamerheal(gamer.getGamerheal()+250);
			gamer.setGamerhealth(gamer.getGamerheal());
			gamer.updateHeal(gamerusername, gamer.getGamerheal());
			gamer.updateHealth(gamerusername, gamer.getGamerheal());
			
			gamer.setGamerdamage(gamer.getGamerdamage()+150);
			gamer.updateDamage(gamerusername, gamer.getGamerdamage());
			
			key = true;}
		}
		if(comxp >=8000) {
			if(gamer.getGamerlevel()!=10) {
			gamer.setGamerlevel(10);
			Helper.showMessage("Seviye atladýn. Yeni seviyen : "+gamer.getGamerlevel());
			
			gamer.setGamerheal(gamer.getGamerheal()+300);
			gamer.setGamerhealth(gamer.getGamerheal());
			gamer.updateHeal(gamerusername, gamer.getGamerheal());
			gamer.updateHealth(gamerusername, gamer.getGamerheal());
			
			gamer.setGamerdamage(gamer.getGamerdamage()+200);
			gamer.updateDamage(gamerusername, gamer.getGamerdamage());
			
			key = true;}
		}
		
		return key;
	}
	
	/*
	public ArrayList<Gamer> getGamerList(String comgamerusername) {
		
		ArrayList<Gamer> list = new ArrayList<>();
		
		Gamer object;
		
		
		try {
			
			statement = localconnection.createStatement();
			resultset = statement.executeQuery("SELECT * FROM gamer");
			
			while(comgamerusername.equals(resultset.getString("gamerusername_data"))) {
				object = new Gamer(resultset.getInt(gamerid),resultset.getString("gamername_data"),resultset.getString("gamerusername_data"),resultset.getString("gamerpassword_data"),
						resultset.getString("gamerheroname_data"),resultset.getInt("gamerdamage_data"),resultset.getInt("gamerhealth_data"),
						resultset.getInt("gamersword_data"),resultset.getInt("gamerarmor_data"),resultset.getInt("gamergold_data"),resultset.getInt("gamerarmy_data"),
						resultset.getString("gamerswordname_data"),resultset.getString("gamerarmorname_data"),resultset.getString("gameruniqeitem_data"));
						System.out.println("liste eklendi");
				list.add(object);
			}
				
		} catch (Exception e) {}
		
		return list;
		}
	*/
	
	public boolean register(String comgamerusername,String comgamerpassword, String comgamername,int comgamerheroid) throws SQLException {
		
		boolean process = false;
		String query = "INSERT INTO gamer (gamerusername_data,gamerpassword_data,gamername_data,gamerheroid_data) VALUES (?,?,?,?)";
		try {
			
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setString(1, comgamerusername);
			preparedStatement.setString(2, comgamerpassword);
			preparedStatement.setString(3, comgamername);
			preparedStatement.setInt(4, comgamerheroid);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Oyuncu Eklendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		if(process)return true;
		else return false;
	}
	
	public boolean updateLevel(String comusername,int comlevel) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET gamerlevel_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comlevel);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Seviye Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateXp(String comusername,int comxp) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET gamerxp_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comxp);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Xp Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	
	
	public boolean updateDamage(String comusername,int comdamage) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET gamerdamage_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comdamage);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Hasar Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	
	public boolean updateHealth(String comusername,int comhealth) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET gamerhealth_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comhealth);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Can Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateHeal(String comusername,int comheal) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET gamerheal_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comheal);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýlk Can Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateSword(String comusername,int comsword) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET gamersword_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comsword);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Sword Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateArmor(String comusername,int comarmor) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET gamerarmor_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comarmor);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Armor Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateGold(String comusername,int comgold) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET gamergold_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comgold);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Altýn Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateArmy(String comusername,int comarmy) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET gamerarmy_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comarmy);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ordu Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateHeroid(String comusername,int comheroid) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET gamerheroid_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comheroid);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("HeroId Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateHeroName(String comusername,String comheroname) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET gamerheroname_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setString(1, comheroname);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("HeroName Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateSwordName(String comusername,String comswordname) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET gamerswordname_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setString(1, comswordname);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("SwordName Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateArmorName(String comusername,String comarmorname) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET gamerarmorname_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setString(1, comarmorname);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("ArmorName Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateUniqeItem(String comusername,String comuniqeitem) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET gamercomuniqeitem_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setString(1, comuniqeitem);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("UniqeItem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	
	public boolean updatePelerin(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET gamerpelerin_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Pelerin Eklendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updatePelerinyn(String comusername) throws SQLException {
	
	boolean process = false;
	String query = "UPDATE gamer SET gamerpelerinyn_data = ? WHERE gamerusername_data = ?";
	try {
	
		statement = localconnection.createStatement();
		preparedStatement = localconnection.prepareStatement(query);
		preparedStatement.setString(1, "Var");
		preparedStatement.setString(2, comusername);
		preparedStatement.executeUpdate();
		process = true;
		System.out.println("Pelerin Var");
		
	} catch (Exception e) {
		e.printStackTrace();
	} 
	
	if(process) return true;
	else return false;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public int getGamerid() {
		return gamerid;
	}
	public void setGamerid(int gamerid) {
		this.gamerid = gamerid;
	}
	public String getGamerusername() {
		return gamerusername;
	}
	public void setGamerusername(String gamerusername) {
		this.gamerusername = gamerusername;
	}
	public String getGamerpassword() {
		return gamerpassword;
	}
	public void setGamerpassword(String gamerpassword) {
		this.gamerpassword = gamerpassword;
	}
	public String getGamername() {
		return gamername;
	}
	public void setGamername(String gamername) {
		this.gamername = gamername;
	}
	
	public String getGamerheroname() {
		return gamerheroname;
	}

	public void setGamerheroname(String gamerheroname) {
		this.gamerheroname = gamerheroname;
	}

	
	public int getGamerlevel() {
		return gamerlevel;
	}

	public void setGamerlevel(int gamerlevel) {
		this.gamerlevel = gamerlevel;
	}

	
	public int getGamerxp() {
		return gamerxp;
	}

	public void setGamerxp(int gamerxp) {
		this.gamerxp = gamerxp;
	}

	public int getGamerdamage() {
		return gamerdamage;
	}
	public void setGamerdamage(int gamerdamage) {
		this.gamerdamage = gamerdamage;
	}
	public int getGamerhealth() {
		return gamerhealth;
	}
	public void setGamerhealth(int gamerhealth) {
		this.gamerhealth = gamerhealth;
	}
	
	public int getGamerheal() {
		return gamerheal;
	}

	public void setGamerheal(int gamerheal) {
		this.gamerheal = gamerheal;
	}

	public int getGamersword() {
		return gamersword;
	}
	public void setGamersword(int gamersword) {
		this.gamersword = gamersword;
	}
	public int getGamerarmor() {
		return gamerarmor;
	}
	public void setGamerarmor(int gamerarmor) {
		this.gamerarmor = gamerarmor;
	}
	public int getGamergold() {
		return gamergold;
	}
	public void setGamergold(int gamergold) {
		this.gamergold = gamergold;
	}
	public int getGamerarmy() {
		return gamerarmy;
	}
	public void setGamerarmy(int gamerarmy) {
		this.gamerarmy = gamerarmy;
	}
	public String getGamerswordname() {
		return gamerswordname;
	}
	public void setGamerswordname(String gamerswordname) {
		this.gamerswordname = gamerswordname;
	}
	public String getGamerarmorname() {
		return gamerarmorname;
	}
	public void setGamerarmorname(String gamerarmorname) {
		this.gamerarmorname = gamerarmorname;
	}
	public String getGameruniqeitem() {
		return gameruniqeitem;
	}
	public void setGameruniqeitem(String gameruniqeitem) {
		this.gameruniqeitem = gameruniqeitem;
	}

	public int getGamerpelerindmg() {
		return gamerpelerindmg;
	}

	public void setGamerpelerindmg(int gamerpelerindmg) {
		this.gamerpelerindmg = gamerpelerindmg;
	}

	public String getGamerpelerinyn() {
		return gamerpelerinyn;
	}

	public void setGamerpelerinyn(String gamerpelerinyn) {
		this.gamerpelerinyn = gamerpelerinyn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
