package javaquiz;

public class Question2 {

		private String language;
		
		public Question2(String language) {
			this.language = language;
		}
		
		public String greet() {
			String retval;
			
			if (this.language == "cat") {
				retval = "Correct!";
			} else {
				retval = "Wrong answer!";
			}
			return retval;
		}
	}