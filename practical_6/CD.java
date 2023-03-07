public class CD extends Media{

String artist ;
int no_of_traks;

public CD(String title,String format,int duration,String artist,int no_of_traks){
super(title,format,duration);
this.artist=artist;
this.no_of_traks=no_of_traks;

}


public void print(){

super.print();
System.out.println("artist: "+artist+"\n no of tracks: "+no_of_traks);

}

public static void main(String[] args){
CD kela=new CD("pikachu","mp9",9,"tekina",99);
kela.print();


}


}
