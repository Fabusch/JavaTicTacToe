import java.util.Scanner;

public class Spieler {
	
String name;
char Zeichen;
boolean aktiv;

public Spieler(String n, char z) {
	name = n;
	Zeichen = 'z';
}
public Spieler(char z) {
	Zeichen = (char) z;
}
public Spieler() {				//notwendig???
	
}
public void setName(String Name){
	name=Name;
}	

public void setAktiv(boolean Wert) {
	aktiv = Wert;
}
public boolean getAktiv() {
	return aktiv;
}
}

