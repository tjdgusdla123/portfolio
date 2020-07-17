package naver.dkxkgh98.smartorder;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import naver.dkxkgh98.smartorder.service.StoreMemberService;
import naver.dkxkgh98.smartorder.service.StoreMenuService;


//웹 사이트의 페이지 이동에만 사용하는 컨트롤러
@Controller
public class StoreMemberPageController {
	@Autowired
	private StoreMemberService storeMemberService;
	@Autowired
	private StoreMenuService storeMenuService;
	@RequestMapping(value = {"/", "index.html"}, method = RequestMethod.GET)
    public String home(HttpServletRequest request, HttpServletResponse response) {
	   //서비스의 메소드를 호출
		System.out.println("컨트롤 홈 도착");
      	return "home";
}
	
	@RequestMapping(value ="user/join", method = RequestMethod.GET)
	public String join() {
		System.out.println("페이지controller도착-회원가입");
		return "user/join";
		
	}
	
	@RequestMapping(value ="user/login", method = RequestMethod.GET)
	public String login() {
		System.out.println("페이지controller도착-로그인");
		return "user/login";
		
	}
	@RequestMapping(value ="user/nonmember", method = RequestMethod.GET)
	public String nonmember() {
		System.out.println("페이지controller도착-비회원입장");
		return "user/nonmember";
		
	}
	@RequestMapping(value ="user/allstoremenu", method = RequestMethod.GET)
		public String allstoremenu(HttpServletRequest request, HttpServletResponse response) {
			//서비스의 메소드를 호출
		storeMenuService.allstoremenu(request,response);
			System.out.println("페이지controller도착-전체메뉴");
		return "user/allstoremenu";	
			
		}

	//Controller 클래스에 상세보기를 위한 메소드를 구현
@RequestMapping(value = {"user/detailstoremenu/{menucode}"}, method = RequestMethod.GET)
	public String detailstoremenu(HttpServletRequest request, HttpServletResponse response) {
		 //서비스의 메소드를 호출
	System.out.println("페이지controller도착-상세보기");
		storeMenuService.detailstoremenu(request, response);
		return "user/detailstoremenu";
}
}
