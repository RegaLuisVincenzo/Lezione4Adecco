package lezione4Adecco;
/*
 * CReare un programma 
 * che stampa tuti i numeri che sono pari
 * che va da 40 a 60
 * stremi inlusi
 * 
 */

public class EserciziCicli1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*	
	///-----ESEMPIO 1
	int index= 40;
	
	while (index<=60){

		// questo codice indicara di stampare i numeri pari 
		if(index % 2==0)
		System.out.println(index);
		
		index++;
		
		*/
		/*
//-------ESEMPIO1
		
		int index= 40;
		
		while (index<=60){
			System.out.println(index);
			index+=2;
			
		}
		*/
		
//-------ESEMPIO2
		
		int index = 40;

		while (index <= 60) {
			// ANDIAMO A CONVERTIRE IL NUMERO IN SCRINGA PER POI DICHIARE UNO SPAZIO PER OGNI STRINGA 
			String risString= index % 2 == 0 ? Integer.toString(index)+" ":" ";
			System.out.print(risString);
			index++;
			
		}	
		}
		
	}

