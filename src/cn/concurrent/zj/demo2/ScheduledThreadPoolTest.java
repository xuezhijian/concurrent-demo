/******************************************************************
 * @Title: ScheduledThreadPoolTest.java  
 * @Package cn.concurrent.zj.demo2  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author zj  
 * @date 2017年5月3日   
 * @version V1.0
 *****************************************************************/
package cn.concurrent.zj.demo2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: ScheduledThreadPoolTest
 * @Description: TODO 定长线程池，支持定时及周期性任务执行
 * @author zj
 * @date 2017年5月3日
 */
public class ScheduledThreadPoolTest {

    public static void main(String[] args) {

        test1();
        // test2();
    }

    private static void test1() {

        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        scheduledThreadPool.schedule(new Runnable() {

            public void run() {
                System.out.println("delay 3 seconds");
            }
        }, 3, TimeUnit.SECONDS);

    }

    private static void test2() {

        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {

            public void run() {
                System.out.println("delay 1 seconds, and excute every 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);

    }

}
