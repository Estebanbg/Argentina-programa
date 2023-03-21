public class Main {

    public static void main(String[] args) {
        int[] notas = { 80, 90, 100, 85 };
        int[] resultado = calcularMaxMin(notas);
        System.out.println("La nota máxima es: " + resultado[0]);
        System.out.println("La nota mínima es: " + resultado[1]);
    }

    public static int[] calcularMaxMin(int[] notas) {
        int max = notas[0];
        int min = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
            if (notas[i] < min) {
                min = notas[i];
            }
        }
        int[] resultado = { max, min };
        return resultado;
    }

}
