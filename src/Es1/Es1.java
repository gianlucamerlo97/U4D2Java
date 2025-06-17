package Es1;
import java.util.Scanner;
import java.util.Arrays;
public class Es1 {
    public static void main(String[] args) {

    }

        public boolean StringaPariDispari(String str){

            if(str.length() %2 ==0) {
                System.out.println("La stringa è pari");
                return true;
            } else {
                System.out.println("La stringa è dispari");
                return false;
            }



        }

        public boolean annoBisestile(int year){
        if(year % 4 ==0 ){
            return year % 400 == 0 && year % 100 == 0;

        }
            return false;
     }

}
