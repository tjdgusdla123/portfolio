package naver.rlgns1129.smartorder.util;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Component
//설정된 패키지에서 예외가 발생하면 동작하도록 해주는 설정
@ControllerAdvice("naver.rlgns1129.smartorder")
public class CommonErrorAdvice {
	//예외처리 메소드
	//Exception이 동작하면 호출되는 메소드
	@ExceptionHandler(Exception.class)
	//Controller 처리 방법과 유사
	public ModelAndView errorHandling(Exception ex) {
		ModelAndView mav = new ModelAndView();
		//에러페이지 이름을 설정 - ViewResolver를 적용
		mav.setViewName("/error/error");
		//전달할 데이터 설정
		mav.addObject("exception", ex);
		return mav;
	}
}






