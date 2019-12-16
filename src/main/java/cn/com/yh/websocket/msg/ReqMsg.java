package cn.com.yh.websocket.msg;

/**
 * @author yangheng
 * @Classname ReqMsg
 * @Description TODO
 * @Date 2019/12/16 16:53
 * @group smart video north
 */
public class ReqMsg {

    private String sid;

    private String plateNumber;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
