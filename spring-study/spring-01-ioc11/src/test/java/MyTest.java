import com.yw.dao.UerDaoMysqlImpl;
import com.yw.dao.UserDaoImpl;
import com.yw.dao.UserDaoOracleImpl;
import com.yw.service.UserService;
import com.yw.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserService userService=new UserServiceImpl();
        //((UserServiceImpl)userService).setUserDao(new UserDaoImpl());
        //((UserServiceImpl)userService).setUserDao(new UserDaoOracleImpl());
        //((UserServiceImpl)userService).setUserDao(new UerDaoMysqlImpl());
        userService.getUser();
    }
}
