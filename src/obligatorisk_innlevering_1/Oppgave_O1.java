package obligatorisk_innlevering_1;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave_O1 {

	public static void main(String[] args) {
		for(int cunt = 1; cunt<=10;cunt++) {
		boolean running = false;
		while (!running) {
			
			String poengtxt = showInputDialog("skriv inn mengden poeng i heltall for elev: " + cunt);
			int poeng = Integer.parseInt(poengtxt);
		
				if (90 <= poeng && poeng <= 100) {
					System.out.println("A");}
				else if (80 <= poeng && poeng <= 89) {
					System.out.println("B");}
				else if (60 <= poeng && poeng <= 79) {
					System.out.println("C");}
				else if (50 <= poeng && poeng <= 59) {
					System.out.println("D");}
				else if (40 <= poeng && poeng <= 49) {
					System.out.println("E");}
				else if (00 <= poeng && poeng <= 39) {
					System.out.println("F");}
					else {
						System.err.println("ugyldig input");
						running = false;}
				
				if (0 <= poeng && poeng <= 100) {
					running = true;}
				
				}
		}
		

	}
}
