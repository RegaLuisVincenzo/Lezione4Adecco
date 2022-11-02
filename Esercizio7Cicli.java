package lezione4Adecco;

import java.util.Scanner;

/*
 * creda in input 2 numeri 
 * che sono >0  altrimenti exit 
 * il primo numeor è la base 
 * il secondo si chiama esponente 
 * 
 * il programma calcola la potenza 
 * 
 * 
 * 
 * 
 */

public class Esercizio7Cicli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key=new Scanner(System.in);
		//crea due numeri 
		int base , esponente ;
		base=key.nextInt();
		esponente=key.nextInt();
		int potenza= 1 ;
		key.close();
		
		// dichiarimao che i numeri sono maggiori di 0
		if(base<0||esponente<0) {
		System.out.println("non posso calcolare");
		System.out.println();
		}
		
		//andiamo a fare l'operazione per trovare la potenza 
		System.out.println("CALCOLA LA POTENZA");
		while (esponente>=1) {
			potenza*=base;
			esponente--;
		}
		System.out.println("lA POTENZA VALE "+potenza);	

	}

}
