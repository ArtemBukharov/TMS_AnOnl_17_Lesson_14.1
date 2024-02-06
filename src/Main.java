public class Main {
    public static void main(String[] args) {
        Thread Thread1 = new Thread(new Runni());
        Thread1.setName("one");
        Thread Thread2 = new Thread(new Runni());
        Thread2.setName("two");
        Thread Thread3 = new Thread(new Runni());
        Thread3.setName("three");
        Thread1.start();
        try {
            Thread1.join();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        Thread2.start();
        Thread3.start();
        System.out.println("main potok");
    }
}
class  Runni implements Runnable {
    @Override
    public void run() {

        int i;
        for (i = 0; i < 100; i++) {
            System.out.println("В потоке :" + Thread.currentThread().getName() );
        }
    }
}