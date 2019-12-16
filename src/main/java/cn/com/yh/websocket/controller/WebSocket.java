package cn.com.yh.websocket.controller;

import cn.com.yh.websocket.msg.ReqMsg;
import cn.com.yh.websocket.msg.ResMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.user.SimpSession;
import org.springframework.messaging.simp.user.SimpSubscription;
import org.springframework.messaging.simp.user.SimpUser;
import org.springframework.messaging.simp.user.SimpUserRegistry;
import org.springframework.stereotype.Controller;

import java.util.Set;

/**
 * @author yangheng
 * @Classname WebSocket
 * @Description TODO
 * @Date 2019/12/5 20:09
 * @group smart video north
 */

@Controller
public class WebSocket {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    private SimpUserRegistry simpUserRegistry;


    public void onConnect(String sid) {
        System.out.println("------新窗口建立连接------" + sid);
    }


    @MessageMapping("/hello") // @MessageMapping 和 @RequestMapping 功能类似，浏览器向服务器发起消息，映射到该地址。
    @SendTo("/nasus/getResponse") // 如果服务器接受到了消息，就会对订阅了 @SendTo 括号中的地址的浏览器发送消息。
    public ResMsg say(ReqMsg reqMsg) throws Exception {
        Set<SimpUser> users = simpUserRegistry.getUsers();
        for (SimpUser user : users) {
            System.out.println("userName->"+user.getName());
            Set<SimpSession> sessions = user.getSessions();
            for (SimpSession session: sessions) {
                System.out.println("sessionId->"+session.getId());
                Set<SimpSubscription> subscriptions = session.getSubscriptions();
                for (SimpSubscription simpSubscription:subscriptions){
                    System.out.println("simpSubscription->"+simpSubscription.getDestination());
                }
            }
        }
        System.out.println("[用户]" + reqMsg.getSid() + "查询的[车牌号]->" + reqMsg.getPlateNumber() + "!");
        return new ResMsg("[用户]" + reqMsg.getSid() + "查询的[车牌号]->" + reqMsg.getPlateNumber() + "!");
    }


}
