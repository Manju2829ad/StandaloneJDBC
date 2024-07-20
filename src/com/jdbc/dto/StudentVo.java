package com.jdbc.dto;

public class StudentVo {

	private String sid;
	private String sname;
	private String sage;
	private String saddress;
	
	
	public StudentVo() {
		
		System.out.println("Student VO object is created");
	}
	
	
	
		@Override
	public String toString() {
		return "StudentVo [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + "]";
	}
		/**
	 * @return the sid
	 */
	public String getSid() {
		return sid;
	}
	/**
	 * @param sid the sid to set
	 */
	public void setSid(String sid) {
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
	public String getSage() {
		return sage;
	}
	/**
	 * @param sage the sage to set
	 */
	public void setSage(String sage) {
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

	
	
	
	
	
	
	
}
