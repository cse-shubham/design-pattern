package builder;

public class Driver {

	public static void main(String[] args) {
		UserComplex.UserBuilder builder = new UserComplex.UserBuilder("shubham", "shubham", "999999999");

		// if in the api nickname is present
		builder.setNickName("shubham");
		// if in the api alternate number is present
		builder.setAlternateNumber("9999999999");

		UserComplex complex = builder.build();
		System.out.println(complex);
	}

}
