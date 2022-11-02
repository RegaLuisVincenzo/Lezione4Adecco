package lezione4Adecco;
/*
 * crea un programma 
 * che prenda in ingresso 
 * un numero in tastiera
 * e calcola la somma 
 * cha va da 1 fino al numero inserito
 * 
 * 
 */

import java.util.Scanner;

public class Esercizio3CicliSomm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key=new Scanner(System.in);
		System.out.println("SCRIVERI UN NUMERO");
		int n1=key.nextInt();
		int index=1;
		int somma=0;
		key.close();
		
		while(index<=n1) {
			somma+=index ;// somma= somma + index;
			System.out.println(index+"+");
			index++;
			}
		System.out.println("LA SOMMMA TOTALE "+somma);
		

	}

}
