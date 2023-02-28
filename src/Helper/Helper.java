package Helper;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Helper {
	

	public static void optionPaneChangeButtonText() {
		UIManager.put("OptionPane.cancelButtonText", "�ptal");
		UIManager.put("OptionPane.noButtonText", "Hay�r");
		UIManager.put("OptionPane.yesButtonText", "Evet");
		UIManager.put("OptionPane.okButtonText", "Tamam");
	}
	
	public static void showMessage(String str) {
		String msg;
		optionPaneChangeButtonText();
		switch(str) {
		case "fill" : 
			msg = "L�tfen t�m alanlar� doldurunuz. ";
			break;
			
		case "success" :
			msg = "��lem ba�ar�l�.";
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
			msg= "Bu i�lemi ger�ekle�tirmek istiyor musun?";
		case "sure2":
			msg= "E�er bu birli�e sald�r�rsan�z kazanamazs�n�z ve alt�n kaybedersiniz. Sald�rmak istedi�inize emin misiniz ? ";
			break;
			
		default: msg=str;	
		}
		
		int result = JOptionPane.showConfirmDialog(null, msg,"Dikkat !",JOptionPane.YES_NO_OPTION);
		if(result == 0) return true;
		else return false;
		
	}
	

}
