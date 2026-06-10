package Day9;

import java.util.concurrent.Semaphore;

class FizzBuzz{
    private int n;
    private int current=1;
    private Semaphore sem=new Semaphore(1);

    public FizzBuzz(int n){this.n=n;}
    public void fizz(Runnable printFizz){
        try{
            while(true){
                sem.acquire();
                if(current>n){sem.release(); break;}
                if(current % 3 ==0 && current % 5!=0)
                {
                    printFizz.run();current++;
                }
                sem.release();
            }
        }
        catch(InterruptedException i){}
    }

}
public class FizzBuzzDemo {
   public static void main(String[] args) {
    FizzBuzz fb=new FizzBuzz(15);
    Thread t1=new Thread(()->fb.fizz(
        ()->System.out.println("fizz"))
    );
    t1.start();
   }
}
