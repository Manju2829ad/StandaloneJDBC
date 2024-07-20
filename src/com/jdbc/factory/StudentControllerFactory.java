package com.jdbc.factory;

import com.jdbc.controller.IStudentController;
import com.jdbc.controller.StudentControllerImpl;


public class StudentControllerFactory {

		private static IStudentController controller = null;

		public static IStudentController getStudentControllerObj() {
			if (controller == null) {
				controller = new StudentControllerImpl();
			}
			return controller;
		}

	}

