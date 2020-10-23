import java.util.*;

class TextFormatter {

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
   // int y = maxlineLength;
    
  }
//Ausgabe
/*An die Gruppe: Import von StringTokenizer, wie Ursprünglich geplant, doch möglich, somit ist die Umsetzung weniger umständlich. Grüße Rick Shaffer
*/
  	public void print(String aText) {

		StringTokenizer st = new StringTokenizer(aText, " ");
		String bText = "";

		while (st.hasMoreTokens()) {
			String nextToken = st.nextToken();
			if (bText.length() + nextToken.length() < 30) {
				bText += nextToken + " ";
			}
			else {
				
				System.out.print(bText);
				System.out.print("\n");
				bText = "";
			}
		}
	}
}