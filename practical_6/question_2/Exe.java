public class Exe extends Manager{
public String location;
Exe(String name,double salary,String dept,String location){
super(name,salary,dept);
this.location=location;


}

public void print(){
super.print();
System.out.print("\nlocation: "+location);
}



public static void main(String[] args){
Exe iska=new Exe(" aniket",999999.999," software engineer"," mars");
iska.print();


}

}
