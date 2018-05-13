import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author : wuyan
 * @Date: 2018/5/13
 * @Time: 13:54
 * @Description: 线程池的执行顺序，线程数>maximumPoolSize+capacity,超出的线程被拒绝
 */
public class ThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(3,6,
                200, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(5));
        for (int i = 0; i <10; i++) {
            Task task=new Task(i);
            threadPoolExecutor.execute(task);
            System.out.println("线程池中的线程数："+threadPoolExecutor.getPoolSize()+
                    ",线程池中等待的线程数："+threadPoolExecutor.getQueue().size()+",已执行完的任务数目："+threadPoolExecutor.getCompletedTaskCount());
        }
        threadPoolExecutor.shutdown();

    }
    static class Task implements Runnable{
        private int taskNum;

        public Task(int i) {
            this.taskNum=i;
        }

        @Override
        public void run() {
            System.out.println("正在执行的task:"+taskNum);
            try{
                Thread.sleep(5000);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("已经执行完的task:"+taskNum);
        }
    }
}
