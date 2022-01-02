import java.io.*;



public class TestSerialization implements Serializable {
		private String name;
		private Integer yearOfBirth;

		public void setName(String name) {
			this.name = name;
		}

		public void setyearOfBirth(Integer yearOfBirth) {
			this.yearOfBirth = yearOfBirth; 
		}

		public String getName() {
			return name;

		}

		public  Integer getYearOfBirth() {
			return yearOfBirth;
		}
}

