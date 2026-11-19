public class AnatomiaThread {

    public static void main(String[] args) {
        System.out.println("Olá Mundo das Threads!");

        NovaThread threadA = new NovaThread("Thread A");
        NovaThread threadB = new NovaThread("Thread B");

        threadA.start();
        threadB.start();
    }
}
