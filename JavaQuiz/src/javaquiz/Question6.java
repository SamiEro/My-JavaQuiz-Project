package javaquiz;

public class Question6 {
	
	private String language;
	
	public Question6(String language) {
		this.language = language;
	}
	
	public String greet() {
		String retval;
		
		if (this.language == "Nashville") {
			retval = "Correct!";
		} else {
			retval = "Wrong answer!";
		}
		return retval;
	}
}