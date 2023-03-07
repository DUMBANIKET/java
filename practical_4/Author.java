
import java.util.Scanner;

public class Author{
private String name;
public String email;
private char gender;


public Author(String name,String email,char gender){
this.name=name;
this.email=email;
this.gender=gender;

}

public String getname(){

return name;

}
public String getEmail(){
return email;

}

public void email(String email){
System.out.println("eneter your email that you want to insert : ");
Scanner in =new Scanner(System.in);
email=in.nextLine();

}

public char getGender(){
return gender;

}

@Override
public String toString(){

return "Author["+"name :"+name+"\t email :"+email+"\t gender:"+gender+"]";
}


public static void main(String[] args)

{
Author obj=new Author ("Dattebayo","naruto@gmail.com",'m');
System.out.println(obj);
}

}
