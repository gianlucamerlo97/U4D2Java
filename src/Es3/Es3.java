package Es3;
import java.util.Scanner;
public class Es3 {
    public static void main(String[] args) {

    }

    Scanner scanner = new Scanner(System.in);

    public void Es3() {
        String stringa = scanner.next();
        int i = 0;
        String testo = "";
        while (!(stringa.equals(":q"))) {


            while (i < stringa.length()) {
                testo += stringa.charAt(i);
                if (i < stringa.length() - 1) {
                    testo += ", ";
                }
                i++;
            }
            System.out.println(testo);
            stringa = scanner.next();
            testo = "";


        }
    }
}