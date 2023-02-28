package Helper;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Helper {
	

	public static void optionPaneChangeButtonText() {
		UIManager.put("OptionPane.cancelButtonText", "Ýptal");
		UIManager.put("OptionPane.noButtonText", "Hayýr");
		UIManager.put("OptionPane.yesButtonText", "Evet");
		UIManager.put("OptionPane.okButtonText", "Tamam");
	}
	
	public static void showMessage(String str) {
		String msg;
		optionPaneChangeButtonText();
		switch(str) {
		case "fill" : 
			msg = "Lütfen tüm alanlarý doldurunuz. ";
			break;
			
		case "success" :
			msg = "Ýþlem baþarýlý.";
			break;
		default: 
			msg=str; 	
		}
		JOptionPane.showMessageDialog(null, msg,"Mesaj", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public static boolean confirm(String str) {
		String msg;
		optionPaneChangeButtonText();
		switch(str) {
		case "sure":
			msg= "Bu iþlemi gerçekleþtirmek istiyor musun?";
		case "sure2":
			msg= "Eðer bu birliðe saldýrýrsanýz kazanamazsýnýz ve altýn kaybedersiniz. Saldýrmak istediðinize emin misiniz ? ";
			break;
			
		default: msg=str;	
		}
		
		int result = JOptionPane.showConfirmDialog(null, msg,"Dikkat !",JOptionPane.YES_NO_OPTION);
		if(result == 0) return true;
		else return false;
		
	}
	

}
