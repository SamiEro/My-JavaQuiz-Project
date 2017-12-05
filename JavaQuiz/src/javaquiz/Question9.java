package javaquiz;

public class Question9 {

	private String language;
	
	public Question9(String language) {
		this.language = language;
	}
	
	public String greet() {
		String retval;
		
		if (this.language == "63") {
			retval = "Correct!";
		} else {
			retval = "Wrong answer!";
		}
		return retval;
	}
}