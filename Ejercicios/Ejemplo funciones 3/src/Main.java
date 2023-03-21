public class Main {

    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] pares = encontrarPares(numeros);
        System.out.println("Los números pares son:");
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }
    }

    public static int[] encontrarPares(int[] numeros) {
        int[] pares = new int[numeros.length];
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[contador] = numeros[i];
                contador++;
            }
        }
        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = pares[i];
        }
        return resultado;
    }

}
/*
En este ejemplo, la función encontrarPares recibe un array de enteros llamado numeros y devuelve otro array
de enteros llamado resultado que contiene todos los números pares encontrados en el array numeros.

La función utiliza un bucle for para recorrer el array numeros y buscar números pares. Si se encuentra un
número par, se almacena en el array pares, que se inicializa con la misma longitud que el array numeros.
Luego, se crea otro array resultado con la longitud correcta (el número de elementos pares encontrados) y
se copian los elementos de pares a resultado.

En el main, se llama a la función encontrarPares con el array numeros y se asigna el resultado a un
nuevo array llamado pares. Finalmente, se imprime cada elemento del array pares.
 */

/*
La línea de código pares[contador] = numeros[i] en la función encontrarPares se utiliza para agregar
un número par encontrado en el array numeros al array pares.

Recuerda que pares es un array que se inicializa con la misma longitud que el array numeros.
Sin embargo, no sabemos cuántos números pares hay en el array numeros antes de recorrerlo.
Por lo tanto, no podemos simplemente agregar todos los números pares al array pares desde el principio.

En lugar de eso, utilizamos la variable contador para llevar la cuenta de cuántos números pares
se han encontrado hasta el momento. Cada vez que encontramos un número par, lo agregamos al array pares
en la posición indicada por contador, y luego incrementamos el valor de contador en 1.

De esta manera, garantizamos que todos los números pares encontrados se almacenen en el array pares
consecutivamente, sin dejar espacios vacíos o elementos duplicados, lo que facilita la creación del
array resultado con la longitud adecuada.
 */