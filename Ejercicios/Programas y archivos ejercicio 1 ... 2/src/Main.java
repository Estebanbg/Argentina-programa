import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        char orden = sc.next().charAt(0);
        sc.close();
        int [] resultado = ordenar(a,b,c,orden);

        System.out.println(Arrays.toString(resultado));

    }

    public static int[] ordenar(int numero1, int numero2, int numero3, char orden) {

        int mayor = 0;
        int medio = 0;
        int menor = 0;
        int temp = 0;

        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;

            if (numero2 >= numero3) {
                medio = numero2;
                menor = numero3;

            } else {
                medio = numero3;
                menor = numero2;
            }


        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;

            if (numero3 >= numero1) {
                medio = numero3;
                menor = numero1;

            } else {
                medio = numero1;
                menor = numero3;
            }

        } else if (numero3 >= numero1 && numero3 >= numero2) {
            mayor = numero3;

            if (numero2 >= numero1) {
                medio = numero2;
                menor = numero1;

            } else {
                medio = numero1;
                menor = numero2;
            }
        }


        if (orden == 'a') {
            temp = mayor;
            mayor = menor;
            menor = temp;
        }
        else if (orden == 'd'){

        }else {
            System.out.println("error");
            return new int[]{0};
        }


        return new int[]{mayor, medio, menor};
    }
}