package naver.dkxkgh98.storemember.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import naver.dkxkgh98.storemember.dao.StoreMemberDAO;
import naver.dkxkgh98.storemember.domain.StoreMember;
@Service
public class StoreMemberServiceImpl implements StoreMemberService {
     @Autowired
	private StoreMemberDAO storeMemberDAO;

	@Override
	public void allstoremember(HttpServletRequest request, HttpServletResponse response) {
        //1.파라미터 읽기
		
		//2.필요한 처리 수행
		
		//3.DAO 메소드의 매개변수 생성
		
		//4.DAO 메소드를 호출
		List<StoreMember> list = storeMemberDAO.allstoremember();
		//5.결과를 가공
		
		//6.결과를 저장 - REST API Server의 경우는 request에 저장
		request.setAttribute("list", list);
	}

	@Override
	public void detailstoremember(HttpServletRequest request, HttpServletResponse response) {
		//요청 주소의 마지막 부분을 가져오기
		String requestURI =request.getRequestURI();
		System.out.println(requestURI);
		String [] ar =requestURI.split("/");
		String membernickname =ar[ar.length-1];
		System.out.println(membernickname);
		//DAO의 메소드 호출
		StoreMember storemember = storeMemberDAO.detailstoremember(membernickname);
		//결과를 저장
		request.setAttribute("storemember", storemember);
		System.out.println(storemember);
	}

	
				
	}

