package naver.dkxkgh98.smartorder.domain;

import java.util.Date;

import lombok.Data;
@Data
public class StoreMember {
	private String membernickname;// 회원별명	              
	private String memberemail ;//회원이메일
	private String memberpassword ; //회원비밀번호
	private String memberphonenumber ; //회원전화번호
	private String memberislogin;  //회원로그인여부
	private Date memberlastlogindate;  //회원마지막로그인날짜
	private String memberisremove ; //회원탈퇴여부
	public String getMembernickname() {
		return membernickname;
	}
	public void setMembernickname(String membernickname) {
		this.membernickname = membernickname;
	}
	public String getMemberemail() {
		return memberemail;
	}
	public void setMemberemail(String memberemail) {
		this.memberemail = memberemail;
	}
	public String getMemberpassword() {
		return memberpassword;
	}
	public void setMemberpassword(String memberpassword) {
		this.memberpassword = memberpassword;
	}
	public String getMemberphonenumber() {
		return memberphonenumber;
	}
	public void setMemberphonenumber(String memberphonenumber) {
		this.memberphonenumber = memberphonenumber;
	}
	public String getMemberislogin() {
		return memberislogin;
	}
	public void setMemberislogin(String memberislogin) {
		this.memberislogin = memberislogin;
	}
	public Date getMemberlastlogindate() {
		return memberlastlogindate;
	}
	public void setMemberlastlogindate(Date memberlastlogindate) {
		this.memberlastlogindate = memberlastlogindate;
	}
	public String getMemberisremove() {
		return memberisremove;
	}
	public void setMemberisremove(String memberisremove) {
		this.memberisremove = memberisremove;
	}
	@Override
	public String toString() {
		return "StoreMember [membernickname=" + membernickname + ", memberemail=" + memberemail + ", memberpassword="
				+ memberpassword + ", memberphonenumber=" + memberphonenumber + ", memberislogin=" + memberislogin
				+ ", memberlastlogindate=" + memberlastlogindate + ", memberisremove=" + memberisremove + "]";
	}
	
	
	
}
