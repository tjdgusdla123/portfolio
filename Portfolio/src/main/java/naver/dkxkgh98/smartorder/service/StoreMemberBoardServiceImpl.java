package naver.dkxkgh98.smartorder.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import naver.dkxkgh98.smartorder.dao.StoreMemberBoardDAO;
import naver.dkxkgh98.smartorder.dao.StoreMemberDAO;
import naver.dkxkgh98.smartorder.domain.StoreMember;
import naver.dkxkgh98.smartorder.domain.StoreMemberBoard;

@Service
public class StoreMemberBoardServiceImpl implements StoreMemberBoardService {
	@Autowired
	private StoreMemberBoardDAO  storeMemberBoardDao;

	
	@Override
	public void memberBoard(HttpServletRequest request) {
	 String boardTitle = request.getParameter("boardTitle");
	 String boardContent = request.getParameter("boardContent");
	 StoreMember storeMember =(StoreMember)request.getSession().getAttribute("storeMember");
	 String memberNickname = request.getParameter("boardTitle");
	 
	 System.out.println("serviceImpl-memberBoard-boardTitle"+boardTitle);
	 System.out.println("serviceImpl-memberBoard-boardContent"+boardContent);
	 System.out.println("serviceImpl-memberBoard-storeMember"+storeMember);
	 System.out.println("serviceImpl-memberBoard-memberNickname"+memberNickname);
	 
	
	 if(boardTitle.length()==0) {
		 boardTitle= "무제";
	 }
	 if(boardContent.length() == 0) {
		 boardContent= "냉무";
	 }
	 
	 //필요한 데이터를 생성 
     String boardIp =request.getRemoteAddr();
     StoreMemberBoard storeMemberBoard = new StoreMemberBoard();
     storeMemberBoard.setBoardTitle(boardTitle);
     storeMemberBoard.setBoardContent(boardContent);
     storeMemberBoard.setMemberNickname(memberNickname);
     storeMemberBoard.setBoardIp(boardIp);
     

	}

}
