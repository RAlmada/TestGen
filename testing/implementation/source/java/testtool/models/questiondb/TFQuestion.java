package testtool.models.questiondb;

import java.util.ArrayList;

/**
 * Question type corresponding with a True/False question
 * the student will simply specify whether or not a statement was true
 *
 * @author RJ Almada (rjalmada@calpoly.edu), Neil Nordhof (nnordhof@calpoly.edu)
 * @version 10jun14
 *
 */
public class TFQuestion extends Question {
	/**
	 * The correct answer : Either True or False
	 */
	public boolean correctAnswer;
	
	/**
	 * The constructor will do data validation when creating a new True/False
	 * Question
	 * 
	 * @param qt - Question Text
	 * @param auth - Question Author
	 * @param course - Course
	 * @param topics - Topics
	 * @param time - Estimated Completion Time
	 * @param diff - Difficulty
	 * @param corAns - Correct Boolean Answer
	 * @throws EmptyBoxException
	 */
	/*@
	 	requires 
	 		(* all parameters to be passed in as non-empty
	 		 * 0 <= diff <= 4
	 		 * time >= 0
	 		 *); 
	 	ensures 
	 		(* a new question is made and that all fields are non-empty
	 		 *);	  
	 @*/
	public TFQuestion(String qt, String auth, String course,
		ArrayList<String> topics, int time, int diff, boolean corAns, int points) throws EmptyBoxException {
		if (qt.equals("")) {
			throw new EmptyBoxException("Question Text must be filled in.");
		} else {
			this.questionText = qt;
		}
		
		this.author = auth;
		this.lastUsed = "Never";
		
		if (course.equals("") || course.equals("Course")) {
			throw new EmptyBoxException("Course must be filled in.");
		} else {
			this.course = course;
		}
		
		if (topics.isEmpty() || topics.equals("Topic")) {
			throw new EmptyBoxException("Topic must be filled in.");
		} else {
			this.topics = topics;
		}
		
		this.time = time;
		this.difficulty = diff;
		
		this.correctAnswer = corAns;
		this.type = "TF";
		this.points = points;
	}

	
	
	public boolean isCorrectAnswer() {
		return correctAnswer;
	}



	public void setCorrectAnswer(boolean correctAnswer) {
		this.correctAnswer = correctAnswer;
	}



	@Override
	public String toString() {
		return super.toString() + ", correctAnswer=" + correctAnswer;
	}
	
	
}
