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

	
				
	}

