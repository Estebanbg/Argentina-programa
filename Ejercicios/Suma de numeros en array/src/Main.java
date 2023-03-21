
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {1, 2, 3, 4, 5};
        int numeroInicio = sc.nextInt();
        int resultado = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeroInicio > numeros[i]) {
                System.out.println(numeros[i]);
                resultado += numeros[i];

            }
        }
        System.out.println(resultado);

    }
}