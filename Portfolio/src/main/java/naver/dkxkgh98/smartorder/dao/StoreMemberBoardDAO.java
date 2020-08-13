package naver.dkxkgh98.smartorder.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import naver.dkxkgh98.smartorder.domain.StoreMemberBoard;

@Repository
public class StoreMemberBoardDAO {
	@Autowired
	private SqlSession sqlSession;
	
	//게시글 작성
	public int memberBoard(StoreMemberBoard storeMemberBoard) {
		System.out.println("StoreMemberBoardDAO-storeMemberBoard:"+storeMemberBoard);
		return sqlSession.insert("storememberboard.memberboardwrite",storeMemberBoard);
	}
	
   //게시글 목록 
	public List<StoreMemberBoard>memberBoardList(){
		System.out.println("dao 전체데이터 가져오기 "+sqlSession);
		return sqlSession.selectList("storememberboard.memberboardlist");
		
		
	}
	//게시글 상세보기 
  
	
}
