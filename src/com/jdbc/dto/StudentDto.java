package com.jdbc.dto;

import java.io.Serializable;

public class StudentDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public StudentDto() {
		System.out.println("StudentDTO Object is created...");
	}
	public Integer getSid() {
		return sid;
	}
	
	/**
	 * @param sid the sid to set
	 */
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the sage
	 */
	public Integer getSage() {
		return sage;
	}
	/**
	 * @param sage the sage to set
	 */
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	/**
	 * @return the saddress
	 */
	public String getSaddress() {
		return saddress;
	}
	/**
	 * @param saddress the saddress to set
	 */
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	private Integer sid;
	private String sname;
	private Integer sage;
	private String saddress;

	@Override
	public String toString() {
		return "StudentDto [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + "]";
	}
	
	
}
