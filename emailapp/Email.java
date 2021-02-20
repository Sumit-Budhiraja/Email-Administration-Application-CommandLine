package emailapp;
import java.util.*;
public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity=500;
	private String alternateEmail;
	private int defaultPassLength=10;
	private String companySuffix="chitkara.edu.in";
	//Constructor to receive the first name and last name
	public Email(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email Creation for: "+firstName);
	
	//call a method asking for dept.
	this.department=setDepartment();
	//System.out.println("Departement "+department);
	//calls a method that returns random password
	this.password=randomPass(defaultPassLength);
	System.out.println("The Password for "+firstName+" is "+this.password);
	//Combine elements to generate Email
	email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
	//System.out.println("Email"+email);
	}
	//Ask for department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nENTER THE DEPARTMENT CODE: ");
		Scanner sc=new Scanner(System.in);
		int depchoice=sc.nextInt();
		if(depchoice==1) {return "sales";}
		else if(depchoice==2) {return "dev";}
		else if(depchoice==3) {return "acct";}
		else {return "";}
		
	}
	//generate a random password
	private String randomPass(int len) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
		char[] password=new char[len];
		for(int i=0;i<len;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	//set the mailbox capacity
	public void setMailboxcapacity(int capacity) {
		this.mailBoxCapacity=capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	//change the password
	public void changePassword(String password) {
		this.password=password;
	}
	public int getMailboxCapacity(){return mailBoxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: "+firstName+" "+lastName+"\n"+
				"COMPANY EMAIL: "+email+"\n"+
				"MAILBOX CAPACITY: "+mailBoxCapacity+"mb";
				
	}
}
