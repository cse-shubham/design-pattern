package builder;

public class UserComplex {
	// required fields
	private final String username;
	private final String password;
	private final String contactNumber;

	// default info
	private final String alternateNumber;
	private final String nickName;

	private UserComplex(UserBuilder builder) {
		this.username = builder.username;
		this.password = builder.password;
		this.contactNumber = builder.contactNumber;
		this.alternateNumber = builder.alternateNumber;
		this.nickName = builder.nickName;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getAlternateNumber() {
		return alternateNumber;
	}

	public String getNickName() {
		return nickName;
	}

	@Override
	public String toString() {
		return "UserComplex [username=" + username + ", password=" + password + ", contactNumber=" + contactNumber
				+ ", alternateNumber=" + alternateNumber + ", nickName=" + nickName + "]";
	}

	public static class UserBuilder {
		// required fields
		private final String username;
		private final String password;
		private final String contactNumber;
		private String alternateNumber;
		private String nickName;

		public UserBuilder(String username, String password, String contactNumber) {
			super();
			this.username = username;
			this.password = password;
			this.contactNumber = contactNumber;
		}

		public UserBuilder setAlternateNumber(String alternateNumber) {
			this.alternateNumber = alternateNumber;
			return this;
		}

		public UserBuilder setNickName(String nickName) {
			this.nickName = nickName;
			return this;
		}

		public UserComplex build() {
			UserComplex user = new UserComplex(this);
			return user;
		}

	}

}
