package naver.dkxkgh98.smartorder.domain;



import java.util.Date;
//domain 패키지에 테이블의 데이터를 표현하는 Item 클래스 생성 – 
//lombok이 제대로 설치가 안되서 getter 와 setter가 자동으로 만들어지지 않으면 
//getter 와 setter 그리고 toString을 직접 작성


import lombok.Data;
@Data
public class StoreMemberBoard {
	//회원게시판 테이블
	private Integer boardBno;  //글번
	private String  boardTitle; //글제목 
	private String  boardContent;//글내용
	private Date    boardRegdate; //작성일 
	private Date    boardUpdatedate;//수정일 
	private Integer boardReadcnt;//조회수 
	private String  boardIp;//작성한 곳의 아이피 
	private String  boardFile;//첨부파일  
	private String  memberNickname;//맴버 닉네임 
	private String  boardDispdate;


}
