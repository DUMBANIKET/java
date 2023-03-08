 class Even extends Thread{
public void run(){
int a[]={1,3,4,6,8};
for (int x:a){
if (x%2==0){
System.out.println("Even no " + x);
}

}
}

}

 class Odd extends Thread{


public void run(){
int a[]={1,3,4,6,8};
for (int x:a){
if (x%2!=0){
System.out.println("odd no " + x);
}

}
}}

 class Sqr extends Thread{
public void run(){
int a[]={1,3,4,6,8};
for (int x:a){

System.out.println("square " + x*x);


}
}
}


public class Thed{
public static void main(String[] args){
Even e=new Even();
e.setPriority(Thread.MAX_PRIORITY);
e.start();
Odd o=new Odd();
o.setPriority(Thread.MIN_PRIORITY);

o.start();

Sqr s=new Sqr();
s.setPriority(Thread.MIN_PRIORITY);
s.start();

}

}
