package naver.dkxkgh98.storemember;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class StoreMemberTest {
	@Autowired
	private DataSource dataSource;

	@Autowired
	private SqlSession sqlSession;

    //@Test
    //public void mybatisTest() {
	// System.out.println(sqlSession);
   //}
	@Test
	public void detailstroemember() {
		
		System.out.println(sqlSession.selectOne("stroemember.detailitem", 1));

	}

	@Test
	public void connectTest() {
		try {
			System.out.println(dataSource.getConnection());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
