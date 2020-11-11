import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection {
  // public static Connection connect() 
	 int i=0,k=0,c1=0,c2=0,c3=0,j=0;
	   int []account_number=new int[12];
	   String []accountant_name=new String[12];
	   int []account_password=new int[12];
	   int []account_balance=new int[12];
	   int []secretcode=new int[12];
	   String []mobilenumber=new String[12];
	   Connection con=null;
	   Statement stmt=null;
	   DBconnection(){
	   try {
	   Class.forName("org.sqlite.JDBC");
	  con= DriverManager.getConnection("jdbc:sqlite:accountdetails.db");
	   //System.out.println("connected!");
	 // con.close();
	   }catch(ClassNotFoundException | SQLException e) {
		   System.out.println("error1"+e);
	   }
	  // return con;
   }
   public void accountdetails() 
   {
	   try {
	   this.stmt=con.createStatement();
	   ResultSet rs=stmt.executeQuery("SELECT * FROM  accountdetails");
	   while(rs.next()) {
		  this.accountant_name[i]=rs.getString("accountantname");
		    this.account_number[i]=rs.getInt("accountnumber");
		   this.account_password[i]=rs.getInt("accountpassword");
		   this .account_balance[i]=rs.getInt("accountbalance");
		   this.secretcode[i]=rs.getInt("secretcode");
		  this.mobilenumber[i]=rs.getString("mobilenumber");
		//System.out.println(this.accountant_name[i]+"          "+     this.account_number[i]+ "    " +    this.account_password[i]+"   "+    this.account_balance[i]);
		   i++;
		   k=i;
	   }
	   }  catch(Exception e) {
		   System.out.println("error2"+e);
   }
}
   public void classConnection() {
	   try {
		   con.close();
	   }catch(Exception e) {
		   System.out.println("error 3" +e);
	   }
   }
      public int  number(int account_number) {
    	  for(i=0;i<k;i++)
    	  {
    		  if(this.account_number[i]==account_number)
    		  {
    			  c1++;
    			  this.j=i;
    		  }
    	  }
    	  if(c1>0) {
    		  return 1;
    	  }
    	  else {
    		  return 0;
    	  }
      }
      public int password(int account_password)
      {
    	  for(i=0;i<k;i++)
    	  {
    		  if(this.account_password[i]==account_password)
    		  {
    			  c2++;
    		  }
    	  }
    	  if(c2>0)
    	  {
    		  return 1;
    	  }
    	  else
    	  {
    		  return 0;
    	  }
      }
      public int serial_num()
    		  {
    	          return this.j;
    		  }
      public int account_balance()
      {
    	  return this.account_balance[this.j];
      }
      public String accountant_name()
      {
    	  return this.accountant_name[this.j];
      }
      public String mobile_number()
      {
    	  return this.mobilenumber[this.j];
      }
      public int secret_code()
      {
    	  return this.secretcode[this.j];
      }
   
}