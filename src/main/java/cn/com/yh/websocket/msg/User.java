package cn.com.yh.websocket.msg;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author yangheng
 * @Classname User
 * @Description TODO
 * @Date 2020/1/2 9:42
 * @group smart video north
 */

@ApiModel("user")
public class User {

    @ApiModelProperty("startTime")
    private String startTime;
    @ApiModelProperty("endTime")
    private String endTime;
    @ApiModelProperty("areas")
    private String[] areas;


    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String[] getAreas() {
        return areas;
    }

    public void setAreas(String[] areas) {
        this.areas = areas;
    }
}
