import java.io.*;

public class  Filewala{
public static void main(String [] args){
try{

byte b[]=new byte[20];

FileInputStream fak=new FileInputStream("a.txt");
FileOutputStream fok=new FileOutputStream("b.txt",true);




fak.read(b);
fok.write(b);
fak.close();
fok.close();

for(byte x:b){
System.out.println((char)(x));
}

}
catch(Exception e){
System.out.println(e);
}

}

}
