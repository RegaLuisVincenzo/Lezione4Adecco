package lezione4Adecco;

import java.util.Scanner;

public class Esercizio4CicloMolt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key=new Scanner(System.in);
		System.err.println("SCRIVERI UN NUMERO");
		int n1=key.nextInt();
		int index=1;
		int molt= index ;
		key.close();
		
		while(index<=n1) {
			molt*=index ;// somma= somma * index;
			System.err.println(index+"*");
			index++;
			}
		System.out.println("risultato "+molt);
	
		}
		
	}


