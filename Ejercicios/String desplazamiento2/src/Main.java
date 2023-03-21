import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char Letra = s.charAt(i);

            int representacion = (int) Letra + 1;

            char decodificacion = (char) representacion;

            System.out.print(decodificacion);

        }
    }
}