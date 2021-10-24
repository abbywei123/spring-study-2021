import com.yw.config.AppConfig;
import com.yw.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类去做，我们就只能通过AnnotationConfig 上下文获取容器
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        User user=(User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
