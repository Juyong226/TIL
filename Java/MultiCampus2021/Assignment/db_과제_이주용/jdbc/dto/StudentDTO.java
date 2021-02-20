package jdbc.dto;

public class StudentDTO {
	
	private int No;
	private String name;
	private String det;
	private String addr;
	private String tel;
	
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentDTO(int no, String name, String det, String addr, String tel) {
		super();
		setNo(no);
		setName(name);
		setDet(det);
		setAddr(addr);
		setTel(tel);
	}
	
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		if(no > 0) {
			No = no;
		} else {
			System.out.println("학번을 입력하세요.");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null) {
			this.name = name;
		} else {
			System.out.println("학생 이름을 입력하세요.");
		}
	}
	public String getDet() {
		return det;
	}
	public void setDet(String det) {
		if(det != null) {
			this.det = det;
		} else {
			this.det = null;
		}
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		if(addr != null) {
			this.addr = addr;
		} else {
			this.addr = null;
		}
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		if(tel != null) {
			this.tel = tel;
		} else {
			this.tel = null;
		}
	}
}
