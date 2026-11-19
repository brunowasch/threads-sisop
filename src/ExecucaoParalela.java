public class ExecucaoParalela {

    public static void main(String[] args) {
        System.out.println("=== Início do Programa Principal ===");

        ThreadNumeros threadA = new ThreadNumeros();
        ThreadLetras threadB = new ThreadLetras();

        threadA.start();
        threadB.start();

        System.out.println("As threads foram iniciadas!");
    }
}
