package com.javaex.vo;

public class PtVo {
	
	private int no;
	private int ptno;
	private int trainerno;
	private int ptcount;
	private int pttotal;
	private String trainername;
	
	//생성자
	public PtVo() {
		
	}

	public PtVo(int no, int ptno, int trainerno, int ptcount, int pttotal, String trainername) {
		
		this.no = no;
		this.ptno = ptno;
		this.trainerno = trainerno;
		this.ptcount = ptcount;
		this.pttotal = pttotal;
		this.trainername = trainername;
	}

	//gs
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getPtno() {
		return ptno;
	}

	public void setPtno(int ptno) {
		this.ptno = ptno;
	}

	public int getTrainerno() {
		return trainerno;
	}

	public void setTrainerno(int trainerno) {
		this.trainerno = trainerno;
	}

	public int getPtcount() {
		return ptcount;
	}

	public void setPtcount(int ptcount) {
		this.ptcount = ptcount;
	}

	public int getPttotal() {
		return pttotal;
	}

	public void setPttotal(int pttotal) {
		this.pttotal = pttotal;
	}

	public String getTrainername() {
		return trainername;
	}

	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}

	//String
	@Override
	public String toString() {
		return "PtVo [no=" + no + ", ptno=" + ptno + ", trainerno=" + trainerno + ", ptcount=" + ptcount + ", pttotal="
				+ pttotal + ", trainername=" + trainername + "]";
	}
	
	
	
	
	
}
