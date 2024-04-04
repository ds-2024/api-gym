package com.javaex.vo;

public class LessonVo {
	
	private int lno;
	private int ptno;
	private String ldate;
	private String comment;
	
	//생성자
	public LessonVo() {
		
	}
	public LessonVo(int lno, int ptno, String ldate, String comment) {
		super();
		this.lno = lno;
		this.ptno = ptno;
		this.ldate = ldate;
		this.comment = comment;
	}
	
	//gs
	public int getLno() {
		return lno;
	}
	public void setLno(int lno) {
		this.lno = lno;
	}
	public int getPtno() {
		return ptno;
	}
	public void setPtno(int ptno) {
		this.ptno = ptno;
	}
	public String getLdate() {
		return ldate;
	}
	public void setLdate(String ldate) {
		this.ldate = ldate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	//String
	@Override
	public String toString() {
		return "LessonVo [lno=" + lno + ", ptno=" + ptno + ", ldate=" + ldate + ", comment=" + comment + "]";
	}
	
	
	

}
