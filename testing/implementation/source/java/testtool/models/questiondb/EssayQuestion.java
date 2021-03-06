package testtool.models.questiondb;
import java.util.ArrayList;

/**
 * Question type corresponding with an Essay question
 * A users answer will be compared with a list of ordered
 * keywords and a grade will be based on the correctness and
 * order of those words in the answer
 *
 * @author RJ Almada (rjalmada@calpoly.edu), Neil Nordhof (nnordhof@calpoly.edu)
 * @version 10jun14
 *
 */
public class EssayQuestion extends Question {
	/**
	 * The collection of keywords that the automatic grader
	 * should be looking for in order.
	 */
	public ArrayList<String> correctKWs;
	
	public EssayQuestion() {
		
	}
	
	/**
	 * The constructor will do data validation when creating a new Essay
	 * Question
	 * 
	 * @param qt - Question Text
	 * @param auth - Question Author
	 * @param course - Course
	 * @param topics - Topics
	 * @param time - Estimated Completion Time
	 * @param diff - Difficulty
	 * @param ckws - Correct Ordered Keywords
	 * @throws EmptyBoxException
	 */
	/*@
	 	requires
	 		(*
	 		 * all parameters to be passed in as non-empty
	 		 * 0 <= diff <= 4
	 		 * time >= 0
	 		 *);
	 	ensures
	 	 	(* a new question is made and that all fields are non-empty
	 		 *);	  
	 @*/
	public EssayQuestion(String qt, String auth, String course,
		ArrayList<String> topics, int time, int diff, ArrayList<String> ckws, int points) throws EmptyBoxException {
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
		
		if (ckws.isEmpty()) {
			throw new EmptyBoxException("Correct Keywords must be filled in.");
		} else {
			this.correctKWs = ckws;
		}
		this.type = "Essay";
		this.points = points;
	}
	
	

	public ArrayList<String> getCorrectKWs() {
		return correctKWs;
	}



	public void setCorrectKWs(ArrayList<String> correctKWs) {
		this.correctKWs = correctKWs;
	}



	@Override
	public String toString() {
		return super.toString() + ", correctKWs=" + correctKWs;
	}
	
	
}
