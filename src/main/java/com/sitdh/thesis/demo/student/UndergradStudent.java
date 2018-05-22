 package com.sitdh.thesis.demo.student;

import com.sitdh.thesis.demo.calculator.ScoreCalculator;

public class UndergradStudent {
	
	private String studentId;
	
	private String name;
	
	private double sumScore = 0f;
	
	private ScoreCalculator calculator;

	public UndergradStudent(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	public void addScore(double score, double weight) {
		this.sumScore += score * weight;
	}
	
	public double getSumScore() {
		return calculator.score(sumScore);
	}

	public String toString() {
		return String.format("%s %s with score %s", studentId, name, sumScore);
	}

	public ScoreCalculator getCalculator() {
		return calculator;
	}

	public void setCalculator(ScoreCalculator calculator) {
		this.calculator = calculator;
	}

	public String getGradeLetter() {
		double score = this.getSumScore();
		
		return this.calculator.getGradeLetter(score);
	}
}
