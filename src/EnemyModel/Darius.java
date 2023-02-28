package EnemyModel;

public class Darius extends Enemy{

	public Darius() {
		super("Darius", 280, 5000, 1000, 1000, 1);
	}
	
	int armor = 400,	heal = 5000;
	String armorname = "Noxus Zýrhý" , axename = "Darius'un Baltasý";
	
	
	
	
	
	public int getHeal() {
		return heal;
	}
	public void setHeal(int heal) {
		this.heal = heal;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public String getArmorname() {
		return armorname;
	}
	public void setArmorname(String armorname) {
		this.armorname = armorname;
	}
	public String getAxename() {
		return axename;
	}
	public void setAxename(String axename) {
		this.axename = axename;
	}
	
	
}
