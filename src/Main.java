
public class Main {

    // TODO: Задание: Доработайте методы класса MyThread
    //  так что бы программа вывела в консоль соответствующий результат
    // TODO: Результат работы программы должен быть таким
    //Thread-0 started...
    //Loop 1
    //Loop 2
    //Loop 3
    //Loop 4
    //Loop 5
    //Thread-0 finished...

    public static void main(String[] args) throws InterruptedException {

        // TODO: Этот код изменять ненужно
        MyThread myThread = new MyThread();
        myThread.setNameMyThread("MyThread");
        myThread.setSleepTime(1000);
        myThread.enableMyThread();
        myThread.start();
        Thread.sleep(5000);
        myThread.disableMyThread();
        Thread.sleep(5000);
        myThread.interruptMyThread();


    }

}
