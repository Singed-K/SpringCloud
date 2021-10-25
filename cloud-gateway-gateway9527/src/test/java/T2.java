import java.time.ZonedDateTime;

/**
 * @author : Singed
 * @create : 2021/10/25 20:45
 */
public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();
        System.out.println(zbj);
        //输出当前时区时间
        //2021-10-25T20:46:29.581+08:00[Asia/Shanghai]
    }
}
