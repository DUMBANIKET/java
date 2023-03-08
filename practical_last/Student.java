 class AgeNotInRange extends Exception{
public String msg;

public AgeNotInRange(String massage){
this.msg=msg;
}
void getmassage(){
System.out.println("kall kar dia");
}

}

public class Student{
public int rno,age;
public String name,course;

public Student(int rno,int age,String name,String course){
this.rno=rno;
this.age=age;
this.name=name;
this.course=course;


}

public void check(){
try{
if(age>15 && age<21){
System.out.println(rno);
System.out.println(age);
System.out.println(name);
System.out.println(course);
}


else{
throw new AgeNotInRange("error hai vai");
}
}
catch(AgeNotInRange e){
System.out.println(e);
}

}


public static void main(String args[]){
Student a=new Student(23,16,"Aniket","bscit");
a.check();

}

}
