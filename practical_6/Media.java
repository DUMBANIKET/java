public class Media{


String title,format;
int duration;
public Media (String title,String format ,int duration){
this.title=title;
this.format=format;
this.duration=duration;


}

public void print(){
System.out.println("Title: "+title+"\n Format: "+format+"\n Duration"+duration);
}
public static void main(String[] args){

}

}
