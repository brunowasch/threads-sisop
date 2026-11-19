public class ThreadSimbolos extends Thread {

    public ThreadSimbolos() {
        super("Símbolos");
    }

    @Override
    public void run() {
        char[] simbolos = {'*', '#', '@', '$', '%'};

        try {
            for (char simbolo : simbolos) {
                System.out.println(getName() + " -> " + simbolo);
                Thread.sleep(500);
            }

            System.out.println(getName() + " terminou!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
