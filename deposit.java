import java.util.*;
public class deposit {
	int balance;
	double generate;
	int otp;
	int enter;
	String p="no";
	String q="no";
	Scanner scan=new Scanner(System.in);
	void deposit(int money,int l,String mobile_number)
	{
	
		this.balance=money+l;
		System.out.println(" ");
		System.out.println("enter your mobile number:");
		do {
			//System.out.println("enter your mobile number:");
		String 	phone_num=scan.next();
			if(mobile_number.equals(phone_num))
			{
				do {
				generate=Math.random();
				otp=(int)(generate*100000);
				System.out.println("otp:"+otp);
				System.out.println("enter the otp:");
				enter=scan.nextInt();
				if(otp==enter)
				{
			  System.out.println(" ");
		     System.out.println("your money is deposited  successfully ");
		     p="no";
				}
				else
				{
					System.out.println(" ");
					System.out.println("invalid otp");
					System.out.println("enter yes if u want to generate new otp:");
					p=scan.next();
				//	System.out.println("enter your mobile number again correctly:");
				}
				}while(p.equals("yes"));
			}
			else
			{
				System.out.println("enter your mobile number again correctly:");
			    q="yes";
		    }
	}while(q.equals("yes"));
	}
     int balance()
     {
    	 return this.balance;
     }
}
