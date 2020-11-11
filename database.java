import java.util.*;

public class database {

	public static void main(String[] args) {
		//use the information in database to check the code 
		String yn="no";
		String str="no";
		String str1="no";
		String str2="no";
		String str3="no";
		int flag=0;
		ArrayList<Integer>money_deposited=new ArrayList<Integer>();
		ArrayList<Integer>money_withdrawn=new ArrayList<Integer>();
		int g=0;
		do {
		System.out.println(" ");
	    System.out.println("welcome to our atm local bank");
		System.out.println("enter your account number:");
		Scanner scan=new Scanner(System.in);
		int account_number=scan.nextInt();
		int account_password,ch,account_balance;
		String mobile_number;
		String accountant_name;
		int var,var1,var2,r=0;
		int []a=new int[100];
		int q=0;
		DBconnection db=new DBconnection();
		db.accountdetails();
		db.classConnection();
		int k=db.number( account_number);
		if(k==1)
		{
			do {
			System.out.println(" ");
			System.out.println("enter your password:");
			account_password=scan.nextInt();
			accountant_name=db.accountant_name();
	
			int l=db.password(account_password);
			if(l==1)
			{
				System.out.println("password is correct");
				deposit b=new deposit();
				withdraw c=new withdraw();
				account_balance=db.account_balance();
				 var=account_balance;
				mobile_number=db.mobile_number();
				 do {
		     	      System.out.println("");
				      System.out.println("enter 1 : if u want to deposit money in your account");
				      System.out.println("enter 2: if u want to withdraw money from your account");
				      System.out.println("enter 3:if u want to see your account details ");
				      System.out.println("enter 4:if u want to exit ");
				   
				      System.out.println(" ");
				      System.out.println("choice:");
				       ch=scan.nextInt();
				      switch(ch)
				      {
				      case 1:
				    	  System.out.println("");
				    	  System.out.println("enter amount of money u want to deposit:");
				    	  int money=scan.nextInt();
				     	    b.deposit(money,var,mobile_number);
				     	   var1=b.balance();//stores the updated balance 
				     //var is a variable that stores initial balance 
				     	  a[q]=var;
				    	  var=var1;
				    	  var1=a[q];
				    	  q++;
				    	
				    	  money_deposited.add(money);
			    	     break;
				      case 2:
				    	  do {
				    	  System.out.println(" ");
				    	  System.out.println("enter amount of money u want to withdraw:");
				    	  int money1=scan.nextInt();
				    	  c.withdraw(money1,var,mobile_number);
				    	  var2=c.newbalance();
				    	  a[q]=var;
				    	  var=var2;
				    	  var2=a[q];
				    	  q++;
				    	  r=c.count_number();
				    	  if(r==0)
				    	  {
				    		  money_withdrawn.add(money1);
				    	  }
				    	  }while(r>0);
				    	  break;
				      case 3:
				    	  do {
				    	  display d=new display();
				    	  System.out.println("enter your secret code to view your account details");
				    	  int secret_code=scan.nextInt();
				    	 int sc=db.secret_code();
				    	 if(secret_code==sc)
				    	 {
				    	  d.display(accountant_name,account_number,account_password,var,mobile_number);
				    	   System.out.println(" ");
				    	 System.out.println("enter yes if u want to see your transaction details:");
				    	   str2=scan.next();
				    	   if(str2.equals("yes"))
				    	   {
				    	   int i=1;
				    	   System.out.println(" ");
				   		System.out.println("list of amounts of money deposited successively:");
				   		
				   		for(Integer name:money_deposited)
				    	   {
				   			System.out.println(i+"."+name);
				   			i++;
				    		  flag=1;
				    	    }
				   		if(i==1)
				   		{
				   			System.out.println(0);
				   		}
				   		int j=1;
				   	   System.out.println(" ");
				   		System.out.println("list of amounts of money withdrawn successively: ");
				   		for(Integer name:money_withdrawn)
				   		{
				   			System.out.println(j+"."+ name);
				   			j++;
				   			flag=1;
				   		}
				   		if(j==1)
				   		{
				   			System.out.println(0);
				   		}
				    	  if(flag==0)
				    	     {
				    	    	 System.out.println("no transactions happened yet");
				    	     }
				    	   }
				    	  }
				    	 else
				    	 {
				    		 System.out.println("your secret code is wrong enter yes to retry again");
				    	     str1=scan.next();
				    	 }
				    	  }while(str1.equals("yes"));
				    	  break;
				      case 4:
				    	  System.out.println("thankyou for visiting our atm local bank");
				    	  System.exit(0);
				    	  break;
				     
				    	  
			}
				      System.out.println(" ");
				      System.out.println("enter yes if u want to perform other transaction:");
				      str=scan.next();
		}while(str.equals("yes"));
			}
			else
			{
				System.out.println(" ");
				System.out.println("incorrect password  try again");
				str3="yes";
			}
		}while(str3.equals("yes"));
		}
		else
		{
			System.out.println(" ");
			System.out.println("your account number is invalid");
			System.out.println("restart authentication process");
		}
		if(k!=1)
		{
			yn="yes";
		}
		if(k==1)
			yn="no";
	
		}while(yn.equals("yes"));
		System.out.println(" ");
		System.out.println("thankyou for visiting our atm local bank");
		}
}