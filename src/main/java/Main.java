import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kwadrat = new Scanner(System.in);
        System.out.print("Podaj liczbe wierszy: ");
        int wiersz = kwadrat.nextInt();
        System.out.print("Podaj Liczbe kolumn: ");
        int kolumna = kwadrat.nextInt();
        System.out.print("Wprowadz symbol: ");
        char symbol = kwadrat.next().charAt(0);
        for (int i = 0; i < wiersz; i++) {
            for (int j = 0; j < kolumna; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println(); 
        }
        kwadrat.close();
    }
}