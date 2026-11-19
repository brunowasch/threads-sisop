public class ThreadNumeros extends Thread {

    public ThreadNumeros() {
        super("Thread A");
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " -> " + i);
                Thread.sleep(500);
            }

            System.out.println(getName() + " terminou!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
