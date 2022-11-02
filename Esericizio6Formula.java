package lezione4Adecco;

import java.util.Scanner;

public class Esericizio6Formula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key=new Scanner(System.in);
		System.out.println("INSERISCI NUMERO");
		double  number=key.nextDouble();
		key.close();
		
		if(number>=1) {
			/*
			// questa è la formula suddivisa in 3 blocchi 
			
			final double "R" = 5.99......// non permette di riasegnare un la costante -- ricordo che tutte le lettere devono essere inserite in maiscolo
			
			double blocco1= Math.pow(Math.E/2,number+1);
			
			double blocco2=Math.pow(Math.E/4,3);
			
			double blocco3=(2*Math.PI)-((7*number)/3);
			
			// questa è  la formula intera con i risulati di ogni blocco 
			 * 		
			double risultato=(blocco1*blocco2)/blocco3;
			
			System.out.println(risultato);
			*/
			
				double risultato=( Math.pow(Math.E/2,number+1)*Math.pow(Math.E/4,3))/((2*Math.PI)-((7*number)/3));
				
				if(risultato!=0) {
					
				System.out.println(risultato);
			}
			else {
				System.out.println("non posso calcolaro");		}
		}
	}
}
