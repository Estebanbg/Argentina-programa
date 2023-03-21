import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char tipo = sc.next().charAt(0);

        int resultado = calcularPromedio(80, 90, 100, 85, tipo);
        System.out.println("El promedio es: " + resultado);
    }

    public static int calcularPromedio(int nota1, int nota2, int nota3, int nota4, char tipoExamen) {
        int promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.print("Se ha calculado el promedio de los ");
        switch (tipoExamen) {
            case 'Q':
                System.out.println("quizzes.");
                break;
            case 'T':
                System.out.println("trabajos.");
                break;
            case 'E':
                System.out.println("exámenes.");
                break;
            default:
                System.out.println("exámenes.");
        }
        return promedio;
    }

}
