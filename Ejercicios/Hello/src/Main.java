import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de inicio: ");
        int numeroInicio = sc.nextInt();
        System.out.println("Numero de fin: ");
        int numeroFin = sc.nextInt();
        int numerosIntermedios = numeroInicio;
        sc.nextLine();
        System.out.println("Imprimir pares o impares? ");
        String numerosElejidos = sc.nextLine();

        boolean indicador = false;

        if("pares".equals(numerosElejidos)){
            indicador = true;
            while (numerosIntermedios <= numeroFin ) {
                if (indicador == true) {
                    if (numerosIntermedios % 2 == 0) {
                        System.out.println(numerosIntermedios);
                    }
                }
                numerosIntermedios += 1;
            }

        } else if("impares".equals(numerosElejidos)){
            while (numerosIntermedios <= numeroFin ) {
                if (indicador == false) {
                    if (numerosIntermedios % 2 != 0) {
                        System.out.println(numerosIntermedios);
                    }
                }
                numerosIntermedios += 1;
            }
        }


    }
}