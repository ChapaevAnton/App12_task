package solution_task;

// TODO: 28.03.2021 Решение
class MyThread extends Thread {

    private boolean isActive;
    private int sleepTime;

    public void interruptMyThread(){
        Thread.currentThread().interrupt();
    }

    public void disableMyThread() {
        isActive = false;
    }

    public void enableMyThread() {
        isActive = true;
    }

   public void setSleepTime(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    public String getNameMyThread() {
        return Thread.currentThread().getName();
    }

    public void setNameMyThread(String name) {
        Thread.currentThread().setName(name);
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