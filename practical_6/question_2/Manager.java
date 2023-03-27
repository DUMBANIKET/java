
public class Manager extends Employee{
public String dept;


Manager(String name,double salary,String dept){
super(name,salary);
this.dept=dept;

}

public void print(){
super.print();
System.out.print("\n Dept: "+dept);
}



public static void main(String[] args){



}

}
