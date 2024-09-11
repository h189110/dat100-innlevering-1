package obligatorisk_innlevering_1;
import static javax.swing.JOptionPane.*;
public class Oppgave_O3 {

	public static void main(String[] args) {
		String heltalltxt = showInputDialog("skriv in tallet du ønsker fakulert: ");
		int inital = Integer.parseInt(heltalltxt);
		int heltall = inital;
		if (heltall<0) {
			System.err.println("ugyldig input skriv et positivt heltall istede for: "+heltall);}
		
		else {
			for(int i = inital;i>1;i--) {
				heltall = heltall * (inital - 1);
						inital--;
					
				System.out.print(heltall +"-");
				
		}
		System.out.println("");
		System.out.println("sluttsummen er: "+heltall);
	}
	}
}
