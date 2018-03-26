import com.google.zxing.WriterException;
import com.mbp.exception.BusinessException;
import com.mbp.pojo.ExampleEntity;
import com.mbp.service.ExampleService;
import com.mbp.utils.CodeCostants;
import com.mbp.utils.JDateTimeUtil;
import com.mbp.utils.QrCodeUtil1;
import com.mbp.utils.QrCodeUtil2;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;
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
	public void testJoddJDateTime() {
		JDateTimeUtil jDateTimeUtil = new JDateTimeUtil();
		jDateTimeUtil.testConstructor();
		jDateTimeUtil.testSet();
		jDateTimeUtil.testGet();
		jDateTimeUtil.testAdd();
		jDateTimeUtil.testAdd2();
		jDateTimeUtil.testFormat();
	}

	@Test
	public void testQrCode() throws IOException, WriterException {
		/*
		生成二维码
         */
		QrCodeUtil1.makeEncode();
		/*
		解析二维码
         */
		//QrCodeUtil1.makeDecode();
	}

	@Test
	public void testLogoQrCode() {
		File logoFile = new File("G://logo.jpg");
		File qrCodeFile = new File("G://5.png");
		String url = "https://www.baidu.com/";
		String note = "访问百度链接";
		QrCodeUtil2.drawLogoQRCode(logoFile, qrCodeFile, url, note);
	}

	@Test
	public void testException() {
		String str = "test";
		if (str.equals("test1")) {
			System.out.println("开发中禁止用system.out.println来输出");
		} else {
			throw new BusinessException(CodeCostants.G_UNKNOW, "字符串不同啊");
		}

	}
}
