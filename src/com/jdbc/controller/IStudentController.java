package com.jdbc.controller;

import com.jdbc.dto.StudentVo;

public interface IStudentController {
		public String insertRecord(StudentVo student);
		public StudentVo readRecord(String sid);
		public String deleteRecord(String sid);
		public String updateRecord(StudentVo student);
	}


