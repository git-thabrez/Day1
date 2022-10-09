package Railway;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Railway obj = new Railway();
		//obj.SignIn();
		obj.BookTicket();
		obj.View();
		obj.Delete();
		obj.View();
	}

}
class Login{
	Scanner scan= new Scanner(System.in);
	String uname;
	String upass;
	String umail;
	public void SignIn() {
		boolean flag =true;
		while(flag) {
			System.out.println("Enter Your UserName :");
		    uname = scan.next();
			System.out.println("Enter Your Email :");
			umail= scan.next();
			System.out.println("Enter Your Password :");
			upass = scan.next();
			if(upass.length()<7) {
				System.out.println("Password is too short... Try Again");
				break;
			}
			else {
				System.out.println("Logged in Successfully...");
				flag=false;
			}
		}
	}
	
}
class Railway extends Login{
	static String name1[]=new String[2];
	static int age1[] = new int[2];
	static char gen1[] = new char[2];
	static char ber1[] = new char[2];
	Scanner scan = new Scanner(System.in);
	
	public void BookTicket() {
		System.out.println("Enter the Number of Tickets to book :");
		int n = scan.nextInt();
		int k=0;
		for(int i=0;i<n;i++) {
		System.out.println("Enter the Name :");
	    name1[k] = scan.next();
		System.out.println("Enter Your Age :");
		age1[k] = scan.nextInt();
		System.out.println("Enter Your Gender :");
		gen1[k] = scan.next().charAt(0);
		System.out.println("Enter Your Birth Preference :");
		ber1[k] = scan.next().charAt(0);
		k++;
		}
		System.out.println("Tickets Booked Successfully...");
		
	}
	public void View() {
		System.out.println("Name"+"\t\t"+"Age"+"\t\t"+"Gender"+"\t\t"+"Berth");
		for(int i=0;i<age1.length;i++) {
			System.out.println(name1[i]+"\t\t"+age1[i]+"\t\t"+gen1[i]+"\t\t"+ber1[i]);
			System.out.println();
		}
	}
	public void Delete() {
		System.out.println("Enter Your Name To Delete Your Ticket :");
		String cname = scan.next();
		for(int i=0;i<age1.length;i++) {
			if(cname.equals(name1[i]))
			{
				name1[i]=null;
				age1[i]=0;
				gen1[i]='\0';
				ber1[i]='\0';
			}
		}
	}
	public void Work() {
		System.out.println("");
	}
}
