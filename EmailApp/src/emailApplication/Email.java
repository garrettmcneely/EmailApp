package emailApplication;

import java.util.Random;

public class Email {

	private String firstName, lastName, department, email, altEmail;
	private String password = "";

	String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

	private int mailboxCap;

	public Email(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;

	}

	// Getter and Setters for first & last name, and department
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return this.department;
	}

	// Random password generator method
	public void setRandomPassword() {
		Random rand = new Random();

		for (int x = 0; x < 8; x++) {
			int randomNum = rand.nextInt(characters.length()) + 1;

			this.password = this.password + characters.charAt(randomNum);
		}

	}

	// Change password method
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	// Creates company email
	public void createEmail() {
		this.email = (String.format("%1s.%2s@%3s.company.com", firstName, lastName, department)).toLowerCase();
	}

	// Getter for email address
	public String getEmail() {
		return email;
	}

	// Setter for alternate email address
	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}

	public String getAltEmail() {
		return this.altEmail;
	}

	// Getter and Setter for mailbox capacity
	public void setMailboxCap(int mailboxCap) {
		this.mailboxCap = mailboxCap;
	}

	public int getMailboxCap() {
		return mailboxCap;
	}

}
