import cn.hutool.json.JSONUtil;
import net.mamoe.mirai.Bot;
import net.mamoe.mirai.BotFactory;
import net.mamoe.mirai.event.Event;
import net.mamoe.mirai.event.events.FriendMessageEvent;
import net.mamoe.mirai.utils.BotConfiguration;

public class Main {
    public static void main(String[] args) {
        //配置并登陆QQ
        Bot bot = BotFactory.INSTANCE.newBot(2166675797l, "y1475369",new BotConfiguration(){{
            fileBasedDeviceInfo();
        }});
        bot.login();

        //监听事件
        bot.getEventChannel().subscribeAlways(Event.class, event -> {
            //将Event对象转为json,此处会报错
            String jsonStr = JSONUtil.toJsonStr(event);
            System.out.println(jsonStr);
        });
    }
}
