package naver.rlgns1129.smartorder.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import naver.rlgns1129.smartorder.domain.StoreMemberBoard;



@Repository
public class StoreMemberBoardDAO {
	@Autowired
	private SqlSession sqlSession;
	
	//게시글 작성
	public int storeMemberBoardWrite(StoreMemberBoard storeMemberBoard) {
		System.out.println("StoreMemberBoardDAO.storeMemberBoardWrite 도착 " + storeMemberBoard);
		return sqlSession.insert("storeMemberBoard.write",storeMemberBoard);
	}
	
   //게시글 목록 
	public List<StoreMemberBoard>storeMemberBoardList(){
		System.out.println("StoreMemberBoardDAO.storeMemberBoardList 도착 ");
		return sqlSession.selectList("storeMemberBoard.list");
		
		
	}
	//게시글 상세보기 
    public StoreMemberBoard storeMemberBoardDetail(int boardBno) {
		System.out.println("StoreMemberBoardDAO.storeMemberBoardDetail 도착 ");
    	return sqlSession.selectOne("storeMemberBoard.detail",boardBno);
   	
    }
   
    public void memberBoardUpdateReadcnt(int boardBno) {
    	sqlSession.update("storememberboard.memberboardupdatereadcnt",boardBno);
    }
	
}
