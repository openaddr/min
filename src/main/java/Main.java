import cn.hutool.json.JSONUtil;
import net.mamoe.mirai.Bot;
import net.mamoe.mirai.BotFactory;
import net.mamoe.mirai.event.Event;
import net.mamoe.mirai.event.events.FriendMessageEvent;
import net.mamoe.mirai.utils.BotConfiguration;

public class Main {
    public static void main(String[] args) {
        Bot bot = BotFactory.INSTANCE.newBot(2166675797l, "y1475369",new BotConfiguration(){{
            fileBasedDeviceInfo();
        }});
        bot.login();

        bot.getEventChannel().subscribeAlways(Event.class, event -> {
            String jsonStr = JSONUtil.toJsonStr(event);
            System.out.println(jsonStr);
        });
    }
}
