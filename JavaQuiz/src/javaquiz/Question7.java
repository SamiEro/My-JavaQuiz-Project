package javaquiz;

public class Question7 {

	private String language;
	
	public Question7(String language) {
		this.language = language;
	}
	
	public String greet() {
		String retval;
		
		if (this.language == "A sword") {
			retval = "Correct!";
		} else {
			retval = "Wrong answer!";
		}
		return retval;
	}
}