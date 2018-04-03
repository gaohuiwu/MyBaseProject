
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.junit.Before;
import org.junit.Test;
import com.mbp.pojo.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * FileName:HibernateTest
 * Author:  ghw06
 * Date:    2018/4/2 17:16
 * Description: hibernate测试类
 */
public class HibernateTest {

	Configuration config = null;
	SessionFactory sessionFactory = null;
	Session session = null;
	Transaction tx = null;

	@Before
	public void init() {
		config = new Configuration().configure("/hibernate.cfg.xml");
		sessionFactory = config.buildSessionFactory();
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
	}

	//增加
	@Test
	public void insert() {
		User ue = new User();
		ue.setUsername("Anny321");
		ue.setPassword("123");
		ue.setEmail("Anny@163.com");
		session.save(ue);
		tx.commit();
	}

	//修改
	@Test
	public void update() {
		User user = (User) session.get(User.class, new Integer(11));
		user.setUsername("Penny");
		session.update(user);
		tx.commit();
		session.close();
	}

	//查找
	@Test
	public void getById() {
		User user = (User) session.get(User.class, new Integer(12));
		tx.commit();
		session.close();
		System.out.println("ID号：" + user.getId() + "；用户名：" + user.getUsername() +
				"；密码：" + user.getPassword() + "；邮件：" + user.getEmail());
	}

	//获取所有
	@Test
	public void getAll() {
		Query query = session.createQuery("from User ");
		for (Object u : query.list()) {
			System.out.println("user:" + u);
		}
	}

	//删除
	@Test
	public void delete() {
		User user = (User) session.get(User.class, new Integer(6));
		session.delete(user);
		tx.commit();
		session.close();
	}

	@Test
	public void useSession() {

	}
}
