package lezione4Adecco;

import java.util.Scanner;

/*
 *crea un programma 
 *che prenda in ingresso  2 numeri 
 *che per nostro comodo sono ordinati
 * ( il rprimo numeor è sempre più piccolo del secondo )
 * 
 * 
 */

public class Esercizio2Cicli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key=new Scanner(System.in);
//-------ESEMPIO 1	
		/*
		 * 
		int n1 , n2 ;
		System.out.println("STAMPA IL PRIMO N. ");
		n1=key.nextInt();
		System.out.println("STAMPA IL SECONDO N.");
		n2=key.nextInt();
		key.close();
		
		while(n2>=n1) {
			System.out.print(n1+"");
			n1++;	
		}
		*/
//------ESEMPIO2
	
		int n1 , n2 ;
		
		int MIN , MAX;
		
		System.out.println("STAMPA IL PRIMO N. ");
		n1=key.nextInt();
		System.out.println("STAMPA IL SECONDO N.");
		n2=key.nextInt();
		key.close();
		
		MAX=n1 > n2 ? n1 : n2;
		MIN=n1 > n2 ? n2 : n1;
		
		System.out.println("MIN vale"+MIN);
		System.out.println("MAX vale"+MAX);
		
		while(MIN<=MAX) {
			System.out.print(MIN+" ");
			MIN++;	
		}
		
//-----ESEMPIO3
		/*
		int n1, n2;

		int min, max;

		System.out.println("STAMPA IL PRIMO N. ");
		n1 = key.nextInt();
		System.out.println("STAMPA IL SECONDO N.");
		n2 = key.nextInt();
		key.close();
		
		if(n1>n2) {
			max=n1;
			min=n2;	
		}
		else {
			max=n2;
			min=n1;
		}
		*/
	}

}
