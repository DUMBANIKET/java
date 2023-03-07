import java.util.Scanner;

class BankAccount{


public String Depositor_name;
public int  acc_no;
public String acc_type;
public double bal_amount;
public int flag=1;
public static void main(String[] args){
int ch;
BankAccount b=new BankAccount();
while(true){
System.out.println("enter the choices \n1:register \n 2:deposit \n 3:widthdraw \n 4:Exit");

Scanner sc=new Scanner(System.in);
ch=sc.nextInt();
switch(ch){
case 1:
	b.register();
	b.display();
	break;
case 2:
	b.deposit();
	b.display();
	break;
case 3:
	b.withdraw();
	b.display();
	break;
case 4:
	System.exit(0);
	break;
default:
	System.out.println("invalid");
	break;


}
}


}
public void register(){
Scanner input=new Scanner(System.in);
System.out.println("Enter your details ");
System.out.println("enter your name");
Depositor_name=input.nextLine();
System.out.println("enter da account type");
acc_type=input.nextLine();

System.out.println("enter your account number");
acc_no=input.nextInt();


if(bal_amount<500){
System.out.println("minimum amount is $500 please add the balance");
bal_amount=input.nextDouble();
System.out.println("balance added please go in");
}
else{
System.out.println("do you want to add money to da systam press 1=yes / 2=nahi");
flag=input.nextInt();
if(flag==1){
bal_amount=input.nextDouble();

}
else if(flag==2){
System.out.println("okay dude");
}
else{
System.out.println("bruh what are you doing");
}

}
}




public void display(){
System.out.println("\n\n Name : "+Depositor_name+"\n\n Account no : "+acc_no+"\n\n Account Type : "+acc_type+"\n\n Total balance : "+bal_amount+"\n\n");

}



public void withdraw(){
System.out.println("Add the amount to remove");
double with;
Scanner in =new Scanner(System.in);
with=in.nextDouble();
bal_amount-=with;
System.out.println("done");
}

public void deposit(){
Scanner i=new Scanner(System.in);
System.out.println("enter the amout you want to add");
double dep=i.nextDouble();
bal_amount+=dep;
System.out.println("done");


}

}

