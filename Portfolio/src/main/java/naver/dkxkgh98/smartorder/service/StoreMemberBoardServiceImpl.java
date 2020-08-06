package naver.dkxkgh98.smartorder.service;



import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import naver.dkxkgh98.smartorder.dao.StoreMemberBoardDAO;

import naver.dkxkgh98.smartorder.domain.StoreMember;
import naver.dkxkgh98.smartorder.domain.StoreMemberBoard;

@Service
public class StoreMemberBoardServiceImpl implements StoreMemberBoardService {
	@Autowired
	private StoreMemberBoardDAO  storeMemberBoardDao;

	//게시판 글 작성 
	@Override
	public Map<String, Object> memberBoard(MultipartHttpServletRequest request , HttpServletResponse response) {
  
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("result", false);
    //파라미터 읽기  
    String boardBno = request.getParameter("boardbno");
    String boardTitle = request.getParameter("boardtitle");
    String boardContent = request.getParameter("boardcontent");
    String memberNickname = request.getParameter("membernickname");
    MultipartFile boardFile =request.getFile("boardfile");
   
    System.out.println("serviceImpl-memberBoard-boardBno:"+boardBno);
    System.out.println("serviceImpl-memberBoard-boardTitle:"+boardTitle);
	 System.out.println("serviceImpl-memberBoard-boardContent:"+boardContent);
	 System.out.println("serviceImpl-memberBoard-memberNickname:"+memberNickname);
	 System.out.println("serviceImpl-memberBoard-boardFile:"+boardFile);
    
	 if(boardTitle.length()==0) {
		 boardTitle= "무제";
	 }
	 if(boardContent.length() == 0) {
		 boardContent= "냉무";
	 }
	 
	
	 
	  String uploadPath = request.getServletContext().getRealPath("/user/profile");
		// 파일 이름 만들기
		 UUID uemail = UUID.randomUUID();
		String filename = boardFile.getOriginalFilename();
	
	   try {
			if(filename.length()>0) {
				filename = uemail + "_" + filename;
				//저장된 파일 경로 만들기
			String filepath  = uploadPath + "\\" + filename;
			//파일 업로드
	        File file = new File(filepath);
				boardFile.transferTo(file);
		
	        
			}else {
				filename="default.png";
			}
			//필요한 데이터를 생성 
			 StoreMemberBoard storeMemberBoard = new StoreMemberBoard();
		     String boardIp =request.getRemoteAddr();
		     storeMemberBoard.setBoardFile(filename);
		     storeMemberBoard.setBoardTitle(boardTitle);
		     storeMemberBoard.setBoardContent(boardContent);
		     storeMemberBoard.setMemberNickname(memberNickname);
		     storeMemberBoard.setBoardIp(boardIp);
		    
		     System.out.println("serviceImpl-memberBoard-storeMemberBoard.setBoardTitle(boardTitle):"+boardTitle);
		     System.out.println("serviceImpl-memberBoard-storeMemberBoard.setBoardFile(filename):"+filename);
		     System.out.println("serviceImpl-memberBoard-storeMemberBoard.setBoardContent(boardContent):"+boardContent);
		     System.out.println("serviceImpl-memberBoard-storeMemberBoard.setMemberNickname(memberNickname):"+memberNickname);
		     System.out.println("serviceImpl-memberBoard-storeMemberBoard.setBoardIp(boardIp):"+boardIp);
		    
		     int row = storeMemberBoardDao.memberBoard(storeMemberBoard);
				// 저장에 성공하면 map의 result에 true 저장
				if (row > 0) {
					map.put("result", true);
				}
			
			 
	   }catch (Exception e){
		   System.out.println("서비스 파일 예외:"+e.getMessage());
		   
	   }
    return map;

	}




}
