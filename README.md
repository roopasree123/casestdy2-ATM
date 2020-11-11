# casestdy2-ATM
ATM JAVA PROGRAM WITH DATABASE CONNECTION
the main classes are: 1.deposit class
                      2.withdraw class
                      3.display class
                      4.DBconnection class
                      5.database class(main class)
In this program i have used a SQLite database browser to create a database table with fields accountantname,accountnumber,accountpassword,accountbalance,secretcode,mobilenumber  for 10 user accounts.
Note:use the account details of the user accounts in the database table to check the proper execution of table.
firstly the user shold enter his account number if account number is valid then he/she can proceed to enter password or else he/she should start authentication process
if the user enters his correct password then he can choose the type of transaction he wants to perfrm and continue further.
deposit class:    *here whenever user wants to deposit money it asks the user to enter his/her mobile number ,generates otp, and asks user to enter otp if entered otp is correct 
                     displays transaction successful.
withdraw class:      * whenever  user wants to withdraw an ammount less than 15000  it asks the user to enter his/her mobile number ,generates otp, and asks user to enter otp if                         entered otp is correct 
                     *displays transaction successful.       
                     *displays the amount of money withdrawn in deominations
display class:      *whenever user wants to see account details it asks the user to enter secret code if it is correct then displays the user account details of the accountant     
                     *also displays the transaction details like amount of money withdrawn and deposited by user successively 
DBconnection class :  *it provides the connection between the database file called accountdetails and our java project
                      *facilitates to use all account details in our program
database (main)class: *provides  all instructions to the user about transactions .
 Note:*database is the main class o the atm program and remaining are classes created and a database ile called accountdetails is included in the program
      *so to test execution of program just create a new java project and copy paste these classes and database file or the entire project is also added in the github so to test         just download it and run in the eclipse ide. 
      *i have used sqlite-jdbc-3.27.2.1 in java build path as class path.         
REPOSITORY LINK: https://github.com/roopasree123/casestdy2-ATM.git              
