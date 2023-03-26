package practicals.file_handling;

import java.io.FileInputStream;

public class Read {

    public static void main(String[] args) {
        String FILE_PATH = "D:\\text_file1.txt";
        int END_OF_FILE_BYTE = -1;

        try{
            FileInputStream fis = new FileInputStream(FILE_PATH);
            int currentByte = fis.read();

            while (currentByte != END_OF_FILE_BYTE){
                System.out.print((char)currentByte);
                currentByte = fis.read();
            }
            fis.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
