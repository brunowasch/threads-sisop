public class App {

    public static void main(String[] args) {
        System.out.println("=== Início do Programa Principal ===");

        ThreadNumeros numeros = new ThreadNumeros();
        ThreadLetras letras = new ThreadLetras();
        ThreadSimbolos simbolos = new ThreadSimbolos();

        numeros.start();
        letras.start();
        simbolos.start();

        System.out.println("As threads foram iniciadas!");
    }
}
