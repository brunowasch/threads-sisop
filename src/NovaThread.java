public class NovaThread extends Thread {

    public NovaThread(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println(getName() + " está executando...");
        System.out.println(getName() + " finalizou!");
    }
}
