import java.awt.print.Printable;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner trojkat = new Scanner(System.in);
        System.out.print("Podaj liczbę wierszy: ");
        int wiersz = trojkat.nextInt();
        System.out.print("Podaj liczbę kolumn: ");
        int kolumna = trojkat.nextInt();
        System.out.print("Wprowadź symbol: ");
        char symbol = trojkat.next().charAt(0);
        for (int i = 0; i < wiersz; i++) {
            for (int j = wiersz; j >i+1; j--) {
              
                    System.out.print(" ");
                
            }
          for(int j= 0; j<i+1; j++){

          System.out.print(symbol);

            
          }
            System.out.println();
        }
        trojkat.close();
    }
}