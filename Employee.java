package com.emailApp;

import java.util.Random;
import java.util.Scanner;

public class Employee {

	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String password;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String company = "InfoTech";
	Scanner sc = new Scanner(System.in);


	public Employee() {
		// First name as input
		this.firstName = firstname();
		// System.out.println(firstName);

		// Last name as input
		this.lastName = lastname();
		// System.out.println(lastName);

		// Department as input
		this.department = employee_department();
		// System.out.println(department);

		// Genereting email with given info
		this.email = employeeemail();
		System.out.println(email);
		// System.out.println();

		// Password as input
		this.password = emailPassword();
		// System.out.println(password);
		// Mailbox capacity as input


		// Alternate email as input
		this.alternateEmail = alternate_email();
		System.out.println();

		// seeing employee information
		viewEmployeeInfo();

		// change password functionality
		change_password();

		// Closing scanner class
		sc.close();
	}

	// Taking input for first name of employee
	private String firstname() {
		System.out.println("Enter  first name of employee : ");
		String first_name = sc.nextLine();
		return first_name;

	}

	// Taking input for last name of employee
	private String lastname() {
		System.out.println("Enter  last name of employee : ");
		String last_name = sc.nextLine();
		return last_name;

	}

	// Taking input ofr department
	private String employee_department()
	{
		System.out.println("1. Dev\n2. QA \n3. IT \n4. Others ");
		System.out.println("Enter the number of department : ");
		int department_id = sc.nextInt();
		sc.nextLine();

		String department_name = switch (department_id) {
		case 1 -> "DEV";
		case 2 -> "QA";
		case 3 -> "IT";
		case 4 -> "Others";
		default -> "None";
		};

		return department_name;

	}

	// Generating email
	private String employeeemail() {
		String employee_mail = this.firstName + "." + this.lastName + "." + this.department + "@" + this.company
				+ ".com";
		return employee_mail;
	}

	// Generating random password for email

	private String emailPassword() {
		int length = 10;
		String charactersOfPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!?$@";
		Random random = new Random();
		StringBuilder email_password = new StringBuilder();

		for (int i = 0; i < length; i++) {
			int rand = random.nextInt(charactersOfPassword.length());
			email_password.append(charactersOfPassword.charAt(rand));
		}

		return email_password.toString();
	}

	private String alternate_email() {
		System.out.println("Alternate email of employee : ");
		String alternateEmail = sc.nextLine();
		return alternateEmail;
	}

	private void viewEmployeeInfo() {
		System.out.println("Name of the Employee : " + this.firstName + " " + this.lastName);
		System.out.println("Email Id : " + this.email);
		System.out.println("Password : " + this.password);
		System.out.println("Alternate email of employee : " + this.alternateEmail);
		System.out.println("Mail box capacity : " + this.mailboxCapacity);

	}

	private void change_password() {
		while (true) {

			System.out.println("Press 1 to change email password or press 2 to keep the original one : ");
			int number = Integer.parseInt(sc.nextLine());
			if (number == 1) {
				System.out.println("Enter old password :");
				String old_password = sc.nextLine().trim();
				if (old_password.equals(this.password)) {
					System.out.println("Enter new password : ");
					String new_password = sc.nextLine().trim();
					this.password = new_password;
					System.out.println("Password changed successfully!");
					System.out.println();
					viewEmployeeInfo();
					break;
				} else {
					System.out.println("You entered wrong password");
				}
			}
			else if (number == 2) {
				System.out.println("Your password is not changed.");
				break;
			} else {
				System.out.println("Invalid option! Please enter 1 or 2.");
			}

		}

	}





}
