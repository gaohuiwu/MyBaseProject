import com.mbp.pojo.ExampleEntity;
import com.mbp.service.ExampleService;
import com.mbp.utils.JDateTimeUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * FileName:TestExample
 * Author:  ghw06
 * Date:    2017/12/17 16:48
 * Description: 测试demo
 */
public class TestExample {

    @Autowired
    ExampleService userService;

    @Test
    public void test1() {
        List<ExampleEntity> list = userService.getUsers();

        for (ExampleEntity entity : list) {
            System.out.println("123:" + entity);
        }
    }

    @Test
    public void test2() {
        ExampleEntity entity = userService.getUserById(1);

        System.out.println("123:" + entity.getName());

    }

    @Test
    public void testJoddJDateTime(){
        JDateTimeUtil jDateTimeUtil=new JDateTimeUtil();
        jDateTimeUtil.testConstructor();
        jDateTimeUtil.testSet();
        jDateTimeUtil.testGet();
        jDateTimeUtil.testAdd();
        jDateTimeUtil.testAdd2();
        jDateTimeUtil.testFormat();
    }
}
