import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        float ingresos = sc.nextFloat();
        int vehiculos = sc.nextInt();
        int inmuebles = sc.nextInt();
        boolean EmbarcacionAeronave = sc.nextBoolean();

        if  (ingresos >= 489083) {

            System.out.println("Pertenece al segmento de ingresos altos");

        } else if( vehiculos >= 3 ){

            System.out.println("Pertenece al segmento de ingresos altos");

        }else if( inmuebles >= 3 ){

            System.out.println("Pertenece al segmento de ingresos altos");

        }else if( EmbarcacionAeronave == true ){

            System.out.println("Pertenece al segmento de ingresos altos");

        }else {

            System.out.println("No pertenece al segmento de ingresos altos");

        }
    }



}