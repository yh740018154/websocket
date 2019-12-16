package cn.com.yh.websocket.msg;

/**
 * @author yangheng
 * @Classname ResMsg
 * @Description TODO
 * @Date 2019/12/16 16:56
 * @group smart video north
 */
public class ResMsg {

    private String responseMsg;


    public ResMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }
}
