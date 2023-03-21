import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char Letra = s.charAt(i);

            int representacion = Integer.valueOf(Letra) + 1;

            char[] decodificacion = Character.toChars(representacion);

            System.out.print(decodificacion);

            /*
            Se puede usar este metodo tambien
            System.out.println(Arrays.toString(decodificacion));
            */
        }
    }
}