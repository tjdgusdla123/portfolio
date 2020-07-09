package naver.dkxkgh98.smartorder.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface StoreMemberService {
	//전체 데이터를 가져오는 메소드
	public void allstoremember(HttpServletRequest request, HttpServletResponse response);
   
	//상세보기를 위한 메소드
	public void detailstoremember(HttpServletRequest request, HttpServletResponse response);


	 
}

