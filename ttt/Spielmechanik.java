
public class Spielmechanik {
public static void eingabe(int eingabe) {
	Main.spielFeld[eingabe-1]=Main.aktiverSpieler().Zeichen;
	}
public static boolean gewinn() {
	Spieler Spieler = Main.aktiverSpieler();
	if 
	(	((Main.spielFeld[6]==Spieler.Zeichen)&&(Main.spielFeld[7]==Spieler.Zeichen)&&(Main.spielFeld[8]==Spieler.Zeichen))||
		((Main.spielFeld[3]==Spieler.Zeichen)&&(Main.spielFeld[4]==Spieler.Zeichen)&&(Main.spielFeld[5]==Spieler.Zeichen))||
		((Main.spielFeld[0]==Spieler.Zeichen)&&(Main.spielFeld[1]==Spieler.Zeichen)&&(Main.spielFeld[2]==Spieler.Zeichen))||
		((Main.spielFeld[0]==Spieler.Zeichen)&&(Main.spielFeld[3]==Spieler.Zeichen)&&(Main.spielFeld[6]==Spieler.Zeichen))||
		((Main.spielFeld[1]==Spieler.Zeichen)&&(Main.spielFeld[4]==Spieler.Zeichen)&&(Main.spielFeld[7]==Spieler.Zeichen))||
		((Main.spielFeld[2]==Spieler.Zeichen)&&(Main.spielFeld[5]==Spieler.Zeichen)&&(Main.spielFeld[8]==Spieler.Zeichen))||
		((Main.spielFeld[2]==Spieler.Zeichen)&&(Main.spielFeld[4]==Spieler.Zeichen)&&(Main.spielFeld[6]==Spieler.Zeichen))||
		((Main.spielFeld[0]==Spieler.Zeichen)&&(Main.spielFeld[4]==Spieler.Zeichen)&&(Main.spielFeld[8]==Spieler.Zeichen)) ) {
			return true; 
			}
	else
		return false;
	}
public static boolean eingabeM�glich(int eingabe) {
	if ((Main.spielFeld[eingabe-1]=='x')||(Main.spielFeld[eingabe-1]=='o')) {
		System.out.println("Dieses Feld ist schon belegt, w�hle bitte ein anderes aus.");
		return false;																			//nicht m�glicher Zug
		}
	else 	
		return true;																			//M�glicher Zug
}
}