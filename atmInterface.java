import java.util.Scanner;
public class atmInterface {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Current balance in your account");
      int balance=sc.nextInt();
     int withdraw,deposit;
     while(true){
System.out.println("Welcome to ATM");
System.out.println("For Withdraw amount press 1");
System.out.println("For deposit amount press 2");
System.out.println("For check amount press 3");
System.out.println("For exit press 4");
System.out.println("tap the operation you want to perform");
int ch=sc.nextInt();
switch(ch){
case 1:
System.out.println("Enter the amount to be withdrawed: ");
withdraw=sc.nextInt();
if(withdraw<=balance){
    balance=balance-withdraw;
    System.out.println("receive your amount");
}
else{
    System.out.println("Insufficient balance");
}
System.out.println("");
break;
case 2:
System.out.println("Enter the amount to be deposited: ");
deposit=sc.nextInt();
balance+=deposit;
System.out.println("Your amount has been successfully deposited");
System.out.println("");
break;
case 3: 
System.out.println("Balance is : "+balance);
System.out.println("");
break;
case 4: 
System.exit(0);
}

     }
    }
}
