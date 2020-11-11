# casestdy2-ATM
ATM JAVA PROGRAM WITH DATABASE CONNECTION
the main classes are: 1.deposit class
                      2.withdraw class
                      3.display class
                      4.DBconnection class
                      5.database class(main class)
In this program i have used a SQLite database browser to create a database table with fields accountantname,accountnumber,accountpassword,accountbalance,secretcode,mobilenumber  for 10 user accounts.
Note:use the account details o the user accounts in the database table to check the proper execution of table.
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
                      
                     
