import com.yw.pojo.Student;
import com.yw.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student student=(Student) context.getBean("student");
        System.out.println(student.toString());
        /*
        * Student{
        * name='张三',
        * address=Address{address='null'},
        * books=[红楼梦, 西游记, 水浒传, 三国演义],
        * hobbies=[听歌, 跑步, 看电影],
        * card={身份证=111111222233334444},
        * games=[LoL, COC, BOB],
        * wife='null',
        * info={姓名=小米, 学号=2015001, username=rose}
        * }

         * */
    }

    @Test
    public void testpnamespace(){
        ApplicationContext context=new ClassPathXmlApplicationContext("userbean.xml");
        User user=context.getBean("user2",User.class);

        System.out.println(user);

        User user2=context.getBean("user2",User.class);
        System.out.println(user2);
        System.out.println(user==user2);
    }
}
