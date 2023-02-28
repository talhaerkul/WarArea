package ItemModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Helper.DBConnection;
import Model.Gamer;


public class Item {
	
	DBConnection dbconnection = new DBConnection();
	Connection localconnection = dbconnection.connectiondbMethod();
	Statement statement = null;
	ResultSet resultset = null;
	PreparedStatement preparedStatement = null;
	
	
	
	
	public Item() {}


	int easySworddmg = 7; String easySwordName = "Dolunay Kýlýcý"; int easySworddata;
	int easyArmordmg = 10; String easyArmorName = "Dolunay Zýrhý"; int easyArmordata;

	int ortaSworddmg = 5; String ortaSwordName = "Uzun Kýlýç"; int ortaSworddata;
	int ortaArmordmg = 10; String ortaArmorName = "Uzun Zýrh"; int ortaArmordata;
	
	int zorSworddmg = 3; String zorSwordName = "Bambu Kýlýç"; int zorSworddata;
	int zorArmordmg = 10; String zorArmorName = "Bambu Zýrh"; int zorArmordata;
	
	int bronzSworddmg = 12; String bronzSwordName = "Bronz Kýlýç"; int bronzSworddata;
	
	int demirSworddmg = 16; String demirSwordName = "Demir Kýlýç"; int demirSworddata;
	
	int celikSworddmg = 25; String celikSwordName = "Çelik Kýlýç"; int celikSworddata;
	
	int tungstenSworddmg = 50; String tungstenSwordName = "Tungsten Kýlýç"; int tungstenSworddata;
	
	int inconelSworddmg = 100; String inconelSwordName = "Inconel Kýlýç"; int inconelSworddata;
	
	int titanyumSworddmg = 200; String titanyumSwordName = "Titanyum Kýlýç"; int titanyumSworddata;
	
	int kumasArmordmg = 16; String kumasArmorName = "Kumaþ Zýrh"; int kumasArmordata;
	
	int deriArmordmg = 23; String deriArmorName = "Deri Zýrh"; int deriArmordata;
	
	int pelerinArmordmg = 50; String pelerinArmorName = "Pelerin"; int pelerinArmordata;
	
	int bronzArmordmg = 30; String bronzArmorName = "Bronz Zýrh"; int bronzArmordata;
	
	int demirArmordmg = 40; String demirArmorName = "Demir Zýrh"; int demirArmordata;
	
	int celikArmordmg = 60; String celikArmorName = "Çelik Zýrh"; int celikArmordata;
	
	int titanyumArmordmg = 150; String titanyumArmorName = "Titanyum Zýrh"; int titanyumArmordata;
	int titanyum2Armordmg = 60; String titanyum2ArmorName = "Titanyum Kask"; int titanyum2Armordata;
	int titanyum3Armordmg = 40; String titanyum3ArmorName = "Titanyum Eldiven"; int titanyum3Armordata;
	
	
	
	
	
	
	
	
	
