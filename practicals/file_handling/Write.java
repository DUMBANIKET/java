package practicals.file_handling;

import java.io.FileOutputStream;

public class Write {
    public static void main(String[] args) {
        String FILE_PATH = "D:\\text_file1.txt";

        try {
            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            String msg = "Written by program";
            byte[] msgByte = msg.getBytes();
            fos.write(msgByte);
            fos.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
