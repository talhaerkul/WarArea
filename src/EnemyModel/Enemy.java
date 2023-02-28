package EnemyModel;

import java.sql.SQLException;
import java.util.Random;

import Helper.Helper;
import Model.Gamer;
import View.MainScreenGUI;

public class Enemy {

	private String name;
	private int damage,health,award,xp,maxNumber;
	
	public Enemy() {
		
	}
	
	public Enemy(String name, int damage, int health, int award,int xp, int maxNumber) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.award = award;
		this.xp = xp;
		this.maxNumber = maxNumber;
	}


	/* rastgele düþman sayýsý 
	  public int EnemyNumber() {
		Random random = new Random();
		return random.nextInt(this.maxNumber)+1;
	}
	*/
	
	
	public boolean combat(Gamer gamer,Enemy enemy) {
		
		boolean key = false;
		int enemydamage = ((enemy.getDamage()*enemy.getMaxNumber())-((gamer.getGamerarmor()+gamer.getGamerpelerindmg())/2));
		int herodamage = gamer.getGamerdamage()+gamer.getGamersword();
		int enemyhealth = enemy.getHealth()*enemy.getMaxNumber();
		int herogold = gamer.getGamergold();
		int nextgold = herogold - (enemy.getMaxNumber()*2);
		int nexthealth = (gamer.getGamerhealth() - enemydamage);
		int ggold = 20;
		int gxp = 10;
		
		
		
		
		if(gamer.getGamerhealth() >= 4 && gamer.getGamerheal()< 40) {
		
		
						if(enemydamage > 0) {
						
										if((enemydamage >= gamer.getGamerhealth() && (gamer.getGamerdamage()+gamer.getGamersword()) < enemyhealth) ) {
											if(Helper.confirm("sure2")) {
												Helper.showMessage("Yaralandýn ve Altýn kaybettin.");
												try {
													gamer.updateGold(gamer.getGamerusername(), nextgold);
													gamer.setGamergold(nextgold);
													
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
												
											}
											
										}else if(enemyhealth > herodamage) {
											Helper.showMessage("Rakip birliðe hasar verdin ama hepsini öldüremedin ve canýn azaldý. Kazanýlan ödül : "+ggold+" Altýn "+gxp+" Xp.");
											try {
												
												if(nexthealth > 0) {
													gamer.updateHealth(gamer.getGamerusername(), nexthealth);
													gamer.setGamerhealth(nexthealth);}
												else {
													gamer.setGamerhealth(1);
													gamer.updateHealth(gamer.getGamerusername(), 1);
												}
												gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold()+ggold);
												gamer.setGamergold(gamer.getGamergold()+ggold);
												
												gamer.setGamerxp(gamer.getGamerxp()+gxp);
												gamer.Level(gamer, gamer.getGamerxp());
												System.out.println(gamer.getGamerlevel());
												System.out.println(gamer.getGamerxp());
												gamer.updateLevel(gamer.getGamerusername(), gamer.getGamerlevel());
												gamer.updateXp(gamer.getGamerusername(), gamer.getGamerxp());
												
												key = true;
											} catch (SQLException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}}
										else if(herodamage >= enemyhealth){
											Helper.showMessage("Rakip birliði yendin ve "+enemy.getAward()+" altýn kazandýn ama canýn azaldý.");
											try {
												if(nexthealth > 0) {
													gamer.updateHealth(gamer.getGamerusername(), nexthealth);
													gamer.setGamerhealth(nexthealth);}
												else {
													gamer.setGamerhealth(1);
													gamer.updateHealth(gamer.getGamerusername(), 1);
												}
												
												gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold()+enemy.getAward());
												gamer.setGamergold(gamer.getGamergold()+enemy.getAward());
												
												gamer.setGamerxp(gamer.getGamerxp()+enemy.getXp());
												gamer.Level(gamer, gamer.getGamerxp());
												System.out.println(gamer.getGamerlevel());
												System.out.println(gamer.getGamerxp());
												gamer.updateLevel(gamer.getGamerusername(), gamer.getGamerlevel());
												gamer.updateXp(gamer.getGamerusername(), gamer.getGamerxp());
												
												key = true;
											} catch (SQLException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}
										}
						}else {
								Helper.showMessage("Rakip birliði yendin ve "+enemy.getAward()+" altýn kazandýn.");
								try {
									
									if(gamer.getGamerheal()>=100) {
										gamer.setGamerhealth(gamer.getGamerhealth()-25);
									}else if(gamer.getGamerheal()>=40 && gamer.getGamerheal()<100) {
										gamer.setGamerhealth(gamer.getGamerhealth()-15);
									}
									else {
										gamer.setGamerhealth(gamer.getGamerhealth()/2);
									}
									if(gamer.getGamerhealth() <= 0) {
										gamer.setGamerhealth(1);
									}
									
									gamer.updateHealth(gamer.getGamerusername(), gamer.getGamerhealth());
									
									gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold()+enemy.getAward());
									gamer.setGamergold(gamer.getGamergold()+enemy.getAward());
									
									gamer.setGamerxp(gamer.getGamerxp()+enemy.getXp());
									gamer.Level(gamer, gamer.getGamerxp());
									System.out.println(gamer.getGamerlevel());
									System.out.println(gamer.getGamerxp());
									gamer.updateLevel(gamer.getGamerusername(), gamer.getGamerlevel());
									gamer.updateXp(gamer.getGamerusername(), gamer.getGamerxp());
									
									key = true;
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
						}
		}else if(gamer.getGamerhealth()<4 && gamer.getGamerheal()<40){
			Helper.showMessage("Canýn çok az!");
		}
		
		
		// KARAKTER GÜÇLENDÝKTEN SONRAKÝ COMBAT
		
		if(gamer.getGamerhealth() > 10 && gamer.getGamerheal()>=40 && gamer.getGamerheal()<150) {
			
									if(enemydamage > 0) {
										
										if((enemydamage >= gamer.getGamerhealth() && (gamer.getGamerdamage()+gamer.getGamersword()) < enemyhealth) ) {
											if(Helper.confirm("sure2")) {
												Helper.showMessage("Yaralandýn ve Altýn kaybettin.");
												try {
													gamer.updateGold(gamer.getGamerusername(), nextgold);
													gamer.setGamergold(nextgold);
													
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
												
											}
											
										}else if(enemyhealth > herodamage) {
											Helper.showMessage("Rakip birliðe hasar verdin ama hepsini öldüremedin ve canýn azaldý. Kazanýlan ödül : "+ggold+" Altýn "+gxp+" Xp.");
											try {
												
												if(nexthealth > 0) {
													gamer.updateHealth(gamer.getGamerusername(), nexthealth);
													gamer.setGamerhealth(nexthealth);}
												else {
													gamer.setGamerhealth(1);
													gamer.updateHealth(gamer.getGamerusername(), 1);
												}
												gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold()+ggold);
												gamer.setGamergold(gamer.getGamergold()+ggold);
												
												gamer.setGamerxp(gamer.getGamerxp()+gxp);
												gamer.Level(gamer, gamer.getGamerxp());
												System.out.println(gamer.getGamerlevel());
												System.out.println(gamer.getGamerxp());
												gamer.updateLevel(gamer.getGamerusername(), gamer.getGamerlevel());
												gamer.updateXp(gamer.getGamerusername(), gamer.getGamerxp());
												
												key = true;
											} catch (SQLException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}}
										else if(herodamage >= enemyhealth){
											Helper.showMessage("Rakip birliði yendin ve "+enemy.getAward()+" altýn kazandýn ama canýn azaldý.");
											try {
												if(nexthealth > 0) {
													gamer.updateHealth(gamer.getGamerusername(), nexthealth);
													gamer.setGamerhealth(nexthealth);}
												else {
													gamer.setGamerhealth(1);
													gamer.updateHealth(gamer.getGamerusername(), 1);
												}
												
												gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold()+enemy.getAward());
												gamer.setGamergold(gamer.getGamergold()+enemy.getAward());
												
												gamer.setGamerxp(gamer.getGamerxp()+enemy.getXp());
												gamer.Level(gamer, gamer.getGamerxp());
												System.out.println(gamer.getGamerlevel());
												System.out.println(gamer.getGamerxp());
												gamer.updateLevel(gamer.getGamerusername(), gamer.getGamerlevel());
												gamer.updateXp(gamer.getGamerusername(), gamer.getGamerxp());
												
												key = true;
											} catch (SQLException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}
										}
						}else {
								Helper.showMessage("Rakip birliði yendin ve "+enemy.getAward()+" altýn kazandýn.");
								try {
									
									if(gamer.getGamerheal()>=100) {
										gamer.setGamerhealth(gamer.getGamerhealth()-25);
									}else if(gamer.getGamerheal()>=40 && gamer.getGamerheal()<100) {
										gamer.setGamerhealth(gamer.getGamerhealth()-15);
									}
									else {
										gamer.setGamerhealth(gamer.getGamerhealth()/2);
									}
									if(gamer.getGamerhealth() <= 0) {
										gamer.setGamerhealth(1);
									}
									
									gamer.updateHealth(gamer.getGamerusername(), gamer.getGamerhealth());
									
									gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold()+enemy.getAward());
									gamer.setGamergold(gamer.getGamergold()+enemy.getAward());
									
									gamer.setGamerxp(gamer.getGamerxp()+enemy.getXp());
									gamer.Level(gamer, gamer.getGamerxp());
									System.out.println(gamer.getGamerlevel());
									System.out.println(gamer.getGamerxp());
									gamer.updateLevel(gamer.getGamerusername(), gamer.getGamerlevel());
									gamer.updateXp(gamer.getGamerusername(), gamer.getGamerxp());
									
									key = true;
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
						}
			
			
			
		}else if(gamer.getGamerhealth()<=10 && gamer.getGamerheal()>=40 && gamer.getGamerheal()<150) {
			Helper.showMessage("Canýn çok az!");
		}
		
		// KARAKTER ÇOK GÜÇLENDÝKTEN SONRAKÝ COMBAT
		
		if(gamer.getGamerhealth() > 25 && gamer.getGamerheal()>=150) {
			
			if(enemydamage > 0) {
				
				if((enemydamage >= gamer.getGamerhealth() && (gamer.getGamerdamage()+gamer.getGamersword()) < enemyhealth) ) {
					if(Helper.confirm("sure2")) {
						Helper.showMessage("Yaralandýn ve Altýn kaybettin.");
						try {
							gamer.updateGold(gamer.getGamerusername(), nextgold);
							gamer.setGamergold(nextgold);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
					
				}else if(enemyhealth > herodamage) {
					Helper.showMessage("Rakip birliðe hasar verdin ama hepsini öldüremedin ve canýn azaldý. Kazanýlan ödül : "+ggold+" Altýn "+gxp+" Xp.");
					try {
						
						if(nexthealth > 0) {
							gamer.updateHealth(gamer.getGamerusername(), nexthealth);
							gamer.setGamerhealth(nexthealth);}
						else {
							gamer.setGamerhealth(1);
							gamer.updateHealth(gamer.getGamerusername(), 1);
						}
						gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold()+ggold);
						gamer.setGamergold(gamer.getGamergold()+ggold);
						
						gamer.setGamerxp(gamer.getGamerxp()+gxp);
						gamer.Level(gamer, gamer.getGamerxp());
						System.out.println(gamer.getGamerlevel());
						System.out.println(gamer.getGamerxp());
						gamer.updateLevel(gamer.getGamerusername(), gamer.getGamerlevel());
						gamer.updateXp(gamer.getGamerusername(), gamer.getGamerxp());
						
						key = true;
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}}
				else if(herodamage >= enemyhealth){
					Helper.showMessage("Rakip birliði yendin ve "+enemy.getAward()+" altýn kazandýn ama canýn azaldý.");
					try {
						if(nexthealth > 0) {
							gamer.updateHealth(gamer.getGamerusername(), nexthealth);
							gamer.setGamerhealth(nexthealth);}
						else {
							gamer.setGamerhealth(1);
							gamer.updateHealth(gamer.getGamerusername(), 1);
						}
						
						gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold()+enemy.getAward());
						gamer.setGamergold(gamer.getGamergold()+enemy.getAward());
						
						gamer.setGamerxp(gamer.getGamerxp()+enemy.getXp());
						gamer.Level(gamer, gamer.getGamerxp());
						System.out.println(gamer.getGamerlevel());
						System.out.println(gamer.getGamerxp());
						gamer.updateLevel(gamer.getGamerusername(), gamer.getGamerlevel());
						gamer.updateXp(gamer.getGamerusername(), gamer.getGamerxp());
						
						key = true;
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}else {
		Helper.showMessage("Rakip birliði yendin ve "+enemy.getAward()+" altýn kazandýn.");
		try {
			
			if(gamer.getGamerheal()>=100) {
				gamer.setGamerhealth(gamer.getGamerhealth()-25);
			}else if(gamer.getGamerheal()>=40 && gamer.getGamerheal()<100) {
				gamer.setGamerhealth(gamer.getGamerhealth()-15);
			}
			else {
				gamer.setGamerhealth(gamer.getGamerhealth()/2);
			}
			if(gamer.getGamerhealth() <= 0) {
				gamer.setGamerhealth(1);
			}
			
			gamer.updateHealth(gamer.getGamerusername(), gamer.getGamerhealth());
			
			gamer.updateGold(gamer.getGamerusername(), gamer.getGamergold()+enemy.getAward());
			gamer.setGamergold(gamer.getGamergold()+enemy.getAward());
			
			gamer.setGamerxp(gamer.getGamerxp()+enemy.getXp());
			gamer.Level(gamer, gamer.getGamerxp());
			System.out.println(gamer.getGamerlevel());
			System.out.println(gamer.getGamerxp());
			gamer.updateLevel(gamer.getGamerusername(), gamer.getGamerlevel());
			gamer.updateXp(gamer.getGamerusername(), gamer.getGamerxp());
			
			key = true;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
}



		}else if(gamer.getGamerhealth()<=25 && gamer.getGamerheal()>=150) {
			Helper.showMessage("Canýn çok az!");
		}
		
		
		
		return key;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;
	}



	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		this.health = health;
	}



	public int getAward() {
		return award;
	}



	public void setAward(int award) {
		this.award = award;
	}

	


	public int getXp() {
		return xp;
	}


	public void setXp(int xp) {
		this.xp = xp;
	}


	public int getMaxNumber() {
		return maxNumber;
	}



	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}
	
	
	
	
	
	
	
}