	public boolean updateEasySworddata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_easysword_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateEasyArmordata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_easyarmor_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateOrtaSworddata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_ortasword_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateOrtaArmordata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_ortaarmor_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	
	public boolean updateZorSworddata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_zorsword_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	
	public boolean updateZorArmordata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_zorarmor_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateBronzSworddata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_bronzsword_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateDemirSworddata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_demirsword_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateCelikSworddata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_celiksword_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateTungstenSworddata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_tungstensword_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateInconelSworddata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_inconelsword_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateTitanyumSworddata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_titanyumsword_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateKumasArmordata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_kumasarmor_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateDeriArmordata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_deriarmor_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updatePelerinArmordata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_pelerinarmor_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateBronzArmordata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_bronzarmor_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateDemirArmordata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_demirarmor_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateCelikArmordata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_celikarmor_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateTitanyumArmordata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_titanyumarmor_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateTitanyum2Armordata(String comusername,int comnumber) throws SQLException {
		
		boolean process = false;
		String query = "UPDATE gamer SET item_titanyum2armor_data = ? WHERE gamerusername_data = ?";
		try {
		
			statement = localconnection.createStatement();
			preparedStatement = localconnection.prepareStatement(query);
			preparedStatement.setInt(1, comnumber);
			preparedStatement.setString(2, comusername);
			preparedStatement.executeUpdate();
			process = true;
			System.out.println("Ýtem Güncellendi");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if(process) return true;
		else return false;
	}
	public boolean updateTitanyum3Armordata(String comusername,int comnumber) throws SQLException {
	
	boolean process = false;
	String query = "UPDATE gamer SET item_titanyum3armor_data = ? WHERE gamerusername_data = ?";
	try {
	
		statement = localconnection.createStatement();
		preparedStatement = localconnection.prepareStatement(query);
		preparedStatement.setInt(1, comnumber);
		preparedStatement.setString(2, comusername);
		preparedStatement.executeUpdate();
		process = true;
		System.out.println("Ýtem Güncellendi");
		
	} catch (Exception e) {
		e.printStackTrace();
	} 
	
	if(process) return true;
	else return false;
}
	
	
	public boolean sworditem2to1(Gamer gamer, Item item) throws SQLException{
		
		if(item.getEasySworddata()==2) {
			item.setEasySworddata(1);
			item.updateEasySworddata(gamer.getGamerusername(), item.getEasySworddata());
		}
		
		if(item.getOrtaSworddata()==2) {
			item.setOrtaSworddata(1);
			item.updateOrtaSworddata(gamer.getGamerusername(), item.getOrtaSworddata());
		}
		
		if(item.getZorSworddata()==2) {
			item.setZorSworddata(1);
			item.updateZorSworddata(gamer.getGamerusername(), item.getZorSworddata());
		}
		if(item.getBronzSworddata()==2) {
			item.setBronzSworddata(1);
			item.updateBronzSworddata(gamer.getGamerusername(), item.getBronzSworddata());
		}
		if(item.getDemirSworddata()==2) {
			item.setDemirSworddata(1);
			item.updateDemirSworddata(gamer.getGamerusername(), item.getDemirSworddata());
		}
		if(item.getCelikSworddata()==2) {
			item.setCelikSworddata(1);
			item.updateCelikSworddata(gamer.getGamerusername(), item.getCelikSworddata());
		}
		if(item.getTungstenSworddata()==2) {
			item.setTungstenSworddata(1);
			item.updateTungstenSworddata(gamer.getGamerusername(), item.getTungstenSworddata());
		}
		if(item.getInconelSworddata()==2) {
			item.setInconelSworddata(1);
			item.updateInconelSworddata(gamer.getGamerusername(), item.getInconelSworddata());
		}
		if(item.getTitanyumSworddata()==2) {
			item.setTitanyumSworddata(1);
			item.updateTitanyumSworddata(gamer.getGamerusername(), item.getTitanyumSworddata());
		}
		
		
		return true;
	}
	public boolean armoritem2to1(Gamer gamer, Item item) throws SQLException{
		
		
		if(item.getEasyArmordata()==2) {
			item.setEasyArmordata(1);
			item.updateEasyArmordata(gamer.getGamerusername(), item.getEasyArmordata());
		}
		
		if(item.getOrtaArmordata()==2) {
			item.setOrtaArmordata(1);
			item.updateOrtaArmordata(gamer.getGamerusername(), item.getOrtaArmordata());
		}
		
		if(item.getZorArmordata()==2) {
			item.setZorArmordata(1);
			item.updateZorArmordata(gamer.getGamerusername(), item.getZorArmordata());
		}
		if(item.getKumasArmordata()==2) {
			item.setKumasArmordata(1);
			item.updateKumasArmordata(gamer.getGamerusername(), item.getKumasArmordata());
		}
		if(item.getDeriArmordata()==2) {
			item.setDeriArmordata(1);
			item.updateDeriArmordata(gamer.getGamerusername(), item.getDeriArmordata());
		}
		if(item.getDemirArmordata()==2) {
			item.setDemirArmordata(1);
			item.updateDemirArmordata(gamer.getGamerusername(), item.getDemirArmordata());
		}
		if(item.getBronzArmordata()==2) {
			item.setBronzArmordata(1);
			item.updateBronzArmordata(gamer.getGamerusername(), item.getBronzArmordata());
		}
		if(item.getCelikArmordata()==2) {
			item.setCelikArmordata(1);
			item.updateCelikArmordata(gamer.getGamerusername(), item.getCelikArmordata());
		}
		if(item.getTitanyumArmordata()==2) {
			item.setTitanyumArmordata(1);
			item.updateTitanyumArmordata(gamer.getGamerusername(), item.getTitanyumArmordata());
		}
		if(item.getTitanyum2Armordata()==2) {
			item.setTitanyum2Armordata(1);
			item.updateTitanyum2Armordata(gamer.getGamerusername(), item.getTitanyum2Armordata());
		}
		if(item.getTitanyum3Armordata()==2) {
			item.setTitanyum3Armordata(1);
			item.updateTitanyum3Armordata(gamer.getGamerusername(), item.getTitanyum3Armordata());
		}
		
		
		return true;
	}
	
	
	


	public int getEasySworddmg() {
		return easySworddmg;
	}



	public void setEasySworddmg(int easySword) {
		this.easySworddmg = easySword;
	}



	public String getEasySwordName() {
		return easySwordName;
	}



	public void setEasySwordName(String easySwordName) {
		this.easySwordName = easySwordName;
	}



	public int getEasyArmordmg() {
		return easyArmordmg;
	}



	public void setEasyArmordmg(int easyArmor) {
		this.easyArmordmg = easyArmor;
	}



	public String getEasyArmorName() {
		return easyArmorName;
	}



	public void setEasyArmorName(String easyArmorName) {
		this.easyArmorName = easyArmorName;
	}



	public int getOrtaSworddmg() {
		return ortaSworddmg;
	}



	public void setOrtaSworddmg(int ortaSword) {
		this.ortaSworddmg = ortaSword;
	}



	public String getOrtaSwordName() {
		return ortaSwordName;
	}



	public void setOrtaSwordName(String ortaSwordName) {
		this.ortaSwordName = ortaSwordName;
	}



	public int getOrtaArmordmg() {
		return ortaArmordmg;
	}



	public void setOrtaArmordmg(int ortaArmor) {
		this.ortaArmordmg = ortaArmor;
	}



	public String getOrtaArmorName() {
		return ortaArmorName;
	}



	public void setOrtaArmorName(String ortaArmorName) {
		this.ortaArmorName = ortaArmorName;
	}



	public int getZorSworddmg() {
		return zorSworddmg;
	}



	public void setZorSworddmg(int zorSword) {
		this.zorSworddmg = zorSword;
	}



	public String getZorSwordName() {
		return zorSwordName;
	}



	public void setZorSwordName(String zorSwordName) {
		this.zorSwordName = zorSwordName;
	}



	public int getZorArmordmg() {
		return zorArmordmg;
	}



	public void setZorArmordmg(int zorArmor) {
		this.zorArmordmg = zorArmor;
	}



	public String getZorArmorName() {
		return zorArmorName;
	}



	public void setZorArmorName(String zorArmorName) {
		this.zorArmorName = zorArmorName;
	}



	public int getEasySworddata() {
		return easySworddata;
	}



	public void setEasySworddata(int easySworddata) {
		this.easySworddata = easySworddata;
	}



	public int getEasyArmordata() {
		return easyArmordata;
	}



	public void setEasyArmordata(int easyArmordata) {
		this.easyArmordata = easyArmordata;
	}



	public int getOrtaSworddata() {
		return ortaSworddata;
	}



	public void setOrtaSworddata(int ortaSworddata) {
		this.ortaSworddata = ortaSworddata;
	}



	public int getOrtaArmordata() {
		return ortaArmordata;
	}



	public void setOrtaArmordata(int ortaArmordata) {
		this.ortaArmordata = ortaArmordata;
	}



	public int getZorSworddata() {
		return zorSworddata;
	}



	public void setZorSworddata(int zorSworddata) {
		this.zorSworddata = zorSworddata;
	}



	public int getZorArmordata() {
		return zorArmordata;
	}



	public void setZorArmordata(int zorArmordata) {
		this.zorArmordata = zorArmordata;
	}






	public int getBronzSworddmg() {
		return bronzSworddmg;
	}






	public void setBronzSworddmg(int bronzSworddmg) {
		this.bronzSworddmg = bronzSworddmg;
	}






	public String getBronzSwordName() {
		return bronzSwordName;
	}






	public void setBronzSwordName(String bronzSwordName) {
		this.bronzSwordName = bronzSwordName;
	}






	public int getBronzSworddata() {
		return bronzSworddata;
	}






	public void setBronzSworddata(int bronzSworddata) {
		this.bronzSworddata = bronzSworddata;
	}






	public int getDemirSworddmg() {
		return demirSworddmg;
	}






	public void setDemirSworddmg(int demirSworddmg) {
		this.demirSworddmg = demirSworddmg;
	}






	public String getDemirSwordName() {
		return demirSwordName;
	}






	public void setDemirSwordName(String demirSwordName) {
		this.demirSwordName = demirSwordName;
	}






	public int getDemirSworddata() {
		return demirSworddata;
	}






	public void setDemirSworddata(int demirSworddata) {
		this.demirSworddata = demirSworddata;
	}






	public int getCelikSworddmg() {
		return celikSworddmg;
	}






	public void setCelikSworddmg(int celikSworddmg) {
		this.celikSworddmg = celikSworddmg;
	}






	public String getCelikSwordName() {
		return celikSwordName;
	}






	public void setCelikSwordName(String celikSwordName) {
		this.celikSwordName = celikSwordName;
	}






	public int getCelikSworddata() {
		return celikSworddata;
	}






	public void setCelikSworddata(int celikSworddata) {
		this.celikSworddata = celikSworddata;
	}






	public int getTungstenSworddmg() {
		return tungstenSworddmg;
	}






	public void setTungstenSworddmg(int tungstenSworddmg) {
		this.tungstenSworddmg = tungstenSworddmg;
	}






	public String getTungstenSwordName() {
		return tungstenSwordName;
	}






	public void setTungstenSwordName(String tungstenSwordName) {
		this.tungstenSwordName = tungstenSwordName;
	}






	public int getTungstenSworddata() {
		return tungstenSworddata;
	}






	public void setTungstenSworddata(int tungstenSworddata) {
		this.tungstenSworddata = tungstenSworddata;
	}






	public int getInconelSworddmg() {
		return inconelSworddmg;
	}






	public void setInconelSworddmg(int inconelSworddmg) {
		this.inconelSworddmg = inconelSworddmg;
	}






	public String getInconelSwordName() {
		return inconelSwordName;
	}






	public void setInconelSwordName(String inconelSwordName) {
		this.inconelSwordName = inconelSwordName;
	}






	public int getInconelSworddata() {
		return inconelSworddata;
	}






	public void setInconelSworddata(int inconelSworddata) {
		this.inconelSworddata = inconelSworddata;
	}






	public int getTitanyumSworddmg() {
		return titanyumSworddmg;
	}






	public void setTitanyumSworddmg(int titanyumSworddmg) {
		this.titanyumSworddmg = titanyumSworddmg;
	}






	public String getTitanyumSwordName() {
		return titanyumSwordName;
	}






	public void setTitanyumSwordName(String titanyumSwordName) {
		this.titanyumSwordName = titanyumSwordName;
	}






	public int getTitanyumSworddata() {
		return titanyumSworddata;
	}






	public void setTitanyumSworddata(int titanyumSworddata) {
		this.titanyumSworddata = titanyumSworddata;
	}






	public int getKumasArmordmg() {
		return kumasArmordmg;
	}






	public void setKumasArmordmg(int kumasArmordmg) {
		this.kumasArmordmg = kumasArmordmg;
	}






	public String getKumasArmorName() {
		return kumasArmorName;
	}






	public void setKumasArmorName(String kumasArmorName) {
		this.kumasArmorName = kumasArmorName;
	}






	public int getKumasArmordata() {
		return kumasArmordata;
	}






	public void setKumasArmordata(int kumasArmordata) {
		this.kumasArmordata = kumasArmordata;
	}






	public int getDeriArmordmg() {
		return deriArmordmg;
	}






	public void setDeriArmordmg(int deriArmordmg) {
		this.deriArmordmg = deriArmordmg;
	}






	public String getDeriArmorName() {
		return deriArmorName;
	}






	public void setDeriArmorName(String deriArmorName) {
		this.deriArmorName = deriArmorName;
	}






	public int getDeriArmordata() {
		return deriArmordata;
	}






	public void setDeriArmordata(int deriArmordata) {
		this.deriArmordata = deriArmordata;
	}






	public int getPelerinArmordmg() {
		return pelerinArmordmg;
	}






	public void setPelerinArmordmg(int pelerinArmordmg) {
		this.pelerinArmordmg = pelerinArmordmg;
	}






	public String getPelerinArmorName() {
		return pelerinArmorName;
	}






	public void setPelerinArmorName(String pelerinArmorName) {
		this.pelerinArmorName = pelerinArmorName;
	}






	public int getPelerinArmordata() {
		return pelerinArmordata;
	}






	public void setPelerinArmordata(int pelerinArmordata) {
		this.pelerinArmordata = pelerinArmordata;
	}






	public int getBronzArmordmg() {
		return bronzArmordmg;
	}






	public void setBronzArmordmg(int bronzArmordmg) {
		this.bronzArmordmg = bronzArmordmg;
	}






	public String getBronzArmorName() {
		return bronzArmorName;
	}






	public void setBronzArmorName(String bronzArmorName) {
		this.bronzArmorName = bronzArmorName;
	}






	public int getBronzArmordata() {
		return bronzArmordata;
	}






	public void setBronzArmordata(int bronzArmordata) {
		this.bronzArmordata = bronzArmordata;
	}






	public int getDemirArmordmg() {
		return demirArmordmg;
	}






	public void setDemirArmordmg(int demirArmordmg) {
		this.demirArmordmg = demirArmordmg;
	}






	public String getDemirArmorName() {
		return demirArmorName;
	}






	public void setDemirArmorName(String demirArmorName) {
		this.demirArmorName = demirArmorName;
	}






	public int getDemirArmordata() {
		return demirArmordata;
	}






	public void setDemirArmordata(int demirArmordata) {
		this.demirArmordata = demirArmordata;
	}






	public int getCelikArmordmg() {
		return celikArmordmg;
	}






	public void setCelikArmordmg(int celikArmordmg) {
		this.celikArmordmg = celikArmordmg;
	}






	public String getCelikArmorName() {
		return celikArmorName;
	}






	public void setCelikArmorName(String celikArmorName) {
		this.celikArmorName = celikArmorName;
	}






	public int getCelikArmordata() {
		return celikArmordata;
	}






	public void setCelikArmordata(int celikArmordata) {
		this.celikArmordata = celikArmordata;
	}






	public int getTitanyumArmordmg() {
		return titanyumArmordmg;
	}






	public void setTitanyumArmordmg(int titanyumArmordmg) {
		this.titanyumArmordmg = titanyumArmordmg;
	}






	public String getTitanyumArmorName() {
		return titanyumArmorName;
	}






	public void setTitanyumArmorName(String titanyumArmorName) {
		this.titanyumArmorName = titanyumArmorName;
	}






	public int getTitanyumArmordata() {
		return titanyumArmordata;
	}






	public void setTitanyumArmordata(int titanyumArmordata) {
		this.titanyumArmordata = titanyumArmordata;
	}






	public int getTitanyum2Armordmg() {
		return titanyum2Armordmg;
	}






	public void setTitanyum2Armordmg(int titanyum2Armordmg) {
		this.titanyum2Armordmg = titanyum2Armordmg;
	}






	public String getTitanyum2ArmorName() {
		return titanyum2ArmorName;
	}






	public void setTitanyum2ArmorName(String titanyum2ArmorName) {
		this.titanyum2ArmorName = titanyum2ArmorName;
	}






	public int getTitanyum2Armordata() {
		return titanyum2Armordata;
	}






	public void setTitanyum2Armordata(int titanyum2Armordata) {
		this.titanyum2Armordata = titanyum2Armordata;
	}






	public int getTitanyum3Armordmg() {
		return titanyum3Armordmg;
	}






	public void setTitanyum3Armordmg(int titanyum3Armordmg) {
		this.titanyum3Armordmg = titanyum3Armordmg;
	}






	public String getTitanyum3ArmorName() {
		return titanyum3ArmorName;
	}






	public void setTitanyum3ArmorName(String titanyum3ArmorName) {
		this.titanyum3ArmorName = titanyum3ArmorName;
	}






	public int getTitanyum3Armordata() {
		return titanyum3Armordata;
	}






	public void setTitanyum3Armordata(int titanyum3Armordata) {
		this.titanyum3Armordata = titanyum3Armordata;
	}
	
	
	
}
