import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();

        /*
        para agregar la funcion de ordernar por decreciente o creciente debemos agregar un scan
        para saber que opcion quiere el usuario. Luego antes de mostrar el array debemos poner un if
        En este if vamos a preguntar si el usuario ingreso "creciente" o "decreciente". Solo comparando
        la variable que ingreso con las palabras mencionadas.
         */

        if (numero1>numero2 && numero1>numero3){
            int mayor = numero1;
            System.out.println(mayor);
            if (numero2 > numero3){
                int medio = numero2;
                int menor = numero3;
                System.out.println(medio);
                System.out.println(menor);
                int[] numeros = {mayor, medio, menor};
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(numeros[i]);
                }
            }

            else{
                int medio = numero3;
                int menor = numero2;
                System.out.println(medio);
                System.out.println(menor);
                int[] numeros = {mayor, medio, menor};
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(numeros[i]);
                }
            }



        }
        else if (numero2>numero1 && numero2>numero3){
            int mayor = numero2;
            System.out.println(mayor);
            if (numero3 > numero1){
                int medio = numero3;
                int menor = numero1;
                System.out.println(medio);
                System.out.println(menor);
                int[] numeros = {mayor, medio, menor};
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(numeros[i]);
                }
            }
            else{
                int medio = numero1;
                int menor = numero3;
                System.out.println(medio);
                System.out.println(menor);
                int[] numeros = {mayor, medio, menor};
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(numeros[i]);
                }
            }

        }
        else if (numero3>numero1 && numero3>numero2) {
            int mayor = numero3;
            System.out.println(mayor);
            if (numero2 > numero1) {
                int medio = numero2;
                int menor = numero1;
                System.out.println(medio);
                System.out.println(menor);
                int[] numeros = {mayor, medio, menor};
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(numeros[i]);
                }
            } else {
                int medio = numero1;
                int menor = numero2;
                System.out.println(medio);
                System.out.println(menor);
                int[] numeros = {mayor, medio, menor};
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(numeros[i]);
                }
            }

        }

    }
}