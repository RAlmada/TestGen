package testtool.models.questiondb;
import java.util.ArrayList;

/**
 * Question type corresponding with a short answer question
 * The student's answer will be compared with a list of
 * correct keywords, the order of the keywords does not
 * matter for this question.
 *
 * @author RJ Almada (rjalmada@calpoly.edu), Neil Nordhof (nnordhof@calpoly.edu)
 * @version 10jun14
 *
 */
public class SAQuestion extends Question {
	/**
	 * The collection of keywords that the automatic
	 * grader should be looking for, in any order.
	 */
	public ArrayList<String> correctKWs;
	
	/**
	 * The constructor will do data validation when creating a new Short Answer
	 * Question
	 * 
	 * @param qt - Question Text
	 * @param auth - Question Author
	 * @param course - Course
	 * @param topics - Topics
	 * @param time - Estimated Completion Time
	 * @param diff - Difficulty
	 * @param ckws - Correct Keywords (unordered)
	 * @param points - Number of points the question is worth
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
	public SAQuestion(String qt, String auth, String course,
		ArrayList<String> topics, int time, int diff, ArrayList<String> ckws, int points) throws EmptyBoxException {
		/*
		 * If question text is empty throw an error
		 * else set questionText to qt
		 */
		if (qt.equals("")) {
			throw new EmptyBoxException("Question Text must be filled in.");
		} else {
			this.questionText = qt;
		}
		
		/*
		 * Author is generated based on logged in user
		 * so will never be empty
		 */
		this.author = auth;
		
		/*
		 * right when a question is created or edited
		 * it will be reset to never been used before
		 */
		this.lastUsed = "Never";
		
		/*
		 * if course is empty or equal to the default text
		 * throw an error
		 * else set course to passed in course
		 */
		if (course.equals("") || course.equals("Course")) {
			throw new EmptyBoxException("Course must be filled in.");
		} else {
			this.course = course;
		}
		
		/*
		 * if topics has nothing in the arraylist has only the default text
		 * throw an error
		 * else set topics to passed in topics
		 */
		if (topics.isEmpty() || topics.equals("Topic")) {
			throw new EmptyBoxException("Topic must be filled in.");
		} else {
			this.topics = topics;
		}
		
		/*
		 * time error checking is done in the view
		 */
		this.time = time;
		
		/*
		 * difficulty is on a 1-5 scale that is dealt with by a combobox and the view
		 */
		this.difficulty = diff;
		
		/*
		 * if correct keywords is empty than throw an error
		 * else set correctKWs to ckws
		 */
		if (ckws.isEmpty()) {
			throw new EmptyBoxException("Correct Keywords must be filled in.");
		} else {
			this.correctKWs = ckws;
		}
		
		/*
		 * hard-coded
		 */
		this.type = "SA";
		/*
		 * points error checking is done in view
		 */
		this.points = points;
	}
	
	
	/**
	 * 
	 * @return list of correct keywords
	 */
	public ArrayList<String> getCorrectKWs() {
		return correctKWs;
	}


	/**
	 * set correct keywords to the passed in list
	 * @param correctKWs
	 */
	public void setCorrectKWs(ArrayList<String> correctKWs) {
		this.correctKWs = correctKWs;
	}



	@Override
	public String toString() {
		return super.toString() + ", correctKWs=" + correctKWs;
	}
	
	
}
