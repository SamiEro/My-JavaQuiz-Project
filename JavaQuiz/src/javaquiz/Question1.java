package javaquiz;

public class Question1 {

		private String language;
		
		public Question1(String language) {
			this.language = language;
		}
		
		public String greet() {
			String retval;
			
			if (this.language == "Helsinki") {
				retval = "Correct!";
			} else {
				retval = "Wrong answer!";
			}
			return retval;
		}
	}