package chapter8.exercise7;

import java.util.ArrayList;

/**
 * 
 * @author Andrew Behncke
 *
 * Student class as described in P8.7
 *
 */
public class Student {
	private String name;
	private ArrayList<Integer> scores;
	
	public Student(String name) {
		this.name = name;
		scores = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addQuiz(int score) {
		scores.add(score);
	}
	
	public int getTotalScore() {
		int score = 0;
		for (int i : scores) {
			score += i;
		}
		return score;
	}
	
	public double getAverageScore() {
		return (double) getTotalScore() / (double) scores.size();
	}
	
}
