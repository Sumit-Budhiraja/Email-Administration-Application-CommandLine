package emailapp;
import java.util.*;
public class Eamilapp {

	public static void main(String[] args) {
		Email em1;
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE FIRST NAME: ");
		String firstName=sc.next();
		System.out.print("ENTER THE LAST NAME: ");
		String lastName=sc.next();
		em1=new Email(firstName,lastName);
		System.out.println();
		System.out.print(em1.showInfo());
		System.out.println();
		System.out.println();
		System.out.println("IF YOU WISH TO ACCESS SPECIAL CONTROLS ENTER PASSWORD ELSE PRESS N : ");
		
		String p=sc.next();
		if(p.compareTo("123456")==0) {
			System.out.println();
			System.out.print("PRESS 1 for Changing MailBox Capacity \nPRESS 2 for Adding Alternate Email \nPRESS 3 for Changing the Password\nPRESS -1 to EXIT Special Controls\n");
			int choice=sc.nextInt();
			while(choice!=-1) {
			if(choice==1) {
				System.out.print("Enter New Mail Box Capacity: ");
				int c=sc.nextInt();
				em1.setMailboxcapacity(c);
				System.out.print("Mail Box Capacity Updated\n NEXT CHOICE: ");
			}
			else if(choice==2) {
				System.out.print("Enter the Alternate Email: ");
				String s=sc.next();
				em1.setAlternateEmail(s);
				System.out.println("Alternate Email Added Successfully\n NEXT CHOICE: ");
			}
			else if(choice==3) {
				System.out.print("Enter the new Password: ");
				String s=sc.next();
				em1.changePassword(s);
				System.out.println("Password Changed successfullya"
						+ "\n NEXT CHOICE: ");
			}
			else {
				System.out.println("Invalid Choice");
				break;
			}
			choice=sc.nextInt();
		   }
			System.out.println();
			System.out.println(em1.showInfo());
			System.out.println(em1.getMailboxCapacity());
			System.out.println(em1.getAlternateEmail());
			System.out.println(em1.getPassword());
		}
		else {
			System.out.println();
			System.out.println(".........Displaying the DETAILS.......");
			System.out.print(em1.showInfo());
		}
		
		
	}

}
