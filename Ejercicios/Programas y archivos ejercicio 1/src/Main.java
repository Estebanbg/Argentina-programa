import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 4;
        int c = 9;
        int resultado = ordenar(a,b,c);



    }

    public static int ordenar(int numero1, int numero2, int numero3) {
        int[] numeros;
        int i;
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println(numero1);
            if (numero2 > numero3) {
                System.out.println(numero2);
                System.out.println(numero3);
                numeros = new int[]{numero1, numero2, numero3};

                for(i = 0; i < numeros.length; ++i) {
                    System.out.println(numeros[i]);
                }
            } else {
                System.out.println(numero3);
                System.out.println(numero2);
                numeros = new int[]{numero1, numero3, numero2};

                for(i = 0; i < numeros.length; ++i) {
                    System.out.println(numeros[i]);
                }
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(numero2);
            if (numero3 > numero1) {
                System.out.println(numero3);
                System.out.println(numero1);
                numeros = new int[]{numero2, numero3, numero1};

                for(i = 0; i < numeros.length; ++i) {
                    System.out.println(numeros[i]);
                }
            } else {
                System.out.println(numero1);
                System.out.println(numero3);
                numeros = new int[]{numero2, numero1, numero3};

                for(i = 0; i < numeros.length; ++i) {
                    System.out.println(numeros[i]);
                }
            }
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println(numero3);
            if (numero2 > numero1) {
                System.out.println(numero2);
                System.out.println(numero1);
                numeros = new int[]{numero3, numero2, numero1};

                for(i = 0; i < numeros.length; ++i) {
                    System.out.println(numeros[i]);
                }
            } else {
                System.out.println(numero1);
                System.out.println(numero2);
                numeros = new int[]{numero3, numero1, numero2};

                for(i = 0; i < numeros.length; ++i) {
                    System.out.println(numeros[i]);
                }
            }
        }

        return 0;
    }
}