package javaquiz;

public class Question10 {

	private String language;
	
	public Question10(String language) {
		this.language = language;
	}
	
	public String greet() {
		String retval;
		
		if (this.language == "Yes") {
			retval = "Correct!";
		} else {
			retval = "Wrong answer!";
		}
		return retval;
	}
}