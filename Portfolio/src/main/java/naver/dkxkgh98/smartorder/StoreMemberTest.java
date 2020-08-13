package naver.dkxkgh98.smartorder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import naver.dkxkgh98.smartorder.dao.StoreMemberBoardDAO;
import naver.dkxkgh98.smartorder.domain.StoreMember;
import naver.dkxkgh98.smartorder.domain.StoreMemberBoard;

//Spring에서 JUnit4 라이브러를 사용하기 위한 설정
@RunWith(SpringJUnit4ClassRunner.class)
//locations에 설정된 파일들을 실행시켜서 메로리에 로드하기 위한설정
//프레임워크마다 설정파일의 경로가 다르므로 web.xml에 설정된 내용을 확인하고
@WebAppConfiguration
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class StoreMemberTest {
	//데이터베이스 연견을 확일할 때 주입
	@Autowired
	private DataSource dataSource;

	
	//@Test
	//public void mybatisTest() {
	// System.out.println(sqlSession);
	// }
	
	//@Test
	//public void detailstroemember() {
	//	System.out.println(sqlSession.selectOne("TestsqlSession"+"storemember.detailstoremember", 1));

	//}

//	@Test
//	public void ConnectTest() {
//		try {
//			System.out.println("Test connectTest:"+dataSource.getConnection());
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			
//			e.printStackTrace();
//		}
//	}
	@Autowired
	private SqlSession sqlSession;
	
//	@Test
//	public void sqlTest() {
//		//email 중복검사
//		//존재하는 이메일이므로 이메일이 출력
//		System.out.println(sqlSession.selectOne("storemember.memberemailcheck", "dkxkgh91@naver.com"));
//		//없는 이메일이므로 null 출력
//		System.out.println(sqlSession.selectOne("storemember.memberemailcheck", "dkxkgh9112@naver.com"));
//		
//	}
//	
//	@Test
//	public void sqlTest2() {
//		//email 중복검사
//		//존재하는 닉네임이므로 이메일이 출력
//		System.out.println(sqlSession.selectOne("storemember.membernicknamecheck", "배짱"));
//		//없는 닉네임이므로 null 출력
//		System.out.println(sqlSession.selectOne("storemember.membernicknamecheck", "임짱"));
//		
//		//데이터 삽입 확인
//		StoreMember storemember =new StoreMember();
//		storemember.setMemberemail("tjdgusdla123@naven.com");
//		storemember.setMemberislogin("");
//		storemember.setMemberlastlogindate(new Date());
//		storemember.setMembernickname("임짱");
//		storemember.setMemberpassword("1234");
//		storemember.setMemberphonenumber("01015153636");
//		storemember.setMemberisremove("");
//		
//		//삽입 삭제 갱신은 정수를 리턴하는데 리턴되는 값은 영향받는 행의 개수
//		System.out.println(sqlSession.insert("storemember.join",storemember));
//	}
	
//	@Test
//	public void memberBoardTest() {
//		StoreMemberBoard  storeMemberBoard =new StoreMemberBoard();
//		storeMemberBoard.setBoardTitle("처음 작성 합니다.");
//		storeMemberBoard.setBoardContent("sdasdasd");
//		storeMemberBoard.setBoardIp("12313");
//		storeMemberBoard.setMemberNickname("test2");
//		storeMemberBoard.setBoardFile("default.png");
//
//System.out.println(sqlSession.insert("storememberboard.memberboard",storeMemberBoard));
////	}
		@Test
	public void memberBoardWriteTest() {
		//게시글 목록 
			//System.out.println(sqlSession.selectList("storememberboard.memberboardlist"));
	   //게시글 상세보기 
		//System.out.println(sqlSession.selectOne("storememberboard.memberboarddetail",1).toString());
			
			//글번호를 가지고 조회수를 1증가시키는 sql 테스트를 했는데 오류가 남  근대 DB에는 반영이됨 뭐가 문제일까?
		//System.out.println(sqlSession.selectOne("storememberboard.memberboardupdatereadcnt",1).toString());

	}
	
	//DAO 테스트
	@Autowired
	private StoreMemberBoardDAO storeMemberBoardDao;
	@Test
	public void daoTest() {
		//DAO 확인
		//System.out.println(storeMemberBoardDao);
		//상세보기 테스트 
		//System.out.println(storeMemberBoardDao.memberBoardDetail(1));
		//글번호로 조회수 +1하기 테스트 
		//System.out.println(storeMemberBoardDao.memberboardupdatereadcnt(1));
	}
	   
		
		
}




