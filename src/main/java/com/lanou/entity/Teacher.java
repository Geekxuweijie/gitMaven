package com.lanou.entity;

public class Teacher {
	private int tId;
	private String tName;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int tId, String tName) {
		super();
		this.tId = tId;
		this.tName = tName;
	}
	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tName=" + tName + "]";
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	} 
	
	

}
