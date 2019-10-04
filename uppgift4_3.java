/*
uppgift4.3 i boken
skapat 2019 10 14
*/

import javax.swing.*;
public class uppgift4_3	{
	public static void main(String[] args){
		String s =JOptionPane.showInputDialog(null,"Hur mycket poäng fick du?");
		int poäng = Integer.parseInt(s);
		String betyg;
			if (poäng >= 25){
				betyg = "E";
			} else if (poäng >= 30) {
				betyg ="D";
			} else if (poäng >= 35) {
				betyg = "C";
			} else if (poäng >= 40) {
				betyg = "B";
			} else if (poäng >= 45) {
				betyg = "A";
			} else {
				betyg = "F";
			}
			JOptionPane.showMessageDialog(null, "Du fick betyget" + betyg);
	}	
}