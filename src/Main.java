public class Main extends Thread {
    private String name;

    public Main(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Main("thread1");
        Thread thread2 = new Main("thread2");
        Thread thread = new Thread(new RunnableImpl("runnable target"));

        System.out.println("bat dau chay chuong trinh");
        thread1.start();
//        thread1.join();
        thread2.start();
//        thread2.join();
        thread.start();
        Thread thread3 = new Thread() {
            public void run() {
                System.out.println("thread3 dang chay");
            }
        };
        thread3.start();
        System.out.println("ket thuc chuong trinh");
    }

    @Override
    public void run() {
        int i = 1;
        for (int j = 0; j < 20; j++) {
            System.out.println(j + 1);
        }
    }
}