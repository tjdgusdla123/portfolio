package naver.dkxkgh98.smartorder.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import naver.dkxkgh98.smartorder.domain.StoreMenu;
import naver.dkxkgh98.smartorder.service.StoreMemberService;
import naver.dkxkgh98.smartorder.service.StoreMenuService;

@RestController
public class StoreMemberRestController {

	@Autowired
	private StoreMemberService storeMemberService;
	@Autowired
	private StoreMenuService storeMenuService;
	//회원가입을 처리하는 메소드
	@RequestMapping(value="user/join",method=RequestMethod.POST)
	public Map<String,Object> join(HttpServletRequest request, HttpServletResponse response){
		//서비스의 메소드를 호출
		Map<String,Object> map = storeMemberService.join(request, response);
		
		return map;
		
	}
	@RequestMapping(value="user/login", method=RequestMethod.POST)
	public Map<String, Object> login(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result =  storeMemberService.login(request, response);
		return result;
	}
}