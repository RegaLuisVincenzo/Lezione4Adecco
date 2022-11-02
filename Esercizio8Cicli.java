package lezione4Adecco;

import java.util.Scanner;

/**
 * 
 * 
 * si prenda in una stringa
 * con il metodo nextLine()
 * 
 * si stampi a video una nuova stringa
 * che e' fatta solamente dalle vocali 
 * ( a ,e  i o u )
 * 
 *  0123
 *  ciao -------> [] ------> iao 
 *
 *  alabarda -----> [] ----> aaaa
 * 
 * @author mr
 *
 */

public class Esercizio8Cicli {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
//---ANDIAMO AD UTLIZZARE IL METODO NEXTLINE 
		System.out.println("INSERISCI");
		String parolaInput = key.nextLine();
		
//UTILIZZIAMO COME VOCE UNA STRINGA E UNA INT PER CREARE UN CICLO CHE PARTE DA "0" A "N"
		String nuovaParola = "";// in questo codice , dichiariamo una stampante senza carattere
		int index = 0;
		
// NEL CICLO DOBBAIMO DICHIARARE CHE INT DEBAB ESSERE MINORE DELLO STRING 
		while (index < parolaInput.length()) {
			
// ALL'INTERNO DEL CICLO ANDIAMO A PRNDERE LA PRIMA LETTERA ATTREVRESO IL CHAR 
			char carattereCorrente = parolaInput.charAt(index);
			
// DOPO IL CICLO ANDIAMO A FARE UNA DESCRIMINANTE UTLIZZANDO "IF"(questo è il metodo base  che deve essere ricordato )
			if (carattereCorrente == 'a' || carattereCorrente == 'e' || carattereCorrente == 'i'
					|| carattereCorrente == 'o' || carattereCorrente == 'u') {
				nuovaParola += carattereCorrente; // nuovaParola = nuovaParola + carattere // questo è il primo metodo 
				/*System.out.println(carattereCorrente+"");// questo è il secondo mettodo */
			}

			index++;
		} // fine while

		System.out.println(nuovaParola);// questa è la nostra variabile che contine tutte òle vocali 

		key.close();

	}

}
