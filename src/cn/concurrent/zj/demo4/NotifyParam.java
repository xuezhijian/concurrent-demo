/******************************************************************
 * @Title: NotifyParam.java  
 * @Package cn.concurrent.zj.demo4  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author zj  
 * @date 2017年5月3日   
 * @version V1.0
 *****************************************************************/
package cn.concurrent.zj.demo4;

import java.util.Map;

/**
 * @ClassName: NotifyParam
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zj
 * @date 2017年5月3日
 */
public class NotifyParam {

    /**
     * 通知参数（通知规则Map）
     */
    private Map<Integer, Integer> notifyParams;

    /**
     * 通知后用于判断是否成功的返回值（成功标识）,由HttpResponse获取
     */
    private String successValue;

    public Map<Integer, Integer> getNotifyParams() {
        return notifyParams;
    }

    public void setNotifyParams(Map<Integer, Integer> notifyParams) {
        this.notifyParams = notifyParams;
    }

    public String getSuccessValue() {
        return successValue;
    }

    public void setSuccessValue(String successValue) {
        this.successValue = successValue;
    }

    /**
     * 最大通知次数限制.
     * 
     * @return
     */
    public Integer getMaxNotifyTimes() {
        return notifyParams == null ? 0 : notifyParams.size();
    }

}
