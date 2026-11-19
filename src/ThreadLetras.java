public class ThreadLetras extends Thread {

    public ThreadLetras() {
        super("Thread B");
    }

    @Override
    public void run() {
        try {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(getName() + " -> " + c);
                Thread.sleep(500);
            }

            System.out.println(getName() + " terminou!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
