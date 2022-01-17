import java.util.Scanner;

public class Main {
	public static Spieler Spieler1 = new Spieler('x');
	public static Spieler Spieler2 = new Spieler('o');
	public static char[] spielFeld = new char[9];				//Spielfeld

	public static void main(String[] args) {
												// Namensgebung der Spieler
		Scanner scanner = new Scanner(System.in);
												// Eingabe und Ausgabe Name Sp.1
		System.out.println("Gebt um fortzufahren bitte eure Namen ein" +"\n" + "Wie heiﬂt der Spieler auf der rechten Bildschirmseite?");	
		Spieler1.setName(scanner.next());
		System.out.println("Spieler 1 " + ": " + Spieler1.name + "\n" + "Zeichen : " + Spieler1.Zeichen);
												// Eingabe und Ausgabe Name Sp.2
		System.out.println("Und wie heiﬂt der Spieler auf der linken Bildschirmseite?");
		Spieler2.setName(scanner.next());
		System.out.println("Spieler 2 : " + Spieler2.name +"\n" + "Zeichen : " + Spieler2.Zeichen);
		

		printFeld();		//drucke spielfeld
		//Wer soll beginnen?
		Spieler1.setAktiv(true);			//Sp1 als erestest Aktiv
		Spieler2.setAktiv(false);
		
		for (int durchgang = 1; durchgang <= 9; durchgang++) {	 //Schleife bis gewinn
			Zug(durchgang);											//Eingabe und ‹berpr¸fen
			printFeld();										//Zeige feld
			if(Spielmechanik.gewinn())							//Gewinn? nicht ->  N‰chster Spieler
				break;
			spielerwechsel();									
			}
		if (Spielmechanik.gewinn()) {							//Gewonnen? -> Ja, zeige Gewinner
			System.out.println(aktiverSpieler().name + " hat gewonnen!"); 
		}
		else 
			System.out.println("Draw" + "\n" + "Leider hat keiner gewonnen.");
	}
	public static void printArray(char a[][]) {				//Spielfeld zweidimensionales array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
				if (j == (a[i].length) - 1)
					System.out.println();
			}
		}
	}
	public static void printFeld() {			//print SpielFeld in Feld
		char[][] Feld = { { ' ', spielFeld[6], ' ', '|', ' ', spielFeld[7], ' ', '|', ' ', spielFeld[8], ' ' },
				{ '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', },
				{ ' ', spielFeld[3], ' ', '|', ' ', spielFeld[4], ' ', '|', ' ', spielFeld[5], ' ' },
				{ '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', },
				{ ' ', spielFeld[0], ' ', '|', ' ', spielFeld[1], ' ', '|', ' ', spielFeld[2], ' ' } };
		printArray(Feld);
	}
	public static void Zug(int durchgang) {
		int eingabe;
		do {
	System.out.println("Zug : " + durchgang + "\n" + aktiverSpieler().name + " w‰hle ein Feld" + "\n" + "Felder siehe Nummernblock");
	eingabe = new java.util.Scanner(System.in).nextInt();
		}while (!(Spielmechanik.eingabeMˆglich(eingabe)));
		Spielmechanik.eingabe(eingabe); 
	}											
	// Spielerwechsel
	public static void spielerwechsel() {

		if (Spieler1.getAktiv()) {
			Spieler1.setAktiv(false);	
			Spieler2.setAktiv(true);						// sp1 inaktiv; sp2 aktiv
		} else {
			Spieler1.setAktiv(true);						//sp1 aktiv; sp2. inaktiv
			Spieler2.setAktiv(false);
		}

	}
	public static Spieler aktiverSpieler() { 		//fragt ab welcher spieler aktiv ist
		if (Spieler1.aktiv)
			return Spieler1;
		else 
			return Spieler2;
	}


}


