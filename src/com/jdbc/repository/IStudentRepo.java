package com.jdbc.repository;

import com.jdbc.dto.StudentBo;

public interface IStudentRepo {
	public String insertRecord(StudentBo stdBo);
	public StudentBo readRecord(Integer sid);
	public String deleteRecord(Integer sid);
	public String updateRecord(StudentBo stdBo);

}
