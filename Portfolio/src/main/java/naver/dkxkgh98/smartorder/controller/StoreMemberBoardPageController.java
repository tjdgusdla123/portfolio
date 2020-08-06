package naver.dkxkgh98.smartorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import naver.dkxkgh98.smartorder.domain.StoreMemberBoard;
import naver.dkxkgh98.smartorder.service.StoreMemberBoardService;

@Controller

public class StoreMemberBoardPageController {

	@Autowired
	private StoreMemberBoardService storeMemberBoardService;
	
	@RequestMapping(value ="board", method = RequestMethod.GET)
	public String board() {
		System.out.println("페이지controller도착-게시판"); 
		return "user/boardmain";
}	
	@RequestMapping(value ="boardwrite", method = RequestMethod.GET)
	public String boardwrite() {
		System.out.println("페이지controller도착-글쓰기"); 
		return "user/boardwrite";
}	
	
	@RequestMapping(value ="boardlist", method = RequestMethod.GET)
	public String boardlist() {
		System.out.println("페이지controller도착-글쓰기"); 
		return "user/boardlist";
}	

	//@RequestMapping(value ="boardwrite", method = RequestMethod.POST)
//	public String writePOST(MultipartHttpServletRequest request ,RedirectAttributes rttr) {
	//	storeMemberBoardService.memberBoard(request);
	//	rttr.addFlashAttribute("msg", "게시글 작성에 성공하셨습니다.");
	//	System.out.println("페이지controller도착-작성완료"); 
	//	return "redirect:/user/boardlist";

//}	

	
}
