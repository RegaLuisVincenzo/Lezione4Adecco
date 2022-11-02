package lezione4Adecco;

import java.util.Scanner;

public class Esercizio5Formula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key=new Scanner(System.in);
		double numero=key.nextDouble();
		
		if(numero>=1) {
			System.out.println("non posso calcolarlo");
			
		
		
		System.out.println("####################");
		System.out.println("CALCOLA.........");
		
		double part1=(2*Math.E*Math.PI)/7;
		double part2=Math.sqrt(5*Math.PI);
		double part3=9*Math.E;
		
		double risultato= (part1+part2+numero)/part3;
		
		System.out.println(risultato);
	
		}
		key.close();
	}

}
