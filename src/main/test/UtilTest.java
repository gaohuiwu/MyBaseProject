import com.mbp.utils.RegexUtils;
import com.mbp.utils.StringExamUtil;
import org.junit.Test;

/**
 * FileName:UtilTest
 * Author:  ghw06
 * Date:    2018/4/3 13:58
 * Description: 工具类的测试
 */
public class UtilTest {


    public static void main(String[] args) {
        String str = StringExamUtil.polishByZero(10, "456");
        System.out.println(str);
    }

    @Test
    public void testRegexUtils() {
        String phoneNum = "17705920601";
        boolean flag = RegexUtils.checkMobile(phoneNum);
        System.out.println(flag);

        String mail = "ghw0614@126.com";
        boolean mailFlag = RegexUtils.checkMail(mail);
        System.out.println(mailFlag);
    }
}
