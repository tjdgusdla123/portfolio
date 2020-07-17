package naver.dkxkgh98.smartorder.service;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import naver.dkxkgh98.smartorder.dao.StoreMenuDAO;
import naver.dkxkgh98.smartorder.domain.StoreMenu;

@Service
public class StoreMenuServiceImpl implements StoreMenuService {
@Autowired
private StoreMenuDAO storeMenuDAO;

@Override
public void allstoremenu(HttpServletRequest request, HttpServletResponse response) {
	//1.파라미터 읽기​
	//2.필요한 처리 수행	​
	//3.DAO 메소드의 매개변수 생성	​
	//4.DAO 메소드를 호출
	List<StoreMenu> list = storeMenuDAO.allstoremenu();
	//5.결과를 가공	​
	//6.결과를 저장 - REST API Server의 경우는 request에 저장
	
	

	request.setAttribute("list", list);
	System.out.println(list);

	}

@Override
public void detailstoremenu(HttpServletRequest request, HttpServletResponse response) {
	//요청 주소의 마지막 부분을 가져오기
	//localhost/detailstoremenu/menucode
	String requestURI = request.getRequestURI();
	String [] ar = requestURI.split("/");
	String menucode = ar[ar.length-1];	
	
	System.out.println("serviceImpl.detailstoremenu menuname변수:" + menucode);
	//DAO의 메소드를 호출
	StoreMenu storeMenu = storeMenuDAO.detailstoremenu(menucode);
	//결과를 저장
	request.setAttribute("menucode", menucode);
	System.out.println(menucode);
}
	
}
	

