package naver.dkxkgh98.smartorder.service;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartHttpServletRequest;


public interface StoreMemberBoardService {
    //게시물 글쓰기 
	public  Map<String,Object> memberBoard(MultipartHttpServletRequest request, HttpServletResponse response);
}