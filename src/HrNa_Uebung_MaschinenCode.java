import java.util.Scanner;

public class HrNa_Uebung_MaschinenCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib den Wert  ein!");
        int x = input.nextInt();
        int y = 1;
        for (int i = 0; i < x; i++) {
            y = y + y;
        }
        System.out.println("Ergebnis : " + y);
    }
}
