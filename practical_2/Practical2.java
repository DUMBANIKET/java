import java.util.*;
class Practical2{

public static void main(String[] args){
Scanner input=new Scanner(System.in);
char a=input.next().toUpperCase().charAt(0);


int alpha=65;
int x=a;

for (int i=0;i<=x-alpha;i++){
for (int j=i;j>=0;j--){

System.out.print((char)(alpha+j)+"");

}
System.out.println("");
}


}





}
