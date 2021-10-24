import com.yw.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringTest {
    public static void main(String[] args) {
        ApplicationContext context=  new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl=(UserServiceImpl) context.getBean("uesrSErviceImpl");
        userServiceImpl.getUser();
    }
}
