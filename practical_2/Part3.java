import java.util.*;
class Part3{


public static void main(String[] args){

Scanner in=new Scanner(System.in);
System.out.print("enter a alphabet");
String input = in.next().toLowerCase();
boolean uppercase=input.charAt(0)>=65 && input.charAt(0)<=90;
boolean lowercase=input.charAt(0)>=97 && input.charAt(0)<=122;
boolean vowels=input.equals("a") || input.equals("e") || input.equals("i")||input.equals("o")|| input.equals("u");
if (input.length()>1){
System.out.println("Error not a single character");

}


else if(!(uppercase || lowercase)){
System.out.println("Error not a letter add a uppercase or a lowercase letter");


}

else if(vowels){
System.out.println("it is a vowel");
}

else {
System.out.println("it is a consonants");

}

}


}
