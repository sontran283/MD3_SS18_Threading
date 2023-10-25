public class RunnableImpl implements Runnable {
    private String name;

    public RunnableImpl(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i+1);
        }
    }
}
