/******************************************************************
 * @Title: FixedThreadPoolTest.java  
 * @Package cn.concurrent.zj.demo2  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author zj  
 * @date 2017年5月3日   
 * @version V1.0
 *****************************************************************/
package cn.concurrent.zj.demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: FixedThreadPoolTest
 * @Description: TODO 定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
 * @author zj
 * @date 2017年5月3日
 */
public class FixedThreadPoolTest {

    public static void main(String[] args) {

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable() {

                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

}
