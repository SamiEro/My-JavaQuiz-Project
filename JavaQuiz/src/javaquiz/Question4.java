package javaquiz;

public class Question4 {

	private String language;
	
	public Question4(String language) {
		this.language = language;
	}
	
	public String greet() {
		String retval;
		
		if (this.language == "Germany") {
			retval = "Correct!";
		} else {
			retval = "Wrong answer!";
		}
		return retval;
	}
}