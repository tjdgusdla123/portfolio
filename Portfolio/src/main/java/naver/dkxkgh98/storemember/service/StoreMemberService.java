package naver.dkxkgh98.storemember.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface StoreMemberService {
	//전체 데이터를 가져오는 메소드
	public void allstoremember(HttpServletRequest request, HttpServletResponse response);

}
