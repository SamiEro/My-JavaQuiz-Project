package javaquiz;

public class Question3 {

		private String language;
		
		public Question3(String language) {
			this.language = language;
		}
		
		public String greet() {
			String retval;
			
			if (this.language == "1960") {
				retval = "Correct!";
			} else {
				retval = "Wrong answer!";
			}
			return retval;
		}
	}