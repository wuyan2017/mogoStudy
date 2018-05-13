/**
 * @author : wuyan
 * @Date: 2018/5/13
 * @Time: 13:04
 * @Description: wait()和notify() 线程的执行顺序
 */
public class ThreadLock {

    public static void main(String[] args) {
        final Object object=new Object();
        final Thread thread=new Thread(){
            @Override
            public void run(){
                try{
                    Thread.sleep(2000);
                }catch (Exception e){
                    System.out.println(e);
                }
                System.out.println("子线程");
                try{
                    synchronized (object){
                        object.notify();
                    }
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        };
        thread.start();
        try{
            synchronized(object){
                object.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程");
    }
}
