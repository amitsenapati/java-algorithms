public class BadThreads {

// volatile keyword in java guarantees that value of the volatile variable will
// always be read from main memory and "happens-before" relationship in Java Memory
// model will ensure that content of memory will be communicated to different threads.

    static volatile String message;

    private static class ConnectorThread extends Thread{
        @Override
        public void run() {
            try{
                sleep(1000);
            }catch (InterruptedException e){ }
            message = "Mares do eat oats.";
        }
    }

    public static void main(String args[]) throws InterruptedException {
        (new ConnectorThread()).start();
        message = "Mares do not eat Oats.";
        Thread.sleep(2000);
        System.out.println(message);
    }
}
