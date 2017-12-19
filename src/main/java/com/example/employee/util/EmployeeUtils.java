package com.example.employee.util;

import java.util.Random;

public class EmployeeUtils {
	
	
	public static int getRandomNumber(){
		int max = 1000000;
		Random random = new Random();
		
		return random.nextInt(max);
	}

}
