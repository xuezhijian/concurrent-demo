/******************************************************************
 * @Title: NotifyTask.java  
 * @Package demo4  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author zj  
 * @date 2017年5月3日   
 * @version V1.0
 *****************************************************************/
package cn.concurrent.zj.demo4;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**  
* @ClassName: NotifyTask  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author zj  
* @date 2017年5月3日  
*    
*/
public class NotifyTask implements Runnable, Delayed{

    private long executeTime;
    
    
    public NotifyTask() {}
    
    
    
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }

   
    @Override
    public int compareTo(Delayed o) {
        // TODO Auto-generated method stub
        return 0;
    }

      
    @Override
    public long getDelay(TimeUnit unit) {
        // TODO Auto-generated method stub
        return 0;
    }

}
