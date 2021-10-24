import com.yw.mapper.UserMapper;
import com.yw.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test2() {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper=context.getBean("userMapper",UserMapper.class);
        List<User> userList= mapper.queryUser();

        for (User user : userList) {
            System.out.println(user.toString());
        }

    }

    @Test
    public void  test3(){
        int count=1;
        //int x=count++;
        int y=++count;
        System.out.println(count);//2
        //System.out.println(x);1
        System.out.println(y); //2
    }
}
