package javaquiz;

public class Question8 {

	private String language;
	
	public Question8(String language) {
		this.language = language;
	}
	
	public String greet() {
		String retval;
		
		if (this.language == "James Cameron") {
			retval = "Correct!";
		} else {
			retval = "Wrong answer!";
		}
		return retval;
	}
}