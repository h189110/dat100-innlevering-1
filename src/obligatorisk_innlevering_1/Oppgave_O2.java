package obligatorisk_innlevering_1;

import static javax.swing.JOptionPane.*;

public class Oppgave_O2 {
	public static void main(String[] args) {
		String inttxt = showInputDialog("skriv inn brutto inntekt uten mellomrom: ");
		double intekt = Integer.parseInt(inttxt);
		
		if(208051<= intekt && intekt <= 292850 ) {
			System.out.println("inntekten din gir deg trinn 1 skatt på 1,7%" + intekt * 0.9983);	
		}
		else if(292851<= intekt && intekt <= 670000) {
			System.out.println("inntekten din gir deg trinn 2 på 4,0%: " + intekt * 0.996);
		}
		else if(670001<= intekt && intekt <=937900) {
			System.out.println(" inntekten din gir deg trinn 3 på 13,6%: " + intekt * 0.9864);
		}
		else if(937901 <= intekt && intekt <= 1350000) {
			System.out.println("inntekten din gir deg trinn 4 på 16,6%: " + intekt * 0.9834);
		}
		else if(1350000<intekt) {
			System.out.println("gratuler du vant kapitalismen du er trinn 5 på 17,6%" + intekt * 0.9824);
		}
		else {
			System.out.println("brutto inntekten din er lav nok til og slippe trinnskatt lønnen din er: " + intekt * 1);
		}
	}
}
