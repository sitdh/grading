package com.sitdh.thesis.demo.calculator;

import com.sitdh.thesis.demo.extrascore.ExtraScore;

public class ScoreCalculator {
	
	private String studentId;
	
	public ExtraScore extraScore;

	public ScoreCalculator(String studentId) {
		this.studentId = studentId;
	}

	public double score(double score) {
		
		double totalScore = score;
		
		extraScore = (null == extraScore) ? new ExtraScore() : extraScore ;
		
		if (totalScore < 20) {
			totalScore += extraScore.getExtraScore(studentId) * 3;
		} else if (totalScore < 30) {
			totalScore += extraScore.getExtraScore(studentId) * 2;
		} else if (totalScore < 50) {
			totalScore += extraScore.getExtraScore(studentId) * 0.5;
		}
		
		return totalScore;
	}

	public String getGradeLetter(double score) {
		String gradeLetter = "F";
		if (score >= 80) {
			gradeLetter = "A";
		} else if (score >= 70) {
			gradeLetter = "B";
		} else if (score >= 60) {
			gradeLetter = "C";
		} else if (score >= 50) {
			gradeLetter = "D";
		}
		
		return gradeLetter;
	}
}
