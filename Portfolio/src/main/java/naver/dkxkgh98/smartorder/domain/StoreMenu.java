package naver.dkxkgh98.smartorder.domain;
public class StoreMenu {
    private String menucode;   // 메뉴코드
    private String menuname ;    // 메뉴명
    private String menuinfo ;   // 메뉴설명
    private Integer menuprice;    // 메뉴가격
    private String menuphoto;   // 메뉴사진
    private String menusection; // 메뉴구분
    private String storenickname; // 가게닉네임
	
    public String getMenucode() {
		return menucode;
	}
	public void setMenucode(String menucode) {
		this.menucode = menucode;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public String getMenuinfo() {
		return menuinfo;
	}
	public void setMenuinfo(String menuinfo) {
		this.menuinfo = menuinfo;
	}
	public Integer getMenuprice() {
		return menuprice;
	}
	public void setMenuprice(Integer menuprice) {
		this.menuprice = menuprice;
	}
	public String getMenuphoto() {
		return menuphoto;
	}
	public void setMenuphoto(String menuphoto) {
		this.menuphoto = menuphoto;
	}
	public String getMenusection() {
		return menusection;
	}
	public void setMenusection(String menusection) {
		this.menusection = menusection;
	}
	public String getStorenickname() {
		return storenickname;
	}
	public void setStorenickname(String storenickname) {
		this.storenickname = storenickname;
	}
	@Override
	public String toString() {
		return "StoreMenu [menucode=" + menucode + ", menuname=" + menuname + ", menuinfo=" + menuinfo + ", menuprice="
				+ menuprice + ", menuphoto=" + menuphoto + ", menusection=" + menusection + ", storenickname="
				+ storenickname + "]";
	}
    
    
}
