package com.javaex.vo;

public class MemberVo {

	// 필드
	private int no;
	private String id;
	private String password;
	private String name;
	private String address;
	private String gender;
	private String hp;
	private int age;
	private int lockerNo;
	private int period;
	private String approval;
	private String ldate;
	private int pttotal;
	private int ptcount;
	private String comment;
	

	// 생성자
	public MemberVo() {

	}
	
	

	public MemberVo(int no, String id, String password, String name, String address, String gender, String hp,
			int age) {
		
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.hp = hp;
		this.age = age;
	}



	public MemberVo(int no, String id, String password, String name, String address, String gender, String hp, int age,
			int lockerNo, int period, String approval) {

		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.hp = hp;
		this.age = age;
		this.lockerNo = lockerNo;
		this.period = period;
		this.approval = approval;
	}



	public MemberVo(int no, String id, String password, String name, String address, String gender, String hp, int age,
			int lockerNo, int period, String approval, String ldate, int pttotal, int ptcount, String comment) {
		
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.hp = hp;
		this.age = age;
		this.lockerNo = lockerNo;
		this.period = period;
		this.approval = approval;
		this.ldate = ldate;
		this.pttotal = pttotal;
		this.ptcount = ptcount;
		this.comment = comment;
	}



	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
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



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getLockerNo() {
		return lockerNo;
	}



	public void setLockerNo(int lockerNo) {
		this.lockerNo = lockerNo;
	}



	public int getPeriod() {
		return period;
	}



	public void setPeriod(int period) {
		this.period = period;
	}



	public String getApproval() {
		return approval;
	}



	public void setApproval(String approval) {
		this.approval = approval;
	}



	public String getLdate() {
		return ldate;
	}



	public void setLdate(String ldate) {
		this.ldate = ldate;
	}



	public int getPttotal() {
		return pttotal;
	}



	public void setPttotal(int pttotal) {
		this.pttotal = pttotal;
	}



	public int getPtcount() {
		return ptcount;
	}



	public void setPtcount(int ptcount) {
		this.ptcount = ptcount;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}


	//toString
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", id=" + id + ", password=" + password + ", name=" + name + ", address="
				+ address + ", gender=" + gender + ", hp=" + hp + ", age=" + age + ", lockerNo=" + lockerNo
				+ ", period=" + period + ", approval=" + approval + ", ldate=" + ldate + ", pttotal=" + pttotal
				+ ", ptcount=" + ptcount + ", comment=" + comment + "]";
	}
	
	
	

}