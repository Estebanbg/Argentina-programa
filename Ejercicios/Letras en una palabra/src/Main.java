public class Main {
    public static void main(String[] args) {
        String palabra = "Holanda";
        char letra = 'a';
        int total = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c == letra){
                total += 1;
            }
            System.out.print(c);

        }
        System.out.println(total);

    }
}