class MyThread extends Thread {

    private boolean isActive;
    private int sleepTime;

    public void interruptMyThread() {
        // TODO: разработать
    }

    public void disableMyThread() {
        // TODO: разработать
    }

    public void enableMyThread() {
        // TODO: разработать
    }

    public void setSleepTime(int sleepTime) {
        // TODO: разработать
    }

    public String getNameMyThread() {

        // TODO: разработать
        return null;
    }

    public void setNameMyThread(String name) {
        // TODO: разработать
    }

    public void run() {

        System.out.printf("%s started... \n", getNameMyThread());
        int counter = 1;
        while (isActive) {
            System.out.println("Loop " + counter++);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
        System.out.printf("%s finished... \n", getNameMyThread());

    }
}