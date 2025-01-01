package exercise;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread from Thread class: " + i);
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread from Runnable class: " + i);
        }
    }
}

public class exercise8 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable); 

        thread1.start();
        thread2.start();
    }
}
