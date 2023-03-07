public class DVD extends CD{
String Director_name;
String Genre;
DVD(String title,String format ,int duration, String artist,int no_of_traks,String Director_name,String Genre){
super(title,format,duration,artist,no_of_traks);
this.Director_name=Director_name;
this.Genre=Genre;
}

public void print(){
super.print();
System.out.println("Director : "+Director_name+"\n Genre: "+Genre);

}


public static void main(String[] args){
DVD naya=new DVD("Pokemon","mp99",59,"aniket",4,"Aniket","action");
naya.print();
}


}
