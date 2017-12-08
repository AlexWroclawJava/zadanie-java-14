import java.util.Scanner;

public class Imiona {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] tablica = new String[5];
        int x = 0;

            System.out.println("Podaj 5 imion: ");
            tablica[0] = input.nextLine();
            tablica[1] = input.nextLine();
            tablica[2] = input.nextLine();
            tablica[3] = input.nextLine();
            tablica[4] = input.nextLine();

        System.out.print("\nPodane imiona w odwrotnej kolejności to: \n");
        x = 4;
        while (x >= 0) {
            System.out.print(tablica[x] + "\n");
            x--;
        }
    }
}
