import java.util.*;
public class withdraw {
	    int newbalance;
	    int count=0;
	    Double generate;
	    int otp;
	    int enter;
	    String phone_num;
	    String p="no";
	    String q="no";
	    Scanner scan=new Scanner(System.in);
		void withdraw(int money,int balance,String mobile_number)
		{
			//int count=0;
			this.newbalance=balance;
			if(money>balance)
			{
				System.out.println("your account balance is less ");
				System.out.println("reduce your withdrawl amount and try again");
				this.count++;
			}
			if(balance==0&&money>balance)
			{
				System.out.println("your account balace is 0 u cannot withdraw money ");
				this.count++;
			}
			if(money<=balance&&money>15000)
			{
				System.out.println(" Atm cash limit exceeds reduce your withdrawl amount and try again");
				this.count++;
			}
			if(money<=balance&&money<=15000)
			{
				this.newbalance=balance-money;
				System.out.println("enter your mobile number for transaction :");
				do {
					//System.out.println("enter your mobile number:");
					phone_num=scan.next();
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
				System.out.println("your withdrawl is successful ");
				 p="no";
						}
						else
						{
							System.out.println(" invalid otp");
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
				//System.out.println("account balance:"+this.newbalance);
				this.count=0;
			}while(q.equals("yes"));
				if(money<500)
				{
					System.out.println("denomination" +money/100+"hunderds");
				}
				else 
				{
					int h=5;
			        int f=(money-500)/500;
			     
			        money += ((money-500)%500)/100;
			        if(money>5)
			        {
			          f=f+1;
			          h=h-5;
			        }
			        System.out.println("denomination :"+f+" Five Hundreds and "+h+" Hundreds");
				}
			}
				//System.out.println("account balance:"+this.newbalance);
		}
		  int  newbalance()
		  {
			  return this.newbalance;
		  }
		  int count_number()
		  {
			  return this.count;
		  }
}
