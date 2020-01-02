package cn.com.yh.websocket;

/**
 * @author yangheng
 * @Classname test
 * @Description TODO
 * @Date 2019/12/19 11:19
 * @group smart video north
 */
public class test {

    public static void main(String[] args) {
        String str="[{\"x\":\"182\",\"y\":\"174\"},{\"x\":\"264\",\"y\":\"174\"},{\"x\":\"264\",\"y\":\"236\"},{\"x\":\"182\",\"y\":\"236\"}]";

        str = str.replace(",", "-");

        System.out.println(str);
    }

    public static void splitStr(String str){
        str=str+"111";

    }
}
