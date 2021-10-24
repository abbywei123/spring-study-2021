import com.yw.mapper.UserMapper;
import com.yw.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void test1() throws IOException {
        String resources="mybatis-config.xml";
        InputStream inputStream= Resources.getResourceAsStream(resources);

        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession(true);

        UserMapper mapper=session.getMapper(UserMapper.class);
        List<User> userList= mapper.queryUser();

        for (User user : userList) {
            System.out.println(user.toString());
        }

    }

    @Test
    public void test2() {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper=context.getBean("userMapper",UserMapper.class);
        List<User> userList= mapper.queryUser();

        for (User user : userList) {
            System.out.println(user.toString());
        }

    }
}
