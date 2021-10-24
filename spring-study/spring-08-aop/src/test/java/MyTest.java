import com.yw.service.USerServiceImpl;
import com.yw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService uSerService=(UserService)context.getBean("userService");
        uSerService.delete();
    }
}
