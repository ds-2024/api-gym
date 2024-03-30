package com.javaex.vo;

public class MemberVo {

	//필드
	private int no;
	private int trainerNo;
	private String id;
	private String password;
	private String name;
	private String address;
	private String gender;
	private String hp;
	private String age;
	private String registerDate;
	private int remainDate;
	private int ptCount;
	
	//생성자
	public MemberVo() {
		
	}

	public MemberVo(int no, int trainerNo, String id, String password, String name, String address, String gender,
			String hp, String age, String registerDate, int remainDate, int ptCount) {
		
		this.no = no;
		this.trainerNo = trainerNo;
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.hp = hp;
		this.age = age;
		this.registerDate = registerDate;
		this.remainDate = remainDate;
		this.ptCount = ptCount;
	}
	
	//getter setter

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getTrainerNo() {
		return trainerNo;
	}

	public void setTrainerNo(int trainerNo) {
		this.trainerNo = trainerNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public int getRemainDate() {
		return remainDate;
	}

	public void setRemainDate(int remainDate) {
		this.remainDate = remainDate;
	}

	public int getPtCount() {
		return ptCount;
	}

	public void setPtCount(int ptCount) {
		this.ptCount = ptCount;
	}

	//toString
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", trainerNo=" + trainerNo + ", id=" + id + ", password=" + password + ", name="
				+ name + ", address=" + address + ", gender=" + gender + ", hp=" + hp + ", age=" + age
				+ ", registerDate=" + registerDate + ", remainDate=" + remainDate + ", ptCount=" + ptCount + "]";
	}
	
	
	
	
	
}