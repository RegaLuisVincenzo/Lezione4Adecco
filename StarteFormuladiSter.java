package lezione4Adecco;

import java.util.Scanner;

public class StarteFormuladiSter {
	
		public static void main(String[] args) {
			
			Scanner key  = new Scanner(System.in);
			
			
			System.out.println("numero");
			int numeroUtente = key.nextInt();
			
			if(numeroUtente < 0 )
				numeroUtente = - numeroUtente;
			
			double fattoriale = 1;
			int index = 1;
			
			
			if(numeroUtente > 20) {
				//usa la formula di stirling
				
				fattoriale = Math.sqrt( 2 * Math.PI * numeroUtente)
						*  Math.pow( numeroUtente / Math.E , numeroUtente); 
				
				System.out.println("Fattoriale di stirling " + fattoriale);
			}
			else {
				
				while(index <= numeroUtente) {
					
					fattoriale *= index;
					
					index++;
				}
				
				System.out.println(fattoriale);
				
				
				
			}
			
			
			
			
			
			key.close();
	}

}
