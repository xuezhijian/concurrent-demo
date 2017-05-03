/******************************************************************
 * @Title: NotifyQueue.java  
 * @Package cn.concurrent.zj.demo4  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author zj  
 * @date 2017年5月3日   
 * @version V1.0
 *****************************************************************/
package cn.concurrent.zj.demo4;

import java.io.Serializable;
import java.util.Date;

/**  
* @ClassName: NotifyQueue  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author zj  
* @date 2017年5月3日  
*    
*/
public class NotifyQueue implements Serializable{

//    /**
//    *
//    */
//   private static final long serialVersionUID = 1L;
//
//   private static final Log LOG = LogFactory.getLog(NotifyQueue.class);
//
//   @Autowired
//   private NotifyParam notifyParam;
//   
//
//   /**
//    * 将传过来的对象进行通知次数判断，决定是否放在任务队列中.<br/>
//    * @param notifyRecord
//    * @throws Exception
//    */
//   public void addToNotifyTaskDelayQueue(RpNotifyRecord notifyRecord) {
//       if (notifyRecord == null) {
//           return;
//       }
//       LOG.info("===>addToNotifyTaskDelayQueue notify id:" + notifyRecord.getId());
//       Integer notifyTimes = notifyRecord.getNotifyTimes(); // 通知次数
//       Integer maxNotifyTimes = notifyRecord.getLimitNotifyTimes(); // 最大通知次数
//       
//       if (notifyRecord.getNotifyTimes().intValue() == 0) {
//           notifyRecord.setLastNotifyTime(new Date()); // 第一次发送(取当前时间)
//       }else{
//           notifyRecord.setLastNotifyTime(notifyRecord.getEditTime()); // 非第一次发送（取上一次修改时间，也是上一次发送时间）
//       }
//       
//       if (notifyTimes < maxNotifyTimes) {
//           // 未超过最大通知次数，继续下一次通知
//           LOG.info("===>notify id:" + notifyRecord.getId() + ", 上次通知时间lastNotifyTime:" + DateUtils.formatDate(notifyRecord.getLastNotifyTime(), "yyyy-MM-dd HH:mm:ss SSS"));
//           App.tasks.put(new NotifyTask(notifyRecord, this, notifyParam));
//       }
//       
//   }
    
    
}
