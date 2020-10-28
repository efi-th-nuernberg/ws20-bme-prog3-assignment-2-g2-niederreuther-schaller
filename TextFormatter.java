import java.util.*;

class TextFormatter {

  int maxLineLength;
  
  private static final String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
          "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et " +
          "accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem " +
          "ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod " +
          "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
          "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est " +
          "Lorem ipsum dolor sit amet.";

  public static void main(String[] args) {
    TextFormatter formatter = new TextFormatter(30);
    formatter.print(text);
  }

  // Konstruktor
  public TextFormatter(int maxLineLength) {
    this.maxLineLength = maxLineLength;
  }
//Ausgabe
/*An Rick, mit deiner Lösung, konnten wir unseren Code deutlich entschlacken, wobei die letzten zwei Wörter und die ersten Wörter jeder Zeile gefehlt haben. Beim Lösungsversuch haben wir zwar das letzte Wort herstellen können, aber die ersten Wörter immer noch nicht. Ich habe versucht, die Tokens erst in ein Array zu packen und dann auszugeben, wobei dabei das gleiche Problem aufgetreten ist. Gegenwärtig haben wir zumindest das gleiche Resultat wie du erreicht, nur dass wir zuvor über ein Array arbeiten (in dem aber alle Tokens enthalten sind, was also nicht das Problem sein kann.) - Max

Anmerkung 2: Wir haben das Problem gefixt, indem wir am Ende jeder Schleife bText zum gegenwärtigen Count gemacht haben und am Ende das letzte Bisschen bText ausgegeben haben -Max
*/

/* Habe auch noch mal drüber geschaut und paar Kommentare ergänzt, sowie den Konstruktor hinzugefügt. Habe den Code jetzt auch geaddet damit die finale Version bei uns im Repository steht. Sieht clean aus! Gut gemacht - Rick*/

  public void print(String aText) {

		StringTokenizer st = new StringTokenizer(aText, " ");
		String bText = "";
    List<String> words = new ArrayList<String>();


    /* Alle Wörter von aText werden der ArrayList "words" hinzugefügt*/
		while (st.hasMoreTokens()) {
      words.add(st.nextToken());
    }
    
		for(int count =0; count < words.size(); count++)
      {
		    if (bText.length() + words.get(count).length() < 30) //solang bisheriger Text in der Zeile und zu prüfendes Wort kleiner sind als 30 Zeichen
        {
				bText += words.get(count) + " ";//soll entweder ein weiteres Zeichen hinzugefügt werden
        } 
        else {
        System.out.println(bText);// oder (falls 30 ereicht sind) geben wir den Text aus
				bText = words.get(count) + " ";
        }
		}
    System.out.println(bText); //für letzte Zeile, welche keine 30 Zeichen mehr beinhaltet:
    //restlicher bText wird ausgegeben
	}
}