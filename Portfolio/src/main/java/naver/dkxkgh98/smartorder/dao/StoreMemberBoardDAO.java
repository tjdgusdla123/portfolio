package naver.dkxkgh98.smartorder.dao;

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
	

}
