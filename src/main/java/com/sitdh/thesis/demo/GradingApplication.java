package com.sitdh.thesis.demo;

import com.sitdh.thesis.demo.calculator.ScoreCalculator;
import com.sitdh.thesis.demo.student.UndergradStudent;

public class GradingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id 	= "580000000021";
		String name = "John Doe";

		UndergradStudent student = new UndergradStudent(id, name);
		student.setCalculator(new ScoreCalculator(id));
		student.addScore(14, 1);
		student.addScore(12, 2);
		student.addScore(14, 2);
		
		student.getSumScore();
		
		String gradeLetter = student.getGradeLetter();
		
		System.out.println(student + ", Grade Letter: " + gradeLetter);
	}

}
