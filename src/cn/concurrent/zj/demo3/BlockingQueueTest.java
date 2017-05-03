/******************************************************************
 * @Title: BlockingQueueTest.java  
 * @Package cn.concurrent.zj.demo3  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author zj  
 * @date 2017年5月3日   
 * @version V1.0
 *****************************************************************/
package cn.concurrent.zj.demo3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @ClassName: BlockingQueueTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zj
 * @date 2017年5月3日
 */
public class BlockingQueueTest {

    public static void main(String[] args) throws InterruptedException {

        // 声明一个容量为10的缓存队列
        BlockingQueue<String> queue = new LinkedBlockingQueue<String>(10);

        Producer producer1 = new Producer(queue);
        Producer producer2 = new Producer(queue);
        Producer producer3 = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        // 借助Executors
        ExecutorService service = Executors.newCachedThreadPool();
        // 启动线程
        service.execute(producer1);
        service.execute(producer2);
        service.execute(producer3);
        service.execute(consumer);

        // 执行10s
        Thread.sleep(10 * 1000);
        producer1.stop();
        producer2.stop();
        producer3.stop();

        Thread.sleep(2000);
        // 退出Executor
        service.shutdown();

        // ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        // LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        // DelayQueue delayQueue = new DelayQueue();
        // PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        // SynchronousQueue synchronousQueue = new SynchronousQueue();

    }

}
