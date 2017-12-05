package javaquiz;

public class Question5 {
	
	private String language;
	
	public Question5(String language) {
		this.language = language;
	}
	
	public String greet() {
		String retval;
		
		if (this.language == "Margaret Mitchell") {
			retval = "Correct!";
		} else {
			retval = "Wrong answer!";
		}
		return retval;
	}
}