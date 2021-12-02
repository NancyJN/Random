public class Main {
    public static void main(String[] args) {
        Safe safe= new Safe();
        Thread thread1 = new Thread(()-> safe.open(),"Thread1");
        Thread thread2 = new Thread(()->safe.open(),"Thread2");
        thread1.start();
        thread2.start();

    }
    static class Safe{
        public synchronized void open(){
            System.out.println(Thread.currentThread().getName()+" Entering the safe");
            try {
                Thread.sleep(1000);

            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " Leaving the safe");
        }
    }
}
